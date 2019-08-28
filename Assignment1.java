package routezero.java.traning1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.print("0：グー 1:チョキ 2:パー\n");
		/* じゃんけんの手を数値で設定
		 * グー：0、チョキ:1、パー:2
		 */
		Scanner sc = new Scanner(System.in);
		// 入力者を先手Aと後手Bの２名に設定
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		System.out.print("じゃんけんぽん！\n");
		// 入力後
		System.out.print("\n");
		System.out.print("A\n");

		if(A == 0) System.out.print("グー\n");
		else if(A == 1) System.out.print("チョキ\n");
		else if(A == 2) System.out.print("パー\n");

		System.out.print("\n");
		System.out.print("B\n");

		if(B == 0) System.out.print("グー\n");
		else if(B == 1) System.out.print("チョキ\n");
		else if(B == 2) System.out.print("パー\n");
		System.out.print("\n");

		/*
		 * 以下、９通りの結果出力
		 */

		if(A == B)System.out.print("あいこです。");
		else if(A == 0){
			if(B == 1) System.out.print("先手の勝ちです。");
			else if(B == 2) System.out.print("後手の勝ちです。");
		}
		else if(A == 1){
			if(B == 2) System.out.print("先手の勝ちです。");
			else if(B == 0) System.out.print("後手の勝ちです。");
		}
		else if(A == 2){
			if(B == 0) System.out.print("先手の勝ちです。");
			else if(B == 1) System.out.print("後手の勝ちです。");
		}
	}
}

