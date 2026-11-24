package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bma implements fma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1n f2827a;
    public final w1n b;
    public final u1n c;
    public final jwm d;
    public final jwm e;

    public bma(w1n w1nVar, w1n w1nVar2, u1n u1nVar, jwm jwmVar, jwm jwmVar2) {
        this.f2827a = w1nVar;
        this.b = w1nVar2;
        this.c = u1nVar;
        this.d = jwmVar;
        this.e = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bma)) {
            return false;
        }
        bma bmaVar = (bma) obj;
        return this.f2827a.equals(bmaVar.f2827a) && this.b.equals(bmaVar.b) && this.c.equals(bmaVar.c) && this.d.equals(bmaVar.d) && Intrinsics.d(this.e, bmaVar.e);
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f2827a.hashCode() * 31)) * 31)) * 31, 31);
        jwm jwmVar = this.e;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        return "MultiTeams(teamOne=" + this.f2827a + ", teamTwo=" + this.b + ", score=" + this.c + ", infoTwo=" + this.d + ", infoThree=" + this.e + Separators.RPAREN;
    }
}
