package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {

    /*필기.
    *   사용자 -> 인포직원 -> 청소업체
    *   요청의 결과 <-      <-
    * */
    public void printMenuList(List<MenuDTO> menuList) {

        System.out.println("전체 메뉴 조회의 결과는!!");
        for(MenuDTO menu : menuList){

            System.out.println(menu);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode){
            case "selectList" : errorMessage = "메뉴 전체 조회를 실패했습니다. "; break;
            case "selectOne" : errorMessage = "메뉴 코드로 메뉴 조회를 실패했습니다..."; break;
            case "insert" : errorMessage = "신규 메뉴 등록에 실패했습니다..."; break;
            case "update" : errorMessage = "수정 실패 " ; break;
            case "delete " : errorMessage = "삭제 성공" ; break;
        }
        System.out.println(errorMessage);

    }

    public void printMenu(MenuDTO menu) {
        System.out.println(menu);

    }

    public void printSuccessMessage(String succesCode) {

        String successMessage = "";
        switch (succesCode){
            case "insert" : successMessage= "신규 메뉴 등록을 성공하였습니다." ; break;
            case "update" : successMessage = " 정상적으로 수정되었습니다"; break;
            case "delete" : successMessage = " 정상적으로 삭제되었습니다"; break;

        }
        System.out.println(successMessage);

    }
}
