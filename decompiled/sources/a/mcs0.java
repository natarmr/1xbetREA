package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mcs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21565a;
    public final byte[] b;
    public final int c;
    public final int d;

    public mcs0(int i, byte[] bArr, int i2, int i3) {
        this.f21565a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mcs0.class != obj.getClass()) {
            return false;
        }
        mcs0 mcs0Var = (mcs0) obj;
        return this.f21565a == mcs0Var.f21565a && this.c == mcs0Var.c && this.d == mcs0Var.d && Arrays.equals(this.b, mcs0Var.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.f21565a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
