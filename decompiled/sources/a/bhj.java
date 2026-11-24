package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bhj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2609a;
    public final int b;
    public final String c;
    public final List d;
    public final boolean e;

    public bhj(int i, long j, String str, List list, boolean z) {
        list.getClass();
        this.f2609a = j;
        this.b = i;
        this.c = str;
        this.d = list;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhj)) {
            return false;
        }
        bhj bhjVar = (bhj) obj;
        return this.f2609a == bhjVar.f2609a && this.b == bhjVar.b && this.c.equals(bhjVar.c) && Intrinsics.d(this.d, bhjVar.d) && this.e == bhjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dw9.a(ua80.b(twn.a(this.b, Long.hashCode(this.f2609a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f2609a, "DayExpressEventsModel(id=", ", position=");
        ua80.t(", coefficient=", this.c, ", dayExpressModelList=", sbQ, this.d);
        return f140.n(sbQ, ", live=", this.e, Separators.RPAREN);
    }
}
