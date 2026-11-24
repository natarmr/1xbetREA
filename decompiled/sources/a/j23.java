package a;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j23 extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ucs0 f15762a;
    public k5q0 b;
    public byte c;
    public ljj0 d;
    public y3d e;
    public t89 f;
    public zbk g;
    public h7k0 h;
    public agc i;

    public final ucs0 a() {
        ucs0 ucs0Var = this.f15762a;
        if (ucs0Var != null) {
            return ucs0Var;
        }
        ucs0 ucs0Var2 = new ucs0(this);
        this.f15762a = ucs0Var2;
        return ucs0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().r(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    public final void c(t89 t89Var, long j, float f) {
        if (t89Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (t89Var instanceof skk0) {
            d(jtt0.o(f, ((skk0) t89Var).f32354a));
            return;
        }
        if (!(t89Var instanceof ijj0)) {
            t9f.b();
            return;
        }
        if (Intrinsics.d(this.f, t89Var)) {
            h7k0 h7k0Var = this.h;
            if (!(h7k0Var == null ? false : h7k0.b(h7k0Var.f12579a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = t89Var;
                    this.h = new h7k0(j);
                    this.g = jgk0.b(new zt(t89Var, j, (byte) 1));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = t89Var;
            this.h = new h7k0(j);
            this.g = jgk0.b(new zt(t89Var, j, (byte) 1));
        }
        ucs0 ucs0VarA = a();
        zbk zbkVar = this.g;
        ucs0VarA.w(zbkVar != null ? (Shader) zbkVar.getValue() : null);
        this.e = null;
        cjx.W(this, f);
    }

    public final void d(long j) {
        y3d y3dVar = this.e;
        if ((y3dVar == null ? false : h2t0.a(y3dVar.f41946a, j)) || j == 16) {
            return;
        }
        this.e = new y3d(j);
        setColor(fbc.U(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(agc agcVar) {
        if (agcVar == null || Intrinsics.d(this.i, agcVar)) {
            return;
        }
        this.i = agcVar;
        if (agcVar.equals(l0q.f19214a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(agcVar instanceof vtm0)) {
            t9f.b();
            return;
        }
        a().A(1);
        vtm0 vtm0Var = (vtm0) agcVar;
        a().z(vtm0Var.f38015a);
        ucs0 ucs0VarA = a();
        ((Paint) ucs0VarA.c).setStrokeMiter(vtm0Var.b);
        a().y(vtm0Var.d);
        a().x(vtm0Var.c);
        a().v(vtm0Var.e);
    }

    public final void f(ljj0 ljj0Var) {
        if (ljj0Var == null || Intrinsics.d(this.d, ljj0Var)) {
            return;
        }
        this.d = ljj0Var;
        if (ljj0Var.equals(ljj0.d)) {
            clearShadowLayer();
            return;
        }
        ljj0 ljj0Var2 = this.d;
        float f = ljj0Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (ljj0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), fbc.U(this.d.f20155a));
    }

    public final void g(k5q0 k5q0Var) {
        if (k5q0Var == null || Intrinsics.d(this.b, k5q0Var)) {
            return;
        }
        this.b = k5q0Var;
        int i = k5q0Var.f17733a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.f17733a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
