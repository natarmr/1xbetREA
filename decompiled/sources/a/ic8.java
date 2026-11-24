package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ic8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14523a;
    public final String b;
    public final List c;

    public ic8(List list, String str, String str2) {
        list.getClass();
        this.f14523a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic8)) {
            return false;
        }
        ic8 ic8Var = (ic8) obj;
        return this.f14523a.equals(ic8Var.f14523a) && this.b.equals(ic8Var.b) && Intrinsics.d(this.c, ic8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f14523a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(b1j.n("BonusAgreements(titleInfo=", this.f14523a, ", descInfo=", this.b, ", bonuses="), this.c, Separators.RPAREN);
    }
}
