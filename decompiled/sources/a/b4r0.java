package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1973a;
    public final long b;
    public final String c;
    public final String d;
    public final List e;

    public b4r0(long j, long j2, String str, String str2, List list) {
        list.getClass();
        this.f1973a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4r0)) {
            return false;
        }
        b4r0 b4r0Var = (b4r0) obj;
        return this.f1973a == b4r0Var.f1973a && this.b == b4r0Var.b && this.c.equals(b4r0Var.c) && this.d.equals(b4r0Var.d) && Intrinsics.d(this.e, b4r0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(rw2.b(Long.hashCode(this.f1973a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f1973a, "TopEventsRawModel(sportId=", ", subSportId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        ua80.t(", smallImage=", this.d, ", gameEvents=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
