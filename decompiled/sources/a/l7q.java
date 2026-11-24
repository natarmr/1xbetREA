package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l7q implements o7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19571a;
    public final boolean b;
    public final List c;

    public l7q(List list, boolean z, boolean z2) {
        list.getClass();
        this.f19571a = z;
        this.b = z2;
        this.c = list;
    }

    public static l7q a(l7q l7qVar, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            z = l7qVar.f19571a;
        }
        boolean z2 = (i & 2) != 0 ? l7qVar.b : true;
        if ((i & 4) != 0) {
            list = l7qVar.c;
        }
        list.getClass();
        return new l7q(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7q)) {
            return false;
        }
        l7q l7qVar = (l7q) obj;
        return this.f19571a == l7qVar.f19571a && this.b == l7qVar.b && Intrinsics.d(this.c, l7qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f19571a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(f140.q("Content(quickBetEnabled=", ", quickBetActive=", ", instruments=", this.f19571a, this.b), this.c, Separators.RPAREN);
    }
}
