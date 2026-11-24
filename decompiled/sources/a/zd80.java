package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zd80 implements ud80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd80 f44201a;
    public final yd80 b;
    public final List c;

    public zd80(wd80 wd80Var, yd80 yd80Var, List list) {
        list.getClass();
        this.f44201a = wd80Var;
        this.b = yd80Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd80)) {
            return false;
        }
        zd80 zd80Var = (zd80) obj;
        return this.f44201a.equals(zd80Var.f44201a) && this.b.equals(zd80Var.b) && Intrinsics.d(this.c, zd80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f44201a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutcomesCardUiModel(outcomesCardHeaderUiModel=");
        sb.append(this.f44201a);
        sb.append(", outcomesCardTeamUiModel=");
        sb.append(this.b);
        sb.append(", outcomesChoice=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
