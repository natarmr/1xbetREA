package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qx20 implements ux20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx20 f29461a;
    public final List b;
    public final int c;
    public final boolean d;

    public qx20(mx20 mx20Var, List list, int i, boolean z) {
        mx20Var.getClass();
        list.getClass();
        this.f29461a = mx20Var;
        this.b = list;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx20)) {
            return false;
        }
        qx20 qx20Var = (qx20) obj;
        return Intrinsics.d(this.f29461a, qx20Var.f29461a) && Intrinsics.d(this.b, qx20Var.b) && this.c == qx20Var.c && this.d == qx20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, dw9.a(this.f29461a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(info=");
        sb.append(this.f29461a);
        sb.append(", graphs=");
        sb.append(this.b);
        sb.append(", coefViewTypeId=");
        return ohs0.k(this.c, ", gameLive=", Separators.RPAREN, sb, this.d);
    }
}
