package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ContentLanguageHeader;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ContentLanguage extends SIPHeader implements ContentLanguageHeader {
    private static final long serialVersionUID = -5195728427134181070L;
    protected Locale locale;

    public ContentLanguage(String str) {
        super("Content-Language");
        setLanguageTag(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ContentLanguage contentLanguage = (ContentLanguage) super.clone();
        Locale locale = this.locale;
        if (locale != null) {
            contentLanguage.locale = (Locale) locale.clone();
        }
        return contentLanguage;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(getLanguageTag());
        return sb;
    }

    @Override // android.javax.sip.header.ContentLanguageHeader
    public Locale getContentLanguage() {
        return this.locale;
    }

    public String getLanguageTag() {
        boolean zEquals = "".equals(this.locale.getCountry());
        Locale locale = this.locale;
        if (zEquals) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + '-' + this.locale.getCountry();
    }

    @Override // android.javax.sip.header.ContentLanguageHeader
    public void setContentLanguage(Locale locale) {
        this.locale = locale;
    }

    public void setLanguageTag(String str) {
        int iIndexOf = str.indexOf(45);
        if (iIndexOf >= 0) {
            this.locale = new Locale(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } else {
            this.locale = new Locale(str);
        }
    }

    public ContentLanguage() {
        super("Content-Language");
    }
}
