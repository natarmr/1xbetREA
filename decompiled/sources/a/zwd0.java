package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zwd0 implements cxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f45101a;
    public final boolean b;
    public final List c;

    public zwd0(i4 i4Var, boolean z, List list) {
        i4Var.getClass();
        list.getClass();
        this.f45101a = i4Var;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwd0)) {
            return false;
        }
        zwd0 zwd0Var = (zwd0) obj;
        return Intrinsics.d(this.f45101a, zwd0Var.f45101a) && this.b == zwd0Var.b && Intrinsics.d(this.c, zwd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f45101a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(itemList=");
        sb.append(this.f45101a);
        sb.append(", resetScroll=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
