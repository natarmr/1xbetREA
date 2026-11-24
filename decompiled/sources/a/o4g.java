package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o4g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24633a;
    public final List b;

    public o4g(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f24633a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4g)) {
            return false;
        }
        o4g o4gVar = (o4g) obj;
        return Intrinsics.d(this.f24633a, o4gVar.f24633a) && Intrinsics.d(this.b, o4gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24633a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("CyberCalendarAvailableParamsModel(availableSubSportIds=", ", availableDates=", this.f24633a, Separators.RPAREN, this.b);
    }
}
