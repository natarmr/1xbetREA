package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k3n implements n3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f17627a;
    public final qal0 b;
    public final j83 c;
    public final String d;

    public k3n(j83 j83Var, qal0 qal0Var, j83 j83Var2, String str) {
        str.getClass();
        this.f17627a = j83Var;
        this.b = qal0Var;
        this.c = j83Var2;
        this.d = str;
    }

    @Override // a.n3n
    public final j83 a() {
        return this.f17627a;
    }

    @Override // a.n3n
    public final j83 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3n)) {
            return false;
        }
        k3n k3nVar = (k3n) obj;
        return this.f17627a.equals(k3nVar.f17627a) && Intrinsics.d(this.b, k3nVar.b) && this.c.equals(k3nVar.c) && Intrinsics.d(this.d, k3nVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f17627a.hashCode() * 31;
        qal0 qal0Var = this.b;
        return this.d.hashCode() + brm0.f(this.c, (iHashCode + (qal0Var == null ? 0 : qal0Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "Single(topInfo=" + ((Object) this.f17627a) + ", timer=" + this.b + ", bottomInfo=" + ((Object) this.c) + ", team=" + kng0.l("SingleTeam(name=", this.d, Separators.RPAREN) + Separators.RPAREN;
    }
}
