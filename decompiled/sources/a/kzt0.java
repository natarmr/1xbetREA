package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kzt0 implements nzt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f19167a;
    public final boolean b;
    public final List c;

    public kzt0(i4 i4Var, boolean z, List list) {
        i4Var.getClass();
        list.getClass();
        this.f19167a = i4Var;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzt0)) {
            return false;
        }
        kzt0 kzt0Var = (kzt0) obj;
        return Intrinsics.d(this.f19167a, kzt0Var.f19167a) && this.b == kzt0Var.b && Intrinsics.d(this.c, kzt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f19167a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(itemList=");
        sb.append(this.f19167a);
        sb.append(", resetScroll=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
