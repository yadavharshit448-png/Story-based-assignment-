
import sys
import codecs

# Force stdout to utf-8 just in case
if sys.stdout.encoding != 'utf-8':
    sys.stdout = codecs.getwriter('utf-8')(sys.stdout.buffer, 'strict')

try:
    import PyPDF2
except ImportError:
    try:
        import pypdf
        PyPDF2 = pypdf
    except ImportError:
        print("PyPDF2 or pypdf not installed")
        sys.exit(1)

def extract_text(pdf_path, output_path):
    try:
        with open(pdf_path, 'rb') as file:
            reader = PyPDF2.PdfReader(file)
            text = ""
            for page in reader.pages:
                text += page.extract_text() + "\n"
        
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write(text)
        print(f"Successfully extracted text to {output_path}")
        return text
    except Exception as e:
        print(f"Error reading PDF: {e}")
        return ""

if __name__ == "__main__":
    pdf_path = "Story Based Problems.pdf"
    output_path = "pdf_content.txt"
    extract_text(pdf_path, output_path)
