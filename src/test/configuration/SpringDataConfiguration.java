
@EnableJpaRepositories("Repositories")
public class SpringDataConfiguration {
    @Bean
    public DataSource dataSource(){
        DriverManagerDateSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/CH02?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
}