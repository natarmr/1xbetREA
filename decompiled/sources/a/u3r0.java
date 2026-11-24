package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u3r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35013a;
    public final int b;
    public final List c;

    public u3r0(String str, List list, int i) {
        list.getClass();
        this.f35013a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3r0)) {
            return false;
        }
        u3r0 u3r0Var = (u3r0) obj;
        return this.f35013a.equals(u3r0Var.f35013a) && this.b == u3r0Var.b && Intrinsics.d(this.c, u3r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f35013a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(kng0.p(this.b, "TopEventTabModel(title=", this.f35013a, ", type=", ", playerStatistics="), this.c, Separators.RPAREN);
    }
}
