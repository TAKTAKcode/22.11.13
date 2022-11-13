package com.tak.study;

import java.util.Random;

public class Study {

    public static void main(String[] args) {
        //단어 두개를 출력하기
        /*컴퓨터에서 단어들을 찾아 여기에 넣은 후 2개를 "동시에" 출력하기*/
        String[] all = {
                          "돼지"
                        , "사진"
                        , "종이"
                        , "키보드"
                        , "연필"
                        , "책상"
                        , "마우스"
                        , "증명사진"
                        , "에어컨"
                        , "이어폰"             //10개
                        , "아이스 아메리카노"
                        , "마스크"
                        , "카페"
                        , "아이폰"
                        , "갤럭시"
                        , "벤츠"
                        , "전기"
                        , "코딩"
                        , "벽돌"
                        , "식물"              //20개
                        , "김치"
                        , "돼지고기"
                        , "소고기"
                        , "자동차"
                        , "21세기"
                        , "복싱"
                        , "복싱화"
                        , "바다"
                        , "블랙팬서"
                        , "전등"              //30개
                        };


        for (int i = 0; i < 2; i++) {

            int ranNum = (int)((Math.random()*10000)%30);    //랜덤한 수를 생성

            System.out.println(all[ranNum]);                 //랜덤의 난수를 넣어서 출력

        }
    }
}
