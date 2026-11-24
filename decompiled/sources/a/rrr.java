package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rrr implements zrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqr f30997a;
    public final String b;
    public final String c;
    public final mpm d;
    public final j83 e;

    public rrr(uqr uqrVar, String str, String str2, mpm mpmVar, j83 j83Var) {
        this.f30997a = uqrVar;
        this.b = str;
        this.c = str2;
        this.d = mpmVar;
        this.e = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrr)) {
            return false;
        }
        rrr rrrVar = (rrr) obj;
        return this.f30997a.equals(rrrVar.f30997a) && this.b.equals(rrrVar.b) && this.c.equals(rrrVar.c) && this.d.equals(rrrVar.d) && this.e.equals(rrrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ohs0.e(this.d, ua80.b(ua80.b(this.f30997a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "MultiTeam(labels=" + this.f30997a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", score=" + this.d + ", bottomInfo=" + ((Object) this.e) + Separators.RPAREN;
    }
}
