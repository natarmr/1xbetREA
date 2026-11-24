package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0n implements m0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12244a;
    public final g0n b;
    public final String c;
    public final String d;
    public final mpm e;
    public final ows0 f;
    public final ows0 g;

    public h0n(boolean z, g0n g0nVar, String str, String str2, mpm mpmVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        str2.getClass();
        this.f12244a = z;
        this.b = g0nVar;
        this.c = str;
        this.d = str2;
        this.e = mpmVar;
        this.f = ows0Var;
        this.g = ows0Var2;
    }

    @Override // a.m0n
    public final boolean a() {
        return this.f12244a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0n)) {
            return false;
        }
        h0n h0nVar = (h0n) obj;
        return this.f12244a == h0nVar.f12244a && Intrinsics.d(this.b, h0nVar.b) && Intrinsics.d(this.c, h0nVar.c) && Intrinsics.d(this.d, h0nVar.d) && this.e.equals(h0nVar.e) && this.f.equals(h0nVar.f) && this.g.equals(h0nVar.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f12244a) * 31;
        g0n g0nVar = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + ohs0.e(this.e, ua80.b(ua80.b((iHashCode + (g0nVar == null ? 0 : g0nVar.hashCode())) * 31, 31, this.c), 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(supportRtl=");
        sb.append(this.f12244a);
        sb.append(", timerModel=");
        sb.append(this.b);
        sb.append(", championshipLabel=");
        f140.v(sb, this.c, ", infoLabel=", this.d, ", scoreSection=");
        sb.append(this.e);
        sb.append(", teamOneModel=");
        sb.append(this.f);
        sb.append(", teamTwoModel=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
