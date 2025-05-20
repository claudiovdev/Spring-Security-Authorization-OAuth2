# Spring-Security-Authorization-OAuth2

Este projeto demonstra a implementação de um Authorization Server completo usando o **Spring Authorization Server**, com suporte a tokens **JWT**, **PKCE**, **refresh token**, **armazenamento via JDBC**, e **customizações no token**.  
Baseado no curso da **AlgaWorks** e aderente à especificação **OAuth 2.1**, o projeto também cobre o uso de **Spring Security** como mecanismo de autenticação.

---

## 🌟 Objetivo

Criar uma esteira completa de **autenticação e autorização OAuth2**, utilizando o **Spring Security** com:

- **Authorization Server**
- **Resource Server**
- **JWT**
- **Introspect**
- **JDBC**
- **PKCE**
- **Consentimento do usuário**

---

## 🧪 Funcionalidades Implementadas

### 🔐 Authorization Server

- Geração de token JWT com customização
- Implementação de fluxo **Client Credentials**
- Implementação de fluxo **Authorization Code com PKCE**
- Armazenamento de autorizações via JDBC
- Suporte a **refresh token**
- Página customizada de login
- Página de consentimento do usuário
- Cadastro de clientes em memória e via JDBC

### 📘 Resource Server

- Proteção de endpoints com validação de token JWT
- Extração de informações customizadas do token
- Validação de escopos e authorities

---

## 🛠️ Tecnologias e Dependências

- Java 17+
- Spring Boot 3
- Spring Security
- Spring Authorization Server
- Spring Data JPA
- MySQL
- JWT (Nimbus)
- Postman (para testes dos fluxos OAuth2)

---

## ▶️ Como Executar

1. Suba o banco MySQL com as tabelas de usuários, grupos e permissões.
2. Configure os dados de conexão no `application.yml`.
3. Execute o projeto com o perfil `default`.
4. Acesse os fluxos de autenticação:
   - `http://localhost:8083/oauth2/authorize` para iniciar o fluxo Authorization Code
   - `http://localhost:8083/oauth2/token` para trocar o código por access_token
   - `http://localhost:8083/oauth2/introspect` para introspecção do token (se estiver usando token opaco)

---

## 📚 Baseado no Curso

Este projeto foi desenvolvido com base no curso:

**Especialista Spring REST - Módulo Spring Authorization Server**  
Instrutor: **AlgaWorks**

---

## ✍️ Autor

**Claudio Vinicius**  
[GitHub]([https://github.com/claudiovdev](https://github.com/claudiovdev)) | [LinkedIn][(https://linkedin.com/in/seu-perfil](https://www.linkedin.com/in/claudiovdev/))  

---

## 📄 Licença

Este projeto está sob a licença MIT.
