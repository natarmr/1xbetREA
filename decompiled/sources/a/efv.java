package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/efv;", "La/um40;", "La/gyj0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class efv extends um40 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final long l;
    public final yjj0 m;
    public final boolean n;
    public final p4 o;
    public final long p;
    public final long q;
    public final int r;
    public final int s;
    public final a4d t;
    public final z5z u;

    public efv(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, yjj0 yjj0Var, boolean z, p4 p4Var, long j2, long j3, int i, int i2, a4d a4dVar, z5z z5zVar) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = j;
        this.m = yjj0Var;
        this.n = z;
        this.o = p4Var;
        this.p = j2;
        this.q = j3;
        this.r = i;
        this.s = i2;
        this.t = a4dVar;
        this.u = z5zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efv)) {
            return false;
        }
        efv efvVar = (efv) obj;
        if (Float.compare(this.b, efvVar.b) != 0 || Float.compare(this.c, efvVar.c) != 0 || Float.compare(this.d, efvVar.d) != 0 || Float.compare(this.e, efvVar.e) != 0 || Float.compare(this.f, efvVar.f) != 0 || Float.compare(this.g, efvVar.g) != 0 || Float.compare(this.h, efvVar.h) != 0 || Float.compare(this.i, efvVar.i) != 0 || Float.compare(this.j, efvVar.j) != 0 || Float.compare(this.k, efvVar.k) != 0 || !ils0.a(this.l, efvVar.l) || !Intrinsics.d(this.m, efvVar.m) || this.n != efvVar.n || !Intrinsics.d(this.o, efvVar.o)) {
            return false;
        }
        long j = efvVar.p;
        int i = y3d.h;
        return h2t0.a(this.p, j) && h2t0.a(this.q, efvVar.q) && this.r == efvVar.r && this.s == efvVar.s && Intrinsics.d(this.t, efvVar.t) && Intrinsics.d(this.u, efvVar.u);
    }

    @Override // a.um40
    public final lm40 f() {
        gyj0 gyj0Var = new gyj0();
        gyj0Var.o = this.b;
        gyj0Var.p = this.c;
        gyj0Var.q = this.d;
        gyj0Var.r = this.e;
        gyj0Var.s = this.f;
        gyj0Var.t = this.g;
        gyj0Var.u = this.h;
        gyj0Var.v = this.i;
        gyj0Var.w = this.j;
        gyj0Var.x = this.k;
        gyj0Var.y = this.l;
        gyj0Var.z = this.m;
        gyj0Var.A = this.n;
        gyj0Var.B = this.o;
        gyj0Var.Y = this.p;
        gyj0Var.Z = this.q;
        gyj0Var.f1 = this.r;
        gyj0Var.g1 = this.s;
        gyj0Var.h1 = this.t;
        gyj0Var.i1 = this.u;
        gyj0Var.j1 = new rai0(gyj0Var, (byte) 17);
        return gyj0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        s460 s460Var;
        gyj0 gyj0Var = (gyj0) lm40Var;
        gyj0Var.o = this.b;
        gyj0Var.p = this.c;
        gyj0Var.q = this.d;
        gyj0Var.r = this.e;
        gyj0Var.s = this.f;
        gyj0Var.t = this.g;
        gyj0Var.u = this.h;
        gyj0Var.v = this.i;
        gyj0Var.w = this.j;
        gyj0Var.x = this.k;
        gyj0Var.y = this.l;
        gyj0Var.z = this.m;
        gyj0Var.A = this.n;
        gyj0Var.B = this.o;
        gyj0Var.Y = this.p;
        gyj0Var.Z = this.q;
        gyj0Var.f1 = this.r;
        gyj0Var.g1 = this.s;
        gyj0Var.h1 = this.t;
        gyj0Var.i1 = this.u;
        rai0 rai0Var = gyj0Var.j1;
        if (gyj0Var.f20279a.n && (s460Var = vcc.X(gyj0Var, 2).v) != null) {
            s460Var.G1(rai0Var, true);
        }
    }

    public final int hashCode() {
        int iA = defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.b) * 31, this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31);
        int i = ils0.c;
        int iE = brm0.e((this.m.hashCode() + rw2.b(iA, 31, this.l)) * 31, 31, this.n);
        p4 p4Var = this.o;
        int iHashCode = (iE + (p4Var == null ? 0 : p4Var.hashCode())) * 31;
        int i2 = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iA2 = twn.a(this.s, twn.a(this.r, rw2.b(rw2.b(iHashCode, 31, this.p), 31, this.q), 31), 31);
        a4d a4dVar = this.t;
        return this.u.hashCode() + ((iA2 + (a4dVar != null ? a4dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strB = ils0.b(this.l);
        String strI = y3d.i(this.p);
        String strI2 = y3d.i(this.q);
        String strE = ua80.e(this.r, "CompositingStrategy(value=", Separators.RPAREN);
        String strA = l78.a(this.s);
        StringBuilder sbS = dw9.s(this.b, this.c, "GraphicsLayerElement(scaleX=", ", scaleY=", ", alpha=");
        vqd.v(sbS, this.d, ", translationX=", this.e, ", translationY=");
        vqd.v(sbS, this.f, ", shadowElevation=", this.g, ", rotationX=");
        vqd.v(sbS, this.h, ", rotationY=", this.i, ", rotationZ=");
        vqd.v(sbS, this.j, ", cameraDistance=", this.k, ", transformOrigin=");
        sbS.append(strB);
        sbS.append(", shape=");
        sbS.append(this.m);
        sbS.append(", clip=");
        sbS.append(this.n);
        sbS.append(", renderEffect=");
        sbS.append(this.o);
        sbS.append(", ambientShadowColor=");
        f140.v(sbS, strI, ", spotShadowColor=", strI2, ", compositingStrategy=");
        f140.v(sbS, strE, ", blendMode=", strA, ", colorFilter=");
        sbS.append(this.t);
        sbS.append(", outsets=");
        sbS.append(this.u);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
