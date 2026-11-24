package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mav0 {
    public static final mav0 f = new mav0(false, iun.f15405a, null, null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21478a;
    public final List b;
    public final esr c;
    public final esr d;
    public final boolean e;

    public mav0(boolean z, List list, esr esrVar, esr esrVar2, boolean z2) {
        list.getClass();
        this.f21478a = z;
        this.b = list;
        this.c = esrVar;
        this.d = esrVar2;
        this.e = z2;
    }

    public static mav0 a(mav0 mav0Var, esr esrVar, esr esrVar2, int i) {
        boolean z = mav0Var.f21478a;
        List list = mav0Var.b;
        if ((i & 4) != 0) {
            esrVar = mav0Var.c;
        }
        esr esrVar3 = esrVar;
        if ((i & 8) != 0) {
            esrVar2 = mav0Var.d;
        }
        esr esrVar4 = esrVar2;
        boolean z2 = (i & 16) != 0 ? mav0Var.e : true;
        mav0Var.getClass();
        list.getClass();
        return new mav0(z, list, esrVar3, esrVar4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mav0)) {
            return false;
        }
        mav0 mav0Var = (mav0) obj;
        return this.f21478a == mav0Var.f21478a && Intrinsics.d(this.b, mav0Var.b) && this.c == mav0Var.c && this.d == mav0Var.d && this.e == mav0Var.e;
    }

    public final int hashCode() {
        int iA = dw9.a(Boolean.hashCode(this.f21478a) * 31, 31, this.b);
        esr esrVar = this.c;
        int iHashCode = (iA + (esrVar == null ? 0 : esrVar.hashCode())) * 31;
        esr esrVar2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (esrVar2 != null ? esrVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelState(isVisible=");
        sb.append(this.f21478a);
        sb.append(", wheelSectors=");
        sb.append(this.b);
        sb.append(", rotateToBonusType=");
        sb.append(this.c);
        sb.append(", rotateSpinAll=");
        sb.append(this.d);
        sb.append(", showActiveSector=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
