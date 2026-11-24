package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pqn0 implements uqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27423a;
    public final String b;
    public final String c;
    public final String d;

    public pqn0(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f27423a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqn0)) {
            return false;
        }
        pqn0 pqn0Var = (pqn0) obj;
        return Intrinsics.d(this.f27423a, pqn0Var.f27423a) && this.b.equals(pqn0Var.b) && this.c.equals(pqn0Var.c) && this.d.equals(pqn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f27423a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("BetByButtons(description=", this.f27423a, ", betSum=", this.b, ", betCurrency="), this.c, ", balance=", this.d, Separators.RPAREN);
    }
}
