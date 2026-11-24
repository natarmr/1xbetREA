package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tqh implements vqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yqh f34379a;
    public final yqh b;
    public final String c;
    public final String d;
    public final r0n e;
    public final String f;
    public final String g;

    public tqh(yqh yqhVar, yqh yqhVar2, String str, r0n r0nVar, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f34379a = yqhVar;
        this.b = yqhVar2;
        this.c = "";
        this.d = str;
        this.e = r0nVar;
        this.f = str2;
        this.g = str3;
    }

    @Override // a.vqh
    public final String a() {
        return this.c;
    }

    @Override // a.vqh
    public final String b() {
        return this.d;
    }

    @Override // a.vqh
    public final yqh c() {
        return this.b;
    }

    @Override // a.vqh
    public final r0n d() {
        return this.e;
    }

    @Override // a.vqh
    public final yqh e() {
        return this.f34379a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqh)) {
            return false;
        }
        tqh tqhVar = (tqh) obj;
        return this.f34379a.equals(tqhVar.f34379a) && this.b.equals(tqhVar.b) && this.c.equals(tqhVar.c) && this.d.equals(tqhVar.d) && this.e.equals(tqhVar.e) && this.f.equals(tqhVar.f) && this.g.equals(tqhVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b((this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f34379a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Line(firstOpponent=");
        sb.append(this.f34379a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", categoryLabel=");
        f140.v(sb, this.c, ", mainFightTag=", this.d, ", timerOption=");
        sb.append(this.e);
        sb.append(", infoLabel=");
        sb.append(this.f);
        sb.append(", additionalInfoLabel=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
