package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23679a;
    public final Map b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public nkg0(boolean z, Map map, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f23679a = z;
        this.b = map;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = f10;
        this.m = f11;
        this.n = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkg0)) {
            return false;
        }
        nkg0 nkg0Var = (nkg0) obj;
        return this.f23679a == nkg0Var.f23679a && this.b.equals(nkg0Var.b) && ycl.b(this.c, nkg0Var.c) && ycl.b(this.d, nkg0Var.d) && ycl.b(this.e, nkg0Var.e) && ycl.b(this.f, nkg0Var.f) && Float.compare(this.g, nkg0Var.g) == 0 && Float.compare(this.h, nkg0Var.h) == 0 && ycl.b(this.i, nkg0Var.i) && ycl.b(this.j, nkg0Var.j) && ycl.b(this.k, nkg0Var.k) && ycl.b(this.l, nkg0Var.l) && ycl.b(this.m, nkg0Var.m) && ycl.b(this.n, nkg0Var.n);
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(ohs0.f(this.b, Boolean.hashCode(this.f23679a) * 31, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31), this.m, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.c);
        String strC2 = ycl.c(this.d);
        String strC3 = ycl.c(this.e);
        String strC4 = ycl.c(this.f);
        String strC5 = ycl.c(this.i);
        String strC6 = ycl.c(this.j);
        String strC7 = ycl.c(this.k);
        String strC8 = ycl.c(this.l);
        String strC9 = ycl.c(this.m);
        String strC10 = ycl.c(this.n);
        StringBuilder sb = new StringBuilder("RpsUiConfig(configIsReady=");
        sb.append(this.f23679a);
        sb.append(", animationParams=");
        sb.append(this.b);
        sb.append(", tableHeight=");
        f140.v(sb, strC, ", tableWidth=", strC2, ", playerSize=");
        f140.v(sb, strC3, ", handSize=", strC4, ", handTranslationY=");
        vqd.v(sb, this.g, ", centralHandTranslationY=", this.h, ", handsOffsetByX=");
        f140.v(sb, strC5, ", topPlayersOffestByX=", strC6, ", bottomPlayersOffsetByX=");
        f140.v(sb, strC7, ", winPlayerSize=", strC8, ", winTitleHeight=");
        return ua80.m(sb, strC9, ", winTitleWidth=", strC10, Separators.RPAREN);
    }
}
