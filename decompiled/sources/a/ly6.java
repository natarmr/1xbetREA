package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ly6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ld5 f20850a;
    public final htv b;
    public final h580 c;
    public final jur d;
    public final f0d e;
    public final g680 f;
    public final boolean g;

    public ly6(ld5 ld5Var, htv htvVar, h580 h580Var, jur jurVar, f0d f0dVar, g680 g680Var, boolean z) {
        ld5Var.getClass();
        htvVar.getClass();
        h580Var.getClass();
        jurVar.getClass();
        f0dVar.getClass();
        this.f20850a = ld5Var;
        this.b = htvVar;
        this.c = h580Var;
        this.d = jurVar;
        this.e = f0dVar;
        this.f = g680Var;
        this.g = z;
    }

    public static ly6 a(ly6 ly6Var, htv htvVar, jur jurVar, f0d f0dVar, g680 g680Var, int i) {
        ld5 ld5Var = ly6Var.f20850a;
        if ((i & 2) != 0) {
            htvVar = ly6Var.b;
        }
        htv htvVar2 = htvVar;
        h580 h580Var = ly6Var.c;
        if ((i & 8) != 0) {
            jurVar = ly6Var.d;
        }
        jur jurVar2 = jurVar;
        if ((i & 16) != 0) {
            f0dVar = ly6Var.e;
        }
        f0d f0dVar2 = f0dVar;
        if ((i & 32) != 0) {
            g680Var = ly6Var.f;
        }
        boolean z = ly6Var.g;
        ld5Var.getClass();
        htvVar2.getClass();
        h580Var.getClass();
        jurVar2.getClass();
        f0dVar2.getClass();
        return new ly6(ld5Var, htvVar2, h580Var, jurVar2, f0dVar2, g680Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly6)) {
            return false;
        }
        ly6 ly6Var = (ly6) obj;
        return Intrinsics.d(this.f20850a, ly6Var.f20850a) && Intrinsics.d(this.b, ly6Var.b) && Intrinsics.d(this.c, ly6Var.c) && Intrinsics.d(this.d, ly6Var.d) && Intrinsics.d(this.e, ly6Var.e) && Intrinsics.d(this.f, ly6Var.f) && this.g == ly6Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f20850a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        g680 g680Var = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode + (g680Var == null ? 0 : g680Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetGameInfoStateModel(backgroundStateModel=");
        sb.append(this.f20850a);
        sb.append(", headlineStateModel=");
        sb.append(this.b);
        sb.append(", opponentsStateModel=");
        sb.append(this.c);
        sb.append(", gameCardStateModel=");
        sb.append(this.d);
        sb.append(", coefficientSettingsStateModel=");
        sb.append(this.e);
        sb.append(", optionBetStateModel=");
        sb.append(this.f);
        sb.append(", isDuelGame=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
