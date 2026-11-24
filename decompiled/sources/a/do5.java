package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class do5 implements xg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6400a;
    public final int b;

    public do5(boolean z, int i) {
        this.f6400a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do5)) {
            return false;
        }
        do5 do5Var = (do5) obj;
        return this.f6400a == do5Var.f6400a && this.b == do5Var.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof do5) && (p6t0Var2 instanceof do5)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f6400a) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof do5) && (p6t0Var2 instanceof do5)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do5 do5Var = (do5) p6t0Var;
            do5 do5Var2 = (do5) p6t0Var2;
            k9x.G(linkedHashSet, new ao5(do5Var.f6400a), new ao5(do5Var2.f6400a));
            k9x.G(linkedHashSet, new bo5(do5Var.b), new bo5(do5Var2.b));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        return b1j.k("BallUiModel(animationEnable=", defpackage.c.d("AnimationEnable(value=", Separators.RPAREN, this.f6400a), ", imageRes=", ua80.e(this.b, "ImageRes(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
