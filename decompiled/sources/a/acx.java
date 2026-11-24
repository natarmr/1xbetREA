package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class acx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f652a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public acx(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f652a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static acx a(acx acxVar, boolean z, boolean z2, int i) {
        boolean z3 = (i & 2) != 0 ? acxVar.b : true;
        if ((i & 4) != 0) {
            z2 = acxVar.c;
        }
        List list = acxVar.d;
        acxVar.getClass();
        list.getClass();
        return new acx(list, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acx)) {
            return false;
        }
        acx acxVar = (acx) obj;
        return this.f652a == acxVar.f652a && this.b == acxVar.b && this.c == acxVar.c && Intrinsics.d(this.d, acxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f652a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("InjuriesState(isLoading=", ", isEmpty=", ", isError=", this.f652a, this.b);
        sbQ.append(this.c);
        sbQ.append(", injuriesList=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
