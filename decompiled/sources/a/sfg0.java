package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class sfg0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32118a;
    public final int b;
    public final int c;
    public final kfg0 d;

    public sfg0(int i, int i2, int i3, kfg0 kfg0Var) {
        this.f32118a = i;
        this.b = i2;
        this.c = i3;
        this.d = kfg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfg0)) {
            return false;
        }
        sfg0 sfg0Var = (sfg0) obj;
        return this.f32118a == sfg0Var.f32118a && this.b == sfg0Var.b && this.c == sfg0Var.c && this.d == sfg0Var.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof sfg0) && (p6t0Var2 instanceof sfg0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "ROULETTE_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, twn.a(this.f32118a, -1635556340, 31), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof sfg0) && (p6t0Var2 instanceof sfg0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            sfg0 sfg0Var = (sfg0) p6t0Var;
            sfg0 sfg0Var2 = (sfg0) p6t0Var2;
            k9x.G(linkedHashSet, new qfg0(sfg0Var.f32118a), new qfg0(sfg0Var2.f32118a));
            k9x.G(linkedHashSet, new ofg0(sfg0Var.b), new ofg0(sfg0Var2.b));
            k9x.G(linkedHashSet, new pfg0(sfg0Var.c), new pfg0(sfg0Var2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strE = ua80.e(this.f32118a, "RouletteImage(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.b, "CurrentValue(value=", Separators.RPAREN);
        String strE3 = ua80.e(this.c, "NewValue(value=", Separators.RPAREN);
        StringBuilder sbN = b1j.n("RouletteUiModel(key=ROULETTE_KEY, image=", strE, ", currentValue=", strE2, ", newValue=");
        sbN.append(strE3);
        sbN.append(", rouletteType=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
