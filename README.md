# Regras de Negócio da Classe Veterinaria

## Atributos
- **clientes**: Lista de clientes da veterinária, do tipo `ArrayList<Cliente>`.
- **pets**: Lista de animais de estimação da veterinária, do tipo `ArrayList<Animal>`.
- **consultas**: Lista de consultas da veterinária, do tipo `ArrayList<Consulta>`.
- **veterinarios**: Lista de veterinários da veterinária, do tipo `ArrayList<Veterinario>`.
- **procedimentos**: Lista de procedimentos da veterinária, do tipo `ArrayList<Procedimento>`.

## Construtor
- **Veterinaria()**: Inicializa as listas de clientes, pets, consultas, veterinarios e procedimentos.

## Métodos
- **adicionarCliente(Cliente cliente)**:
    - Adiciona um cliente à lista de clientes.
    - Se a lista de clientes for nula, retorna "Cliente inválido".
    - Se o cliente já estiver cadastrado, retorna "Cliente já cadastrado".
    - Caso contrário, adiciona o cliente à lista e retorna "Cliente cadastrado com sucesso".

- **removerCliente(Cliente cliente)**:
    - Remove um cliente da lista de clientes.
    - Se a lista de clientes for nula, retorna "Cliente inválido".
    - Se o cliente não estiver cadastrado, retorna "Cliente não cadastrado".
    - Caso contrário, remove o cliente da lista e retorna "Cliente removido com sucesso".

- **buscarCliente(String cpf)**:
    - Busca um cliente pelo CPF na lista de clientes.
    - Retorna o cliente se encontrado, caso contrário, retorna `null`.

- **adicionarAnimal(Animal animal)**:
    - Adiciona um animal à lista de animais.
    - Se a lista de pets for nula, retorna "Animal inválido".
    - Se o animal já estiver cadastrado, retorna "Animal já cadastrado".
    - Caso contrário, adiciona o animal à lista e retorna "Animal cadastrado com sucesso".

- **removerAnimal(Animal animal)**:
    - Remove um animal da lista de animais.
    - Se a lista de pets for nula, retorna "Animal inválido".
    - Se o animal não estiver cadastrado, retorna "Animal não cadastrado".
    - Caso contrário, remove o animal da lista e retorna "Animal removido com sucesso".

- **buscarAnimal(String nome)**:
    - Busca um animal pelo nome na lista de animais.
    - Retorna o animal se encontrado, caso contrário, retorna `null`.

- **adicionarConsulta(Consulta consulta)**:
    - Adiciona uma consulta à lista de consultas.
    - Se a lista de consultas for nula, retorna "Consulta inválida".
    - Se a consulta já estiver cadastrada, retorna "Consulta já cadastrada".
    - Caso contrário, adiciona a consulta à lista e retorna "Consulta cadastrada com sucesso".

- **removerConsulta(Consulta consulta)**:
    - Remove uma consulta da lista de consultas.
    - Se a lista de consultas for nula, retorna "Consulta inválida".
    - Se a consulta não estiver cadastrada, retorna "Consulta não cadastrada".
    - Caso contrário, remove a consulta da lista e retorna "Consulta removida com sucesso".

- **buscarConsulta(int id)**:
    - Busca uma consulta pelo ID na lista de consultas.
    - Retorna a consulta se encontrada, caso contrário, retorna `null`.

- **adicionarVeterinario(Veterinario veterinario)**:
    - Adiciona um veterinário à lista de veterinários.
    - Se a lista de veterinários for nula, retorna "Veterinário inválido".
    - Se o veterinário já estiver cadastrado, retorna "Veterinário já cadastrado".
    - Caso contrário, adiciona o veterinário à lista e retorna "Veterinário cadastrado com sucesso".

- **removerVeterinario(Veterinario veterinario)**:
    - Remove um veterinário da lista de veterinários.
    - Se a lista de veterinários for nula, retorna "Veterinário inválido".
    - Se o veterinário não estiver cadastrado, retorna "Veterinário não cadastrado".
    - Caso contrário, remove o veterinário da lista e retorna "Veterinário removido com sucesso".

- **buscarVeterinario(String cpf)**:
    - Busca um veterinário pelo CPF na lista de veterinários.
    - Retorna o veterinário se encontrado, caso contrário, retorna `null`.

- **adicionarProcedimento(Procedimento procedimento)**:
    - Adiciona um procedimento à lista de procedimentos.
    - Se a lista de procedimentos for nula, retorna "Procedimento inválido".
    - Se o procedimento já estiver cadastrado, retorna "Procedimento já cadastrado".
    - Caso contrário, adiciona o procedimento à lista e retorna "Procedimento cadastrado com sucesso".

- **removerProcedimento(Procedimento procedimento)**:
    - Remove um procedimento da lista de procedimentos.
    - Se a lista de procedimentos for nula, retorna "Procedimento inválido".
    - Se o procedimento não estiver cadastrado, retorna "Procedimento não cadastrado".
    - Caso contrário, remove o procedimento da lista e retorna "Procedimento removido com sucesso".

- **buscarProcedimento(String nome)**:
    - Busca um procedimento pelo nome na lista de procedimentos.
    - Retorna o procedimento se encontrado, caso contrário, retorna `null`.

## Regras de Negócio
- A lista de clientes, pets, consultas, veterinários e procedimentos são inicializadas no momento da criação do objeto `Veterinaria`.
- Um cliente pode ser adicionado ou removido da lista de clientes através dos métodos `adicionarCliente(Cliente cliente)` e `removerCliente(Cliente cliente)`.
- Um animal pode ser adicionado ou removido da lista de animais através dos métodos `adicionarAnimal(Animal animal)` e `removerAnimal(Animal animal)`.
- Uma consulta pode ser adicionada ou removida da lista de consultas através dos métodos `adicionarConsulta(Consulta consulta)` e `removerConsulta(Consulta consulta)`.
- Um veterinário pode ser adicionado ou removido da lista de veterinários através dos métodos `adicionarVeterinario(Veterinario veterinario)` e `removerVeterinario(Veterinario veterinario)`.
- Um procedimento pode ser adicionado ou removido da lista de procedimentos através dos métodos `adicionarProcedimento(Procedimento procedimento)` e `removerProcedimento(Procedimento procedimento)`.

---

# Regras de Negócio da Classe Procedimento

## Atributos
- **nome**: Representa o nome do procedimento.
- **preco**: Representa o preço do procedimento.
- **gato**: Indica se o procedimento é aplicável a gatos.
- **cachorro**: Indica se o procedimento é aplicável a cachorros.

## Construtor
- **Procedimento(String nome, double preco, boolean gato, boolean cachorro)**: Inicializa os atributos `nome`, `preco`, `gato` e `cachorro`.

## Métodos
- **getNome()**: Retorna o nome do procedimento.
- **getPreco()**: Retorna o preço do procedimento.
- **isGato()**: Retorna `true` se o procedimento é aplicável a gatos, caso contrário, retorna `false`.
- **isCachorro()**: Retorna `true` se o procedimento é aplicável a cachorros, caso contrário, retorna `false`.

## Regras de Negócio
- O nome do procedimento (`nome`) e o preço (`preco`) são definidos no momento da criação do objeto e podem ser acessados através dos métodos `getNome()` e `getPreco()`.
- A aplicabilidade do procedimento a gatos (`gato`) e a cachorros (`cachorro`) é definida no momento da criação do objeto e pode ser acessada através dos métodos `isGato()` e `isCachorro()`.

---

# Regras de Negócio da Classe Consulta

## Atributos
- **id**: Identificador único da consulta.
- **animal**: Representa o animal que será atendido na consulta.
- **veterinario**: Representa o veterinário responsável pela consulta.
- **data**: Representa a data da consulta.
- **procedimento**: Representa o procedimento a ser realizado na consulta.
- **atendida**: Indica se a consulta foi atendida.
- **validada**: Indica se a consulta foi validada.

## Construtor
- **Consulta(Animal animal, Veterinario veterinario, String data, Procedimento procedimento)**: Inicializa os atributos `animal`, `veterinario`, `data`, `procedimento`, `atendida` e `validada`. O atributo `id` é inicializado com um valor único.

## Métodos
- **getAnimal()**: Retorna o animal da consulta.
- **getData()**: Retorna a data da consulta.
- **isAtendida()**: Retorna `true` se a consulta foi atendida, caso contrário, retorna `false`.
- **isValidada()**: Retorna `true` se a consulta foi validada, caso contrário, retorna `false`.
- **getId()**: Retorna o identificador único da consulta.
- **getVeterinario()**: Retorna o veterinário responsável pela consulta.
- **getProcedimento()**: Retorna o procedimento a ser realizado na consulta.
- **atender()**: Marca a consulta como atendida se ela estiver validada.
- **validar()**: Valida a consulta se ela ainda não foi atendida, retornando `true` se foi possível validar, caso contrário, `false`.

## Regras de Negócio
- A consulta só pode ser validada uma vez e não pode ser atendida até ser validada.
- O atributo `id` é único para cada consulta e gerado automaticamente.
- A consulta deve ser validada antes de ser atendida.

---

# Regras de Negócio da Classe Veterinario

## Atributos
- `procedimentos`: Lista de procedimentos realizados pelo veterinário, do tipo `ArrayList<Procedimento>`.
- `consultas`: Lista de consultas realizadas pelo veterinário, do tipo `ArrayList<Consulta>`.

## Construtor
- `Veterinario(String nome, String cpf, String telefone)`: Inicializa os atributos `nome`, `cpf`, `telefone`, `procedimentos` e `consultas`.

## Métodos
- `getConsultas()`: Retorna a lista de consultas do veterinário.
- `getProcedimentos()`: Retorna a lista de procedimentos do veterinário.
- `adicionarProcedimento(Procedimento procedimento)`: Adiciona um procedimento ao veterinário.
    - Se o procedimento for nulo, retorna "Procedimento inválido".
    - Se o procedimento já estiver cadastrado, retorna "Procedimento já cadastrado".
    - Caso contrário, adiciona o procedimento à lista e retorna "Procedimento cadastrado com sucesso".
- `removerProcedimento(Procedimento procedimento)`: Remove um procedimento do veterinário.
    - Se o procedimento for nulo, retorna "Procedimento inválido".
    - Se o procedimento não estiver cadastrado, retorna "Procedimento não cadastrado".
    - Caso contrário, remove o procedimento da lista e retorna "Procedimento removido com sucesso".
- `adicionarConsulta(Consulta consulta)`: Adiciona uma consulta ao veterinário.
    - Se a consulta for nula, retorna `false`.
    - Se a consulta já estiver cadastrada, retorna `false`.
    - Se o procedimento da consulta não estiver na lista de procedimentos do veterinário, retorna `false`.
    - Se o veterinário da consulta não for o mesmo que está adicionando, retorna `false`.
    - Caso contrário, adiciona a consulta à lista e retorna `true`.
- `atenderConsulta(Consulta consulta)`: Atende uma consulta do veterinário.
    - Se a consulta não estiver na lista de consultas do veterinário, retorna "Consulta não encontrada".
    - Se a consulta não pertencer ao veterinário, retorna "Consulta não pertence a este veterinário".
    - Caso contrário, marca a consulta como atendida e retorna "Consulta atendida com sucesso".

## Regras de Negócio
- A classe `Veterinario` herda da classe `Pessoa`, portanto, todas as regras de negócio da classe `Pessoa` também se aplicam a `Veterinario`.
- A lista de procedimentos (`procedimentos`) e a lista de consultas (`consultas`) são inicializadas no momento da criação do objeto `Veterinario`.
- Um procedimento pode ser adicionado ao veterinário através do método `adicionarProcedimento(Procedimento procedimento)`.
- Um procedimento pode ser removido do veterinário através do método `removerProcedimento(Procedimento procedimento)`.
- Uma consulta pode ser adicionada ao veterinário através do método `adicionarConsulta(Consulta consulta)`.
- Uma consulta pode ser atendida pelo veterinário através do método `atenderConsulta(Consulta consulta)`.

---

# Regras de Negócio da Classe Cliente

## Atributos
- `pets`: Lista de animais de estimação do cliente, do tipo `ArrayList<Animal>`.

## Construtor
- `Cliente(String nome, String cpf, String telefone)`: Inicializa os atributos `nome`, `cpf`, `telefone` e a lista de `pets`.

## Métodos
- `adicionarPet(Animal pet)`: Adiciona um animal de estimação ao cliente.
    - Se a lista de pets for nula, retorna "Pet inválido".
    - Se o animal já estiver cadastrado, retorna "Pet já cadastrado".
    - Caso contrário, adiciona o animal à lista de pets, define o cliente como dono do animal e retorna "Pet cadastrado com sucesso".
- `removerPet(Animal pet)`: Remove um animal de estimação do cliente.
    - Se a lista de pets for nula, retorna "Pet inválido".
    - Se o animal não estiver cadastrado, retorna "Pet não cadastrado".
    - Caso contrário, remove o animal da lista de pets, remove o cliente como dono do animal e retorna "Pet removido com sucesso".
- `getPets()`: Retorna a lista de animais de estimação do cliente.

## Regras de Negócio
- A classe `Cliente` herda da classe `Pessoa`, portanto, todas as regras de negócio da classe `Pessoa` também se aplicam a `Cliente`.
- A lista de animais de estimação (`pets`) é inicializada no momento da criação do objeto `Cliente`.
- Um animal de estimação pode ser adicionado ao cliente através do método `adicionarPet(Animal pet)`, que também define o cliente como dono do animal.
- Um animal de estimação pode ser removido do cliente através do método `removerPet(Animal pet)`, que também remove o cliente como dono do animal.

---

# Regras de Negócio da Classe Pessoa

## Atributos
- `nome`: Representa o nome da pessoa.
- `cpf`: Representa o CPF da pessoa.
- `telefone`: Representa o telefone da pessoa.

## Construtor
- `Pessoa(String nome, String cpf, String telefone)`: Inicializa os atributos `nome`, `cpf` e `telefone`.

## Métodos
- `getNome()`: Retorna o nome da pessoa.
- `getCpf()`: Retorna o CPF da pessoa.
- `getTelefone()`: Retorna o telefone da pessoa.

## Regras de Negócio
- A classe `Pessoa` é abstrata, portanto, não pode ser instanciada diretamente.
- Os atributos `nome`, `cpf` e `telefone` são definidos no momento da criação do objeto e podem ser acessados através dos métodos `getNome()`, `getCpf()` e `getTelefone()`.

---

# Regras de Negócio da Classe Gato

## Atributos
- `tipoPelagem`: Representa o tipo de pelagem do gato.
- `arisco`: Indica se o gato é arisco.

## Construtor
- `Gato(String nome, String dataNascimento, String tipoPelagem, boolean arisco)`: Inicializa os atributos `nome`, `dataNascimento`, `tipoPelagem` e `arisco`.

## Métodos
- `getTipoPelagem()`: Retorna o tipo de pelagem do gato.
- `isArisco()`: Retorna `true` se o gato for arisco, caso contrário, retorna `false`.

## Regras de Negócio
- A classe `Gato` herda da classe `Animal`, portanto, todas as regras de negócio da classe `Animal` também se aplicam a `Gato`.
- O tipo de pelagem do gato (`tipoPelagem`) e se ele é arisco (`arisco`) são definidos no momento da criação do objeto e podem ser acessados através dos métodos `getTipoPelagem()` e `isArisco()`.

---

# Regras de Negócio da Classe Animal

## Atributos
- `nome`: Representa o nome do animal.
- `dataNascimento`: Representa a data de nascimento do animal.
- `dono`: Representa o dono do animal, do tipo `Cliente`.
- `consultas`: Lista de consultas do animal, do tipo `ArrayList<Consulta>`.

## Construtor
- `Animal(String nome, String dataNascimento)`: Inicializa os atributos `nome`, `dataNascimento` e a lista de `consultas`.

## Métodos
- `getNome()`: Retorna o nome do animal.
- `getDataNascimento()`: Retorna a data de nascimento do animal.
- `getDono()`: Retorna o dono do animal.
- `getConsultas()`: Retorna a lista de consultas do animal.

## Regras de Negócio
- `adicionarConsulta(Consulta consulta)`: Adiciona uma consulta ao animal.
    - Se a consulta for nula, retorna "Consulta inválida".
    - Se a consulta já estiver cadastrada, retorna "Consulta já cadastrada".
    - Caso contrário, adiciona a consulta à lista e retorna "Consulta cadastrada com sucesso".
- `adicionarDono(Cliente dono)`: Adiciona um dono ao animal.
    - Se o dono for nulo, retorna "Dono inválido".
    - Se o dono já estiver cadastrado, retorna "Dono já cadastrado".
    - Caso contrário, define o dono do animal e adiciona o animal à lista de pets do dono, retornando "Dono cadastrado com sucesso".
- `removerDono()`: Remove o dono do animal, definindo o atributo `dono` como `null`.

---

# Regras de Negócio da Classe Cachorro

## Atributos
- `raca`: Representa a raça do cachorro.
- `adestrado`: Indica se o cachorro é adestrado.

## Construtor
- `Cachorro(String nome, String dataNascimento, String raca, boolean adestrado)`: Inicializa os atributos `nome`, `dataNascimento`, `raca` e `adestrado`.

## Métodos
- `getRaca()`: Retorna a raça do cachorro.
- `isAdestrado()`: Retorna `true` se o cachorro for adestrado, caso contrário, retorna `false`.

## Regras de Negócio
- A classe `Cachorro` herda da classe `Animal`, portanto, todas as regras de negócio da classe `Animal` também se aplicam a `Cachorro`.
- A raça do cachorro (`raca`) e se ele é adestrado (`adestrado`) são definidos no momento da criação do objeto e podem ser acessados através dos métodos `getRaca()` e `isAdestrado()`.
