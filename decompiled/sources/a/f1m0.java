package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class f1m0 {
    public static final e1m0 Companion = new e1m0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8771a;
    public final Long b;
    public final n0m0 c;

    static {
        m0m0 m0m0Var = n0m0.Companion;
        d = new a8z[]{maz.a(wez.f39042a, new fzk0((byte) 26)), null, null};
    }

    public /* synthetic */ f1m0(int i, List list, Long l, n0m0 n0m0Var) {
        if ((i & 1) == 0) {
            this.f8771a = null;
        } else {
            this.f8771a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = n0m0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1m0)) {
            return false;
        }
        f1m0 f1m0Var = (f1m0) obj;
        return Intrinsics.d(this.f8771a, f1m0Var.f8771a) && Intrinsics.d(this.b, f1m0Var.b) && Intrinsics.d(this.c, f1m0Var.c);
    }

    public final int hashCode() {
        List list = this.f8771a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        n0m0 n0m0Var = this.c;
        return iHashCode2 + (n0m0Var != null ? n0m0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StageNetResponse(teams=" + this.f8771a + ", sportId=" + this.b + ", response=" + this.c + Separators.RPAREN;
    }
}
