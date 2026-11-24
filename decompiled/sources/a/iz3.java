package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iz3 implements lz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm80 f15617a;
    public final r1o b;

    public iz3(pm80 pm80Var, r1o r1oVar) {
        this.f15617a = pm80Var;
        this.b = r1oVar;
    }

    @Override // a.lz3
    public final pm80 a() {
        return this.f15617a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz3)) {
            return false;
        }
        iz3 iz3Var = (iz3) obj;
        return Intrinsics.d(this.f15617a, iz3Var.f15617a) && this.b.equals(iz3Var.b);
    }

    public final int hashCode() {
        pm80 pm80Var = this.f15617a;
        return this.b.hashCode() + ((pm80Var == null ? 0 : pm80Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f15617a + ", result=" + this.b + Separators.RPAREN;
    }
}
