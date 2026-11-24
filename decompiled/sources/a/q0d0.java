package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q0d0 extends r0d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27892a;
    public final String b;
    public final List c;
    public final ghn d;

    public q0d0(String str, String str2, List list, ghn ghnVar) {
        this.f27892a = str;
        this.b = str2;
        this.c = list;
        this.d = ghnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0d0)) {
            return false;
        }
        q0d0 q0d0Var = (q0d0) obj;
        return Intrinsics.d(this.f27892a, q0d0Var.f27892a) && Intrinsics.d(this.b, q0d0Var.b) && Intrinsics.d(this.c, q0d0Var.c) && Intrinsics.d(this.d, q0d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(ua80.b(this.f27892a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PropertyValuesHolder2D(xPropertyName=", this.f27892a, ", yPropertyName=", this.b, ", pathData=");
        sbN.append(this.c);
        sbN.append(", interpolator=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
