package a;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e50 implements a50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxu f7208a;
    public final htz b;
    public final htz c;

    public e50(gxu gxuVar) {
        this.f7208a = gxuVar;
        boolean zIsEmpty = ((mq40) gxuVar.c).f22205a.isEmpty();
        htz htzVar = oq40.f25670a;
        if (zIsEmpty) {
            this.b = htzVar;
            this.c = htzVar;
            return;
        }
        oy40 oy40Var = (oy40) py40.b.f27789a.get();
        oy40Var = oy40Var == null ? py40.c : oy40Var;
        oq40.a(gxuVar);
        oy40Var.getClass();
        this.b = htzVar;
        this.c = htzVar;
    }

    @Override // a.a50
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        htz htzVar = this.b;
        fwb0 fwb0Var = (fwb0) this.f7208a.b;
        try {
            byte[] bArr3 = fwb0Var.c;
            byte[] bArrB0 = nia0.b0(Arrays.copyOf(bArr3, bArr3.length), ((a50) fwb0Var.b).a(bArr, bArr2));
            int i = fwb0Var.f;
            int length = bArr.length;
            htzVar.getClass();
            return bArrB0;
        } catch (GeneralSecurityException e) {
            htzVar.getClass();
            throw e;
        }
    }

    @Override // a.a50
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        gxu gxuVar = this.f7208a;
        htz htzVar = this.c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = gxuVar.d(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((a50) ((fwb0) it.next()).b).b(bArrCopyOfRange, bArr2);
                    htzVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e) {
                    f50.f8936a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = gxuVar.d(y9a.f).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((a50) ((fwb0) it2.next()).b).b(bArr, bArr2);
                htzVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        htzVar.getClass();
        hny.o("decryption failed");
        return null;
    }
}
