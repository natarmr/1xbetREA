package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qwa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29426a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final pwa0 f;

    public qwa0(String str, String str2, int i, String str3, int i2, pwa0 pwa0Var) {
        str.getClass();
        this.f29426a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = pwa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwa0)) {
            return false;
        }
        qwa0 qwa0Var = (qwa0) obj;
        return Intrinsics.d(this.f29426a, qwa0Var.f29426a) && this.b.equals(qwa0Var.b) && this.c == qwa0Var.c && this.d.equals(qwa0Var.d) && this.e == qwa0Var.e && Intrinsics.d(this.f, qwa0Var.f);
    }

    public final int hashCode() {
        int iA = twn.a(this.e, ua80.b(twn.a(this.c, ua80.b(this.f29426a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31);
        pwa0 pwa0Var = this.f;
        return iA + (pwa0Var == null ? 0 : pwa0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PopUpBonusModel(id=", this.f29426a, ", text=", this.b, ", time=");
        kng0.w(this.c, ", title=", this.d, ", typeId=", sbN);
        sbN.append(this.e);
        sbN.append(", extension=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
