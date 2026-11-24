package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class apm implements cpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1259a;
    public final vcg0 b;
    public final int c;
    public final boolean d;

    public apm(a4x a4xVar, vcg0 vcg0Var, int i, boolean z) {
        a4xVar.getClass();
        this.f1259a = a4xVar;
        this.b = vcg0Var;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apm)) {
            return false;
        }
        apm apmVar = (apm) obj;
        return Intrinsics.d(this.f1259a, apmVar.f1259a) && this.b == apmVar.b && this.c == apmVar.c && this.d == apmVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, (this.b.hashCode() + (this.f1259a.hashCode() * 31)) * 961, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RollingCalendarContentDate(allTimeUiModel=null, items=");
        sb.append(this.f1259a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", activeCellColors=null, selectedIndex=");
        return ohs0.k(this.c, ", reverseLayout=", Separators.RPAREN, sb, this.d);
    }
}
