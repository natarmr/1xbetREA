package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class pdq0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f26820a;
    public final ArrayList b;

    public pdq0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f26820a = linkedHashMap;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdq0)) {
            return false;
        }
        pdq0 pdq0Var = (pdq0) obj;
        return this.f26820a.equals(pdq0Var.f26820a) && this.b.equals(pdq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26820a.hashCode() * 31);
    }

    public final String toString() {
        return "TicTacToeStatisticsModel(currentRound=" + this.f26820a + ", roundHistory=" + this.b + Separators.RPAREN;
    }
}
