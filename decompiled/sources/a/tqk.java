package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34384a;
    public final List b;

    public tqk(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f34384a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqk)) {
            return false;
        }
        tqk tqkVar = (tqk) obj;
        return Intrinsics.d(this.f34384a, tqkVar.f34384a) && Intrinsics.d(this.b, tqkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34384a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("DisciplineDetailsEventFocusTournamentsMapModel(liveChamps=", ", lineChamps=", this.f34384a, Separators.RPAREN, this.b);
    }
}
