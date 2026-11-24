package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jdw0 {
    protected transient int zza;

    public final byte[] a() {
        try {
            mew0 mew0Var = (mew0) this;
            int iK = mew0Var.k();
            byte[] bArr = new byte[iK];
            boolean z = aew0.b;
            vdw0 vdw0Var = new vdw0(bArr, iK);
            mew0Var.d(vdw0Var);
            if (vdw0Var.x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (vdw0Var.x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            e9d0.m(rw2.o(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int b(egw0 egw0Var);
}
