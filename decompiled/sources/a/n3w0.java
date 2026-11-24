package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22869a;
    public final int b;
    public final List c;
    public final int d;

    public n3w0(int i, int i2, long j, List list) {
        list.getClass();
        this.f22869a = j;
        this.b = i;
        this.c = list;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3w0)) {
            return false;
        }
        n3w0 n3w0Var = (n3w0) obj;
        return this.f22869a == n3w0Var.f22869a && this.b == n3w0Var.b && Intrinsics.d(this.c, n3w0Var.c) && this.d == n3w0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dw9.a(twn.a(this.b, Long.hashCode(this.f22869a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f22869a, "Config(sportId=", ", version=");
        sbQ.append(", devices=");
        sbQ.append(this.c);
        sbQ.append(", test=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
