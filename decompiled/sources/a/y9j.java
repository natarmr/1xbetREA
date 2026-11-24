package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y9j implements haj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9j f42249a;
    public final int b;
    public final a4x c;
    public final boolean d;
    public final dxh0 e;
    public final a4x f;

    public y9j(u9j u9jVar, int i, i4 i4Var, boolean z, dxh0 dxh0Var, i4 i4Var2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f42249a = u9jVar;
        this.b = i;
        this.c = i4Var;
        this.d = z;
        this.e = dxh0Var;
        this.f = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9j)) {
            return false;
        }
        y9j y9jVar = (y9j) obj;
        return this.f42249a.equals(y9jVar.f42249a) && this.b == y9jVar.b && Intrinsics.d(this.c, y9jVar.c) && this.d == y9jVar.d && this.e.equals(y9jVar.e) && Intrinsics.d(this.f, y9jVar.f);
    }

    @Override // a.haj
    public final jaj getType() {
        return jaj.BROADCASTING;
    }

    public final int hashCode() {
        return this.f.hashCode() + hne.h(this.e, brm0.e(cs0.b(this.c, twn.a(this.b, this.f42249a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    public final String toString() {
        return "BroadcastingSectionUiModel(broadcasting=" + this.f42249a + ", currentIndex=" + this.b + ", broadcastingTabs=" + this.c + ", isTabVisible=" + this.d + ", style=" + this.e + ", segments=" + this.f + Separators.RPAREN;
    }
}
