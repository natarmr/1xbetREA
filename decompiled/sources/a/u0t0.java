package a;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class u0t0 {
    public static final ThreadLocal d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34872a;
    public final dgu b;
    public volatile int c = 0;

    public u0t0(dgu dguVar, int i) {
        this.b = dguVar;
        this.f34872a = i;
    }

    public final int a(int i) {
        nd40 nd40VarB = b();
        int iA = nd40VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) nd40VarB.d;
        int i2 = iA + nd40VarB.f15098a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final nd40 b() {
        ThreadLocal threadLocal = d;
        nd40 nd40Var = (nd40) threadLocal.get();
        if (nd40Var == null) {
            nd40Var = new nd40();
            threadLocal.set(nd40Var);
        }
        od40 od40Var = (od40) this.b.f6058a;
        int iA = od40Var.a(6);
        if (iA != 0) {
            int i = iA + od40Var.f15098a;
            int i2 = (this.f34872a * 4) + ((ByteBuffer) od40Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) od40Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) od40Var.d;
            nd40Var.d = byteBuffer;
            if (byteBuffer != null) {
                nd40Var.f15098a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                nd40Var.b = i4;
                nd40Var.c = ((ByteBuffer) nd40Var.d).getShort(i4);
                return nd40Var;
            }
            nd40Var.f15098a = 0;
            nd40Var.b = 0;
            nd40Var.c = 0;
        }
        return nd40Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        nd40 nd40VarB = b();
        int iA = nd40VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) nd40VarB.d).getInt(iA + nd40VarB.f15098a) : 0));
        sb.append(", codepoints:");
        nd40 nd40VarB2 = b();
        int iA2 = nd40VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + nd40VarB2.f15098a;
            i = ((ByteBuffer) nd40VarB2.d).getInt(((ByteBuffer) nd40VarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(Separators.SP);
        }
        return sb.toString();
    }
}
