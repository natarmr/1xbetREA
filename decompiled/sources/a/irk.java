package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class irk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15260a;
    public final List b;

    public irk(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f15260a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irk)) {
            return false;
        }
        irk irkVar = (irk) obj;
        return Intrinsics.d(this.f15260a, irkVar.f15260a) && Intrinsics.d(this.b, irkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15260a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("DisciplineDetailsHeaderFocusTournamentsMapModel(liveChamps=", ", lineChamps=", this.f15260a, Separators.RPAREN, this.b);
    }
}
