package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w7s implements y7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7s f38689a;
    public final a4x b;
    public final xym0 c;
    public final py20 d;
    public final asr e;
    public final a4x f;
    public final a4x g;
    public final v7s h;
    public final boolean i;

    public w7s(s7s s7sVar, a4x a4xVar, xym0 xym0Var, py20 py20Var, asr asrVar, a4x a4xVar2, a4x a4xVar3, v7s v7sVar, boolean z) {
        s7sVar.getClass();
        a4xVar.getClass();
        xym0Var.getClass();
        py20Var.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f38689a = s7sVar;
        this.b = a4xVar;
        this.c = xym0Var;
        this.d = py20Var;
        this.e = asrVar;
        this.f = a4xVar2;
        this.g = a4xVar3;
        this.h = v7sVar;
        this.i = z;
    }

    @Override // a.y7s
    public final s7s a() {
        return this.f38689a;
    }

    @Override // a.y7s
    public final xym0 b() {
        return this.c;
    }

    @Override // a.y7s
    public final a4x c() {
        return this.b;
    }

    @Override // a.y7s
    public final py20 d() {
        return this.d;
    }

    @Override // a.y7s
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7s)) {
            return false;
        }
        w7s w7sVar = (w7s) obj;
        return Intrinsics.d(this.f38689a, w7sVar.f38689a) && Intrinsics.d(this.b, w7sVar.b) && Intrinsics.d(this.c, w7sVar.c) && this.d == w7sVar.d && this.e.equals(w7sVar.e) && Intrinsics.d(this.f, w7sVar.f) && Intrinsics.d(this.g, w7sVar.g) && Intrinsics.d(this.h, w7sVar.h) && this.i == w7sVar.i;
    }

    public final int hashCode() {
        int iB = cs0.b(this.g, cs0.b(this.f, (this.e.hashCode() + brm0.e((this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b, this.f38689a.hashCode() * 31, 31)) * 31)) * 31, 31, true)) * 31, 31), 31);
        v7s v7sVar = this.h;
        return Boolean.hashCode(this.i) + ((iB + (v7sVar == null ? 0 : v7sVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(toolbarUiModel=");
        sb.append(this.f38689a);
        sb.append(", backgroundImageUrls=");
        sb.append(this.b);
        sb.append(", subGamesUiState=");
        sb.append(this.c);
        sb.append(", marketsAnchorState=");
        sb.append(this.d);
        sb.append(", anchoredDraggableEnable=true, gameBoard=");
        sb.append(this.e);
        sb.append(", dashboardContent=");
        sb.append(this.f);
        sb.append(", displayedCards=");
        sb.append(this.g);
        sb.append(", scrollToTop=");
        sb.append(this.h);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
