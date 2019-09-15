package org.spring.woo.main.domain;

public class Criteria {
	private int page;
    //page�� ũ�⸦ ���� �Ѵ�.
    private int pageSize =10;
	private String keyword;
	private String sType;
	
	//userId�������� List�� �ҷ��ٶ� ����ϱ� ���� ��ü
	private String userId;
	
	//userId get,set
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if (page <= 0) {
			page = 1;
		}
		page = ( page - 1 ) * 10;
		
		this.page = page;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getsType() {
		return sType;
	}
	public void setsType(String sType) {
		this.sType = sType;
	}
	
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", pageSize=" + pageSize + ", keyword=" + keyword + ", sType=" + sType
				+ ", userId=" + userId + "]";
	}

}