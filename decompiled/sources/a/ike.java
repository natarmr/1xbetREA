package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14921a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public ike(boolean z, int i, int i2, int i3, float f, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f14921a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
    }

    public static ike a(ike ikeVar, boolean z, int i, int i2, int i3, float f, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4) {
        boolean z7 = (i4 & 1) != 0 ? ikeVar.f14921a : z;
        int i5 = (i4 & 2) != 0 ? ikeVar.b : i;
        int i6 = (i4 & 4) != 0 ? ikeVar.c : i2;
        int i7 = (i4 & 8) != 0 ? ikeVar.d : i3;
        float f2 = (i4 & 16) != 0 ? ikeVar.e : f;
        boolean z8 = (i4 & 32) != 0 ? ikeVar.f : true;
        boolean z9 = (i4 & 64) != 0 ? ikeVar.g : z2;
        boolean z10 = (i4 & 128) != 0 ? ikeVar.h : z3;
        boolean z11 = (i4 & 256) != 0 ? ikeVar.i : z4;
        boolean z12 = (i4 & 512) != 0 ? ikeVar.j : z5;
        boolean z13 = (i4 & 1024) != 0 ? ikeVar.k : false;
        boolean z14 = (i4 & 2048) != 0 ? ikeVar.l : z6;
        ikeVar.getClass();
        return new ike(z7, i5, i6, i7, f2, z8, z9, z10, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ike)) {
            return false;
        }
        ike ikeVar = (ike) obj;
        return this.f14921a == ikeVar.f14921a && this.b == ikeVar.b && this.c == ikeVar.c && this.d == ikeVar.d && Float.compare(this.e, ikeVar.e) == 0 && this.f == ikeVar.f && this.g == ikeVar.g && this.h == ikeVar.h && this.i == ikeVar.i && this.j == ikeVar.j && this.k == ikeVar.k && this.l == ikeVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(defpackage.c.a(twn.a(this.d, twn.a(this.c, twn.a(this.b, Boolean.hashCode(this.f14921a) * 31, 31), 31), 31), this.e, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "ControlsState(controlsAvailable=", ", flashResource=", ", flashSelector=", this.f14921a);
        axq.r(this.c, this.d, ", zoomControlPosition=", ", zoomValue=", sbT);
        sbT.append(this.e);
        sbT.append(", zoomControlAvailable=");
        sbT.append(this.f);
        sbT.append(", switchFlashControlAvailable=");
        ua80.u(", switchCameraControlAvailable=", ", switchFlashControlClickable=", sbT, this.g, this.h);
        ua80.u(", switchCameraControlClickable=", ", takePhotoControlClickable=", sbT, this.i, this.j);
        return ohs0.p(", zoomControlClickable=", Separators.RPAREN, sbT, this.k, this.l);
    }
}
