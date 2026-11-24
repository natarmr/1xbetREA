package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17912a;
    public final long b;
    public final List c;
    public final String d;

    public k9e0(long j, long j2, String str, List list) {
        list.getClass();
        this.f17912a = j;
        this.b = j2;
        this.c = list;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9e0)) {
            return false;
        }
        k9e0 k9e0Var = (k9e0) obj;
        return this.f17912a == k9e0Var.f17912a && this.b == k9e0Var.b && Intrinsics.d(this.c, k9e0Var.c) && this.d.equals(k9e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(rw2.b(Long.hashCode(this.f17912a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17912a, "RatingValueColModel(id=", ", contentType=");
        hne.x(sbQ, this.b, ", value=", this.c);
        return rw2.o(sbQ, ", competitorId=", this.d, Separators.RPAREN);
    }
}
