package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class sf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ypl f32101a;
    public final bql b;

    public sf40(ypl yplVar, bql bqlVar) {
        this.f32101a = yplVar;
        this.b = bqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf40)) {
            return false;
        }
        sf40 sf40Var = (sf40) obj;
        return this.f32101a == sf40Var.f32101a && this.b.equals(sf40Var.b);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(sf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32101a.hashCode() * 31);
    }

    public final String toString() {
        return "UserTournaments(style=" + this.f32101a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
