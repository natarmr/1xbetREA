package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class g7l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10820a;

    public g7l(String str) {
        this.f10820a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7l) && this.f10820a.equals(((g7l) obj).f10820a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.cyber_game_dota_talent_tree_disable) + (this.f10820a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.cyber_game_dota_talent_tree_disable, "DotaSkillsHeroParamsUiModel(levelTitle=", this.f10820a, ", talentThreeRes=", Separators.RPAREN);
    }
}
