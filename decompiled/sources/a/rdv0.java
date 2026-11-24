package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rdv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30307a;
    public final long b;
    public final long c;
    public final pdv0 d;
    public final qdv0 e;
    public final qdv0 f;
    public final iev0 g;
    public final boolean h;

    public rdv0(long j, long j2, long j3, pdv0 pdv0Var, qdv0 qdv0Var, qdv0 qdv0Var2, iev0 iev0Var, boolean z) {
        this.f30307a = j;
        this.b = j2;
        this.c = j3;
        this.d = pdv0Var;
        this.e = qdv0Var;
        this.f = qdv0Var2;
        this.g = iev0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdv0)) {
            return false;
        }
        rdv0 rdv0Var = (rdv0) obj;
        return this.f30307a == rdv0Var.f30307a && this.b == rdv0Var.b && this.c == rdv0Var.c && this.d.equals(rdv0Var.d) && this.e.equals(rdv0Var.e) && this.f.equals(rdv0Var.f) && this.g.equals(rdv0Var.g) && this.h == rdv0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f30307a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30307a, "WidgetEventUiModel(sportId=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", eventId=", this.c, ", header=");
        sbQ.append(this.d);
        sbQ.append(", firstOpponent=");
        sbQ.append(this.e);
        sbQ.append(", secondOpponent=");
        sbQ.append(this.f);
        sbQ.append(", score=");
        sbQ.append(this.g);
        sbQ.append(", supportRtl=");
        return rw2.p(sbQ, this.h, Separators.RPAREN);
    }
}
