package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class fff {
    public static final eff Companion = new eff();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9444a;
    public final Double b;
    public final bg8 c;

    public /* synthetic */ fff(int i, long j, bg8 bg8Var, Double d) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, dff.f5997a.getDescriptor());
            throw null;
        }
        this.f9444a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bg8Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fff)) {
            return false;
        }
        fff fffVar = (fff) obj;
        return this.f9444a == fffVar.f9444a && Intrinsics.d(this.b, fffVar.b) && Intrinsics.d(this.c, fffVar.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f9444a) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        bg8 bg8Var = this.c;
        return iHashCode2 + (bg8Var != null ? bg8Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrystalGameRequest(walletId=" + this.f9444a + ", bet=" + this.b + ", bonusRequest=" + this.c + Separators.RPAREN;
    }

    public fff(long j, bg8 bg8Var, Double d) {
        this.f9444a = j;
        this.b = d;
        this.c = bg8Var;
    }
}
