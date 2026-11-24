package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ifa0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14677a;
    public final gfa0 b;
    public final gfa0 c;
    public final a4x d;
    public final a4x e;
    public final efa0 f;

    public ifa0(String str, gfa0 gfa0Var, gfa0 gfa0Var2, a4x a4xVar, a4x a4xVar2, efa0 efa0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f14677a = str;
        this.b = gfa0Var;
        this.c = gfa0Var2;
        this.d = a4xVar;
        this.e = a4xVar2;
        this.f = efa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifa0)) {
            return false;
        }
        ifa0 ifa0Var = (ifa0) obj;
        return this.f14677a.equals(ifa0Var.f14677a) && this.b.equals(ifa0Var.b) && this.c.equals(ifa0Var.c) && Intrinsics.d(this.d, ifa0Var.d) && Intrinsics.d(this.e, ifa0Var.e) && this.f.equals(ifa0Var.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f14677a;
    }

    public final int hashCode() {
        return this.f.hashCode() + cs0.b(this.e, cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f14677a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "PlayersCompositionUiModel(key=" + this.f14677a + ", firstTeamInfo=" + this.b + ", secondTeamInfo=" + this.c + ", firstTeamPlayers=" + this.d + ", secondTeamPlayers=" + this.e + ", statisticComposition=" + this.f + Separators.RPAREN;
    }
}
