package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19793a;
    public final ArrayList b;

    public lcc0(int i, ArrayList arrayList) {
        this.f19793a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcc0)) {
            return false;
        }
        lcc0 lcc0Var = (lcc0) obj;
        return this.f19793a == lcc0Var.f19793a && this.b.equals(lcc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f19793a) * 31);
    }

    public final String toString() {
        return "PromoCmsPromotionInfoStageDrawModel(stageId=" + this.f19793a + ", draws=" + this.b + Separators.RPAREN;
    }
}
