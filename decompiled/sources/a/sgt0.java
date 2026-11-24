package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sgt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32179a;
    public final boolean b;
    public final List c;

    public sgt0(List list, boolean z, boolean z2) {
        list.getClass();
        this.f32179a = z;
        this.b = z2;
        this.c = list;
    }

    public static sgt0 a(sgt0 sgt0Var, boolean z, boolean z2) {
        List list = sgt0Var.c;
        list.getClass();
        return new sgt0(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgt0)) {
            return false;
        }
        sgt0 sgt0Var = (sgt0) obj;
        return this.f32179a == sgt0Var.f32179a && this.b == sgt0Var.b && Intrinsics.d(this.c, sgt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f32179a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(f140.q("UpcomingEventsState(isLoading=", ", isError=", ", upcomingEventsList=", this.f32179a, this.b), this.c, Separators.RPAREN);
    }
}
