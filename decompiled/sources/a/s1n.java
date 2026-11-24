package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1n f31465a;
    public final w1n b;
    public final v1n c;
    public final jwm d;
    public final jwm e;
    public final jwm f;
    public final boolean g;

    public s1n(w1n w1nVar, w1n w1nVar2, v1n v1nVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z) {
        this.f31465a = w1nVar;
        this.b = w1nVar2;
        this.c = v1nVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1n)) {
            return false;
        }
        s1n s1nVar = (s1n) obj;
        return this.f31465a.equals(s1nVar.f31465a) && this.b.equals(s1nVar.b) && this.c.equals(s1nVar.c) && this.d.equals(s1nVar.d) && this.e.equals(s1nVar.e) && Intrinsics.d(this.f, s1nVar.f) && this.g == s1nVar.g;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f31465a.hashCode() * 31)) * 31)) * 31, 31), 31);
        jwm jwmVar = this.f;
        return Boolean.hashCode(this.g) + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(teamOne=");
        sb.append(this.f31465a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", infoOne=");
        sb.append(this.d);
        sb.append(", infoTwo=");
        b1j.A(sb, this.e, ", infoThree=", this.f, ", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
