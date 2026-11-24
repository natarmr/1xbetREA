package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3923a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final rnk f;

    public c8o(long j, int i, String str, String str2, String str3, rnk rnkVar) {
        brm0.B(str, str2, str3);
        this.f3923a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = rnkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8o)) {
            return false;
        }
        c8o c8oVar = (c8o) obj;
        return this.f3923a == c8oVar.f3923a && this.b == c8oVar.b && Intrinsics.d(this.c, c8oVar.c) && Intrinsics.d(this.d, c8oVar.d) && Intrinsics.d(this.e, c8oVar.e) && this.f == c8oVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.b, Long.hashCode(this.f3923a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f3923a, "EsportsWorldCupDisciplineMapModel(champId=", ", sportId=");
        f140.v(sbQ, ", title=", this.c, ", subtitle=", this.d);
        sbQ.append(", sportIcon=");
        sbQ.append(this.e);
        sbQ.append(", bannerType=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
