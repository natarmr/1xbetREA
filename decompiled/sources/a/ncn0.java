package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ncn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23303a;
    public final boolean b;
    public final int c;
    public final List d;

    public ncn0(int i, String str, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.f23303a = str;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    public static ncn0 a(ncn0 ncn0Var, boolean z, int i, int i2) {
        String str = ncn0Var.f23303a;
        if ((i2 & 2) != 0) {
            z = ncn0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = ncn0Var.c;
        }
        List list = ncn0Var.d;
        str.getClass();
        list.getClass();
        return new ncn0(i, str, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncn0)) {
            return false;
        }
        ncn0 ncn0Var = (ncn0) obj;
        return Intrinsics.d(this.f23303a, ncn0Var.f23303a) && this.b == ncn0Var.b && this.c == ncn0Var.c && Intrinsics.d(this.d, ncn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, brm0.e(this.f23303a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SubscriptionsTeamBetContainerState(navigationBarTitle=", this.f23303a, ", basketButtonEnabled=", this.b, ", selectedTab=");
        sbU.append(this.c);
        sbU.append(", tabs=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
