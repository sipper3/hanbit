package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
	Map<String, MemberBean> map;
	MemberBean mSession;
	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
		mSession = new MemberBean();
	}
	@Override
	public String join(MemberBean member) {
		String result = "회원가입실패(동일아이디 존재)";
		if(map.containsKey(member.getId()) == false){
			map.put(member.getId(), member);
			result = "회원가입성공";
		}
		return result;
	}

	@Override
	public void update(MemberBean member) {
		mSession.setPwd(member.getPwd());
		map.put(mSession.getId(), mSession);
	}

	@Override
	public void delete() {
		map.remove(mSession.getId());
	}

	@Override
	public MemberBean findByID(String id) {
		return map.get(id);
	}

	@Override
	public String login(String id, String pwd) {
		String result = "로그인 실패";
		if (map.containsKey(id) && pwd.equals(map.get(id).getPwd())) {
			mSession = map.get(id);
			result = "로그인 성공";
		}
		return result;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> list = new ArrayList<MemberBean>();
		/*
		Iterator<String> keys = map.keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            if(map.get(key).getName().equals(name)){
            	list.add(map.get(key));
            }
        }
        */
		for (String key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				list.add(map.get(key));
			}
		}
		return list;
	}

	@Override
	public int countByGen(String gen) {
		int cnt = 0;
		/*
		Iterator<String> keys = map.keySet().iterator();
        while( keys.hasNext() ){
            String key = keys.next();
            if(map.get(key).getGender().equals(gen)){
            	cnt++;
            }
        }
        */
		for (String key : map.keySet()) {
			if(map.get(key).getGender().equals(gen)){
				cnt++;
			}
		}
		return cnt;
	}
	@Override
	public MemberBean detail() {
		return mSession;
	}
	
}
