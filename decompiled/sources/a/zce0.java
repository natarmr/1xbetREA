package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zce0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44163a;
    public final String b;
    public final boolean c;

    public zce0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f44163a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zce0)) {
            return false;
        }
        zce0 zce0Var = (zce0) obj;
        return Intrinsics.d(this.f44163a, zce0Var.f44163a) && Intrinsics.d(this.b, zce0Var.b) && this.c == zce0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f44163a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("RealityLimitLockScreenState(title=", this.f44163a, ", subtitle=", this.b, ", dontRemind="), this.c, Separators.RPAREN);
    }
}
