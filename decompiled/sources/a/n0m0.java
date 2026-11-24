package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class n0m0 {
    public static final m0m0 Companion = new m0m0();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new fzk0(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22706a;
    public final List b;
    public final String c;

    public /* synthetic */ n0m0(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f22706a = null;
        } else {
            this.f22706a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0m0)) {
            return false;
        }
        n0m0 n0m0Var = (n0m0) obj;
        return Intrinsics.d(this.f22706a, n0m0Var.f22706a) && Intrinsics.d(this.b, n0m0Var.b) && Intrinsics.d(this.c, n0m0Var.c);
    }

    public final int hashCode() {
        String str = this.f22706a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(defpackage.c.f("StageNetCellResponse(title=", this.f22706a, ", cells=", this.b, ", logo="), this.c, Separators.RPAREN);
    }
}
