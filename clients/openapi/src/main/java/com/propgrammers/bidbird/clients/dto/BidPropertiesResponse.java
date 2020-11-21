package com.propgrammers.bidbird.clients.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 참고: https://www.data.go.kr/data/15000851/openapi.do
 *
 * <?xml version="1.0" encoding="UTF-8"?>
 * <response>
 *     <header>
 *         <resultCode>00</resultCode>
 *         <resultMsg>NORMAL SERVICE.</resultMsg>
 *     </header>
 *     <body>
 *         <items>
 *             <item>
 *                 <RNUM>1</RNUM>
 *                 <PLNM_NO>584280</PLNM_NO>
 *                 <PBCT_NO>9487712</PBCT_NO>
 *                 <PBCT_CDTN_NO>3425904</PBCT_CDTN_NO>
 *                 <CLTR_NO>1411835</CLTR_NO>
 *                 <CLTR_HSTR_NO>3390363</CLTR_HSTR_NO>
 *                 <SCRN_GRP_CD>0001</SCRN_GRP_CD>
 *                 <CTGR_FULL_NM>토지 / 답</CTGR_FULL_NM>
 *                 <BID_MNMT_NO>0024</BID_MNMT_NO>
 *                 <CLTR_NM>울산광역시 울주군 삼남면 방기리 775-3</CLTR_NM>
 *                 <CLTR_MNMT_NO>2020-00798-001</CLTR_MNMT_NO>
 *                 <LDNM_ADRS>울산광역시 울주군 삼남면 방기리 775-3</LDNM_ADRS>
 *                 <NMRD_ADRS> </NMRD_ADRS>
 *                 <LDNM_PNU>3171039024007750003</LDNM_PNU>
 *                 <DPSL_MTD_CD>0001</DPSL_MTD_CD>
 *                 <DPSL_MTD_NM>매각</DPSL_MTD_NM>
 *                 <BID_MTD_NM>일반경쟁(최고가방식) / 총액</BID_MTD_NM>
 *                 <MIN_BID_PRC>44986000</MIN_BID_PRC>
 *                 <APSL_ASES_AVG_AMT>56232000</APSL_ASES_AVG_AMT>
 *                 <FEE_RATE>(80%)</FEE_RATE>
 *                 <PBCT_BEGN_DTM>20200615100000</PBCT_BEGN_DTM>
 *                 <PBCT_CLS_DTM>20200617170000</PBCT_CLS_DTM>
 *                 <PBCT_CLTR_STAT_NM>인터넷입찰마감</PBCT_CLTR_STAT_NM>
 *                 <USCBD_CNT>0</USCBD_CNT>
 *                 <IQRY_CNT>0</IQRY_CNT>
 *                 <GOODS_NM>답 264 ㎡ 지분(총면적 601㎡) , 귀 제시목록에 의거 대상토지 중 이광호 지분 264/601(264㎡)만을 감정평가의 대상으로 하였으며,대상지분의 위치확인이 곤란하여 대상토지의 전체가액에 지분</GOODS_NM>
 *                 <MANF></MANF>
 *                 <MDL></MDL>
 *                 <NRGT></NRGT>
 *                 <GRBX></GRBX>
 *                 <ENDPC></ENDPC>
 *                 <VHCL_MLGE></VHCL_MLGE>
 *                 <FUEL></FUEL>
 *                 <SCRT_NM></SCRT_NM>
 *                 <TPBZ></TPBZ>
 *                 <ITM_NM></ITM_NM>
 *                 <MMB_RGT_NM></MMB_RGT_NM>
 *                 <CLTR_IMG_FILES>
 *                     <CLTR_IMG_FILE>http://www.onbid.co.kr/op/common/downloadFile.do?atchFilePtcsNo=10575190&amp;atchSeq=7</CLTR_IMG_FILE>
 *                     <CLTR_IMG_FILE>http://www.onbid.co.kr/op/common/downloadFile.do?atchFilePtcsNo=10575190&amp;atchSeq=6</CLTR_IMG_FILE>
 *                     <CLTR_IMG_FILE>http://www.onbid.co.kr/op/common/downloadFile.do?atchFilePtcsNo=10575190&amp;atchSeq=4</CLTR_IMG_FILE>
 *                     <CLTR_IMG_FILE>http://www.onbid.co.kr/op/common/downloadFile.do?atchFilePtcsNo=10575190&amp;atchSeq=5</CLTR_IMG_FILE>
 *                     <CLTR_IMG_FILE>http://www.onbid.co.kr/op/common/downloadFile.do?atchFilePtcsNo=10575190&amp;atchSeq=3</CLTR_IMG_FILE>
 *                     <CLTR_IMG_FILE>http://www.onbid.co.kr/op/common/downloadFile.do?atchFilePtcsNo=10575190&amp;atchSeq=8</CLTR_IMG_FILE>
 *                     <CLTR_IMG_FILE>http://www.onbid.co.kr/op/common/downloadFile.do?atchFilePtcsNo=10575190&amp;atchSeq=2</CLTR_IMG_FILE>
 *                 </CLTR_IMG_FILES>
 *             </item>
**         </items>
 *         <pageNo>1</pageNo>
 *         <totalCount>37874</totalCount>
 *         <numOfRows>20</numOfRows>
 *     </body>
 * </response>
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@XmlRootElement(name = "response")
public class BidPropertiesResponse {

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

        @XmlElement(name = "PLNM_NO")
        private Long noticeNumber;

        @XmlElement(name = "PBCT_NO")
        private Long publicAuctionNumber;

        @XmlElement(name = "PBCT_CDTN_NO")
        private Long bidConditionNumber;

        @XmlElement(name = "CLTR_NO")
        private Long propertyNumber;

        @XmlElement(name = "CLTR_HSTR_NO")
        private Long propertyHistoryNumber;

        @XmlElement(name = "SCRN_GRP_CD")
        private String screenGroupCode;

        @XmlElement(name = "CTGR_FULL_NM")
        private String useName;

        @XmlElement(name = "BID_MNMT_NO")
        private String bidNumber;

        @XmlElement(name = "CLTR_NM")
        private String propertyName;

        @XmlElement(name = "CLTR_MNMT_NO")
        private String propertyManagementNumber;

        @XmlElement(name = "LDNM_ADRS")
        private String propertyJibunAddress;

        @XmlElement(name = "NMRD_ADRS")
        private String propertyReadNameAddress;

        @XmlElement(name = "DPSL_MTD_CD")
        private String disposalMethodCode;

        @XmlElement(name = "DPSL_MTD_NM")
        private String disposalMethod;

        @XmlElement(name = "BID_MTD_NM")
        private String bidMethod;

        @XmlElement(name = "MIN_BID_PRC")
        private Long minBidPrice;

        @XmlElement(name = "APSL_ASES_AVG_AMT")
        private Long appraisalPrice;

        @XmlElement(name = "PBCT_BEGN_DTM")
        private String bidStartDate;

        @XmlElement(name = "PBCT_CLS_DTM")
        private String bidCloseDate;

        @XmlElement(name = "PBCT_CLTR_STAT_NM")
        private String propertyState;

        @XmlElement(name = "USCBD_CNT")
        private Long miscarryCount;

        @XmlElement(name = "IQRY_CNT")
        private Long inquiryCount;

        @XmlElement(name = "GOODS_NM")
        private String goodsDetail;

        @XmlElement(name = "MANF")
        private String manufacturer;

        @XmlElement(name = "MDL")
        private String model;

        @XmlElement(name = "NRGT")
        private String depreciation;

        @XmlElement(name = "GRBX")
        private String transmission;

        @XmlElement(name = "ENDPC")
        private String exhaustVolume;

        @XmlElement(name = "VHCL_MLGE")
        private String mileage;

        @XmlElement(name = "FUEL")
        private String fuel;

        @XmlElement(name = "SCRT_NM")
        private String corporate;

        @XmlElement(name = "TPBZ")
        private String business;

        @XmlElement(name = "ITM_NM")
        private String itemName;

        @XmlElement(name = "MMB_RGT_NM")
        private String membership;

        @XmlElement(name = "CLTR_IMG_FILES")
        private PropertyImages propertyImages;
    }

    @Getter
    @XmlRootElement(name = "CLTR_IMG_FILES")
    public static class PropertyImages {

        @XmlElement(name = "CLTR_IMG_FILE")
        private List<String> contents;
    }
}
