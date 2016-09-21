package com.webapp.util;

import java.util.ArrayList;
import java.util.List;

public class voidTranscoding {
	 /**
     * ��Ƶת��
     * @param ffmpegPath    ת�빤�ߵĴ��·��
     * @param upFilePath    ����ָ��Ҫת����ʽ���ļ�,Ҫ��ͼ����ƵԴ�ļ�
     * @param codcFilePath    ��ʽת����ĵ��ļ�����·��
     * @param mediaPicPath    ��ͼ����·��
     * @return
     * @throws Exception
     */
    public boolean executeCodecs(String ffmpegPath, String upFilePath, String codcFilePath,
            String mediaPicPath) throws Exception {
        // ����һ��List����������ת����Ƶ�ļ�Ϊflv��ʽ������
        List<String> convert = new ArrayList<String>();
        convert.add(ffmpegPath); // ���ת������·��
        convert.add("-i"); // ��Ӳ�����-i�����ò���ָ��Ҫת�����ļ�
        convert.add(upFilePath); // ���Ҫת����ʽ����Ƶ�ļ���·��
        convert.add("-qscale");     //ָ��ת��������
        convert.add("6");
        convert.add("-ab");        //������Ƶ����
        convert.add("64");
        convert.add("-ac");        //����������
        convert.add("2");
        convert.add("-ar");        //���������Ĳ���Ƶ��
        convert.add("22050");
        convert.add("-r");        //����֡Ƶ
        convert.add("24");
        convert.add("-y"); // ��Ӳ�����-y�����ò���ָ���������Ѵ��ڵ��ļ�
        convert.add(codcFilePath);

        // ����һ��List�������������Ƶ�н�ȡͼƬ������
        List<String> cutpic = new ArrayList<String>();
        cutpic.add(ffmpegPath);
        cutpic.add("-i");
        cutpic.add(upFilePath); // ͬ�ϣ�ָ�����ļ���������ת��Ϊflv��ʽ֮ǰ���ļ���Ҳ������ת����flv�ļ���
        cutpic.add("-y");
        cutpic.add("-f");
        cutpic.add("image2");
        cutpic.add("-ss"); // ��Ӳ�����-ss�����ò���ָ����ȡ����ʼʱ��
        cutpic.add("17"); // �����ʼʱ��Ϊ��17��
        cutpic.add("-t"); // ��Ӳ�����-t�����ò���ָ������ʱ��
        cutpic.add("0.001"); // ��ӳ���ʱ��Ϊ1����
        cutpic.add("-s"); // ��Ӳ�����-s�����ò���ָ����ȡ��ͼƬ��С
        cutpic.add("800*280"); // ��ӽ�ȡ��ͼƬ��СΪ350*240
        cutpic.add(mediaPicPath); // ��ӽ�ȡ��ͼƬ�ı���·��

        boolean mark = true;
        ProcessBuilder builder = new ProcessBuilder();
        try {
            builder.command(convert);
            builder.redirectErrorStream(true);
            builder.start();
            
            builder.command(cutpic);
            builder.redirectErrorStream(true);
            // ���������Ϊ true�����κ���ͨ���˶���� start() ���������ĺ����ӽ������ɵĴ�������������׼����ϲ���
            //������߾���ʹ�� Process.getInputStream() ������ȡ����ʹ�ù���������Ϣ����Ӧ�������ø�����
            builder.start();
        } catch (Exception e) {
            mark = false;
            System.out.println(e);
            e.printStackTrace();
        }
        return mark;
    }
}
