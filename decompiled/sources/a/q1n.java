package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1n f27962a;
    public final w1n b;
    public final t1n c;
    public final jwm d;
    public final jwm e;
    public final jwm f;
    public final boolean g;

    public q1n(w1n w1nVar, w1n w1nVar2, t1n t1nVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z) {
        this.f27962a = w1nVar;
        this.b = w1nVar2;
        this.c = t1nVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1n)) {
            return false;
        }
        q1n q1nVar = (q1n) obj;
        return this.f27962a.equals(q1nVar.f27962a) && this.b.equals(q1nVar.b) && this.c.equals(q1nVar.c) && this.d.equals(q1nVar.d) && this.e.equals(q1nVar.e) && Intrinsics.d(this.f, q1nVar.f) && this.g == q1nVar.g;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f27962a.hashCode() * 31)) * 31)) * 31, 31), 31);
        jwm jwmVar = this.f;
        return Boolean.hashCode(this.g) + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(teamOne=");
        sb.append(this.f27962a);
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
