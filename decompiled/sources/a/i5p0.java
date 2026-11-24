package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i5p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14204a;
    public final List b;

    public i5p0(int i, List list) {
        list.getClass();
        this.f14204a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5p0)) {
            return false;
        }
        i5p0 i5p0Var = (i5p0) obj;
        return this.f14204a == i5p0Var.f14204a && Intrinsics.d(this.b, i5p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f14204a) * 31);
    }

    public final String toString() {
        return "TeamChampStatisticModel(sportId=" + this.f14204a + ", items=" + this.b + Separators.RPAREN;
    }
}
