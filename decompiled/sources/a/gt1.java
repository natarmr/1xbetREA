package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gt1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vql f11859a;
    public final brl b;

    public gt1(vql vqlVar, brl brlVar) {
        this.f11859a = vqlVar;
        this.b = brlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt1)) {
            return false;
        }
        gt1 gt1Var = (gt1) obj;
        return this.f11859a == gt1Var.f11859a && this.b.equals(gt1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11859a.hashCode() * 31);
    }

    public final String toString() {
        return "ProgressUiModel(style=" + this.f11859a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
