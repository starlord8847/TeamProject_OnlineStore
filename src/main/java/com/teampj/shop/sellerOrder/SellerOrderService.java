package com.teampj.shop.sellerOrder;

import java.util.ArrayList;

public interface SellerOrderService {

	//��۰���
		public ArrayList<SellerOrderDTO> orderview(String scode, String serchname, String serchname1, String orderday1,
				String orderday2);
	//�����ȣ ����
		public int oshipUpdate(String scode, String string, String string2, String string3);
	//ȯ����ȸ
		public ArrayList<SellerOrderDTO> refundview(String scode, String serchcolumn, String serchname, String ostate,
				String orderday1, String orderday2);
	//ȯ�ҳ��� ����
		public int refundsave(String scode, String string, String string2, String string3, int i, String string5,
				int j);
		
		
}
