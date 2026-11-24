package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class glp0 {
    public static final flp0 Companion = new flp0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new mhp0(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11505a;
    public final List b;

    public /* synthetic */ glp0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f11505a = null;
        } else {
            this.f11505a = str;
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
        if (!(obj instanceof glp0)) {
            return false;
        }
        glp0 glp0Var = (glp0) obj;
        return Intrinsics.d(this.f11505a, glp0Var.f11505a) && Intrinsics.d(this.b, glp0Var.b);
    }

    public final int hashCode() {
        String str = this.f11505a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("TeamStatisticByChampionshipResponse(champTitle=", this.f11505a, ", playerStatisticList=", this.b, Separators.RPAREN);
    }
}
