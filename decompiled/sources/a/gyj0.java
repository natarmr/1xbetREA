package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gyj0 extends lm40 implements v6z, qai0 {
    public boolean A;
    public p4 B;
    public long Y;
    public long Z;
    public int f1;
    public int g1;
    public a4d h1;
    public z5z i1;
    public rai0 j1;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public yjj0 z;

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS = pj30Var.S(j);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new huh0(pu90VarS, this, (byte) 19));
    }

    @Override // a.qai0
    public final boolean e() {
        return false;
    }

    public final String toString() {
        float f = this.o;
        float f2 = this.p;
        float f3 = this.q;
        float f4 = this.r;
        float f5 = this.s;
        float f6 = this.t;
        float f7 = this.u;
        float f8 = this.v;
        float f9 = this.w;
        float f10 = this.x;
        String strB = ils0.b(this.y);
        yjj0 yjj0Var = this.z;
        boolean z = this.A;
        p4 p4Var = this.B;
        String strI = y3d.i(this.Y);
        String strI2 = y3d.i(this.Z);
        String strE = ua80.e(this.f1, "CompositingStrategy(value=", Separators.RPAREN);
        String strA = l78.a(this.g1);
        a4d a4dVar = this.h1;
        z5z z5zVar = this.i1;
        StringBuilder sbS = dw9.s(f, f2, "SimpleGraphicsLayerModifier(scaleX=", ", scaleY=", ", alpha = ");
        vqd.v(sbS, f3, ", translationX=", f4, ", translationY=");
        vqd.v(sbS, f5, ", shadowElevation=", f6, ", rotationX=");
        vqd.v(sbS, f7, ", rotationY=", f8, ", rotationZ=");
        vqd.v(sbS, f9, ", cameraDistance=", f10, ", transformOrigin=");
        sbS.append(strB);
        sbS.append(", shape=");
        sbS.append(yjj0Var);
        sbS.append(", clip=");
        sbS.append(z);
        sbS.append(", renderEffect=");
        sbS.append(p4Var);
        sbS.append(", ambientShadowColor=");
        f140.v(sbS, strI, ", spotShadowColor=", strI2, ", compositingStrategy=");
        f140.v(sbS, strE, ", blendMode=", strA, ", colorFilter=");
        sbS.append(a4dVar);
        sbS.append("outsets=");
        sbS.append(z5zVar);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        if (this.A) {
            yai0.g(abi0Var, this.z);
        }
    }
}
