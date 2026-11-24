package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojs f27105a;
    public final yym0 b;
    public final tf50 c;
    public final zrr d;
    public final l49 e;
    public final e0k0 f;
    public final a4x g;
    public final boolean h;
    public final a4x i;

    public pjs(ojs ojsVar, yym0 yym0Var, tf50 tf50Var, zrr zrrVar, l49 l49Var, e0k0 e0k0Var, a4x a4xVar, boolean z, a4x a4xVar2) {
        ojsVar.getClass();
        yym0Var.getClass();
        zrrVar.getClass();
        l49Var.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f27105a = ojsVar;
        this.b = yym0Var;
        this.c = tf50Var;
        this.d = zrrVar;
        this.e = l49Var;
        this.f = e0k0Var;
        this.g = a4xVar;
        this.h = z;
        this.i = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjs)) {
            return false;
        }
        pjs pjsVar = (pjs) obj;
        return Intrinsics.d(this.f27105a, pjsVar.f27105a) && Intrinsics.d(this.b, pjsVar.b) && this.c == pjsVar.c && Intrinsics.d(this.d, pjsVar.d) && Intrinsics.d(this.e, pjsVar.e) && Intrinsics.d(this.f, pjsVar.f) && Intrinsics.d(this.g, pjsVar.g) && this.h == pjsVar.h && Intrinsics.d(this.i, pjsVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f27105a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        e0k0 e0k0Var = this.f;
        return this.i.hashCode() + brm0.e(cs0.b(this.g, (iHashCode + (e0k0Var == null ? 0 : e0k0Var.hashCode())) * 31, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameLiteUiState(toolbarUiModel=");
        sb.append(this.f27105a);
        sb.append(", subGamesUiState=");
        sb.append(this.b);
        sb.append(", currentNavigationBarType=");
        sb.append(this.c);
        sb.append(", gameBoardSection=");
        sb.append(this.d);
        sb.append(", broadcastingSection=");
        sb.append(this.e);
        sb.append(", simulation=");
        sb.append(this.f);
        sb.append(", infoSection=");
        sb.append(this.g);
        sb.append(", rtlSupport=");
        sb.append(this.h);
        sb.append(", displayedCards=");
        return cs0.n(sb, this.i, Separators.RPAREN);
    }
}
