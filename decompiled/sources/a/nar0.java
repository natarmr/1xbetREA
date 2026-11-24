package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23204a;
    public final String b;
    public final u6n c;
    public final String d;
    public final u6n e;
    public final s6x f;
    public final s6x g;

    public nar0(String str, String str2, u6n u6nVar, String str3, u6n u6nVar2, s6x s6xVar, s6x s6xVar2) {
        str.getClass();
        this.f23204a = str;
        this.b = str2;
        this.c = u6nVar;
        this.d = str3;
        this.e = u6nVar2;
        this.f = s6xVar;
        this.g = s6xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nar0)) {
            return false;
        }
        nar0 nar0Var = (nar0) obj;
        return Intrinsics.d(this.f23204a, nar0Var.f23204a) && this.b.equals(nar0Var.b) && this.c.equals(nar0Var.c) && this.d.equals(nar0Var.d) && this.e.equals(nar0Var.e) && this.f.equals(nar0Var.f) && this.g.equals(nar0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ua80.b(this.f23204a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TopPlayersKabaddiUiModel(title=", this.f23204a, ", player1Name=", this.b, ", player1Logo=");
        sbN.append(this.c);
        sbN.append(", player2Name=");
        sbN.append(this.d);
        sbN.append(", player2Logo=");
        sbN.append(this.e);
        sbN.append(", attemptsIndicatorUiModel=");
        sbN.append(this.f);
        sbN.append(", pointsIndicatorUiModel=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
