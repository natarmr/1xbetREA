package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23119a;
    public final a4x b;
    public final boolean c;
    public final dja d;
    public final dja e;
    public final m930 f;
    public final a4x g;
    public final dxh0 h;
    public final a4x i;
    public final boolean j;

    public n930(a4x a4xVar, a4x a4xVar2, boolean z, dja djaVar, dja djaVar2, m930 m930Var, a4x a4xVar3, dxh0 dxh0Var, a4x a4xVar4, boolean z2) {
        m930Var.getClass();
        a4xVar4.getClass();
        this.f23119a = a4xVar;
        this.b = a4xVar2;
        this.c = z;
        this.d = djaVar;
        this.e = djaVar2;
        this.f = m930Var;
        this.g = a4xVar3;
        this.h = dxh0Var;
        this.i = a4xVar4;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n930)) {
            return false;
        }
        n930 n930Var = (n930) obj;
        return this.f23119a.equals(n930Var.f23119a) && Intrinsics.d(this.b, n930Var.b) && this.c == n930Var.c && this.d == n930Var.d && this.e == n930Var.e && Intrinsics.d(this.f, n930Var.f) && this.g.equals(n930Var.g) && this.h.equals(n930Var.h) && Intrinsics.d(this.i, n930Var.i) && this.j == n930Var.j;
    }

    public final int hashCode() {
        int iHashCode = this.f23119a.hashCode() * 31;
        a4x a4xVar = this.b;
        int iE = brm0.e((iHashCode + (a4xVar == null ? 0 : a4xVar.hashCode())) * 31, 31, this.c);
        dja djaVar = this.d;
        int iHashCode2 = (iE + (djaVar == null ? 0 : djaVar.hashCode())) * 31;
        dja djaVar2 = this.e;
        return Boolean.hashCode(this.j) + cs0.b(this.i, hne.h(this.h, cs0.b(this.g, (this.f.hashCode() + ((iHashCode2 + (djaVar2 != null ? djaVar2.hashCode() : 0)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("MatchBoardUiModel(displayedCards=", this.f23119a, ", broadcastCardList=", this.b, ", isCardsSectionExpanded=");
        sbQ.append(this.c);
        sbQ.append(", currentGameInfoCardType=");
        sbQ.append(this.d);
        sbQ.append(", currentBroadcastingType=");
        sbQ.append(this.e);
        sbQ.append(", currentTab=");
        sbQ.append(this.f);
        sbQ.append(", tabs=");
        sbQ.append(this.g);
        sbQ.append(", style=");
        sbQ.append(this.h);
        sbQ.append(", segments=");
        return rz4.m(sbQ, this.i, ", isTabVisible=", this.j, Separators.RPAREN);
    }
}
