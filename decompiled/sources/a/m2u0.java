package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m2u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21083a;
    public final nie b;
    public final List c;
    public final String d;
    public final int e;

    public m2u0(long j, nie nieVar, List list, String str, int i) {
        list.getClass();
        this.f21083a = j;
        this.b = nieVar;
        this.c = list;
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2u0)) {
            return false;
        }
        m2u0 m2u0Var = (m2u0) obj;
        return this.f21083a == m2u0Var.f21083a && this.b == m2u0Var.b && Intrinsics.d(this.c, m2u0Var.c) && this.d.equals(m2u0Var.d) && this.e == m2u0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(dw9.a((this.b.hashCode() + (Long.hashCode(this.f21083a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueColBodyModel(id=");
        sb.append(this.f21083a);
        sb.append(", contentType=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", competitorId=");
        sb.append(this.d);
        return vqd.p(sb, ", colSpan=", this.e, Separators.RPAREN);
    }
}
