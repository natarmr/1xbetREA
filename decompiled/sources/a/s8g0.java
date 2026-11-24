package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s8g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31798a;
    public final long b;
    public final int c;
    public final lho d;
    public final String e;
    public final String f;
    public final List g;

    public s8g0(long j, long j2, int i, lho lhoVar, String str, String str2, List list) {
        list.getClass();
        this.f31798a = j;
        this.b = j2;
        this.c = i;
        this.d = lhoVar;
        this.e = str;
        this.f = str2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8g0)) {
            return false;
        }
        s8g0 s8g0Var = (s8g0) obj;
        return this.f31798a == s8g0Var.f31798a && this.b == s8g0Var.b && this.c == s8g0Var.c && this.d == s8g0Var.d && this.e.equals(s8g0Var.e) && this.f.equals(s8g0Var.f) && Intrinsics.d(this.g, s8g0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b((this.d.hashCode() + twn.a(this.c, rw2.b(Long.hashCode(this.f31798a) * 31, 31, this.b), 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f31798a, "ResultsModel(dateFrom=", ", dateTo=");
        ua80.v(sbQ, this.b, ", result=", this.c);
        sbQ.append(", status=");
        sbQ.append(this.d);
        sbQ.append(", time=");
        sbQ.append(this.e);
        ua80.t(", title=", this.f, ", veloJerseys=", sbQ, this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
