package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dde implements ode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f5893a;
    public final boolean b;
    public final boolean c;

    public dde(a4x a4xVar, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f5893a = a4xVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dde)) {
            return false;
        }
        dde ddeVar = (dde) obj;
        return Intrinsics.d(this.f5893a, ddeVar.f5893a) && this.b == ddeVar.b && this.c == ddeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f5893a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Items(items=");
        sb.append(this.f5893a);
        sb.append(", enableTwoRows=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
