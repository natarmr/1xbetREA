package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zvv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45076a;
    public final int b;
    public final nsv0 c;
    public final nsv0 d;
    public final nsv0 e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public final float j;

    public zvv0(int i, int i2, nsv0 nsv0Var, nsv0 nsv0Var2, nsv0 nsv0Var3, int i3, float f, int i4, float f2, float f3) {
        this.f45076a = i;
        this.b = i2;
        this.c = nsv0Var;
        this.d = nsv0Var2;
        this.e = nsv0Var3;
        this.f = i3;
        this.g = f;
        this.h = i4;
        this.i = f2;
        this.j = f3;
    }

    public static zvv0 a(zvv0 zvv0Var, int i, int i2, nsv0 nsv0Var, nsv0 nsv0Var2, nsv0 nsv0Var3, int i3, float f, int i4, float f2, float f3, int i5) {
        if ((i5 & 1) != 0) {
            i = zvv0Var.f45076a;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = zvv0Var.b;
        }
        int i7 = i2;
        zvv0Var.getClass();
        zvv0Var.getClass();
        if ((i5 & 16) != 0) {
            nsv0Var = zvv0Var.c;
        }
        nsv0 nsv0Var4 = nsv0Var;
        if ((i5 & 32) != 0) {
            nsv0Var2 = zvv0Var.d;
        }
        nsv0 nsv0Var5 = nsv0Var2;
        nsv0 nsv0Var6 = (i5 & 64) != 0 ? zvv0Var.e : nsv0Var3;
        int i8 = (i5 & 128) != 0 ? zvv0Var.f : i3;
        float f4 = (i5 & 256) != 0 ? zvv0Var.g : f;
        int i9 = (i5 & 512) != 0 ? zvv0Var.h : i4;
        float f5 = (i5 & 1024) != 0 ? zvv0Var.i : f2;
        float f6 = (i5 & 2048) != 0 ? zvv0Var.j : f3;
        zvv0Var.getClass();
        return new zvv0(i6, i7, nsv0Var4, nsv0Var5, nsv0Var6, i8, f4, i9, f5, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvv0)) {
            return false;
        }
        zvv0 zvv0Var = (zvv0) obj;
        return this.f45076a == zvv0Var.f45076a && this.b == zvv0Var.b && ycl.b(0.0f, 0.0f) && ycl.b(0.0f, 0.0f) && this.c.equals(zvv0Var.c) && this.d.equals(zvv0Var.d) && this.e.equals(zvv0Var.e) && this.f == zvv0Var.f && ycl.b(this.g, zvv0Var.g) && this.h == zvv0Var.h && ycl.b(this.i, zvv0Var.i) && Float.compare(this.j, zvv0Var.j) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + defpackage.c.a(twn.a(this.h, defpackage.c.a(twn.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + defpackage.c.a(defpackage.c.a(twn.a(this.b, Integer.hashCode(this.f45076a) * 31, 31), 0.0f, 31), 0.0f, 31)) * 31)) * 31)) * 31, 31), this.g, 31), 31), this.i, 31);
    }

    public final String toString() {
        String strC = ycl.c(0.0f);
        String strC2 = ycl.c(0.0f);
        String strC3 = ycl.c(this.g);
        String strC4 = ycl.c(this.i);
        StringBuilder sbT = dw9.t("XBottomSheetRects(sheetTopPx=", this.f45076a, ", sheetHeightPx=", ", sheetTop=", this.b);
        f140.v(sbT, strC, ", sheetHeight=", strC2, ", topBlock=");
        sbT.append(this.c);
        sbT.append(", middleBlock=");
        sbT.append(this.d);
        sbT.append(", bottomBlock=");
        sbT.append(this.e);
        sbT.append(", navBarPaddingPx=");
        sbT.append(this.f);
        sbT.append(", navBarPadding=");
        twn.w(this.h, strC3, ", statusBarPaddingPx=", ", statusBarPadding=", sbT);
        sbT.append(strC4);
        sbT.append(", keyboardProgress=");
        sbT.append(this.j);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
