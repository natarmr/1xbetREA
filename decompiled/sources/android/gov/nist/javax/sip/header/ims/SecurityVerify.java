package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class SecurityVerify extends SecurityAgree implements SecurityVerifyHeader, ExtensionHeader {
    public SecurityVerify() {
        super("Security-Verify");
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
