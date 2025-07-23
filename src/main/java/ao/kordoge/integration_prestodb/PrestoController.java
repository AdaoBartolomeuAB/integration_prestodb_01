package ao.kordoge.integration_prestodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class PrestoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/query/funcionarios")
    public List<Map<String, Object>> getDataFuncionario() {
        String sql = "select * from sqlserver_conta.dbo.funcionario";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("/query/organizacoes")
    public List<Map<String, Object>> getDataOrganizacao() {
        String sql = "select * from sqlserver_conta.dbo.organizacao";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("/query/utilizadores")
    public List<Map<String, Object>> getDataUtilizadores() {
        String sql = "select * from  sqlserver_autorizacao.dbo.utilizador";
        return jdbcTemplate.queryForList(sql);
    }
}
