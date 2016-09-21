package com.webapp.dao;

import java.util.List;
import com.webapp.entity.Media;

/**
 *
 *  MediaDao.java    
 *
 *  @version �� 1.1
 *  
 *  @author  �� ������    <a href="mailto:DennisIT@163.com">�����ʼ�</a>
 *    
 *  @since     �� 1.0        ����ʱ��:    2013-2-07        ����10:19:54
 *     
 *  TODO     :    interface MediaDao.java is used for ...
 *
 */
public interface MediaDao {
    
    /**
     * ��Ƶת��
     * @param ffmpegPath    ת�빤�ߵĴ��·��
     * @param upFilePath    ����ָ��Ҫת����ʽ���ļ�,Ҫ��ͼ����ƵԴ�ļ�
     * @param codcFilePath    ��ʽת����ĵ��ļ�����·��
     * @param mediaPicPath    ��ͼ����·��
     * @return
     * @throws Exception
     */
    public boolean executeCodecs(String ffmpegPath,String upFilePath, String codcFilePath, String mediaPicPath)throws Exception;
    
    /**
     * �����ļ�
     * @param media
     * @return
     * @throws Exception
     */
    public boolean saveMedia(Media media)throws Exception;

    /**
     * ��ѯ���ؿ������м�¼����Ŀ
     * @return
     * @throws Exception
     */
    public int getAllMediaCount()throws Exception;
    
    /**
     * ����ҳ�Ĳ�ѯ
     * @param firstResult
     * @param maxResult
     * @return
     */
    public List<Media> queryALlMedia(int firstResult, int maxResult)throws Exception;
    
    /**
     * ����Id��ѯ��Ƶ
     * @param id
     * @return
     * @throws Exception
     */
    public Media queryMediaById(int id)throws Exception;
}