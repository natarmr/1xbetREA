package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qr40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29192a;
    public final String b;
    public final String c;
    public final ur40 d;

    public qr40(String str, String str2, String str3, ur40 ur40Var) {
        brm0.B(str, str2, str3);
        this.f29192a = str;
        this.b = str2;
        this.c = str3;
        this.d = ur40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr40)) {
            return false;
        }
        qr40 qr40Var = (qr40) obj;
        return Intrinsics.d(this.f29192a, qr40Var.f29192a) && Intrinsics.d(this.b, qr40Var.b) && Intrinsics.d(this.c, qr40Var.c) && this.d.equals(qr40Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f29192a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MortalKombatStatisticUiModel(round=", this.f29192a, ", time=", this.b, ", finishRound=");
        sbN.append(this.c);
        sbN.append(", winRound=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
