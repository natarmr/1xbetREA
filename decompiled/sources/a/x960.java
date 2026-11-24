package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40495a;
    public final Integer b;

    public x960(int i, Integer num) {
        this.f40495a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x960)) {
            return false;
        }
        x960 x960Var = (x960) obj;
        return this.f40495a == x960Var.f40495a && Intrinsics.d(this.b, x960Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f40495a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f40495a + ", dataOffset=" + this.b + Separators.RPAREN;
    }
}
