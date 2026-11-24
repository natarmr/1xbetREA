package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35668a;

    public uha0(List list) {
        list.getClass();
        this.f35668a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uha0) && Intrinsics.d(this.f35668a, ((uha0) obj).f35668a);
    }

    public final int hashCode() {
        return this.f35668a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f35668a, "PlayersStatisticCricketInfoBottomSheetState(columnTitles=", Separators.RPAREN);
    }
}
