package abstractFactoryFileExporter;

public class PdfExporter implements FileExporterFactory{
    @Override
    public String export(String content) {
        return "pdf --> " + content;
    }
}
