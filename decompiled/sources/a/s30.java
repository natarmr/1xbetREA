package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s30 implements v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31530a;
    public final String b;
    public final String c;

    public s30(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f31530a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.v30
    public final String a() {
        return this.f31530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s30)) {
            return false;
        }
        s30 s30Var = (s30) obj;
        return this.f31530a.equals(s30Var.f31530a) && Intrinsics.d(this.b, s30Var.b) && Intrinsics.d(this.c, s30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31530a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ValueDisabled(advanceTitle=", this.f31530a, ", balanceValue=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
