package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pjb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27081a;
    public final long b;
    public final String c;
    public final String d;
    public final c280 e;
    public final boolean f;

    public pjb(long j, long j2, String str, String str2, c280 c280Var, boolean z) {
        this.f27081a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = c280Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjb)) {
            return false;
        }
        pjb pjbVar = (pjb) obj;
        return this.f27081a == pjbVar.f27081a && this.b == pjbVar.b && this.c.equals(pjbVar.c) && this.d.equals(pjbVar.d) && this.e.equals(pjbVar.e) && this.f == pjbVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + hne.g(this.e, ua80.b(ua80.b(rw2.b(Long.hashCode(this.f27081a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f27081a, "ChampionshipCardCollectionUiItem(id=", ", sportId=");
        kng0.z(sbQ, this.b, ", label=", this.c);
        sbQ.append(", champIconImage=");
        sbQ.append(this.d);
        sbQ.append(", opponentIcon=");
        sbQ.append(this.e);
        return f140.n(sbQ, ", favourite=", this.f, Separators.RPAREN);
    }
}
