package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2711a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bjk(String str, boolean z, boolean z2, boolean z3) {
        this.f2711a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjk)) {
            return false;
        }
        bjk bjkVar = (bjk) obj;
        return Intrinsics.d(this.f2711a, bjkVar.f2711a) && this.b == bjkVar.b && this.c == bjkVar.c && this.d == bjkVar.d;
    }

    public final int hashCode() {
        String str = this.f2711a;
        return Boolean.hashCode(this.d) + brm0.e(brm0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", shouldReattachParent=", Separators.RPAREN, brm0.u("DialogParams(key=", this.f2711a, ", isAllowingStateLoss=", this.b, ", isShowMultipleDialog="), this.c, this.d);
    }
}
