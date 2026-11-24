package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yvk f27691a;
    public final r7k0 b;
    public final prm c;
    public final prm d;
    public final prm e;
    public final o5d f;

    public pw20(yvk yvkVar, r7k0 r7k0Var, prm prmVar, prm prmVar2, prm prmVar3, o5d o5dVar) {
        this.f27691a = yvkVar;
        this.b = r7k0Var;
        this.c = prmVar;
        this.d = prmVar2;
        this.e = prmVar3;
        this.f = o5dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw20)) {
            return false;
        }
        pw20 pw20Var = (pw20) obj;
        return this.f27691a.equals(pw20Var.f27691a) && this.b.equals(pw20Var.b) && this.c.equals(pw20Var.c) && this.d.equals(pw20Var.d) && this.e.equals(pw20Var.e) && this.f.equals(pw20Var.f);
    }

    public final int hashCode() {
        return this.f.f24682a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b.f29980a, this.f27691a.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MarketSettingsUiModel(displayOrderTabsUiModel=" + this.f27691a + ", sizePresetsUiModel=" + this.b + ", headerSizeSlider=" + this.c + ", marketSizeSlider=" + this.d + ", coefficientSizeSlider=" + this.e + ", colorsUiModel=" + this.f + Separators.RPAREN;
    }
}
