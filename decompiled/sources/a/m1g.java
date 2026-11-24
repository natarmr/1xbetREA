package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m1g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21006a;
    public final ms2 b;
    public final l1g c;
    public final k1g d;
    public final j1g e;
    public final long f;
    public final long g;

    public m1g(String str, ms2 ms2Var, l1g l1gVar, k1g k1gVar, j1g j1gVar, long j, long j2) {
        str.getClass();
        ms2Var.getClass();
        l1gVar.getClass();
        k1gVar.getClass();
        j1gVar.getClass();
        this.f21006a = str;
        this.b = ms2Var;
        this.c = l1gVar;
        this.d = k1gVar;
        this.e = j1gVar;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1g)) {
            return false;
        }
        m1g m1gVar = (m1g) obj;
        return Intrinsics.d(this.f21006a, m1gVar.f21006a) && Intrinsics.d(this.b, m1gVar.b) && this.c == m1gVar.c && this.d == m1gVar.d && this.e == m1gVar.e && this.f == m1gVar.f && this.g == m1gVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + rw2.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f21006a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberAnalyticsParams(gameId=");
        sb.append(this.f21006a);
        sb.append(", entryPointType=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", subType=");
        sb.append(this.d);
        sb.append(", cyberType=");
        sb.append(this.e);
        sb.append(", champId=");
        sb.append(this.f);
        return rw2.n(sb, this.g, ", sportId=", Separators.RPAREN);
    }
}
