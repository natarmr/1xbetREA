package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2l0 f35190a;
    public final int b;
    public final int c;
    public final u1m d;
    public final q1l0 e;
    public final s2l0 f;

    public u7l0(c2l0 c2l0Var, int i, int i2, u1m u1mVar) {
        this.f35190a = c2l0Var;
        this.b = i;
        this.c = i2;
        this.d = u1mVar;
        this.e = new q1l0(i2);
        this.f = new s2l0(i, u1mVar);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.e;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7l0)) {
            return false;
        }
        u7l0 u7l0Var = (u7l0) obj;
        return Intrinsics.d(this.f35190a, u7l0Var.f35190a) && this.b == u7l0Var.b && this.c == u7l0Var.c && this.d == u7l0Var.d;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f35190a;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, this.f35190a.hashCode() * 31, 31), 31);
        u1m u1mVar = this.d;
        return iA + (u1mVar == null ? 0 : u1mVar.hashCode());
    }

    public final String toString() {
        return "ChampionshipCounterWithActionIcon(title=" + this.f35190a + ", counterValue=" + this.b + ", actionIconResId=" + this.c + ", customBadgeStyle=" + this.d + Separators.RPAREN;
    }
}
