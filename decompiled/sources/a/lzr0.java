package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lzr0 implements mzr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nzr0 f20919a;
    public final String b;
    public final nrq0 c;

    public lzr0(nzr0 nzr0Var, String str, nrq0 nrq0Var) {
        str.getClass();
        this.f20919a = nzr0Var;
        this.b = str;
        this.c = nrq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzr0)) {
            return false;
        }
        lzr0 lzr0Var = (lzr0) obj;
        return this.f20919a == lzr0Var.f20919a && Intrinsics.d(this.b, lzr0Var.b) && this.c == lzr0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f20919a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Title(cellType=" + this.f20919a + ", title=" + this.b + ", gravityType=" + this.c + Separators.RPAREN;
    }
}
