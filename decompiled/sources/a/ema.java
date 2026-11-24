package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ema implements fma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1n f8038a;
    public final w1n b;
    public final u1n c;
    public final jwm d;
    public final jwm e;

    public ema(w1n w1nVar, w1n w1nVar2, u1n u1nVar, jwm jwmVar, jwm jwmVar2) {
        this.f8038a = w1nVar;
        this.b = w1nVar2;
        this.c = u1nVar;
        this.d = jwmVar;
        this.e = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ema)) {
            return false;
        }
        ema emaVar = (ema) obj;
        return this.f8038a.equals(emaVar.f8038a) && this.b.equals(emaVar.b) && this.c.equals(emaVar.c) && this.d.equals(emaVar.d) && Intrinsics.d(this.e, emaVar.e);
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f8038a.hashCode() * 31)) * 31)) * 31, 31);
        jwm jwmVar = this.e;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        return "TwoPairs(teamOne=" + this.f8038a + ", teamTwo=" + this.b + ", score=" + this.c + ", infoTwo=" + this.d + ", infoThree=" + this.e + Separators.RPAREN;
    }
}
