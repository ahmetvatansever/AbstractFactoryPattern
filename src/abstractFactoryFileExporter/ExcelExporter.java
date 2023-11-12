package abstractFactoryFileExporter;

public class ExcelExporter implements FileExporterFactory{
    @Override
    public String export(String content) {
        return "excel --> " + content;
    }
}