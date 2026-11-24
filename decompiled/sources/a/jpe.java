package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jpe implements ope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16895a;
    public final long b;
    public final long c;
    public final String d;

    public jpe(long j, long j2, long j3, String str) {
        str.getClass();
        this.f16895a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpe)) {
            return false;
        }
        jpe jpeVar = (jpe) obj;
        long j = jpeVar.f16895a;
        int i = y3d.h;
        return h2t0.a(this.f16895a, j) && h2t0.a(this.b, jpeVar.b) && h2t0.a(this.c, jpeVar.c) && Intrinsics.d(this.d, jpeVar.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(true) + ua80.b(rw2.b(rw2.b(Long.hashCode(this.f16895a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.f16895a);
        String strI2 = y3d.i(this.b);
        return ua80.m(b1j.n("Rounded(textColor=", strI, ", backgroundColor=", strI2, ", borderColor="), y3d.i(this.c), ", labelText=", this.d, ", hasBorder=true)");
    }
}
