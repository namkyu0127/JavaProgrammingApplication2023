package Pokemonster;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
            System.out.println("숫자를 입력하세요!");
            int a = sc.nextInt();
            if (a == 3) {
                System.out.println("숫자 입니다!");
            } else if (a == 1) {
                System.out.println(a);
            }
        }catch (InputMismatchException err) {
            System.out.println("숫자를 입력해야합니다");
            System.out.println("예외 내용 : " + err.getMessage());
        }
        catch (NullPointerException err){
            System.out.println("플레이어 객체가 생성 되지 않았습니다.");
            System.out.println("예외 내용 : " + err.getMessage());
        }
        catch(IndexOutOfBoundsException err) {
            System.out.println("존재하지 않는 스킬입니다. 기술 범위를 벗어남.");
            System.out.println("예외 내용 : " + err.getMessage());
        } catch (Exception err){
            System.out.println("예외가 발생했습니다.");
            System.out.println("예외 내용 : " + err.getMessage());
        }finally {
            System.out.println("종료");
        }
    }
}
