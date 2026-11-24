package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13285a;
    public final List b;

    public hm1(int i, List list, List list2) {
        this((i & 1) != 0 ? iun.f15405a : list, (i & 2) != 0 ? iun.f15405a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm1)) {
            return false;
        }
        hm1 hm1Var = (hm1) obj;
        return Intrinsics.d(this.f13285a, hm1Var.f13285a) && Intrinsics.d(this.b, hm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13285a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("PartTypeOneScreen(chosenFilters=", ", chosenProviders=", this.f13285a, Separators.RPAREN, this.b);
    }

    public hm1(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f13285a = list;
        this.b = list2;
    }
}
