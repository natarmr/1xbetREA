package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g6l0 implements k6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10772a;
    public final qzl b;
    public final String c;
    public final String d;

    public g6l0(long j, qzl qzlVar, String str, String str2) {
        str.getClass();
        this.f10772a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = str2;
    }

    @Override // a.k6l0
    public final long a() {
        return this.f10772a;
    }

    @Override // a.k6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6l0)) {
            return false;
        }
        g6l0 g6l0Var = (g6l0) obj;
        return this.f10772a == g6l0Var.f10772a && this.b.equals(g6l0Var.b) && Intrinsics.d(this.c, g6l0Var.c) && this.d.equals(g6l0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (Long.hashCode(this.f10772a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOpponent(gameId=");
        sb.append(this.f10772a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        f140.v(sb, ", opponentName=", this.c, ", infoLabel=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
