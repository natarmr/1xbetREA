package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qnl0 implements xnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29035a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final qem h;
    public final qtm i;

    public qnl0(String str, String str2, long j, String str3, String str4, long j2, String str5, qem qemVar, qtm qtmVar) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f29035a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = str5;
        this.h = qemVar;
        this.i = qtmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnl0)) {
            return false;
        }
        qnl0 qnl0Var = (qnl0) obj;
        if (!Intrinsics.d(this.f29035a, qnl0Var.f29035a) || !Intrinsics.d(this.b, qnl0Var.b)) {
            return false;
        }
        long j = qnl0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && Intrinsics.d(this.d, qnl0Var.d) && Intrinsics.d(this.e, qnl0Var.e) && h2t0.a(this.f, qnl0Var.f) && Intrinsics.d(this.g, qnl0Var.g) && Intrinsics.d(this.h, qnl0Var.h) && Intrinsics.d(this.i, qnl0Var.i);
    }

    public final int hashCode() {
        int i;
        int iB = ua80.b(this.f29035a.hashCode() * 31, 31, this.b);
        int i2 = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB2 = ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        qem qemVar = this.h;
        if (qemVar == null) {
            i = 0;
        } else {
            qemVar.getClass();
            i = -924444967;
        }
        int i3 = (iB2 + i) * 31;
        qtm qtmVar = this.i;
        return i3 + (qtmVar != null ? qtmVar.hashCode() : 0);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("Cricket(teamOneName=", this.f29035a, ", teamOneScore=", this.b, ", teamOneScoreColor=");
        f140.v(sbN, strI, ", teamTwoName=", this.d, ", teamTwoScore=");
        f140.v(sbN, this.e, ", teamTwoScoreColor=", strI2, ", infoLabel=");
        sbN.append(this.g);
        sbN.append(", eventStatusIndicatorModel=");
        sbN.append(this.h);
        sbN.append(", timer=");
        sbN.append(this.i);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
