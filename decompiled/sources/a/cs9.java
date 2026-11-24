package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cs9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4877a;
    public final bs9 b;
    public final boolean c;
    public final long d;
    public final sp9 e;

    public cs9(List list, bs9 bs9Var, boolean z, long j, sp9 sp9Var) {
        list.getClass();
        this.f4877a = list;
        this.b = bs9Var;
        this.c = z;
        this.d = j;
        this.e = sp9Var;
    }

    public static cs9 a(cs9 cs9Var, List list, bs9 bs9Var, boolean z, sp9 sp9Var, int i) {
        if ((i & 1) != 0) {
            list = cs9Var.f4877a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            bs9Var = cs9Var.b;
        }
        bs9 bs9Var2 = bs9Var;
        if ((i & 4) != 0) {
            z = cs9Var.c;
        }
        boolean z2 = z;
        long j = (i & 8) != 0 ? cs9Var.d : -1L;
        if ((i & 16) != 0) {
            sp9Var = cs9Var.e;
        }
        cs9Var.getClass();
        list2.getClass();
        return new cs9(list2, bs9Var2, z2, j, sp9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs9)) {
            return false;
        }
        cs9 cs9Var = (cs9) obj;
        return Intrinsics.d(this.f4877a, cs9Var.f4877a) && this.b == cs9Var.b && this.c == cs9Var.c && this.d == cs9Var.d && Intrinsics.d(this.e, cs9Var.e);
    }

    public final int hashCode() {
        int iB = rw2.b(brm0.e((this.b.hashCode() + (this.f4877a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        sp9 sp9Var = this.e;
        return iB + (sp9Var == null ? 0 : sp9Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackHistoryState(callbackHistory=");
        sb.append(this.f4877a);
        sb.append(", contentStatus=");
        sb.append(this.b);
        sb.append(", isLoading=");
        rw2.v(this.d, ", animatedItemId=", sb, this.c);
        sb.append(", requestModelToDelete=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
