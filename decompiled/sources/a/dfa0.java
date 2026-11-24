package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class dfa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5991a;
    public final a4x b;

    public dfa0(i4 i4Var, String str) {
        i4Var.getClass();
        this.f5991a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfa0)) {
            return false;
        }
        dfa0 dfa0Var = (dfa0) obj;
        return this.f5991a.equals(dfa0Var.f5991a) && Intrinsics.d(this.b, dfa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + twn.a(R.drawable.composition_player_statistic_placeholder, this.f5991a.hashCode() * 31, 31);
    }

    public final String toString() {
        return cs0.n(kng0.p(R.drawable.composition_player_statistic_placeholder, "PlayersCompositionStatisticPlayerUiModel(playerImage=", this.f5991a, ", placeholder=", ", playerStatistic="), this.b, Separators.RPAREN);
    }
}
