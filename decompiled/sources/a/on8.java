package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class on8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo7 f25535a;
    public final boolean b;
    public final boolean c;
    public final jye d;
    public final vw6 e;
    public final Boolean f;
    public final vw6 g;
    public final xyc h;

    public on8(fo7 fo7Var, boolean z, boolean z2, jye jyeVar, vw6 vw6Var, Boolean bool, vw6 vw6Var2, xyc xycVar) {
        jyeVar.getClass();
        this.f25535a = fo7Var;
        this.b = z;
        this.c = z2;
        this.d = jyeVar;
        this.e = vw6Var;
        this.f = bool;
        this.g = vw6Var2;
        this.h = xycVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on8)) {
            return false;
        }
        on8 on8Var = (on8) obj;
        return this.f25535a.equals(on8Var.f25535a) && this.b == on8Var.b && this.c == on8Var.c && this.d == on8Var.d && this.e.equals(on8Var.e) && Intrinsics.d(this.f, on8Var.f) && Intrinsics.d(this.g, on8Var.g) && Intrinsics.d(this.h, on8Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(this.f25535a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        Boolean bool = this.f;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        vw6 vw6Var = this.g;
        int iHashCode3 = (iHashCode2 + (vw6Var == null ? 0 : vw6Var.hashCode())) * 31;
        xyc xycVar = this.h;
        return iHashCode3 + (xycVar != null ? xycVar.hashCode() : 0);
    }

    public final String toString() {
        return "BottomContentKeyModel(betTypeStateModel=" + this.f25535a + ", forceLoading=" + this.b + ", isDuelGame=" + this.c + ", couponInteractionButtonStateModel=" + this.d + ", simpleBetFieldParamsStateModel=" + this.e + ", promocodeMakeBetBtnEnabled=" + this.f + ", autoBetFieldParamsStateModel=" + this.g + ", autoCoefBetFieldParamsStateModel=" + this.h + Separators.RPAREN;
    }
}
