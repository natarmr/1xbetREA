package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class pqb0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jqb0 f27408a;
    public final ArrayList b;

    public pqb0(jqb0 jqb0Var, ArrayList arrayList) {
        this.f27408a = jqb0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqb0)) {
            return false;
        }
        pqb0 pqb0Var = (pqb0) obj;
        return this.f27408a.equals(pqb0Var.f27408a) && this.b.equals(pqb0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "POWER_OF_POWER_KEY";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f27408a.hashCode() - 323612087) * 31);
    }

    public final String toString() {
        return "PowerOfPowerTableUiItem(key=POWER_OF_POWER_KEY, heroesColumn=" + this.f27408a + ", tableColumns=" + this.b + Separators.RPAREN;
    }
}
