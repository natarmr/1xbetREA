package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface PUserDatabaseHeader extends Parameters, Header {
    public static final String NAME = "P-User-Database";

    String getDatabaseName();

    void setDatabaseName(String str);
}
