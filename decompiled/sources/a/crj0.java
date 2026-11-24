package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class crj0 {
    public static final arj0 Companion = new arj0();
    public static final a8z[] c = {maz.a(wez.f39042a, new hwi0(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4848a;
    public final grj0 b;

    public /* synthetic */ crj0(int i, List list, grj0 grj0Var) {
        if ((i & 1) == 0) {
            this.f4848a = null;
        } else {
            this.f4848a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = grj0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crj0)) {
            return false;
        }
        crj0 crj0Var = (crj0) obj;
        return Intrinsics.d(this.f4848a, crj0Var.f4848a) && Intrinsics.d(this.b, crj0Var.b);
    }

    public final int hashCode() {
        List list = this.f4848a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        grj0 grj0Var = this.b;
        return iHashCode + (grj0Var != null ? grj0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ShortGameResponse(teams=" + this.f4848a + ", response=" + this.b + Separators.RPAREN;
    }
}
