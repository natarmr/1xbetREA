package a;

import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o5w0 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding");
    }
}
