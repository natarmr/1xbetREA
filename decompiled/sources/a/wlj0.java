package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wlj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39357a;
    public final boolean b;
    public final dxh0 c;
    public final a4x d;
    public final a4x e;
    public final mtl f;
    public final boolean g;
    public final mdm h;
    public final int i;

    public wlj0(int i, boolean z, dxh0 dxh0Var, a4x a4xVar, a4x a4xVar2, mtl mtlVar, boolean z2, mdm mdmVar, int i2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f39357a = i;
        this.b = z;
        this.c = dxh0Var;
        this.d = a4xVar;
        this.e = a4xVar2;
        this.f = mtlVar;
        this.g = z2;
        this.h = mdmVar;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlj0)) {
            return false;
        }
        wlj0 wlj0Var = (wlj0) obj;
        return this.f39357a == wlj0Var.f39357a && this.b == wlj0Var.b && this.c.equals(wlj0Var.c) && Intrinsics.d(this.d, wlj0Var.d) && Intrinsics.d(this.e, wlj0Var.e) && this.f.equals(wlj0Var.f) && this.g == wlj0Var.g && this.h.equals(wlj0Var.h) && this.i == wlj0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + f140.d(this.h, brm0.e(cs0.b(this.f.f22376a, cs0.b(this.e, cs0.b(this.d, hne.h(this.c, brm0.e(Integer.hashCode(this.f39357a) * 31, 31, this.b), 31), 31), 31), 31), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f39357a, "ShareAppByQrCodeUiState(currentTab=", ", showTabs=", ", segmentedControlStyle=", this.b);
        sbL.append(this.c);
        sbL.append(", screenTabs=");
        sbL.append(this.d);
        sbL.append(", appLinks=");
        sbL.append(this.e);
        sbL.append(", bottomBarModel=");
        sbL.append(this.f);
        sbL.append(", hasErrorWhileLoadingData=");
        sbL.append(this.g);
        sbL.append(", dsEmptyConfig=");
        sbL.append(this.h);
        sbL.append(", logoImageResource=");
        return rz4.j(this.i, Separators.RPAREN, sbL);
    }
}
