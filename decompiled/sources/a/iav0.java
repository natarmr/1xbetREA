package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class iav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14457a;
    public final esr b;

    public iav0(int i, esr esrVar) {
        esrVar.getClass();
        this.f14457a = i;
        this.b = esrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iav0)) {
            return false;
        }
        iav0 iav0Var = (iav0) obj;
        return this.f14457a == iav0Var.f14457a && this.b == iav0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f14457a) * 31);
    }

    public final String toString() {
        return "WheelSector(id=" + this.f14457a + ", bonusType=" + this.b + Separators.RPAREN;
    }
}
