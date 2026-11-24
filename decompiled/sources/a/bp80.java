package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bp80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2970a;
    public final int b;
    public final String c;

    public bp80(int i, Long l, String str) {
        str.getClass();
        this.f2970a = l;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp80)) {
            return false;
        }
        bp80 bp80Var = (bp80) obj;
        return Intrinsics.d(this.f2970a, bp80Var.f2970a) && this.b == bp80Var.b && Intrinsics.d(this.c, bp80Var.c);
    }

    public final int hashCode() {
        Long l = this.f2970a;
        return this.c.hashCode() + twn.a(this.b, (l == null ? 0 : l.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParamsRecommended(partitionId=");
        sb.append(this.f2970a);
        sb.append(", pageNumber=");
        sb.append(this.b);
        sb.append(", androidId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
