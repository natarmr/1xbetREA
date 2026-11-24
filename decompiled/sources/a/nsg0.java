package a;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class nsg0 implements Attributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlPullParser f24050a;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.f24050a.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.f24050a.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        XmlPullParser xmlPullParser = this.f24050a;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.f24050a.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.f24050a.getAttributeValue(i);
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }
}
