package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rqn0 implements uqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30939a;
    public final String b;
    public final String c;
    public final String d;

    public rqn0(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f30939a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqn0)) {
            return false;
        }
        rqn0 rqn0Var = (rqn0) obj;
        return Intrinsics.d(this.f30939a, rqn0Var.f30939a) && this.b.equals(rqn0Var.b) && this.c.equals(rqn0Var.c) && this.d.equals(rqn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f30939a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("SettingsBetSum(description=", this.f30939a, ", betSum=", this.b, ", betCurrency="), this.c, ", balance=", this.d, Separators.RPAREN);
    }
}
