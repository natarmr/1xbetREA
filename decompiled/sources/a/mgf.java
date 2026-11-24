package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class mgf implements p6t0, s0h {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mgf);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CRYSTAL_ODDS_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.cybergame_crystal_red) + twn.a(R.drawable.cybergame_crystal_orange, twn.a(R.drawable.cybergame_crystal_yellow, twn.a(R.drawable.cybergame_crystal_cyan, twn.a(R.drawable.cybergame_crystal_blue, twn.a(R.drawable.cybergame_crystal_purple, rw2.b(-525096461, 31, 1L), 31), 31), 31), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CrystalOddsUiModel(key=CRYSTAL_ODDS_KEY, id=1, purpleCrystalImage=", R.drawable.cybergame_crystal_purple, ", blueCrystalImage=", ", cyanCrystalImage=", R.drawable.cybergame_crystal_blue);
        axq.r(R.drawable.cybergame_crystal_cyan, R.drawable.cybergame_crystal_yellow, ", yellowCrystalImage=", ", orangeCrystalImage=", sbT);
        return w6x.o(R.drawable.cybergame_crystal_orange, R.drawable.cybergame_crystal_red, ", redCrystalImage=", Separators.RPAREN, sbT);
    }
}
