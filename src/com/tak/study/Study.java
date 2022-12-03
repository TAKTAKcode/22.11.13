package com.tak.study;

import java.util.Random;

public class Study {

    public static void main(String[] args) {
        //단어 두개를 출력하기
        /*컴퓨터에서 단어들을 찾아 여기에 넣은 후 2개를 "동시에" 출력하기*/
        String[] words = {
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
                        , "복싱"
                        , "글러브"
                        , "복싱화"
                        , "모나미"
                        , "무지개"
                        , "경매"
                        , "인생"
                        , "공자"
                        , "논어"
                        , "영풍문고"          //40개
                        , "첫 눈"
                        , "백반"
                        , "싸움"
                        , "주먹"
                        , "러닝화"
                        , "가수"
                        , "가방"
                        , "딸기"
                        , "눈물"
                        , "행복"             //50개
                        , "데시벨"
                        , "성수동"
                        , "영화"
                        , "넷플릭스"
                        , "모니터"
                        , "책"
                        , "눈썹"
                        , "문신"
                        , "목걸이"
                        , "대저택"           //60개
                        , "모자"
                        , "아름다움"
                        , "안경"
                        , "왁스"
                        , "눈덩이"
                        , "체스"
                        , "로또"
                        , "꿈"
                        , "포마드"
                        , "천국"            //70개
                        , "치맥"
                        , "연어롤"
                        , "드릴"
                        , "순수"
                        , "나이키"
                        , "연애"
                        , "장막"
                        , "지름길"
                        , "독서"
                        , "편지"            //80개
                        };


        for (int i = 0; i < 2; i++) {

            int ranNum = (int)((Math.random()*10000)%70);      //랜덤한 수를 생성

            System.out.println(words[ranNum]);                 //랜덤의 난수를 넣어서 출력

        }
    }
}
