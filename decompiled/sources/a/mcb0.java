package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mcb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21543a;
    public final String b;
    public final float c;
    public final float d;
    public final int e;

    public mcb0(String str, String str2, float f, float f2, int i) {
        this.f21543a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcb0)) {
            return false;
        }
        mcb0 mcb0Var = (mcb0) obj;
        return this.f21543a.equals(mcb0Var.f21543a) && this.b.equals(mcb0Var.b) && Float.compare(this.c, mcb0Var.c) == 0 && Float.compare(this.d, mcb0Var.d) == 0 && this.e == mcb0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + defpackage.c.a(defpackage.c.a(ua80.b(this.f21543a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PopularHeroModel(name=", this.f21543a, ", image=", this.b, ", winRate=");
        vqd.v(sbN, this.c, ", pickRate=", this.d, ", matches=");
        return rz4.j(this.e, Separators.RPAREN, sbN);
    }
}
