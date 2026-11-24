package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vn5 {
    public static final un5 Companion = new un5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37701a;
    public final bdf b;
    public final hdf c;

    static {
        adf adfVar = bdf.Companion;
    }

    public /* synthetic */ vn5(int i, String str, bdf bdfVar, hdf hdfVar) {
        if ((i & 1) == 0) {
            this.f37701a = null;
        } else {
            this.f37701a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bdfVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hdfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn5)) {
            return false;
        }
        vn5 vn5Var = (vn5) obj;
        return Intrinsics.d(this.f37701a, vn5Var.f37701a) && Intrinsics.d(this.b, vn5Var.b) && Intrinsics.d(this.c, vn5Var.c);
    }

    public final int hashCode() {
        String str = this.f37701a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        bdf bdfVar = this.b;
        int iHashCode2 = (iHashCode + (bdfVar == null ? 0 : bdfVar.hashCode())) * 31;
        hdf hdfVar = this.c;
        return iHashCode2 + (hdfVar != null ? hdfVar.hashCode() : 0);
    }

    public final String toString() {
        return "BallByBallResponse(number=" + this.f37701a + ", cricketBalls=" + this.b + ", cricketPoints=" + this.c + Separators.RPAREN;
    }
}
