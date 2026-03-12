# Como Compilar o Jogo "Eu, Daniela" Online e Grátis

Para compilar o seu jogo sem baixar nenhum programa, você pode usar o **GitHub Actions**. É uma ferramenta gratuita que cria o APK para você automaticamente na nuvem.

### Passo 1: Criar um Repositório no GitHub
1. Crie uma conta no [GitHub](https://github.com) (se não tiver).
2. Crie um novo repositório chamado `EuDaniela`.
3. Suba todos os arquivos desta pasta ZIP para o seu repositório.

### Passo 2: Configurar a Compilação Automática
Crie uma pasta chamada `.github/workflows` no seu repositório e adicione um arquivo chamado `android.yml` com o seguinte conteúdo:

```yaml
name: Android CI
on: [push]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v3
    - name: set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: gradle
    - name: Grant execute permission for gradlew
      run: chmod +x gradlew
    - name: Build with Gradle
      run: ./gradlew assembleDebug
    - name: Upload APK
      uses: actions/upload-artifact@v3
      with:
        name: app-debug
        path: app/build/outputs/apk/debug/app-debug.apk
```

### Passo 3: Baixar o APK
1. Assim que você salvar esse arquivo, o GitHub começará a "trabalhar" (veja na aba **Actions**).
2. Quando terminar (ficar verde), clique no processo e baixe o arquivo em **Artifacts**.
3. Pronto! Você terá o arquivo `app-debug.apk` para instalar no seu Android.

---

### Opção 2: Testar Online (Sem Instalar)
Se você quiser apenas ver o jogo funcionando sem instalar no celular:
1. Vá ao site [Appetize.io](https://appetize.io).
2. Suba o APK que você gerou no GitHub.
3. Você poderá jogar diretamente no navegador!

---

**Dica:** Para instalar o APK no seu celular, lembre-se de ativar a opção "Instalar de fontes desconhecidas" nas configurações do Android.
