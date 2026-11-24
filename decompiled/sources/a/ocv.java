package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ocv {
    public static final ncv Companion = new ncv();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djh0 f25046a;
    public final List b;

    static {
        cjh0 cjh0Var = djh0.Companion;
        c = new a8z[]{null, maz.a(wez.f39042a, new tet((byte) 29))};
    }

    public /* synthetic */ ocv(int i, djh0 djh0Var, List list) {
        if ((i & 1) == 0) {
            this.f25046a = null;
        } else {
            this.f25046a = djh0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocv)) {
            return false;
        }
        ocv ocvVar = (ocv) obj;
        return Intrinsics.d(this.f25046a, ocvVar.f25046a) && Intrinsics.d(this.b, ocvVar.b);
    }

    public final int hashCode() {
        djh0 djh0Var = this.f25046a;
        int iHashCode = (djh0Var == null ? 0 : djh0Var.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GrandPrixStatisticInfoResponse(seasonSelectors=" + this.f25046a + ", stages=" + this.b + Separators.RPAREN;
    }
}
