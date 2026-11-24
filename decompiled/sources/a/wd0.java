package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud0 f38948a;
    public final List b;
    public final th1 c;
    public final String d;

    public wd0(ud0 ud0Var, List list, th1 th1Var, String str) {
        list.getClass();
        this.f38948a = ud0Var;
        this.b = list;
        this.c = th1Var;
        this.d = str;
    }

    public static wd0 a(wd0 wd0Var, ud0 ud0Var, List list, String str, int i) {
        if ((i & 2) != 0) {
            list = wd0Var.b;
        }
        th1 th1Var = wd0Var.c;
        if ((i & 8) != 0) {
            str = wd0Var.d;
        }
        wd0Var.getClass();
        list.getClass();
        return new wd0(ud0Var, list, th1Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0)) {
            return false;
        }
        wd0 wd0Var = (wd0) obj;
        return this.f38948a.equals(wd0Var.f38948a) && Intrinsics.d(this.b, wd0Var.b) && this.c == wd0Var.c && Intrinsics.d(this.d, wd0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + dw9.a(this.f38948a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AggregatorBrandsSearchState(screenState=" + this.f38948a + ", brands=" + this.b + ", aggregatorProviderCardStyle=" + this.c + ", query=" + this.d + Separators.RPAREN;
    }
}
