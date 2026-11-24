package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1925a;
    public final n0x b;
    public final String c;

    public b3s0(n0x n0xVar, String str, String str2) {
        this.f1925a = str;
        this.b = n0xVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3s0)) {
            return false;
        }
        b3s0 b3s0Var = (b3s0) obj;
        return this.f1925a.equals(b3s0Var.f1925a) && this.b.equals(b3s0Var.b) && this.c.equals(b3s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f140.f(this.b, this.f1925a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentPositionInternalModel(place=");
        sb.append(this.f1925a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", prize=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
