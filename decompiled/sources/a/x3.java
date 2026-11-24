package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x3 implements f540 {
    protected int memoizedHashCode;

    public abstract int b(o2h0 o2h0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract yit d();

    public final byte[] e() {
        try {
            int iB = ((jjt) this).b(null);
            byte[] bArr = new byte[iB];
            ryc rycVar = new ryc(bArr, iB);
            g(rycVar);
            if (iB - rycVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            e9d0.m(c("byte array"), e);
            return null;
        }
    }

    public final kg9 f() {
        try {
            int iB = ((jjt) this).b(null);
            kg9 kg9Var = og9.b;
            byte[] bArr = new byte[iB];
            ryc rycVar = new ryc(bArr, iB);
            g(rycVar);
            if (iB - rycVar.d == 0) {
                return new kg9(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            e9d0.m(c("ByteString"), e);
            return null;
        }
    }

    public abstract void g(ryc rycVar);
}
