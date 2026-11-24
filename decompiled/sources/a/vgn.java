package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vgn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37389a;

    public vgn(List list) {
        list.getClass();
        this.f37389a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgn) && Intrinsics.d(this.f37389a, ((vgn) obj).f37389a);
    }

    public final int hashCode() {
        return this.f37389a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37389a, "EarnedPointsModel(earnedTableModel=", Separators.RPAREN);
    }
}
