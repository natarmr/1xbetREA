package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7507a;
    public final float b;
    public final double c;
    public final double d;

    public eb8(List list, float f, double d, double d2) {
        list.getClass();
        this.f7507a = list;
        this.b = f;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb8)) {
            return false;
        }
        eb8 eb8Var = (eb8) obj;
        return Intrinsics.d(this.f7507a, eb8Var.f7507a) && Float.compare(this.b, eb8Var.b) == 0 && Double.compare(this.c, eb8Var.c) == 0 && Double.compare(this.d, eb8Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.d(this.c, defpackage.c.a(this.f7507a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardInfoModel(orderedPrices=");
        sb.append(this.f7507a);
        sb.append(", currentPrice=");
        sb.append(this.b);
        sb.append(", maxPrice=");
        sb.append(this.c);
        return brm0.m(sb, this.d, ", minPrice=", Separators.RPAREN);
    }
}
