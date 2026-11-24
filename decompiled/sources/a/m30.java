package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m30 implements v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21089a;
    public final String b;
    public final String c;

    public m30(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f21089a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.v30
    public final String a() {
        return this.f21089a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m30)) {
            return false;
        }
        m30 m30Var = (m30) obj;
        return Intrinsics.d(this.f21089a, m30Var.f21089a) && Intrinsics.d(this.b, m30Var.b) && Intrinsics.d(this.c, m30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f21089a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("RefreshActive(advanceTitle=", this.f21089a, ", balanceValue=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
