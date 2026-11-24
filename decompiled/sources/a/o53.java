package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24668a;
    public final int b;
    public final pu90 c;
    public final pu90 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final k6z i;

    public o53(int i, int i2, pu90 pu90Var, pu90 pu90Var2, int i3, int i4, int i5, int i6, k6z k6zVar) {
        k6zVar.getClass();
        this.f24668a = i;
        this.b = i2;
        this.c = pu90Var;
        this.d = pu90Var2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = k6zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o53)) {
            return false;
        }
        o53 o53Var = (o53) obj;
        return this.f24668a == o53Var.f24668a && this.b == o53Var.b && Intrinsics.d(this.c, o53Var.c) && Intrinsics.d(this.d, o53Var.d) && this.e == o53Var.e && this.f == o53Var.f && this.g == o53Var.g && this.h == o53Var.h && this.i == o53Var.i;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f24668a) * 31, 31);
        pu90 pu90Var = this.c;
        int iHashCode = (iA + (pu90Var == null ? 0 : pu90Var.hashCode())) * 31;
        pu90 pu90Var2 = this.d;
        return this.i.hashCode() + twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, (iHashCode + (pu90Var2 != null ? pu90Var2.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("AnimatedDeltaLayoutParams(parentWidthPx=", this.f24668a, ", parentHeightPx=", ", deltaPlaceable=", this.b);
        sbT.append(this.c);
        sbT.append(", arrowIconPlaceable=");
        sbT.append(this.d);
        sbT.append(", deltaWidth=");
        axq.r(this.e, this.f, ", arrowIconWidth=", ", deltaHeight=", sbT);
        axq.r(this.g, this.h, ", arrowIconHeight=", ", layoutDirection=", sbT);
        sbT.append(this.i);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
