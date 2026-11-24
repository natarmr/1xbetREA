package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gaj implements haj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10968a;
    public final a4x b;
    public final String c;
    public final String d;
    public final a4x e;
    public final l1v0 f;

    public gaj(String str, a4x a4xVar, String str2, String str3, a4x a4xVar2, l1v0 l1v0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f10968a = str;
        this.b = a4xVar;
        this.c = str2;
        this.d = str3;
        this.e = a4xVar2;
        this.f = l1v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaj)) {
            return false;
        }
        gaj gajVar = (gaj) obj;
        return this.f10968a.equals(gajVar.f10968a) && Intrinsics.d(this.b, gajVar.b) && Intrinsics.d(this.c, gajVar.c) && Intrinsics.d(this.d, gajVar.d) && Intrinsics.d(this.e, gajVar.e) && Intrinsics.d(this.f, gajVar.f);
    }

    @Override // a.haj
    public final jaj getType() {
        return jaj.STADIUM_WEATHER;
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f10968a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iB2 = cs0.b(this.e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        l1v0 l1v0Var = this.f;
        return iB2 + (l1v0Var != null ? l1v0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("Stadium(name=", this.f10968a, ", info=", this.b, ", webSiteUrl=");
        f140.v(sbU, this.c, ", webSiteLabel=", this.d, ", images=");
        sbU.append(this.e);
        sbU.append(", weatherInfo=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
