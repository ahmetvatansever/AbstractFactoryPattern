package abstractFactoryFileExporter;

public class Run {

    public static void main(String[] args) {
	    /*
        Fabrika metodunu kodunuzun çalışması gereken nesnelerin tipi ve bağımlılıklarını tam olarak bilmediğinizde kullanabilirsiniz.

        Fabrika metodu ürün oluşturma kodunu, ürünü kullanan koddan ayırır. Böylece yeni ürün oluşturma kodları kodun geri kalanından bağımsız olarak yazılabilir.

        Örneğin yeni bir ürün tipi oluşturmak için sadece yeni bir oluşturucu alt sınıf ekler ve onun içerisinde fabrika metodunu ezersiniz.
        */

        ExcelExporter excelExporter = new ExcelExporter();
        String excelStr = excelExporter.export("TEST_EXCEL");
        System.out.println(excelStr);

        PdfExporter pdfExporter = new PdfExporter();
        String pdfStr = pdfExporter.export("TEST_PDF");
        System.out.println(pdfStr);
    }
}
