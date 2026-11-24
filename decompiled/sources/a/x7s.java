package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x7s implements y7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7s f40428a;
    public final a4x b;
    public final xym0 c;

    public x7s(s7s s7sVar, a4x a4xVar, xym0 xym0Var) {
        s7sVar.getClass();
        a4xVar.getClass();
        xym0Var.getClass();
        this.f40428a = s7sVar;
        this.b = a4xVar;
        this.c = xym0Var;
        py20 py20Var = py20.f27786a;
    }

    @Override // a.y7s
    public final s7s a() {
        return this.f40428a;
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
        return py20.f27786a;
    }

    @Override // a.y7s
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7s)) {
            return false;
        }
        x7s x7sVar = (x7s) obj;
        return Intrinsics.d(this.f40428a, x7sVar.f40428a) && Intrinsics.d(this.b, x7sVar.b) && Intrinsics.d(this.c, x7sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f40428a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Loading(toolbarUiModel=" + this.f40428a + ", backgroundImageUrls=" + this.b + ", subGamesUiState=" + this.c + Separators.RPAREN;
    }
}
