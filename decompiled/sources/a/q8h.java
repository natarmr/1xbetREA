package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28299a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final r8h g;

    public q8h(long j, String str, String str2, int i, String str3, String str4, r8h r8hVar) {
        this.f28299a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = r8hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8h)) {
            return false;
        }
        q8h q8hVar = (q8h) obj;
        return this.f28299a == q8hVar.f28299a && this.b.equals(q8hVar.b) && this.c.equals(q8hVar.c) && this.d == q8hVar.d && this.e.equals(q8hVar.e) && this.f.equals(q8hVar.f) && this.g.equals(q8hVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f28299a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28299a, "CyberMatchesStatisticPlayersListModel(id=", ", nick=", this.b);
        axq.s(this.d, ", name=", this.c, ", age=", sbO);
        f140.v(sbO, ", country=", this.e, ", image=", this.f);
        sbO.append(", statistics=");
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
