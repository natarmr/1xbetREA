package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q210 implements t210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f27979a;
    public final boolean b;
    public final List c;

    public q210(i4 i4Var, boolean z, List list) {
        i4Var.getClass();
        list.getClass();
        this.f27979a = i4Var;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q210)) {
            return false;
        }
        q210 q210Var = (q210) obj;
        return Intrinsics.d(this.f27979a, q210Var.f27979a) && this.b == q210Var.b && Intrinsics.d(this.c, q210Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f27979a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(itemList=");
        sb.append(this.f27979a);
        sb.append(", resetScroll=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
