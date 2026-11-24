package android.gov.nist.javax.sip.header.extensions;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface ReferencesHeader extends Parameters, Header {
    public static final String CHAIN = "chain";
    public static final String INQUIRY = "inquiry";
    public static final String NAME = "References";
    public static final String REFER = "refer";
    public static final String REL = "rel";
    public static final String SEQUEL = "sequel";
    public static final String SERVICE = "service";
    public static final String XFER = "xfer";

    String getCallId();

    String getRel();

    void setCallId(String str);

    void setRel(String str);
}
