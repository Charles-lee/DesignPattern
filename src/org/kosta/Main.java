package org.kosta;

public class Main {

	public static void main(String[] args) {
		// �׳� �밨�� ��Ű �����
		Cookie braveCookie = new BraveCookie();

		// ������ ���� �밨�� ��Ű �����
		Cookie milkBraveCookie = new MilkTopping(braveCookie);

		// ������ ���ݸ��� ���� �밨�� ��Ű �����
		Cookie chocolateMilkBraveCookie = new ChocolateTopping(milkBraveCookie);

		for (int i = 0; i < args.length; i++) {
			
		}
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// ������ ������ �ѹ� �� ���� �밨�� ��Ű �����
		Cookie chocolateDoubleMilkBraveCookie = new MilkTopping(chocolateMilkBraveCookie);;

		System.out.println(chocolateDoubleMilkBraveCookie.getName());

	}

}

