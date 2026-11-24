package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ju1 implements lu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vql f17128a;
    public final brl b;

    public ju1(vql vqlVar, brl brlVar) {
        this.f17128a = vqlVar;
        this.b = brlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju1)) {
            return false;
        }
        ju1 ju1Var = (ju1) obj;
        return this.f17128a == ju1Var.f17128a && this.b.equals(ju1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17128a.hashCode() * 31);
    }

    public final String toString() {
        return "ProgressUiModel(style=" + this.f17128a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
