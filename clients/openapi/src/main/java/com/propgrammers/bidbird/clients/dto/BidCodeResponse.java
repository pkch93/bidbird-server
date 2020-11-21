package com.propgrammers.bidbird.clients.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 코드조회API 응답 예시
 * <response>
 *     <header>
 *         <resultCode>00</resultCode>
 *         <resultMsg>NORMAL SERVICE.</resultMsg>
 *     </header>
 *     <body>
 *         <items>
 *             <item>
 *                 <RNUM>1</RNUM>
 *                 <CTGR_ID>10000</CTGR_ID>
 *                 <CTGR_NM>부동산</CTGR_NM>
 *                 <CTGR_HIRK_ID>1</CTGR_HIRK_ID>
 *                 <CTGR_HIRK_NM>ONBID</CTGR_HIRK_NM>
 *             </item>
 *         </items>
 *         <pageNo>1</pageNo>
 *         <totalCount>22</totalCount>
 *         <numOfRows>10</numOfRows>
 *     </body>
 * </response>
 */

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@XmlRootElement(name = "response")
public class BidCodeResponse {

    @XmlElement(name = "header")
    private Header header;

    @XmlElement(name = "body")
    private Body body;

    @Getter
    @XmlRootElement(name = "header")
    public static class Header {
        @XmlElement(name = "resultCode")
        private Long resultCode;

        @XmlElement(name = "resultMsg")
        private String resultMessage;
    }

    @Getter
    @XmlRootElement(name = "body")
    public static class Body {

        @XmlElement(name = "items")
        private Items items;

        @XmlElement(name = "totalCount")
        private Long totalCount;

        @XmlElement(name = "pageNo")
        private Long page;

        @XmlElement(name = "numOfRows")
        private Long size;
    }

    @Getter
    @XmlRootElement(name = "items")
    public static class Items {
        @XmlElement(name = "item")
        private List<Item> items;
    }

    @Getter
    @XmlRootElement(name = "item")
    public static class Item {

        @XmlElement(name = "RNUM")
        private Long rowNumber;

        @XmlElement(name = "CTGR_ID")
        private Long categoryId;

        @XmlElement(name = "CTGR_NM")
        private String category;

        @XmlElement(name = "CTGR_HIRK_ID")
        private String parentCategoryId;

        @XmlElement(name = "CTGR_NM")
        private String parentCategoryName;
    }
}
