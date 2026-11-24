package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class y080 {
    public static final u080 Companion = new u080();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41795a;
    public final String b;
    public final x080 c;

    public /* synthetic */ y080(int i, String str, String str2, x080 x080Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, t080.f33107a.getDescriptor());
            throw null;
        }
        this.f41795a = str;
        this.b = str2;
        this.c = x080Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y080)) {
            return false;
        }
        y080 y080Var = (y080) obj;
        return Intrinsics.d(this.f41795a, y080Var.f41795a) && Intrinsics.d(this.b, y080Var.b) && Intrinsics.d(this.c, y080Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f41795a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OperationRequest(id=", this.f41795a, ", rt=", this.b, ", payload=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public y080(String str, String str2, x080 x080Var) {
        str.getClass();
        this.f41795a = str;
        this.b = str2;
        this.c = x080Var;
    }
}
