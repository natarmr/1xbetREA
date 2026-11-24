package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class duv0 {
    public static final l7m0 i = androidx.compose.runtime.e.e(new tly(0.0f, 0.0f, false));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f6715a = androidx.compose.runtime.e.e(hic.g());
    public final pz40 b = androidx.compose.runtime.e.e(new qkx(0));
    public final pz40 c = androidx.compose.runtime.e.e(0);
    public final pz40 d = androidx.compose.runtime.e.e(0);
    public final pz40 e = androidx.compose.runtime.e.e(null);
    public final pz40 f = androidx.compose.runtime.e.e(i);
    public final pz40 g = androidx.compose.runtime.e.e(null);
    public final pz40 h = androidx.compose.runtime.e.e(null);

    public final w6k a() {
        return (w6k) ((hgk0) this.f6715a).getValue();
    }

    public final l7m0 b() {
        return (l7m0) ((hgk0) this.f).getValue();
    }

    public final int c() {
        return ((Number) ((hgk0) this.c).getValue()).intValue();
    }

    public final int d() {
        return ((Number) ((hgk0) this.d).getValue()).intValue();
    }

    public final void e(euv0 euv0Var) {
        w6k w6kVarA = a();
        w6k w6kVar = euv0Var.f8442a;
        long j = euv0Var.b;
        if (!Intrinsics.d(w6kVarA, w6kVar)) {
            w6kVar.getClass();
            ((hgk0) this.f6715a).setValue(w6kVar);
        }
        pz40 pz40Var = this.b;
        if (!qkx.a(((qkx) ((hgk0) pz40Var).getValue()).f28908a, j)) {
            ((hgk0) pz40Var).setValue(new qkx(j));
        }
        int iC = c();
        int i2 = euv0Var.c;
        if (iC != i2) {
            ((hgk0) this.c).setValue(Integer.valueOf(i2));
        }
        int iD = d();
        int i3 = euv0Var.d;
        if (iD != i3) {
            ((hgk0) this.d).setValue(Integer.valueOf(i3));
        }
        pz40 pz40Var2 = this.e;
        vne vneVar = (vne) ((hgk0) pz40Var2).getValue();
        vne vneVar2 = euv0Var.e;
        if (vneVar != vneVar2) {
            ((hgk0) pz40Var2).setValue(vneVar2);
        }
    }
}
