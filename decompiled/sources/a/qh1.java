package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qh1 {
    public static final ph1 Companion = new ph1();
    public static final a8z[] d = {maz.a(wez.f39042a, new c51(6)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28714a;
    public final int b;
    public final String c;

    public /* synthetic */ qh1(int i, int i2, String str, List list) {
        if ((i & 1) == 0) {
            this.f28714a = null;
        } else {
            this.f28714a = list;
        }
        this.b = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh1)) {
            return false;
        }
        qh1 qh1Var = (qh1) obj;
        return Intrinsics.d(this.f28714a, qh1Var.f28714a) && this.b == qh1Var.b && Intrinsics.d(this.c, qh1Var.c);
    }

    public final int hashCode() {
        List list = this.f28714a;
        int iA = twn.a(this.b, (list == null ? 0 : list.hashCode()) * 31, 31);
        String str = this.c;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorPromotedCategoriesResponse(categories=");
        sb.append(this.f28714a);
        sb.append(", errorId=");
        sb.append(this.b);
        sb.append(", errorMessage=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
