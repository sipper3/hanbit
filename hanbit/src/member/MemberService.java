package member;

import java.util.List;

public interface MemberService {
	/*
	 * CRUD
	 * C : add
	 * R : find(search)
	 * U : update
	 * D : delete
	 */
	public String join(MemberBean member);
	public String login(String id, String pwd);
	public MemberBean detail();
	public void update(MemberBean member);
	public void delete();
	public MemberBean findByID(String id);
	public List<MemberBean> findByName(String name);
	public int countByGen(String gen);
	
	
}
