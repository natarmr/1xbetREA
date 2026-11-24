package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zrk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44858a;
    public final List b;

    public zrk(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f44858a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrk)) {
            return false;
        }
        zrk zrkVar = (zrk) obj;
        return Intrinsics.d(this.f44858a, zrkVar.f44858a) && Intrinsics.d(this.b, zrkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44858a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("DisciplineDetailsIconFocusTournamentsMapModel(liveChamps=", ", lineChamps=", this.f44858a, Separators.RPAREN, this.b);
    }
}
