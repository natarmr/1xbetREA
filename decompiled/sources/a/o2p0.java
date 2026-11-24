package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o2p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24542a;
    public final rqm b;
    public final dtp0 c;

    public o2p0(String str, rqm rqmVar, dtp0 dtp0Var) {
        this.f24542a = str;
        this.b = rqmVar;
        this.c = dtp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2p0)) {
            return false;
        }
        o2p0 o2p0Var = (o2p0) obj;
        return this.f24542a.equals(o2p0Var.f24542a) && this.b.equals(o2p0Var.b) && this.c.equals(o2p0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f24542a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f24542a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamBetStatisticsCellMenuUiItem(key=" + this.f24542a + ", style=" + this.b + ", menuType=" + this.c + Separators.RPAREN;
    }
}
