package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v2o0 implements a3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36696a;
    public final String b;
    public final dkk c;
    public final dkk d;
    public final dlk e;

    public v2o0(String str, String str2, dkk dkkVar, dkk dkkVar2, dlk dlkVar) {
        str.getClass();
        str2.getClass();
        this.f36696a = str;
        this.b = str2;
        this.c = dkkVar;
        this.d = dkkVar2;
        this.e = dlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2o0)) {
            return false;
        }
        v2o0 v2o0Var = (v2o0) obj;
        return Intrinsics.d(this.f36696a, v2o0Var.f36696a) && Intrinsics.d(this.b, v2o0Var.b) && this.c.equals(v2o0Var.c) && this.d.equals(v2o0Var.d) && this.e.equals(v2o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b1j.c(this.d, b1j.c(this.c, ua80.b(this.f36696a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Dice(firstOpponentName=", this.f36696a, ", secondOpponentName=", this.b, ", firstPlayerScore=");
        sbN.append(this.c);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.d);
        sbN.append(", resultScoreModel=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
