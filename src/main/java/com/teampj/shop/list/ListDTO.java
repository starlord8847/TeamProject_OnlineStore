package com.teampj.shop.list;

public class ListDTO {

	String pcode, scode, pname;
	int price, cost, pcount, pshipday, pshipcost, preshipcost, pspshipcost;
	String pthumbnail, pdscrpt, pmaincate, psubcate, ptag, prgtdate;
	
	public ListDTO() {
		super();
	}
	public ListDTO(String pcode, String scode, String pname, int price, int cost, int pcount, int pshipday,
			int pshipcost, int preshipcost, int pspshipcost, String pthumbnail, String pdscrpt, String pmaincate,
			String psubcate, String ptag, String prgtdate) {
		super();
		this.pcode = pcode; //상품코드
		this.scode = scode; //판매자코드
		this.pname = pname; // 상품명
		this.price = price; //가격
		this.cost = cost; //원가
		this.pcount = pcount; //판매가능수량
		this.pshipday = pshipday; //배송기간
		this.pshipcost = pshipcost; //배송비
		this.preshipcost = preshipcost; //반품배송비
		this.pspshipcost = pspshipcost; //도서산간배송비
		this.pthumbnail = pthumbnail; //상품썸네일
		this.pdscrpt = pdscrpt; //상품설명
		this.pmaincate = pmaincate; //대분류
		this.psubcate = psubcate; //소분류
		this.ptag = ptag; //태그
		this.prgtdate = prgtdate; //상품 등록일
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPcount() {
		return pcount;
	}
	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
	public int getPshipday() {
		return pshipday;
	}
	public void setPshipday(int pshipday) {
		this.pshipday = pshipday;
	}
	public int getPshipcost() {
		return pshipcost;
	}
	public void setPshipcost(int pshipcost) {
		this.pshipcost = pshipcost;
	}
	public int getPreshipcost() {
		return preshipcost;
	}
	public void setPreshipcost(int preshipcost) {
		this.preshipcost = preshipcost;
	}
	public int getPspshipcost() {
		return pspshipcost;
	}
	public void setPspshipcost(int pspshipcost) {
		this.pspshipcost = pspshipcost;
	}
	public String getPthumbnail() {
		return pthumbnail;
	}
	public void setPthumbnail(String pthumbnail) {
		this.pthumbnail = pthumbnail;
	}
	public String getPdscrpt() {
		return pdscrpt;
	}
	public void setPdscrpt(String pdscrpt) {
		this.pdscrpt = pdscrpt;
	}
	public String getPmaincate() {
		return pmaincate;
	}
	public void setPmaincate(String pmaincate) {
		this.pmaincate = pmaincate;
	}
	public String getPsubcate() {
		return psubcate;
	}
	public void setPsubcate(String psubcate) {
		this.psubcate = psubcate;
	}
	public String getPtag() {
		return ptag;
	}
	public void setPtag(String ptag) {
		this.ptag = ptag;
	}
	public String getPrgtdate() {
		return prgtdate;
	}
	public void setPrgtdate(String prgtdate) {
		this.prgtdate = prgtdate;
	}
	
	
}