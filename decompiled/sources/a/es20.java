package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class es20 implements fs20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8309a;
    public final String b;

    public es20(long j, String str) {
        str.getClass();
        this.f8309a = j;
        this.b = str;
    }

    @Override // a.fs20
    public final long a() {
        return this.f8309a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es20)) {
            return false;
        }
        es20 es20Var = (es20) obj;
        return this.f8309a == es20Var.f8309a && Intrinsics.d(this.b, es20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f8309a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8309a, "Category(marketTypeId=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
