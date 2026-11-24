package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class efa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dfa0 f7713a;
    public final dfa0 b;
    public final a4x c;
    public final String d;

    public efa0(dfa0 dfa0Var, dfa0 dfa0Var2, a4x a4xVar, String str) {
        a4xVar.getClass();
        str.getClass();
        this.f7713a = dfa0Var;
        this.b = dfa0Var2;
        this.c = a4xVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efa0)) {
            return false;
        }
        efa0 efa0Var = (efa0) obj;
        return this.f7713a.equals(efa0Var.f7713a) && this.b.equals(efa0Var.b) && Intrinsics.d(this.c, efa0Var.c) && Intrinsics.d(this.d, efa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f7713a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PlayersCompositionStatisticUiModel(firstPlayerCompositionStatistic=" + this.f7713a + ", secondPlayerCompositionStatistic=" + this.b + ", statisticInfo=" + this.c + ", statisticsTitle=" + this.d + Separators.RPAREN;
    }
}
