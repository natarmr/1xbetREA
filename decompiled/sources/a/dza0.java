package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dza0 implements oza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f6934a;
    public final a4x b;
    public final boolean c;

    public dza0(lq5 lq5Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f6934a = lq5Var;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dza0)) {
            return false;
        }
        dza0 dza0Var = (dza0) obj;
        return this.f6934a.equals(dza0Var.f6934a) && Intrinsics.d(this.b, dza0Var.b) && this.c == dza0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f6934a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularAggregatorBannersItemUiModel(style=");
        sb.append(this.f6934a);
        sb.append(", bannersList=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
