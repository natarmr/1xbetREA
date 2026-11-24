package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kds0 {
    public static final jds0 Companion = new jds0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18121a;
    public final String b;
    public final aoe0 c;

    public /* synthetic */ kds0(int i, String str, String str2, aoe0 aoe0Var) {
        if ((i & 1) == 0) {
            this.f18121a = null;
        } else {
            this.f18121a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aoe0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kds0)) {
            return false;
        }
        kds0 kds0Var = (kds0) obj;
        return Intrinsics.d(this.f18121a, kds0Var.f18121a) && Intrinsics.d(this.b, kds0Var.b) && Intrinsics.d(this.c, kds0Var.c);
    }

    public final int hashCode() {
        String str = this.f18121a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aoe0 aoe0Var = this.c;
        return iHashCode2 + (aoe0Var != null ? aoe0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TrackerModel(uuid=", this.f18121a, ", downloadId=", this.b, ", referralObject=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public kds0(aoe0 aoe0Var) {
        this.f18121a = "";
        this.b = null;
        this.c = aoe0Var;
    }
}
