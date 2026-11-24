package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5745a;

    public dag(List list) {
        list.getClass();
        this.f5745a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dag) && Intrinsics.d(this.f5745a, ((dag) obj).f5745a);
    }

    public final int hashCode() {
        return this.f5745a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f5745a, "CyberCalendarStatisticModel(tournaments=", Separators.RPAREN);
    }
}
