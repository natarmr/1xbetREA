package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kkv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18460a;
    public final String b;
    public final String c;

    public kkv0(String str, String str2, String str3) {
        this.f18460a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkv0)) {
            return false;
        }
        kkv0 kkv0Var = (kkv0) obj;
        return this.f18460a.equals(kkv0Var.f18460a) && this.b.equals(kkv0Var.b) && this.c.equals(kkv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f18460a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("WinsJackpotInfoModel(winSum=", this.f18460a, ", date=", this.b, ", id="), this.c, Separators.RPAREN);
    }
}
