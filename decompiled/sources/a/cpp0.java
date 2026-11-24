package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cpp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5p0 f4760a;
    public final m5p0 b;
    public final List c;

    public cpp0(m5p0 m5p0Var, m5p0 m5p0Var2, List list) {
        list.getClass();
        this.f4760a = m5p0Var;
        this.b = m5p0Var2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpp0)) {
            return false;
        }
        cpp0 cpp0Var = (cpp0) obj;
        return this.f4760a.equals(cpp0Var.f4760a) && this.b.equals(cpp0Var.b) && Intrinsics.d(this.c, cpp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4760a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamsCharacteristicsModel(teamOne=");
        sb.append(this.f4760a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", forecasts=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
