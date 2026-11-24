package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h5r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4r0 f12496a;
    public final d0t b;
    public final boolean c;
    public final mdm d;

    public h5r0(w4r0 w4r0Var, d0t d0tVar, boolean z, mdm mdmVar) {
        this.f12496a = w4r0Var;
        this.b = d0tVar;
        this.c = z;
        this.d = mdmVar;
    }

    public static h5r0 a(h5r0 h5r0Var, w4r0 w4r0Var, d0t d0tVar, boolean z, int i) {
        if ((i & 1) != 0) {
            w4r0Var = h5r0Var.f12496a;
        }
        if ((i & 2) != 0) {
            d0tVar = h5r0Var.b;
        }
        if ((i & 4) != 0) {
            z = h5r0Var.c;
        }
        mdm mdmVar = h5r0Var.d;
        h5r0Var.getClass();
        return new h5r0(w4r0Var, d0tVar, z, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5r0)) {
            return false;
        }
        h5r0 h5r0Var = (h5r0) obj;
        return Intrinsics.d(this.f12496a, h5r0Var.f12496a) && Intrinsics.d(this.b, h5r0Var.b) && this.c == h5r0Var.c && this.d.equals(h5r0Var.d);
    }

    public final int hashCode() {
        w4r0 w4r0Var = this.f12496a;
        int iHashCode = (w4r0Var == null ? 0 : w4r0Var.hashCode()) * 31;
        d0t d0tVar = this.b;
        return this.d.hashCode() + brm0.e((iHashCode + (d0tVar != null ? d0tVar.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return "TopGamesByStatBottomSheetState(config=" + this.f12496a + ", game=" + this.b + ", error=" + this.c + ", errorConfig=" + this.d + Separators.RPAREN;
    }
}
