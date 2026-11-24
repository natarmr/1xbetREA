package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vea0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boo0 f37275a;
    public final boolean b;
    public final a4x c;
    public final a4x d;

    public vea0(boo0 boo0Var, boolean z, i4 i4Var, i4 i4Var2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f37275a = boo0Var;
        this.b = z;
        this.c = i4Var;
        this.d = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vea0)) {
            return false;
        }
        vea0 vea0Var = (vea0) obj;
        return this.f37275a.equals(vea0Var.f37275a) && this.b == vea0Var.b && Intrinsics.d(this.c, vea0Var.c) && Intrinsics.d(this.d, vea0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, brm0.e(this.f37275a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "PlayersAbilitiesUiModel(tabs=" + this.f37275a + ", firstTeamSelected=" + this.b + ", heroesPictures=" + this.c + ", heroesLevelAbilities=" + this.d + Separators.RPAREN;
    }
}
