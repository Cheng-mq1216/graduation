package cn.lynu.mapper;

import cn.lynu.model.Student;
import cn.lynu.model.StudentExample;
import cn.lynu.model.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String studentId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(String studentId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    Student getStudentByUserId(String userId);
    
    User getUserByStudentId(String studentId);
    
    Student getStudentByStudentId(String studentId);

	boolean updateProjectNum(@Param("studentId")String studentId,
				@Param("teacherId")String teacherId,@Param("projectId")String projectId);
	
	boolean updateNoProjectNum(String studentId);

}