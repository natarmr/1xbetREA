package android.gov.nist.javax.sip.header;

import a.itt0;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.AcceptLanguageHeader;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class AcceptLanguage extends ParametersHeader implements AcceptLanguageHeader {
    private static final long serialVersionUID = -4473982069737324919L;
    protected String languageRange;

    public AcceptLanguage() {
        super("Accept-Language");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.languageRange;
        if (str != null) {
            sb.append(str);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            sb.append(this.parameters.encode());
        }
        return sb;
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public Locale getAcceptLanguage() {
        String str = this.languageRange;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(45);
        return iIndexOf >= 0 ? new Locale(this.languageRange.substring(0, iIndexOf), this.languageRange.substring(iIndexOf + 1)) : new Locale(this.languageRange);
    }

    public String getLanguageRange() {
        return this.languageRange;
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public float getQValue() {
        if (hasParameter("q")) {
            return ((Float) this.parameters.getValue("q")).floatValue();
        }
        return -1.0f;
    }

    public boolean hasQValue() {
        return hasParameter("q");
    }

    public void removeQValue() {
        removeParameter("q");
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public void setAcceptLanguage(Locale locale) {
        if ("".equals(locale.getCountry())) {
            this.languageRange = locale.getLanguage();
            return;
        }
        this.languageRange = locale.getLanguage() + '-' + locale.getCountry();
    }

    public void setLanguageRange(String str) {
        this.languageRange = str.trim();
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public void setQValue(float f) throws InvalidArgumentException {
        double d = f;
        if (d < 0.0d || d > 1.0d) {
            itt0.r("qvalue out of range!");
        } else if (f == -1.0f) {
            removeParameter("q");
        } else {
            setParameter(new NameValue("q", Float.valueOf(f)));
        }
    }
}
