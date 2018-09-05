package com.springboot.entity;

import java.util.Date;

import lombok.Data;
/**
 * 会员信息
 * @author Hongware
 *
 */
@Data
public class TMembers implements java.io.Serializable {
	private static final long serialVersionUID = -4765626096358224121L;
	private Integer memberId;
	private String memberNo;
	private String userName;
	private String email;
	private String password;
	private Date registerDate;
	private Integer rmdMemberId;
	private String rmdMemberNo;
	private String rmdMemberEmail;
	private String rmdMemberFullName;
	private Integer passwordQuestion;
	private String passwordAnswer;
	private Date lastLoginTime;
	private String lastLoginIp;
	private Integer isDeleted;
	private Date postDate;
	private Date modiDate;
	private Float amount;
	private Integer statusId;
	private Integer isDefaultIcon;
	private String memberIcon;
	private String idiograph;
	private Integer usergroup;
	private Integer usertype;
	private Integer ismail;
	private String signature;
	private String image;
	private String imageurl;
	private String imagewidth;
	private String imageheight;
	private String regip;
	private Date regtime;
	private Date lasttime;
	private Integer postnum;
	private Integer replaynum;
	private Integer deletenum;
	private Integer elitenum;
	private Integer isonline;
	private Integer money;
	private Integer experience;
	private Integer charam;
	private Integer prestige;
	private Integer logintimes;
	private Integer grade;
	private String persontitle;
	private String socialpart;
	private Integer islock;
	private String homepage;
	private String introdution;
	private Integer isNew;
	private Integer cancelMemberSakeId;
	private Integer constellationId;
	private Integer anniversaryTypeId;
	private Date anniversary;
	private String schoolInfo;
	private String companyInfo;
	private String idcard;
	private String msnid;
	private String qqid;
	private String interest;
	private Float costSum;
	private Float lastCost;
	private Date lastLoginTimeN;
	private Integer loginCounts;
	private Date loginCurrentTime;
	private Integer loginGapDays;
	private String keywords;
	private Integer userId;
	private Integer userTypeId;
	private Integer memberLevelId;
	private String avatar;
	private String sinformation;
	private String cinformation;
	private String msn;
	private String qq;
	private String pwebsite;
	private String hobbies;
	private Float tconsumption;
	private Float point;
	private Integer suppliersId;
	private Integer agentsId;
	private Integer buyCount;
	private Integer isMember;
	private String mobilePhone; // 会员手机号
	private String plat; // 会员平台
	private String openId; // 微信opengID;


}