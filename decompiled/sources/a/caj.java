package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class caj implements haj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4013a;
    public final kmo b;

    public caj(i4 i4Var, kmo kmoVar) {
        i4Var.getClass();
        this.f4013a = i4Var;
        this.b = kmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caj)) {
            return false;
        }
        caj cajVar = (caj) obj;
        return Intrinsics.d(this.f4013a, cajVar.f4013a) && Intrinsics.d(this.b, cajVar.b);
    }

    @Override // a.haj
    public final jaj getType() {
        return jaj.SHORT_STATISTIC;
    }

    public final int hashCode() {
        int iHashCode = this.f4013a.hashCode() * 31;
        kmo kmoVar = this.b;
        return iHashCode + (kmoVar == null ? 0 : kmoVar.hashCode());
    }

    public final String toString() {
        return "ShortStatistic(infoList=" + this.f4013a + ", btnUiModel=" + this.b + Separators.RPAREN;
    }
}
