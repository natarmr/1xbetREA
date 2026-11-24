package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class etp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8387a;
    public final ctp0 b;

    public etp0(String str, ctp0 ctp0Var) {
        this.f8387a = str;
        this.b = ctp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etp0)) {
            return false;
        }
        etp0 etp0Var = (etp0) obj;
        return this.f8387a.equals(etp0Var.f8387a) && this.b.equals(etp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8387a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamsStatisticMenuUiItem(name=" + this.f8387a + ", type=" + this.b + Separators.RPAREN;
    }
}
