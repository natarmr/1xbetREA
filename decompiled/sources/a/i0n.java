package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0n implements m0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13955a;
    public final e0n b;
    public final String c;
    public final String d;
    public final mpm e;
    public final ows0 f;
    public final ows0 g;

    public i0n(boolean z, e0n e0nVar, String str, String str2, mpm mpmVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        str2.getClass();
        this.f13955a = z;
        this.b = e0nVar;
        this.c = str;
        this.d = str2;
        this.e = mpmVar;
        this.f = ows0Var;
        this.g = ows0Var2;
    }

    @Override // a.m0n
    public final boolean a() {
        return this.f13955a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0n)) {
            return false;
        }
        i0n i0nVar = (i0n) obj;
        return this.f13955a == i0nVar.f13955a && Intrinsics.d(this.b, i0nVar.b) && Intrinsics.d(this.c, i0nVar.c) && Intrinsics.d(this.d, i0nVar.d) && this.e.equals(i0nVar.e) && this.f.equals(i0nVar.f) && this.g.equals(i0nVar.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f13955a) * 31;
        e0n e0nVar = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + ohs0.e(this.e, ua80.b(ua80.b((iHashCode + (e0nVar == null ? 0 : e0nVar.hashCode())) * 31, 31, this.c), 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V1(supportRtl=");
        sb.append(this.f13955a);
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
