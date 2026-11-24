package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class grf0 {
    public static final frf0 Companion = new frf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wrf0 f11777a;
    public final zof0 b;

    public /* synthetic */ grf0(int i, wrf0 wrf0Var, zof0 zof0Var) {
        if ((i & 1) == 0) {
            this.f11777a = null;
        } else {
            this.f11777a = wrf0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zof0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grf0)) {
            return false;
        }
        grf0 grf0Var = (grf0) obj;
        return Intrinsics.d(this.f11777a, grf0Var.f11777a) && Intrinsics.d(this.b, grf0Var.b);
    }

    public final int hashCode() {
        wrf0 wrf0Var = this.f11777a;
        int iHashCode = (wrf0Var == null ? 0 : wrf0Var.hashCode()) * 31;
        zof0 zof0Var = this.b;
        return iHashCode + (zof0Var != null ? zof0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ResidentResponse(residentSecondLife=" + this.f11777a + ", game=" + this.b + Separators.RPAREN;
    }
}
