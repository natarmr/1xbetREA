package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class plf extends slf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27179a;
    public final wpf b;
    public final String c;

    public plf(String str, wpf wpfVar, String str2) {
        this.f27179a = str;
        this.b = wpfVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plf)) {
            return false;
        }
        plf plfVar = (plf) obj;
        return this.f27179a.equals(plfVar.f27179a) && this.b == plfVar.b && this.c.equals(plfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f27179a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2SuicideGameLogModel(player=");
        sb.append(this.f27179a);
        sb.append(", side=");
        sb.append(this.b);
        sb.append(", weapon=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
