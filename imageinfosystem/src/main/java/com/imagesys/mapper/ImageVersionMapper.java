package com.imagesys.mapper;

import com.imagesys.pojo.ImageVersion;

public interface ImageVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_version
     *
     * @mbggenerated Tue Jul 14 11:46:22 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_version
     *
     * @mbggenerated Tue Jul 14 11:46:22 CST 2020
     */
    int insert(ImageVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_version
     *
     * @mbggenerated Tue Jul 14 11:46:22 CST 2020
     */
    int insertSelective(ImageVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_version
     *
     * @mbggenerated Tue Jul 14 11:46:22 CST 2020
     */
    ImageVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_version
     *
     * @mbggenerated Tue Jul 14 11:46:22 CST 2020
     */
    int updateByPrimaryKeySelective(ImageVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_version
     *
     * @mbggenerated Tue Jul 14 11:46:22 CST 2020
     */
    int updateByPrimaryKey(ImageVersion record);
}