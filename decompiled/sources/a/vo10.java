package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vo10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37744a;
    public final esr b;
    public final esr c;
    public final boolean d;

    public vo10(List list, esr esrVar, esr esrVar2, boolean z) {
        list.getClass();
        this.f37744a = list;
        this.b = esrVar;
        this.c = esrVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo10)) {
            return false;
        }
        vo10 vo10Var = (vo10) obj;
        return Intrinsics.d(this.f37744a, vo10Var.f37744a) && this.b == vo10Var.b && this.c == vo10Var.c && this.d == vo10Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f37744a.hashCode() * 31;
        esr esrVar = this.b;
        int iHashCode2 = (iHashCode + (esrVar == null ? 0 : esrVar.hashCode())) * 31;
        esr esrVar2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (esrVar2 != null ? esrVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LuckyWheelWheelUiModel(sectors=" + this.f37744a + ", rotateToBonusType=" + this.b + ", rotateSpinAllBonusType=" + this.c + ", showActiveSector=" + this.d + Separators.RPAREN;
    }
}
