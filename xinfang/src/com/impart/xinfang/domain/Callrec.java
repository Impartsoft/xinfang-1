package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
package com.impart.xinfang.domain;

import java.util.Date;
/**8
 * 电话记录
 * @author Administrator
 *
 */
public class Callrec {
private int callid;  //编号  int
private String callNum;  //电话号码  varchar
private String recFile;  //录音文件  varchar
private Date dialTime;  //振铃时间  datetime
private Date startTime;  //接通时间  datetime
private Date endTime;  //结束时间  datetime
private int dialLong; //振铃时长  int
private int timeLong;  //通话时长 int
private int callType;  //电话类型  tinyint  :1：呼入接通；2：呼入流失；3：呼入转接；4：留言；9：呼出
private String transMittel;  //转接电话  varchar
private int isDele;  //删除标志  tinyint  0：未删除；1：删除
private int doFlag;  //处理标志  int  0：未处理；1：处理
public int getCallid() {
	return callid;
}
public void setCallid(int callid) {
	this.callid = callid;
}
public String getCallNum() {
	return callNum;
}
public void setCallNum(String callNum) {
	this.callNum = callNum;
}
public String getRecFile() {
	return recFile;
}
public void setRecFile(String recFile) {
	this.recFile = recFile;
}
public Date getDialTime() {
	return dialTime;
}
public void setDialTime(Date dialTime) {
	this.dialTime = dialTime;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getDialLong() {
	return dialLong;
}
public void setDialLong(int dialLong) {
	this.dialLong = dialLong;
}
public int getTimeLong() {
	return timeLong;
}
public void setTimeLong(int timeLong) {
	this.timeLong = timeLong;
}
public int getCallType() {
	return callType;
}
public void setCallType(int callType) {
	this.callType = callType;
}
public String getTransMittel() {
	return transMittel;
}
public void setTransMittel(String transMittel) {
	this.transMittel = transMittel;
}
public int getIsDele() {
	return isDele;
}
public void setIsDele(int isDele) {
	this.isDele = isDele;
}
public int getDoFlag() {
	return doFlag;
}
public void setDoFlag(int doFlag) {
	this.doFlag = doFlag;
}
@Override
public String toString() {
	return "Callrec [callid=" + callid + ", callNum=" + callNum + ", recFile="
			+ recFile + ", dialTime=" + dialTime + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", dialLong=" + dialLong + ", timeLong="
			+ timeLong + ", callType=" + callType + ", transMittel="
			+ transMittel + ", isDele=" + isDele + ", doFlag=" + doFlag + "]";
}
}
