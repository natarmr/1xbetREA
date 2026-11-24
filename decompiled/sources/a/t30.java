package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t30 implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33242a;
    public final String b;
    public final String c;

    public t30(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f33242a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.w30
    public final String a() {
        return this.f33242a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t30)) {
            return false;
        }
        t30 t30Var = (t30) obj;
        return this.f33242a.equals(t30Var.f33242a) && Intrinsics.d(this.b, t30Var.b) && Intrinsics.d(this.c, t30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f33242a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ValueDisabled(advanceTitle=", this.f33242a, ", balanceValue=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
