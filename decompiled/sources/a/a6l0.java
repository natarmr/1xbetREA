package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a6l0 implements d6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f323a;
    public final qzl b;
    public final String c;
    public final String d;

    public a6l0(long j, qzl qzlVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f323a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = str2;
    }

    @Override // a.d6l0
    public final long a() {
        return this.f323a;
    }

    @Override // a.d6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6l0)) {
            return false;
        }
        a6l0 a6l0Var = (a6l0) obj;
        return this.f323a == a6l0Var.f323a && this.b.equals(a6l0Var.b) && Intrinsics.d(this.c, a6l0Var.c) && Intrinsics.d(this.d, a6l0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (Long.hashCode(this.f323a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOpponent(gameId=");
        sb.append(this.f323a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        f140.v(sb, ", opponentName=", this.c, ", infoLabel=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
