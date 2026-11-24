package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z5q0 implements b6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43831a;
    public final String b;
    public final oie c;

    public z5q0(String str, oie oieVar) {
        str.getClass();
        this.f43831a = str;
        this.b = TokenNames.X;
        this.c = oieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5q0)) {
            return false;
        }
        z5q0 z5q0Var = (z5q0) obj;
        return Intrinsics.d(this.f43831a, z5q0Var.f43831a) && this.b.equals(z5q0Var.b) && Intrinsics.d(this.c, z5q0Var.c);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.a(9, this.f43831a.hashCode() * 31, 31), 31, this.b);
        oie oieVar = this.c;
        return iB + (oieVar == null ? 0 : oieVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Mask(mask=", this.f43831a, ", keyboardType=", bmy.a(9), ", maskSymbol=");
        sbN.append(this.b);
        sbN.append(", contentType=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
