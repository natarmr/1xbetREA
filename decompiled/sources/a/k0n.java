package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k0n implements m0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17477a;
    public final g0n b;
    public final String c;
    public final a2m d;
    public final ows0 e;
    public final ows0 f;

    public k0n(boolean z, g0n g0nVar, String str, a2m a2mVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        this.f17477a = z;
        this.b = g0nVar;
        this.c = str;
        this.d = a2mVar;
        this.e = ows0Var;
        this.f = ows0Var2;
    }

    @Override // a.m0n
    public final boolean a() {
        return this.f17477a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0n)) {
            return false;
        }
        k0n k0nVar = (k0n) obj;
        return this.f17477a == k0nVar.f17477a && Intrinsics.d(this.b, k0nVar.b) && Intrinsics.d(this.c, k0nVar.c) && this.d.equals(k0nVar.d) && this.e.equals(k0nVar.e) && this.f.equals(k0nVar.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17477a) * 31;
        g0n g0nVar = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + rz4.a(this.d, ua80.b((iHashCode + (g0nVar == null ? 0 : g0nVar.hashCode())) * 31, 31, this.c), 31)) * 31);
    }

    public final String toString() {
        return "V3(supportRtl=" + this.f17477a + ", timerModel=" + this.b + ", championshipLabel=" + this.c + ", scoreSection=" + this.d + ", teamOneModel=" + this.e + ", teamTwoModel=" + this.f + Separators.RPAREN;
    }
}
