package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14076a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final v5l0 e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public i32(int i, boolean z, boolean z2, boolean z3, v5l0 v5l0Var, boolean z4, boolean z5, String str) {
        v5l0Var.getClass();
        str.getClass();
        this.f14076a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = v5l0Var;
        this.f = z4;
        this.g = z5;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i32)) {
            return false;
        }
        i32 i32Var = (i32) obj;
        return this.f14076a == i32Var.f14076a && this.b == i32Var.b && this.c == i32Var.c && this.d == i32Var.d && this.e == i32Var.e && this.f == i32Var.f && this.g == i32Var.g && Intrinsics.d(this.h, i32Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(brm0.e(axq.c(this.e, brm0.e(brm0.e(brm0.e(Integer.hashCode(this.f14076a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f14076a, "AllEventGamesScreenSettingsModel(eventId=", ", customSportIcon=", ", topIcon=", this.b);
        ua80.u(", isBettingDisabled=", ", sportEventCardStyle=", sbL, this.c, this.d);
        sbL.append(this.e);
        sbL.append(", isNewEventParams=");
        sbL.append(this.f);
        sbL.append(", hasStream=");
        return twn.q(", overrideImagesId=", this.h, Separators.RPAREN, sbL, this.g);
    }
}
