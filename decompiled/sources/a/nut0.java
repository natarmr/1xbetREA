package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class nut0 implements Comparable, Serializable {
    public static final mut0 c = new mut0(null);
    public static final nut0 d = new nut0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24161a;
    public final long b;

    public nut0(long j, long j2) {
        this.f24161a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nut0 nut0Var = (nut0) obj;
        nut0Var.getClass();
        long j = nut0Var.f24161a;
        long j2 = this.f24161a;
        if (j2 != j) {
            g2t0 g2t0Var = h2t0.b;
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        g2t0 g2t0Var2 = h2t0.b;
        return Long.compare(this.b ^ Long.MIN_VALUE, nut0Var.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nut0)) {
            return false;
        }
        nut0 nut0Var = (nut0) obj;
        return this.f24161a == nut0Var.f24161a && this.b == nut0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24161a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        put0.a(this.f24161a, bArr, 0, 0, 4);
        bArr[8] = 45;
        put0.a(this.f24161a, bArr, 9, 4, 6);
        bArr[13] = 45;
        put0.a(this.f24161a, bArr, 14, 6, 8);
        bArr[18] = 45;
        put0.a(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        put0.a(this.b, bArr, 24, 2, 8);
        return kotlin.text.c.m(bArr);
    }
}
