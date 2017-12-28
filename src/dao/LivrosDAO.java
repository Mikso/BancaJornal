/**
 * 
 */
package dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;


/**
 * @author Bruno
 *
 */


@Entity
@Table(name = "Estoque")
public class LivrosDAO {
	// Atributos de cada livro
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", unique = true, nullable = false )
	private Integer id;
	
	@Column
	private String isbn;
	@Column
	private String editora;
	@Column
	private String titulo;
	@Column
	private String ano;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
}
