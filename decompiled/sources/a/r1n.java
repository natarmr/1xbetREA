package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1n f29690a;
    public final w1n b;
    public final u1n c;
    public final jwm d;
    public final jwm e;
    public final boolean f;

    public r1n(w1n w1nVar, w1n w1nVar2, u1n u1nVar, jwm jwmVar, jwm jwmVar2, boolean z) {
        this.f29690a = w1nVar;
        this.b = w1nVar2;
        this.c = u1nVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1n)) {
            return false;
        }
        r1n r1nVar = (r1n) obj;
        return this.f29690a.equals(r1nVar.f29690a) && this.b.equals(r1nVar.b) && this.c.equals(r1nVar.c) && this.d.equals(r1nVar.d) && Intrinsics.d(this.e, r1nVar.e) && this.f == r1nVar.f;
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f29690a.hashCode() * 31)) * 31)) * 31, 31);
        jwm jwmVar = this.e;
        return Boolean.hashCode(this.f) + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        return "V3(teamOne=" + this.f29690a + ", teamTwo=" + this.b + ", score=" + this.c + ", infoTwo=" + this.d + ", infoThree=" + this.e + ", supportRtl=" + this.f + Separators.RPAREN;
    }
}
