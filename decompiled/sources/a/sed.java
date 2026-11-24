package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32072a;
    public final boolean b;
    public final List c;

    public sed(List list, boolean z, boolean z2) {
        list.getClass();
        this.f32072a = z;
        this.b = z2;
        this.c = list;
    }

    public static sed a(sed sedVar, boolean z, boolean z2) {
        List list = sedVar.c;
        list.getClass();
        return new sed(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sed)) {
            return false;
        }
        sed sedVar = (sed) obj;
        return this.f32072a == sedVar.f32072a && this.b == sedVar.b && Intrinsics.d(this.c, sedVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f32072a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(f140.q("CompletedMatchesState(isLoading=", ", isError=", ", matchesResultList=", this.f32072a, this.b), this.c, Separators.RPAREN);
    }
}
