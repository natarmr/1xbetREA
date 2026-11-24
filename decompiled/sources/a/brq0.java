package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class brq0 implements erq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3091a;
    public final String b;
    public final String c;
    public final String d;
    public final lrq0 e;

    public brq0(String str, String str2, String str3, String str4, lrq0 lrq0Var) {
        str4.getClass();
        this.f3091a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = lrq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brq0)) {
            return false;
        }
        brq0 brq0Var = (brq0) obj;
        return this.f3091a.equals(brq0Var.f3091a) && this.b.equals(brq0Var.b) && this.c.equals(brq0Var.c) && Intrinsics.d(this.d, brq0Var.d) && this.e.equals(brq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f3091a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(jackpot=", this.f3091a, ", tirage=", this.b, ", tirageStatus=");
        f140.v(sbN, this.c, ", betAcceptUntil=", this.d, ", tirageUiContent=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
