package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9g0 f18178a;
    public final boolean b;
    public final qim c;
    public final Map d;
    public final Date e;

    public kf2(b9g0 b9g0Var, boolean z, qim qimVar, Map map, Date date) {
        this.f18178a = b9g0Var;
        this.b = z;
        this.c = qimVar;
        this.d = map;
        this.e = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf2)) {
            return false;
        }
        kf2 kf2Var = (kf2) obj;
        return this.f18178a == kf2Var.f18178a && this.b == kf2Var.b && this.c.equals(kf2Var.c) && this.d.equals(kf2Var.d) && Intrinsics.d(this.e, kf2Var.e);
    }

    public final int hashCode() {
        int iF = ohs0.f(this.d, (this.c.hashCode() + brm0.e(this.f18178a.hashCode() * 31, 31, this.b)) * 31, 31);
        Date date = this.e;
        return iF + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "AltResultsUiState(selectedTab=" + this.f18178a + ", showMultiselect=" + this.b + ", headerModel=" + this.c + ", searchQueryMap=" + this.d + ", choosenDate=" + this.e + Separators.RPAREN;
    }
}
