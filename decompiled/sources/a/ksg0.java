package a;

import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* JADX INFO: loaded from: classes.dex */
public final class ksg0 extends DefaultHandler2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ osg0 f18812a;

    public ksg0(osg0 osg0Var) {
        this.f18812a = osg0Var;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f18812a.F(new String(cArr, i, i2));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f18812a.c(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        osg0.y(new tyc(str2));
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.f18812a.D();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws fsg0 {
        this.f18812a.E(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }
}
