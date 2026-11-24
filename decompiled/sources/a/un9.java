package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class un9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35950a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public un9(String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.f35950a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un9)) {
            return false;
        }
        un9 un9Var = (un9) obj;
        return this.f35950a.equals(un9Var.f35950a) && this.b == un9Var.b && this.c == un9Var.c && Intrinsics.d(this.d, un9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f35950a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("CalendarTournamentRoundPlayoffModel(name=", this.f35950a, ", isThirdPlace=", this.b, ", isGrandFinal=");
        sbU.append(this.c);
        sbU.append(", matches=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
