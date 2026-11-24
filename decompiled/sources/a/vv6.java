package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vv6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38084a;
    public final List b;

    public vv6(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f38084a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv6)) {
            return false;
        }
        vv6 vv6Var = (vv6) obj;
        return Intrinsics.d(this.f38084a, vv6Var.f38084a) && Intrinsics.d(this.b, vv6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38084a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("BetEventWithIndexModel(betEvents=", ", eventsIndexes=", this.f38084a, Separators.RPAREN, this.b);
    }
}
