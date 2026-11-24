package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21887a;
    public final int b;

    public mja0(int i, List list) {
        list.getClass();
        this.f21887a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mja0)) {
            return false;
        }
        mja0 mja0Var = (mja0) obj;
        return Intrinsics.d(this.f21887a, mja0Var.f21887a) && this.b == mja0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f21887a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayersStatisticSelectorsBottomSheetState(filtersList=" + this.f21887a + ", chosenFilterId=" + this.b + Separators.RPAREN;
    }
}
