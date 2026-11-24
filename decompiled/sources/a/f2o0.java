package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f2o0 implements k2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8822a;
    public final String b;
    public final String c;
    public final dkk d;
    public final dkk e;
    public final dlk f;

    public f2o0(String str, String str2, String str3, dkk dkkVar, dkk dkkVar2, dlk dlkVar) {
        brm0.B(str, str2, str3);
        this.f8822a = str;
        this.b = str2;
        this.c = str3;
        this.d = dkkVar;
        this.e = dkkVar2;
        this.f = dlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2o0)) {
            return false;
        }
        f2o0 f2o0Var = (f2o0) obj;
        return Intrinsics.d(this.f8822a, f2o0Var.f8822a) && Intrinsics.d(this.b, f2o0Var.b) && Intrinsics.d(this.c, f2o0Var.c) && this.d.equals(f2o0Var.d) && this.e.equals(f2o0Var.e) && this.f.equals(f2o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b1j.c(this.e, b1j.c(this.d, ua80.b(ua80.b(this.f8822a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Dice(firstOpponentName=", this.f8822a, ", secondOpponentName=", this.b, ", infoLabel=");
        sbN.append(this.c);
        sbN.append(", firstPlayerScore=");
        sbN.append(this.d);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.e);
        sbN.append(", resultScoreModel=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
