package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class via0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37470a;

    public via0(List list) {
        list.getClass();
        this.f37470a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof via0) && Intrinsics.d(this.f37470a, ((via0) obj).f37470a);
    }

    public final int hashCode() {
        return this.f37470a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37470a, "PlayersStatisticInfoBottomSheetState(columnTitles=", Separators.RPAREN);
    }
}
