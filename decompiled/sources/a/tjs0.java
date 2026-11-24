package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tjs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34065a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public tjs0(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f34065a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static tjs0 a(tjs0 tjs0Var, boolean z, boolean z2) {
        List list = tjs0Var.d;
        list.getClass();
        return new tjs0(list, z, z2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjs0)) {
            return false;
        }
        tjs0 tjs0Var = (tjs0) obj;
        return this.f34065a == tjs0Var.f34065a && this.b == tjs0Var.b && this.c == tjs0Var.c && Intrinsics.d(this.d, tjs0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f34065a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TransfersPlayerState(isLoading=", ", isError=", ", isEmpty=", this.f34065a, this.b);
        sbQ.append(this.c);
        sbQ.append(", transfersList=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
