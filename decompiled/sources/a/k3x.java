package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k3x {
    public static final k3x g = new k3x(false, 0, true, 1, 1, rs00.c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17640a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final rs00 f;

    public k3x(boolean z, int i, boolean z2, int i2, int i3, rs00 rs00Var) {
        this.f17640a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = rs00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3x)) {
            return false;
        }
        k3x k3xVar = (k3x) obj;
        return this.f17640a == k3xVar.f17640a && this.b == k3xVar.b && this.c == k3xVar.c && this.d == k3xVar.d && this.e == k3xVar.e && Intrinsics.d(this.f, k3xVar.f);
    }

    public final int hashCode() {
        return this.f.f31011a.hashCode() + twn.a(this.e, twn.a(this.d, brm0.e(twn.a(this.b, Boolean.hashCode(this.f17640a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String strA = ply.a(this.b);
        String strA2 = bmy.a(this.d);
        String strA3 = j3x.a(this.e);
        StringBuilder sbQ = axq.q("ImeOptions(singleLine=", ", capitalization=", strA, this.f17640a, ", autoCorrect=");
        f140.s(", keyboardType=", strA2, ", imeAction=", sbQ, this.c);
        sbQ.append(strA3);
        sbQ.append(", platformImeOptions=null, hintLocales=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
