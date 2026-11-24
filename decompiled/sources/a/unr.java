package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class unr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final snr f35977a;
    public final a4x b;
    public final f0k0 c;
    public final zym0 d;
    public final a4x e;
    public final a4x f;
    public final boolean g;
    public final dja h;
    public final znd i;
    public final boolean j;

    public unr(snr snrVar, a4x a4xVar, f0k0 f0k0Var, zym0 zym0Var, a4x a4xVar2, a4x a4xVar3, boolean z, dja djaVar, znd zndVar, boolean z2) {
        snrVar.getClass();
        a4xVar.getClass();
        zym0Var.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f35977a = snrVar;
        this.b = a4xVar;
        this.c = f0k0Var;
        this.d = zym0Var;
        this.e = a4xVar2;
        this.f = a4xVar3;
        this.g = z;
        this.h = djaVar;
        this.i = zndVar;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unr)) {
            return false;
        }
        unr unrVar = (unr) obj;
        return Intrinsics.d(this.f35977a, unrVar.f35977a) && Intrinsics.d(this.b, unrVar.b) && Intrinsics.d(this.c, unrVar.c) && Intrinsics.d(this.d, unrVar.d) && Intrinsics.d(this.e, unrVar.e) && Intrinsics.d(this.f, unrVar.f) && this.g == unrVar.g && this.h == unrVar.h && Intrinsics.d(this.i, unrVar.i) && this.j == unrVar.j;
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f35977a.hashCode() * 31, 31);
        f0k0 f0k0Var = this.c;
        int iE = brm0.e(cs0.b(this.f, cs0.b(this.e, (this.d.hashCode() + ((iB + (f0k0Var == null ? 0 : f0k0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.g);
        dja djaVar = this.h;
        int iHashCode = (iE + (djaVar == null ? 0 : djaVar.hashCode())) * 31;
        znd zndVar = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode + (zndVar != null ? zndVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameAdvancedUiState(toolbarUiModel=");
        sb.append(this.f35977a);
        sb.append(", backgroundImageUrls=");
        sb.append(this.b);
        sb.append(", simulationNavigateUiModel=");
        sb.append(this.c);
        sb.append(", subGamesUiState=");
        sb.append(this.d);
        sb.append(", matchInfoCardList=");
        hne.y(sb, this.e, ", displayedCards=", this.f, ", isCardsSectionExpanded=");
        sb.append(this.g);
        sb.append(", currentGameInfoCardType=");
        sb.append(this.h);
        sb.append(", compressedCard=");
        sb.append(this.i);
        sb.append(", rtlSupport=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
