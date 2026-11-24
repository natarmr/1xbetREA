package a;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class h3x0 implements dnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7x0 f12407a;

    public h3x0(b7x0 b7x0Var) {
        this.f12407a = b7x0Var;
    }

    @Override // a.dnw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f12407a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((j3x0) it.next()).f15857a.b(bArr, null);
            } catch (GeneralSecurityException unused) {
            }
        }
        hny.o("decryption failed");
        return null;
    }
}
