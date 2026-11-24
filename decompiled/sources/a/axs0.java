package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class axs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1637a;
    public final u6n b;

    public axs0(u6n u6nVar, String str) {
        this.f1637a = str;
        this.b = u6nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axs0)) {
            return false;
        }
        axs0 axs0Var = (axs0) obj;
        return this.f1637a.equals(axs0Var.f1637a) && this.b.equals(axs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1637a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoOpponentsPromotionTeamUiModel(name=" + this.f1637a + ", logo=" + this.b + Separators.RPAREN;
    }
}
