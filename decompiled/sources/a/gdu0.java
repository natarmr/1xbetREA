package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gdu0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11120a;
    public final List b;
    public final String c;
    public final String d;
    public final ydu0 e;
    public final long f;

    public gdu0(List list, List list2, String str, String str2, ydu0 ydu0Var, long j) {
        list.getClass();
        list2.getClass();
        this.f11120a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
        this.e = ydu0Var;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdu0)) {
            return false;
        }
        gdu0 gdu0Var = (gdu0) obj;
        return Intrinsics.d(this.f11120a, gdu0Var.f11120a) && Intrinsics.d(this.b, gdu0Var.b) && this.c.equals(gdu0Var.c) && this.d.equals(gdu0Var.d) && this.e == gdu0Var.e && this.f == gdu0Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ((this.e.hashCode() + ua80.b(ua80.b(dw9.a(this.f11120a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("VictoryFormulaLiveModel(playerOneNumbers=", ", playerTwoNumbers=", this.f11120a, ", formulaPlayerOne=", this.b);
        f140.v(sbT, this.c, ", formulaPlayerTwo=", this.d, ", gameStatus=");
        sbT.append(this.e);
        sbT.append(", timer=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
