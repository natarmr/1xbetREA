package a;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a290 extends hwt0 {
    public t89 b;
    public float f;
    public t89 g;
    public float k;
    public float m;
    public boolean p;
    public vtm0 q;
    public final w03 r;
    public w03 s;
    public w03 t;
    public final a8z u;
    public float c = 1.0f;
    public List d = q4u0.f28120a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public a290() {
        w03 w03VarA = z03.a();
        this.r = w03VarA;
        this.s = w03VarA;
        this.u = maz.a(wez.b, new i280((byte) 18));
    }

    @Override // a.hwt0
    public final void a(fhl fhlVar) {
        vtm0 vtm0Var;
        if (this.n) {
            tfx.L(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        t89 t89Var = this.b;
        if (t89Var != null) {
            fhl.K0(fhlVar, this.s, t89Var, this.c, null, 56);
        }
        t89 t89Var2 = this.g;
        if (t89Var2 != null) {
            vtm0 vtm0Var2 = this.q;
            if (this.o || vtm0Var2 == null) {
                vtm0 vtm0Var3 = new vtm0(this.f, this.j, this.h, this.i, null, 16);
                this.q = vtm0Var3;
                this.o = false;
                vtm0Var = vtm0Var3;
            } else {
                vtm0Var = vtm0Var2;
            }
            fhl.K0(fhlVar, this.s, t89Var2, this.e, vtm0Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        w03 w03Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = w03Var;
            return;
        }
        w03 w03Var2 = this.s;
        if (w03Var2 != w03Var) {
            int i = w03Var2.f38329a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.i();
            this.s.j(i);
        } else {
            this.s = z03.a();
        }
        a8z a8zVar = this.u;
        ((y03) a8zVar.getValue()).f41785a.setPath(w03Var.f38329a, false);
        float length = ((y03) a8zVar.getValue()).f41785a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((y03) a8zVar.getValue()).a(f4, f5, this.s);
            return;
        }
        w03 w03VarA = this.t;
        if (w03VarA == null) {
            w03VarA = z03.a();
            this.t = w03VarA;
        }
        w03VarA.h();
        ((y03) a8zVar.getValue()).a(f4, length, w03VarA);
        w03.a(this.s, w03VarA);
        w03VarA.h();
        ((y03) a8zVar.getValue()).a(0.0f, f5, w03VarA);
        w03.a(this.s, w03VarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
