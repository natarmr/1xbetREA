package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31799a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;

    public s8h(int i, int i2, long j, String str, String str2, List list) {
        list.getClass();
        this.f31799a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8h)) {
            return false;
        }
        s8h s8hVar = (s8h) obj;
        return this.f31799a == s8hVar.f31799a && this.b == s8hVar.b && this.c.equals(s8hVar.c) && this.d.equals(s8hVar.d) && this.e == s8hVar.e && Intrinsics.d(this.f, s8hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, ua80.b(ua80.b(rw2.b(Integer.hashCode(this.f31799a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f31799a, this.b, "CyberMatchesStatisticTeamModel(id=", ", feedTeamId=");
        f140.v(sbQ, ", name=", this.c, ", image=", this.d);
        sbQ.append(", rank=");
        sbQ.append(this.e);
        sbQ.append(", players=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
