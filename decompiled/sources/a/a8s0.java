package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a8s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f443a;
    public final String b = String.valueOf(sre0.f32672a.b(a8s0.class).J());

    public a8s0(boolean z) {
        this.f443a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8s0) && this.f443a == ((a8s0) obj).f443a;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f443a);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof a8s0) || !(p6t0Var2 instanceof a8s0)) {
            return iun.f15405a;
        }
        yni0 yni0Var = new yni0();
        k9x.G(yni0Var, new z7s0(((a8s0) p6t0Var).f443a), new z7s0(((a8s0) p6t0Var2).f443a));
        return cui0.a(yni0Var);
    }

    public final String toString() {
        return kng0.l("TournamentTeamPrizeDistributionCollapsedButtonUiModel(collapsed=", defpackage.c.d("Collapsed(value=", Separators.RPAREN, this.f443a), Separators.RPAREN);
    }
}
