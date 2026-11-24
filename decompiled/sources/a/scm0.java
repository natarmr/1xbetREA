package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class scm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31993a;
    public final int b;
    public final int c;
    public final String d;

    public scm0(String str, int i, int i2, long j) {
        str.getClass();
        this.f31993a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scm0)) {
            return false;
        }
        scm0 scm0Var = (scm0) obj;
        return this.f31993a == scm0Var.f31993a && this.b == scm0Var.b && this.c == scm0Var.c && Intrinsics.d(this.d, scm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Long.hashCode(this.f31993a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f31993a, "StatisticDictionariesEntity(id=", ", type=");
        w6x.w(this.c, ", itemId=", ", title=", this.d, sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
