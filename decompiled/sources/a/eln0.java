package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8009a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public eln0(List list, List list2, int i, int i2, int i3) {
        this.f8009a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eln0)) {
            return false;
        }
        eln0 eln0Var = (eln0) obj;
        return this.f8009a.equals(eln0Var.f8009a) && Intrinsics.d(this.b, eln0Var.b) && this.c == eln0Var.c && this.d == eln0Var.d && this.e == eln0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f8009a.hashCode() * 31;
        List list = this.b;
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
        sb.append(this.f8009a);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.b);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.c);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.d);
        sb.append(", maxFpsForAllSizes=");
        return brm0.n(sb, this.e, ')');
    }
}
