package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class frq0 implements irq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10032a;
    public final String b;
    public final String c;
    public final String d;
    public final apq0 e;

    public frq0(String str, String str2, String str3, String str4, apq0 apq0Var) {
        brm0.B(str2, str3, str4);
        this.f10032a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = apq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frq0)) {
            return false;
        }
        frq0 frq0Var = (frq0) obj;
        return this.f10032a.equals(frq0Var.f10032a) && Intrinsics.d(this.b, frq0Var.b) && Intrinsics.d(this.c, frq0Var.c) && Intrinsics.d(this.d, frq0Var.d) && this.e.equals(frq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f10032a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(jackpot=", this.f10032a, ", tirage=", this.b, ", tirageStatus=");
        f140.v(sbN, this.c, ", betAcceptUntil=", this.d, ", tirageUiContent=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
