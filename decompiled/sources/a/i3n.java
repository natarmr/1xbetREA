package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i3n implements n3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f14105a;
    public final qal0 b;
    public final j83 c;
    public final nal0 d;
    public final nal0 e;
    public final x9l0 f;

    public i3n(j83 j83Var, qal0 qal0Var, j83 j83Var2, nal0 nal0Var, nal0 nal0Var2, x9l0 x9l0Var) {
        this.f14105a = j83Var;
        this.b = qal0Var;
        this.c = j83Var2;
        this.d = nal0Var;
        this.e = nal0Var2;
        this.f = x9l0Var;
    }

    @Override // a.n3n
    public final j83 a() {
        return this.f14105a;
    }

    @Override // a.n3n
    public final j83 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3n)) {
            return false;
        }
        i3n i3nVar = (i3n) obj;
        return this.f14105a.equals(i3nVar.f14105a) && Intrinsics.d(this.b, i3nVar.b) && this.c.equals(i3nVar.c) && this.d.equals(i3nVar.d) && this.e.equals(i3nVar.e) && this.f.equals(i3nVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f14105a.hashCode() * 31;
        qal0 qal0Var = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.f(this.c, (iHashCode + (qal0Var == null ? 0 : qal0Var.hashCode())) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Default(topInfo=" + ((Object) this.f14105a) + ", timer=" + this.b + ", bottomInfo=" + ((Object) this.c) + ", teamOne=" + this.d + ", teamTwo=" + this.e + ", score=" + this.f + Separators.RPAREN;
    }
}
