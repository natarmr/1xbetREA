package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class SecurityClient extends SecurityAgree implements SecurityClientHeader, ExtensionHeader {
    public SecurityClient() {
        super("Security-Client");
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
