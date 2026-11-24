package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mjg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjg0 f21895a;
    public final n0x b;
    public final n0x c;
    public final n0x d;
    public final boolean e;
    public final gig0 f;

    public mjg0(hjg0 hjg0Var, n0x n0xVar, n0x n0xVar2, n0x n0xVar3, boolean z, gig0 gig0Var) {
        this.f21895a = hjg0Var;
        this.b = n0xVar;
        this.c = n0xVar2;
        this.d = n0xVar3;
        this.e = z;
        this.f = gig0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjg0)) {
            return false;
        }
        mjg0 mjg0Var = (mjg0) obj;
        return this.f21895a.equals(mjg0Var.f21895a) && this.b.equals(mjg0Var.b) && this.c.equals(mjg0Var.c) && this.d.equals(mjg0Var.d) && this.e == mjg0Var.e && Intrinsics.d(this.f, mjg0Var.f);
    }

    public final int hashCode() {
        int iE = brm0.e(f140.f(this.d, f140.f(this.c, f140.f(this.b, this.f21895a.hashCode() * 31, 31), 31), 31), 31, this.e);
        gig0 gig0Var = this.f;
        return iE + (gig0Var == null ? 0 : gig0Var.hashCode());
    }

    public final String toString() {
        return "RpsPlayerHandState(animationAction=" + this.f21895a + ", handImageRes=" + this.b + ", defaultImageRes=" + this.c + ", resultImageRes=" + this.d + ", isImmediate=" + this.e + ", animationParams=" + this.f + Separators.RPAREN;
    }
}
