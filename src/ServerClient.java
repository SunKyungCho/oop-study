import spec.Language;

public abstract class ServerClient implements Paper {

    Server server = new Server("test");
    Language backEndLanguage = new Language("java");
    Language frontEndLanguage = new Language("kotlinJS");

    protected Programmer backEndProgrammer;
    protected Programmer frontEndProgrammer;

    public void setBackEndProgrammer(Programmer backEndProgrammer) {
        this.backEndProgrammer = backEndProgrammer;
    }

    public void setFrontEndProgrammer(Programmer frontEndProgrammer) {
        this.frontEndProgrammer = frontEndProgrammer;
    }

}
