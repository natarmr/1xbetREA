package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11167a;
    public final String b;
    public final String c;
    public final boolean d;

    public gep(String str, String str2, String str3, boolean z) {
        this.f11167a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static gep a(gep gepVar, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = gepVar.f11167a;
        }
        if ((i & 2) != 0) {
            str2 = gepVar.b;
        }
        if ((i & 4) != 0) {
            str3 = gepVar.c;
        }
        if ((i & 8) != 0) {
            z = gepVar.d;
        }
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new gep(str, str2, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gep)) {
            return false;
        }
        gep gepVar = (gep) obj;
        return this.f11167a.equals(gepVar.f11167a) && this.b.equals(gepVar.b) && this.c.equals(gepVar.c) && this.d == gepVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f11167a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", showBalance=", Separators.RPAREN, b1j.n("FavoritesBalanceState(balanceName=", this.f11167a, ", money=", this.b, ", currency="), this.d);
    }
}
