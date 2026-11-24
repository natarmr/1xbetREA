package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tcr implements vcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33731a;
    public final boolean b;
    public final th90 c;
    public final String d;

    public tcr(boolean z, boolean z2, th90 th90Var, String str) {
        th90Var.getClass();
        this.f33731a = z;
        this.b = z2;
        this.c = th90Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcr)) {
            return false;
        }
        tcr tcrVar = (tcr) obj;
        return this.f33731a == tcrVar.f33731a && this.b == tcrVar.b && Intrinsics.d(this.c, tcrVar.c) && this.d.equals(tcrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f33731a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Content(isLoading=", ", debugAllowed=", ", headers=", this.f33731a, this.b);
        sbQ.append(this.c);
        sbQ.append(", statisticUrl=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
