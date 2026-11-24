package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x2d {
    public static final v0h0 g = qxw.L(new e6c(29), new sfc(11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40160a;
    public final float b;
    public final float c;
    public final agk0 d;
    public final agk0 e;
    public final agk0 f;

    public x2d(float f, float f2, float f3) {
        this.f40160a = f;
        this.b = f2;
        this.c = f3;
        this.d = androidx.compose.runtime.e.a(f);
        this.e = androidx.compose.runtime.e.a(f3);
        this.f = androidx.compose.runtime.e.a(f2);
    }

    public final float a() {
        agk0 agk0Var = this.d;
        if (agk0Var.l() == 0.0f) {
            return 0.0f;
        }
        return this.f.l() / agk0Var.l();
    }

    public final void b(float f) {
        this.f.m(l1e0.c(f, this.d.l(), 0.0f));
    }

    public final void c(float f) {
        this.d.m(f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2d)) {
            return false;
        }
        x2d x2dVar = (x2d) obj;
        return Float.compare(this.f40160a, x2dVar.f40160a) == 0 && Float.compare(this.b, x2dVar.b) == 0 && Float.compare(this.c, x2dVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f40160a) * 31, this.b, 31);
    }

    public final String toString() {
        return kng0.o(dw9.s(this.f40160a, this.b, "CollapsingToolbarScrollState(initialHeightOffsetLimit=", ", initialHeightOffset=", ", initialContentOffset="), this.c, Separators.RPAREN);
    }
}
