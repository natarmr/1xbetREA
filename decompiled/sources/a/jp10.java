package a;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jp10 implements gp10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxu f16879a;
    public final htz b;
    public final htz c;

    public jp10(gxu gxuVar) {
        this.f16879a = gxuVar;
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

    @Override // a.gp10
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        htz htzVar = this.c;
        if (length <= 5) {
            htzVar.getClass();
            hny.o("tag too short");
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        gxu gxuVar = this.f16879a;
        for (fwb0 fwb0Var : gxuVar.d(bArrCopyOf)) {
            try {
                ((gp10) fwb0Var.b).a(bArrCopyOfRange, fwb0Var.e.equals(af80.LEGACY) ? nia0.b0(bArr2, kp10.b) : bArr2);
                htzVar.getClass();
                return;
            } catch (GeneralSecurityException e) {
                kp10.f18656a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = gxuVar.d(y9a.f).iterator();
        while (it.hasNext()) {
            try {
                ((gp10) ((fwb0) it.next()).b).a(bArr, bArr2);
                htzVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        htzVar.getClass();
        hny.o("invalid MAC");
    }

    @Override // a.gp10
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        htz htzVar = this.b;
        fwb0 fwb0Var = (fwb0) this.f16879a.b;
        if (fwb0Var.e.equals(af80.LEGACY)) {
            bArr = nia0.b0(bArr, kp10.b);
        }
        try {
            byte[] bArr2 = fwb0Var.c;
            byte[] bArrB0 = nia0.b0(Arrays.copyOf(bArr2, bArr2.length), ((gp10) fwb0Var.b).b(bArr));
            int i = fwb0Var.f;
            htzVar.getClass();
            return bArrB0;
        } catch (GeneralSecurityException e) {
            htzVar.getClass();
            throw e;
        }
    }
}
