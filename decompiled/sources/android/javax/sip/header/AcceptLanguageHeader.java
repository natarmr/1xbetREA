package android.javax.sip.header;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface AcceptLanguageHeader extends Parameters, Header {
    public static final String NAME = "Accept-Language";

    Locale getAcceptLanguage();

    float getQValue();

    void setAcceptLanguage(Locale locale);

    void setQValue(float f);
}
