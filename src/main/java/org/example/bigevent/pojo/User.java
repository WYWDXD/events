package org.example.bigevent.pojo;



import java.time.LocalDateTime;
//lombok 在编译阶段，为实体类自动生成setter getter toString
//pom文件中引入依赖 在实体类上添加注解
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.groups.Default;
import lombok.Data;

@Data
public class User {
//    @NotNull
    private Integer id;//主键ID
    private String username;//用户名
    @JsonIgnore //让springmvc把当前对象转换成json字符串的时候，忽略password，最终的json字符串就没有password
    private String password;//密码
//    @NotNull
    @Pattern(regexp = "^\\S{1,10}$")
    private String nickname;//昵称
//    @NotEmpty

    @Email
    private String email;//邮箱
    private String userPic;//用户头像地址
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
    public interface Update extends Default {
    }
}
