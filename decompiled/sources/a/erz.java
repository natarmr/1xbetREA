package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class erz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8304a;
    public final d7i0 b;
    public final boolean c;
    public final boolean d;

    public erz(List list, d7i0 d7i0Var, boolean z, boolean z2) {
        list.getClass();
        this.f8304a = list;
        this.b = d7i0Var;
        this.c = z;
        this.d = z2;
    }

    public static erz a(erz erzVar, List list, d7i0 d7i0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = erzVar.f8304a;
        }
        if ((i & 2) != 0) {
            d7i0Var = erzVar.b;
        }
        if ((i & 4) != 0) {
            z = erzVar.c;
        }
        if ((i & 8) != 0) {
            z2 = erzVar.d;
        }
        erzVar.getClass();
        list.getClass();
        return new erz(list, d7i0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erz)) {
            return false;
        }
        erz erzVar = (erz) obj;
        return Intrinsics.d(this.f8304a, erzVar.f8304a) && Intrinsics.d(this.b, erzVar.b) && this.c == erzVar.c && this.d == erzVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f8304a.hashCode() * 31;
        d7i0 d7i0Var = this.b;
        return Boolean.hashCode(this.d) + brm0.e((iHashCode + (d7i0Var == null ? 0 : d7i0Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitSelfExcludeReasonAfricaState(reasons=");
        sb.append(this.f8304a);
        sb.append(", selectedReason=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return ohs0.p(", isError=", Separators.RPAREN, sb, this.c, this.d);
    }
}
