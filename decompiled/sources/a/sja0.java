package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sja0 implements vja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f32296a;
    public final mdm b;

    public sja0(j9m0 j9m0Var, mdm mdmVar) {
        this.f32296a = j9m0Var;
        this.b = mdmVar;
    }

    @Override // a.vja0
    public final j9m0 d() {
        return this.f32296a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sja0)) {
            return false;
        }
        sja0 sja0Var = (sja0) obj;
        return this.f32296a.equals(sja0Var.f32296a) && this.b.equals(sja0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32296a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(backgroundUiModel=" + this.f32296a + ", dsEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
