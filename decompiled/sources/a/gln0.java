package a;

import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11501a;
    public final int b;
    public final boolean c;
    public final rfu0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public gln0(int i, int i2, boolean z, rfu0 rfu0Var, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        rfu0Var.getClass();
        range.getClass();
        this.f11501a = i;
        this.b = i2;
        this.c = z;
        this.d = rfu0Var;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = range;
        this.j = z6;
    }

    public static gln0 a(gln0 gln0Var, boolean z, Range range, int i) {
        int i2 = gln0Var.f11501a;
        int i3 = gln0Var.b;
        boolean z2 = gln0Var.c;
        rfu0 rfu0Var = gln0Var.d;
        boolean z3 = gln0Var.e;
        boolean z4 = gln0Var.f;
        boolean z5 = gln0Var.g;
        if ((i & 256) != 0) {
            range = gln0Var.i;
        }
        Range range2 = range;
        boolean z6 = gln0Var.j;
        rfu0Var.getClass();
        range2.getClass();
        return new gln0(i2, i3, z2, rfu0Var, z3, z4, z5, z, range2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gln0)) {
            return false;
        }
        gln0 gln0Var = (gln0) obj;
        return this.f11501a == gln0Var.f11501a && this.b == gln0Var.b && this.c == gln0Var.c && this.d == gln0Var.d && this.e == gln0Var.e && this.f == gln0Var.f && this.g == gln0Var.g && this.h == gln0Var.h && Intrinsics.d(this.i, gln0Var.i) && this.j == gln0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e((this.d.hashCode() + brm0.e(twn.a(this.b, Integer.hashCode(this.f11501a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings(cameraMode=");
        sb.append(this.f11501a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", hasVideoCapture=");
        sb.append(this.c);
        sb.append(", videoStabilization=");
        sb.append(this.d);
        sb.append(", isUltraHdrOn=");
        sb.append(this.e);
        sb.append(", isHighSpeedOn=");
        sb.append(this.f);
        sb.append(", isFeatureComboInvocation=");
        sb.append(this.g);
        sb.append(", requiresFeatureComboQuery=");
        sb.append(this.h);
        sb.append(", targetFpsRange=");
        sb.append(this.i);
        sb.append(", isStrictFpsRequired=");
        return brm0.o(sb, this.j, ')');
    }
}
