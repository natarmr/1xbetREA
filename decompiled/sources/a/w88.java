package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w88 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38710a;
    public final xxb0 b;
    public final List c;
    public final String d;
    public final String e;

    public w88(boolean z, xxb0 xxb0Var, List list, String str, String str2) {
        list.getClass();
        this.f38710a = z;
        this.b = xxb0Var;
        this.c = list;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w88)) {
            return false;
        }
        w88 w88Var = (w88) obj;
        return this.f38710a == w88Var.f38710a && this.b == w88Var.b && Intrinsics.d(this.c, w88Var.c) && this.d.equals(w88Var.d) && this.e.equals(w88Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(dw9.a((this.b.hashCode() + (Boolean.hashCode(this.f38710a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockPrizeModel(hidden=");
        sb.append(this.f38710a);
        sb.append(", clientDistributionType=");
        sb.append(this.b);
        sb.append(", items=");
        h97.y(", description=", this.d, ", title=", sb, this.c);
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
