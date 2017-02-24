package com.arm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.arm.common.DBManager;
import com.arm.common.*;
import com.arm.dto.*;

public class appRivewDAO {
	Connection conn = null;
	PreparedStatement pt = null;
	DBManager db = new DBManager();

	
	/**
	 * ��� �л��� ������ �������� ���� �Լ�
	 * @return
	 */

	
	/**
	 * ����¡ 
	 * @param sseq
	 * @param eseq
	 * @return
	 
	public ArrayList<appRivewDTO> getPageUserList(int sseq,int eseq){
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		ArrayList<appRivewDTO> list = new ArrayList<appRivewDTO>();
		DBManager db = new DBManager();

		try {
			conn = db.getConnection();
			//S
			String sql="select u.* from (select rownum rnum, u.* from users u) u where rnum>=? and rnum<=?";
			//p
			//conn.createStatement();
			pt = conn.prepareStatement(sql);

			pt.setInt(1,sseq);
			pt.setInt(2,eseq);
			//e
			//pstmt.executeQuery(sql);
			rs = pt.executeQuery();

			while(rs.next()){
				appRivewDTO dto=new appRivewDTO();
				dto.setuNum(rs.getInt("UNUM"));
				dto.setuName(rs.getString("UNAME"));
				dto.setUserId(rs.getString("USERID"));
				dto.setuPw(rs.getString("UPW"));
				dto.setuBirth(rs.getString("UBIRTH"));
				dto.setuBirth(rs.getString("ULEVEL"));
				list.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(conn, pt, rs);
		}
		return list;
	}*/
	
	/**
	 * ��ü�л� ����
	 * @return
	 
	public int getTotalList(){
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		DBManager db = new DBManager();
		int res=0;
		try {
			conn = db.getConnection();
			String sql="select count(*) cnt from users";
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			rs.next();
			res=rs.getInt("CNT");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(conn, pt, rs);
		}
		return res;
	}*/
	

	
	
	/**
	 * �ش� ���� ���� ��������
	 * @param seq
	 * @return
	 */

	public ArrayList<appRivewDTO> getAppRivewList(String appId){
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		DBManager db = new DBManager();
		ArrayList<appRivewDTO> list=new ArrayList<appRivewDTO>();
		try {
			conn = db.getConnection();
			String sql = "select * from tsarm0201 where unum=?";
			pt = conn.prepareStatement(sql);
			pt.setString(1,appId);
			rs = pt.executeQuery();
			while(rs.next()){
				appRivewDTO dto=new appRivewDTO();
				dto.setCustomid(rs.getString("CUSTOMID"));
				dto.setReviewContent(rs.getString("REVIEWCONTENT"));
				dto.setScore(rs.getInt("SCORE"));
				dto.setDevice(rs.getString("DEVICE"));
				dto.setDate(rs.getString("DATE"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(conn, pt, rs);
		}
		return list;
	}
	
}
