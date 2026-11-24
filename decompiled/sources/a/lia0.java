package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20094a;
    public final int b;

    public lia0(int i, List list) {
        list.getClass();
        this.f20094a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lia0)) {
            return false;
        }
        lia0 lia0Var = (lia0) obj;
        return Intrinsics.d(this.f20094a, lia0Var.f20094a) && this.b == lia0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f20094a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayersStatisticCricketSelectorsBottomSheetState(filtersList=" + this.f20094a + ", chosenFilterId=" + this.b + Separators.RPAREN;
    }
}
