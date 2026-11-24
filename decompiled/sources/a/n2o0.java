package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n2o0 implements s2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22812a;
    public final String b;
    public final String c;
    public final String d;
    public final dkk e;
    public final dkk f;
    public final dlk g;

    public n2o0(dkk dkkVar, dkk dkkVar2, dlk dlkVar, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f22812a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dkkVar;
        this.f = dkkVar2;
        this.g = dlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2o0)) {
            return false;
        }
        n2o0 n2o0Var = (n2o0) obj;
        return Intrinsics.d(this.f22812a, n2o0Var.f22812a) && Intrinsics.d(this.b, n2o0Var.b) && Intrinsics.d(this.c, n2o0Var.c) && Intrinsics.d(this.d, n2o0Var.d) && this.e.equals(n2o0Var.e) && this.f.equals(n2o0Var.f) && this.g.equals(n2o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b1j.c(this.f, b1j.c(this.e, ua80.b(ua80.b(ua80.b(this.f22812a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Dice(liveTagText=", this.f22812a, ", firstOpponentName=", this.b, ", secondOpponentName=");
        f140.v(sbN, this.c, ", infoLabel=", this.d, ", firstPlayerScore=");
        sbN.append(this.e);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.f);
        sbN.append(", resultScoreModel=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
