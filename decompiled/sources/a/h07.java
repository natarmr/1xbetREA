package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12220a;
    public final long b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final long f;
    public final long g;

    public h07(List list, long j, boolean z, String str, boolean z2, long j2, long j3) {
        list.getClass();
        str.getClass();
        this.f12220a = list;
        this.b = j;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h07)) {
            return false;
        }
        h07 h07Var = (h07) obj;
        return Intrinsics.d(this.f12220a, h07Var.f12220a) && this.b == h07Var.b && this.c == h07Var.c && Intrinsics.d(this.d, h07Var.d) && this.e == h07Var.e && this.f == h07Var.f && this.g == h07Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + rw2.b(brm0.e(ua80.b(brm0.e(rw2.b(this.f12220a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetGroupModel(bets=");
        sb.append(this.f12220a);
        sb.append(", id=");
        sb.append(this.b);
        hne.u(", hasSpecialSign=", ", appBonusLabel=", this.d, sb, this.c);
        rz4.A(sb, ", live=", this.e, ", gameId=");
        sb.append(this.f);
        return rw2.n(sb, this.g, ", sportId=", Separators.RPAREN);
    }
}
