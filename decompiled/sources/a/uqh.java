package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uqh implements vqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yqh f36118a;
    public final yqh b;
    public final String c;
    public final String d;
    public final r0n e;
    public final String f;

    public uqh(yqh yqhVar, yqh yqhVar2, String str, r0n r0nVar, String str2) {
        str.getClass();
        this.f36118a = yqhVar;
        this.b = yqhVar2;
        this.c = "";
        this.d = str;
        this.e = r0nVar;
        this.f = str2;
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
        return this.f36118a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqh)) {
            return false;
        }
        uqh uqhVar = (uqh) obj;
        return this.f36118a.equals(uqhVar.f36118a) && this.b.equals(uqhVar.b) && this.c.equals(uqhVar.c) && this.d.equals(uqhVar.d) && this.e.equals(uqhVar.e) && this.f.equals(uqhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f36118a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Live(firstOpponent=");
        sb.append(this.f36118a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", categoryLabel=");
        f140.v(sb, this.c, ", mainFightTag=", this.d, ", timerOption=");
        sb.append(this.e);
        sb.append(", roundTagText=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
