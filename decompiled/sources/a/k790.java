package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k790 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17810a;
    public final long b;
    public final String c;

    public k790(String str, long j, boolean z) {
        str.getClass();
        this.f17810a = z;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k790)) {
            return false;
        }
        k790 k790Var = (k790) obj;
        return this.f17810a == k790Var.f17810a && this.b == k790Var.b && Intrinsics.d(this.c, k790Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Boolean.hashCode(this.f17810a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentContentParams(deposit=");
        sb.append(this.f17810a);
        sb.append(", currencyId=");
        sb.append(this.b);
        return rw2.o(sb, ", redirectUrl=", this.c, Separators.RPAREN);
    }
}
