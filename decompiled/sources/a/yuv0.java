package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yuv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxv0 f43288a;
    public final float b;
    public final float c;

    public yuv0(lxv0 lxv0Var, float f, float f2) {
        lxv0Var.getClass();
        this.f43288a = lxv0Var;
        this.b = f;
        this.c = f2;
    }

    public static yuv0 a(yuv0 yuv0Var, lxv0 lxv0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            lxv0Var = yuv0Var.f43288a;
        }
        if ((i & 2) != 0) {
            f = yuv0Var.b;
        }
        if ((i & 4) != 0) {
            f2 = yuv0Var.c;
        }
        lxv0Var.getClass();
        return new yuv0(lxv0Var, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuv0)) {
            return false;
        }
        yuv0 yuv0Var = (yuv0) obj;
        return Intrinsics.d(this.f43288a, yuv0Var.f43288a) && Float.compare(this.b, yuv0Var.b) == 0 && Float.compare(this.c, yuv0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(this.f43288a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XBottomSheetLiftSession(restAnchor=");
        sb.append(this.f43288a);
        sb.append(", restAnchorOffsetPx=");
        sb.append(this.b);
        sb.append(", keyboardMaxReservePx=");
        return kng0.o(sb, this.c, Separators.RPAREN);
    }
}
