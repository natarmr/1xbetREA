package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ieh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14633a;
    public final List b;

    public ieh(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f14633a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieh)) {
            return false;
        }
        ieh iehVar = (ieh) obj;
        return Intrinsics.d(this.f14633a, iehVar.f14633a) && Intrinsics.d(this.b, iehVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14633a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("CyberStageTableGameModel(tableTitles=", ", tableBody=", this.f14633a, Separators.RPAREN, this.b);
    }
}
