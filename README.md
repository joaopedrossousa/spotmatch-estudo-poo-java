# 🎧 Projeto: App de Streaming de Músicas e Podcasts

## 📝 Descrição

Este projeto foi desenvolvido com o objetivo de **treinar os principais conceitos de Programação Orientada a Objetos (POO)** em Java, por meio da simulação de um **aplicativo de streaming** que reproduz músicas e podcasts.

O sistema permite cadastrar conteúdos de áudio, reproduzi-los, contabilizar curtidas e reproduções, além de realizar avaliações, demonstrando na prática o uso de **encapsulamento, herança, polimorfismo e interfaces**.

---

## 🧠 Conceitos de POO aplicados

| Conceito | Implementação |
|-----------|----------------|
| **Encapsulamento** | A classe `Audio` possui atributos privados com getters e setters para controle seguro do estado. |
| **Herança** | As classes `Musica` e `Podcast` **herdam** de `Audio`, reutilizando e especializando comportamentos. |
| **Polimorfismo** | A interface `Comportamentos` é implementada tanto por `Musica` quanto por `Podcast`, permitindo chamadas genéricas aos métodos `reproduzir()` e `avaliacao()`. |
| **Abstração** | A classe `Audio` representa um conceito genérico de mídia, sem se preocupar com detalhes específicos de cada tipo de conteúdo. |

---

## 🏗️ Estrutura do Projeto

```
src/
 └── br/com/desaf/alura/
     ├── Audio.java
     ├── Musica.java
     ├── Podcast.java
     ├── Comportamentos.java
     └── Principal.java
```

---

## 📚 Descrição das Classes

### 🎵 `Audio`
Classe base que representa um conteúdo de áudio genérico.

**Atributos principais:**
- `titulo`
- `duracao`
- `totalDeReproducoes`
- `curtidas`
- `classificacao`

**Principais métodos:**
- `reproduzir()`
- `curtir()`
- `avaliacao()`

---

### 🎶 `Musica`
Subclasse de `Audio` que representa uma música.

**Atributos adicionais:**
- `artista`
- `album`
- `genero`

**Comportamento:**
Implementa a interface `Comportamentos` com lógica própria de reprodução e avaliação de músicas.

---

### 🎙️ `Podcast`
Subclasse de `Audio` que representa um podcast.

**Atributos adicionais:**
- `host`
- `descricao`
- `episodio`

**Comportamento:**
Implementa `Comportamentos` com foco em reprodução de episódios e interação com ouvintes.

---

### ⚙️ `Comportamentos`
Interface que define os métodos essenciais que todo conteúdo deve possuir:
- `void reproduzir()`
- `void avaliacao()`

---

### 💻 `Principal`
Classe que contém o método `main()`, responsável por executar o programa.  
Permite:
- Criar objetos de `Musica` e `Podcast`;
- Definir seus dados (título, duração, artista, etc.);
- Reproduzir, curtir e avaliar cada conteúdo.

---

## ▶️ Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/app-streaming.git
   ```

2. Abra o projeto em sua IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

3. Compile e execute a classe principal:
   ```bash
   javac br/com/desaf/alura/Principal.java
   java br.com.desaf.alura.Principal
   ```

4. Siga as instruções exibidas no console para reproduzir músicas ou podcasts.

---

## 💡 Exemplo de Saída

```
Reproduzindo:
Música: Blinding Lights
Artista: The Weeknd
Duração: 4.0 minutos
Curtidas: 1
Classificação: 5 estrelas
```

---

## 🧩 Melhorias Futuras
- Implementar menu interativo para navegação entre playlists;
- Salvar dados em arquivo (persistência);
- Criar interface gráfica (JavaFX ou Swing);
- Adicionar ranking de músicas mais tocadas.

---
