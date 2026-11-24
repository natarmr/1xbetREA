package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ocp0 implements wcp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5a0 f25038a;
    public final c5a0 b;
    public final String c;

    public ocp0(c5a0 c5a0Var, c5a0 c5a0Var2, String str) {
        str.getClass();
        this.f25038a = c5a0Var;
        this.b = c5a0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocp0)) {
            return false;
        }
        ocp0 ocp0Var = (ocp0) obj;
        return this.f25038a.equals(ocp0Var.f25038a) && this.b.equals(ocp0Var.b) && Intrinsics.d(this.c, ocp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.e(this.b.f3761a, this.f25038a.f3761a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(firstPlayerLogo=");
        sb.append(this.f25038a);
        sb.append(", secondPlayerLogo=");
        sb.append(this.b);
        sb.append(", name=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
