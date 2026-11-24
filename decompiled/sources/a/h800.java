package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h800 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12602a;
    public final String b;
    public final String c;

    public h800(String str, String str2, String str3) {
        this.f12602a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h800)) {
            return false;
        }
        h800 h800Var = (h800) obj;
        return this.f12602a.equals(h800Var.f12602a) && this.b.equals(h800Var.b) && this.c.equals(h800Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f12602a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("LineUpMissingPlayerModel(playerId=", this.f12602a, ", status=", this.b, ", reasonText="), this.c, Separators.RPAREN);
    }
}
