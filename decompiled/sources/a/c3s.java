package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c3s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3s f3694a;
    public final a4x b;
    public final b830 c;
    public final n930 d;
    public final a4x e;
    public final kg30 f;
    public final ynd g;
    public final d0k0 h;
    public final boolean i;

    public c3s(b3s b3sVar, a4x a4xVar, b830 b830Var, n930 n930Var, a4x a4xVar2, kg30 kg30Var, ynd yndVar, d0k0 d0k0Var, boolean z) {
        b3sVar.getClass();
        a4xVar.getClass();
        b830Var.getClass();
        this.f3694a = b3sVar;
        this.b = a4xVar;
        this.c = b830Var;
        this.d = n930Var;
        this.e = a4xVar2;
        this.f = kg30Var;
        this.g = yndVar;
        this.h = d0k0Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3s)) {
            return false;
        }
        c3s c3sVar = (c3s) obj;
        return Intrinsics.d(this.f3694a, c3sVar.f3694a) && Intrinsics.d(this.b, c3sVar.b) && Intrinsics.d(this.c, c3sVar.c) && this.d.equals(c3sVar.d) && this.e.equals(c3sVar.e) && Intrinsics.d(this.f, c3sVar.f) && Intrinsics.d(this.g, c3sVar.g) && Intrinsics.d(this.h, c3sVar.h) && this.i == c3sVar.i;
    }

    public final int hashCode() {
        int iB = cs0.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b, this.f3694a.hashCode() * 31, 31)) * 31)) * 31, 31);
        kg30 kg30Var = this.f;
        int iHashCode = (iB + (kg30Var == null ? 0 : kg30Var.hashCode())) * 31;
        ynd yndVar = this.g;
        int iHashCode2 = (iHashCode + (yndVar == null ? 0 : yndVar.hashCode())) * 31;
        d0k0 d0k0Var = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode2 + (d0k0Var != null ? d0k0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameClassicUiState(toolbarUiModel=");
        sb.append(this.f3694a);
        sb.append(", backgroundImageUrls=");
        sb.append(this.b);
        sb.append(", marketsUiState=");
        sb.append(this.c);
        sb.append(", matchBoardUiModel=");
        sb.append(this.d);
        sb.append(", matchInfoCardList=");
        sb.append(this.e);
        sb.append(", matchTimer=");
        sb.append(this.f);
        sb.append(", compressedCard=");
        sb.append(this.g);
        sb.append(", simulationNavigateUiModel=");
        sb.append(this.h);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
