package android.gov.nist.javax.sip.header;

import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface ParametersExt extends Parameters {
    String getParameter(String str, boolean z);

    void setQuotedParameter(String str, String str2);
}
