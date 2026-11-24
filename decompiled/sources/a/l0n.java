package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l0n implements m0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19211a;
    public final g0n b;
    public final String c;
    public final String d;
    public final a2m e;
    public final ows0 f;
    public final ows0 g;

    public l0n(boolean z, g0n g0nVar, String str, String str2, a2m a2mVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        str2.getClass();
        this.f19211a = z;
        this.b = g0nVar;
        this.c = str;
        this.d = str2;
        this.e = a2mVar;
        this.f = ows0Var;
        this.g = ows0Var2;
    }

    @Override // a.m0n
    public final boolean a() {
        return this.f19211a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0n)) {
            return false;
        }
        l0n l0nVar = (l0n) obj;
        return this.f19211a == l0nVar.f19211a && Intrinsics.d(this.b, l0nVar.b) && Intrinsics.d(this.c, l0nVar.c) && Intrinsics.d(this.d, l0nVar.d) && this.e.equals(l0nVar.e) && this.f.equals(l0nVar.f) && this.g.equals(l0nVar.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19211a) * 31;
        g0n g0nVar = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + rz4.a(this.e, ua80.b(ua80.b((iHashCode + (g0nVar == null ? 0 : g0nVar.hashCode())) * 31, 31, this.c), 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(supportRtl=");
        sb.append(this.f19211a);
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
