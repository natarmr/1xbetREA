package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ty6 implements wy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf40 f34738a;
    public final String b;
    public final eo8 c;

    public ty6(uf40 uf40Var, String str, eo8 eo8Var) {
        this.f34738a = uf40Var;
        this.b = str;
        this.c = eo8Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof ty6) {
                ty6 ty6Var = (ty6) obj;
                if (this.f34738a.equals(ty6Var.f34738a)) {
                    String str = ty6Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (zEquals && this.c.equals(ty6Var.c)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f34738a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.b;
        return "PlayersDuelBetGameInfoUiModel(middleLaneUiModel=" + this.f34738a + ", subgameUiModel=" + (str == null ? "null" : kng0.l("SubgameUiModel(subgameText=", str, Separators.RPAREN)) + ", bottomLaneUiModel=" + this.c + Separators.RPAREN;
    }
}
