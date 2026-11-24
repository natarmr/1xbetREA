package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tnr0 implements vnr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34250a;
    public final String b;
    public final String c;
    public final String d;
    public final gmq e;
    public final String f;

    public tnr0(String str, String str2, String str3, String str4, gmq gmqVar, String str5) {
        brm0.B(str, str2, str5);
        this.f34250a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gmqVar;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnr0)) {
            return false;
        }
        tnr0 tnr0Var = (tnr0) obj;
        return Intrinsics.d(this.f34250a, tnr0Var.f34250a) && Intrinsics.d(this.b, tnr0Var.b) && this.c.equals(tnr0Var.c) && this.d.equals(tnr0Var.d) && this.e.equals(tnr0Var.e) && Intrinsics.d(this.f, tnr0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f34250a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TotoHeaderBanner(jackpotValue=", this.f34250a, ", tirageValue=", this.b, ", betAcceptTimeLimit=");
        f140.v(sbN, this.c, ", poolTimerValue=", this.d, ", untilEndTimerValue=");
        sbN.append(this.e);
        sbN.append(", poolSumValue=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
