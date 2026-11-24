package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13959a;
    public final List b;

    public i0q0(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f13959a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0q0)) {
            return false;
        }
        i0q0 i0q0Var = (i0q0) obj;
        return Intrinsics.d(this.f13959a, i0q0Var.f13959a) && Intrinsics.d(this.b, i0q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13959a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("TennisWinLossModel(winLossSingleList=", ", winLossDoubleList=", this.f13959a, Separators.RPAREN, this.b);
    }
}
