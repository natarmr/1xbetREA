package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33561a;
    public final List b;

    public t9g(List list, List list2) {
        list2.getClass();
        this.f33561a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9g)) {
            return false;
        }
        t9g t9gVar = (t9g) obj;
        return this.f33561a.equals(t9gVar.f33561a) && Intrinsics.d(this.b, t9gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33561a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("CyberCalendarPeriodViewParamsUiModel(currentPeriod=", ", events=", this.f33561a, Separators.RPAREN, this.b);
    }
}
