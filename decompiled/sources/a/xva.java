package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xva implements zva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41549a;
    public final String b;
    public final String c;
    public final ijl d;
    public final String e;

    public xva(String str, String str2, String str3, ijl ijlVar, String str4) {
        brm0.B(str, str3, str4);
        this.f41549a = str;
        this.b = str2;
        this.c = str3;
        this.d = ijlVar;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xva)) {
            return false;
        }
        xva xvaVar = (xva) obj;
        return Intrinsics.d(this.f41549a, xvaVar.f41549a) && this.b.equals(xvaVar.b) && Intrinsics.d(this.c, xvaVar.c) && this.d == xvaVar.d && Intrinsics.d(this.e, xvaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f41549a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AccountSelection(balanceName=", this.f41549a, ", money=", this.b, ", currency=");
        sbN.append(this.c);
        sbN.append(", style=");
        sbN.append(this.d);
        sbN.append(", topUpLabel=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
