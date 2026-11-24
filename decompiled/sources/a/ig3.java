package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ig3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14717a;
    public final ah3 b;
    public final wg3 c;
    public final ix80 d;
    public final dx00 e;

    public ig3(String str, ah3 ah3Var, wg3 wg3Var, ix80 ix80Var, dx00 dx00Var) {
        str.getClass();
        this.f14717a = str;
        this.b = ah3Var;
        this.c = wg3Var;
        this.d = ix80Var;
        this.e = dx00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig3)) {
            return false;
        }
        ig3 ig3Var = (ig3) obj;
        return Intrinsics.d(this.f14717a, ig3Var.f14717a) && this.b == ig3Var.b && this.c == ig3Var.c && Intrinsics.d(this.d, ig3Var.d) && Intrinsics.d(this.e, ig3Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f14717a.hashCode() * 31;
        ah3 ah3Var = this.b;
        int iHashCode2 = (iHashCode + (ah3Var == null ? 0 : ah3Var.hashCode())) * 31;
        wg3 wg3Var = this.c;
        int iHashCode3 = (iHashCode2 + (wg3Var == null ? 0 : wg3Var.hashCode())) * 31;
        ix80 ix80Var = this.d;
        int iHashCode4 = (iHashCode3 + (ix80Var == null ? 0 : ix80Var.hashCode())) * 31;
        dx00 dx00Var = this.e;
        return iHashCode4 + (dx00Var != null ? dx00Var.hashCode() : 0);
    }

    public final String toString() {
        return "AppStartContentUiModel(appVersionName=" + this.f14717a + ", preset=" + this.b + ", loaderType=" + this.c + ", partnerImage=" + this.d + ", logoImage=" + this.e + Separators.RPAREN;
    }
}
