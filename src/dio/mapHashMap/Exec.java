package dio.mapHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exec {

	public static void main(String[] args) {
		
		// cria lista de alunos com a interface HashMap no conceito de chave, valor mesmo conceito do noSql, json, mongoDb.
		Map<String, String> aluno = new HashMap<>();
		
		Map<String, String> aluno2 = new HashMap<>();
		
		// cria os objetos com o metodo put incluindo a chave, valor.
		aluno.put("nome", "João");
		aluno.put("idade", "15");
		aluno.put("media", "7.8");
		aluno.put("turma", "Manhã");
		aluno.put("sala", "4-C");
		
		aluno2.put("nome", "Beatriz");
		aluno2.put("idade", "20");
		aluno2.put("media", "9.9");
		aluno2.put("turma", "Tarde");
		aluno2.put("sala", "2-A");
		
		// imprime o objeto aluno.
		System.out.println(aluno);
		System.out.println(aluno2);
		
		// imprime as chaves do objeto aluno com metodo KeySet.
		System.out.println(aluno.keySet());
		System.out.println(aluno2.keySet());
		
		// imprime os valores do objeto aluno com metodo Values.
		System.out.println(aluno.values());
		System.out.println(aluno2.values());
		
		// cria uma lista dos objetos alunos com a interface ArrayList.
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		// adiciona os objetos aluno na lista ArrayLis com metodo add.
		listaAlunos.add(aluno);
		
		listaAlunos.add(aluno2);
		
		// imprime a lista de alunos
		System.out.println(listaAlunos);
		
		// imprime o tamanho da lista com metodo size.
		System.out.println(listaAlunos.size());
		
		// imprime o objeto aluno em determinado indice com metodo get.
		System.out.println(listaAlunos.get(1));
		
		// compara e imprime se o objeto aluno e igual ao aluno2 com metodo equals.
		System.out.println(aluno.equals(aluno2));
		
		// imprime um resultado booleano se contem a chave nome com metodo caontainsKey.
		System.out.println(aluno.containsKey("nome"));
		
		// imprime um resultado booleano se contem o valor Silvio com metodo containsValue.
		System.out.println(aluno.containsValue("Silvio"));

	}

}
