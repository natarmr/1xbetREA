package android.gov.nist.javax.sdp;

import a.mji0;
import a.ohq;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class SdpEncoderImpl {
    public void output(mji0 mji0Var, OutputStream outputStream) throws IOException {
        if (!(outputStream instanceof ObjectOutputStream)) {
            ohq.l("The output stream has to be an instance of ObjectOutputStream");
            return;
        }
        ObjectOutputStream objectOutputStream = (ObjectOutputStream) outputStream;
        if (mji0Var != null) {
            objectOutputStream.writeObject(mji0Var);
        } else {
            ohq.l("The parameter is null");
        }
    }

    public void setEncoding(String str) throws UnsupportedEncodingException {
        throw new UnsupportedEncodingException("Method not supported");
    }

    public void setRtpmapAttribute(boolean z) {
    }

    public void setTypedTime(boolean z) {
    }
}
