package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iax implements jax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1v0 f14459a;
    public final String b;
    public final a4x c;
    public final String d;
    public final String e;
    public final a4x f;

    public iax(m1v0 m1v0Var, String str, a4x a4xVar, String str2, String str3, a4x a4xVar2) {
        dja djaVar = dja.PENALTY;
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f14459a = m1v0Var;
        this.b = str;
        this.c = a4xVar;
        this.d = str2;
        this.e = str3;
        this.f = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iax)) {
            return false;
        }
        iax iaxVar = (iax) obj;
        dja djaVar = dja.PENALTY;
        return Intrinsics.d(this.f14459a, iaxVar.f14459a) && this.b.equals(iaxVar.b) && Intrinsics.d(this.c, iaxVar.c) && Intrinsics.d(this.d, iaxVar.d) && Intrinsics.d(this.e, iaxVar.e) && Intrinsics.d(this.f, iaxVar.f);
    }

    @Override // a.jax
    public final dja getType() {
        return dja.STADIUM_WEATHER;
    }

    public final int hashCode() {
        int iHashCode = dja.STADIUM_WEATHER.hashCode() * 31;
        m1v0 m1v0Var = this.f14459a;
        int iB = cs0.b(this.c, ua80.b((iHashCode + (m1v0Var == null ? 0 : m1v0Var.hashCode())) * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        dja djaVar = dja.STADIUM_WEATHER;
        StringBuilder sb = new StringBuilder("Stadium(type=");
        sb.append(djaVar);
        sb.append(", weatherInfo=");
        sb.append(this.f14459a);
        sb.append(", name=");
        cs0.B(sb, this.b, ", info=", this.c, ", webSiteUrl=");
        f140.v(sb, this.d, ", webSiteLabel=", this.e, ", images=");
        return cs0.n(sb, this.f, Separators.RPAREN);
    }
}
