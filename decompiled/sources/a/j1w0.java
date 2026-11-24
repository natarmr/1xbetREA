package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15757a;
    public final List b;

    public j1w0(List list, boolean z) {
        list.getClass();
        this.f15757a = z;
        this.b = list;
    }

    public static j1w0 a(j1w0 j1w0Var, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            z = j1w0Var.f15757a;
        }
        if ((i & 2) != 0) {
            list = j1w0Var.b;
        }
        j1w0Var.getClass();
        list.getClass();
        return new j1w0(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1w0)) {
            return false;
        }
        j1w0 j1w0Var = (j1w0) obj;
        return this.f15757a == j1w0Var.f15757a && Intrinsics.d(this.b, j1w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f15757a) * 31);
    }

    public final String toString() {
        return "AuthRouteState(isAuthorized=" + this.f15757a + ", registrationTypes=" + this.b + Separators.RPAREN;
    }
}
