package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qjg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28838a;
    public final String b;
    public final int c;
    public final boolean d;

    public qjg0(int i, int i2, String str, boolean z) {
        this.f28838a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjg0)) {
            return false;
        }
        qjg0 qjg0Var = (qjg0) obj;
        return this.f28838a == qjg0Var.f28838a && this.b.equals(qjg0Var.b) && this.c == qjg0Var.c && this.d == qjg0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, ua80.b(Integer.hashCode(this.f28838a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return ohs0.k(this.c, ", win=", Separators.RPAREN, vqd.r(this.f28838a, "RpsPlayerInformationModel(id=", ", name=", this.b, ", score="), this.d);
    }
}
