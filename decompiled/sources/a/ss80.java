package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ss80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32714a;
    public final mp0 b;
    public final pp0 c;
    public final imm d;
    public final tq80 e;
    public final es80 f;
    public final tr80 g;

    public ss80(boolean z, mp0 mp0Var, pp0 pp0Var, imm immVar, tq80 tq80Var, es80 es80Var, tr80 tr80Var) {
        mp0Var.getClass();
        pp0Var.getClass();
        immVar.getClass();
        tq80Var.getClass();
        es80Var.getClass();
        tr80Var.getClass();
        this.f32714a = z;
        this.b = mp0Var;
        this.c = pp0Var;
        this.d = immVar;
        this.e = tq80Var;
        this.f = es80Var;
        this.g = tr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss80)) {
            return false;
        }
        ss80 ss80Var = (ss80) obj;
        return this.f32714a == ss80Var.f32714a && this.b == ss80Var.b && Intrinsics.d(this.c, ss80Var.c) && Intrinsics.d(this.d, ss80Var.d) && Intrinsics.d(this.e, ss80Var.e) && Intrinsics.d(this.f, ss80Var.f) && Intrinsics.d(this.g, ss80Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + h97.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f32714a) * 31)) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PartTypeOneUiState(isPinnedNavigationBar=" + this.f32714a + ", partTypeOneFilterStyle=" + this.b + ", partTypeOneFilterUiModel=" + this.c + ", partTypeOneNavigationBarUiModel=" + this.d + ", partTypeOneAccountSelectionUiModel=" + this.e + ", partTypeOneGamesUiModel=" + this.f + ", partTypeOneBannerUiModel=" + this.g + Separators.RPAREN;
    }
}
