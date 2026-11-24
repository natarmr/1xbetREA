package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41340a;
    public final List b;

    public xqv(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f41340a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqv)) {
            return false;
        }
        xqv xqvVar = (xqv) obj;
        return Intrinsics.d(this.f41340a, xqvVar.f41340a) && Intrinsics.d(this.b, xqvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41340a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("HeaderFocusAllEventsModel(liveEvents=", ", lineEvents=", this.f41340a, Separators.RPAREN, this.b);
    }
}
