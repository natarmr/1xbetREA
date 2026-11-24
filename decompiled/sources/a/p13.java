package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p13 extends lm40 implements vld, ehl, g6z {
    public final gy40 o;
    public final boolean p;
    public final float q;
    public final u3k r;
    public final t3k s;
    public td9 t;
    public float u;
    public boolean w;
    public jcg0 y;
    public kcg0 z;
    public long v = 0;
    public final vy40 x = new vy40();

    public p13(gy40 gy40Var, boolean z, float f, u3k u3kVar, t3k t3kVar) {
        this.o = gy40Var;
        this.p = z;
        this.q = f;
        this.r = u3kVar;
        this.s = t3kVar;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.lm40
    public final void R0() {
        qjj.W(N0(), null, null, new k6d0(this, null, (byte) 18), 3);
    }

    @Override // a.lm40
    public final void S0() {
        jcg0 jcg0Var = this.y;
        if (jcg0Var != null) {
            this.z = null;
            vfc.J(this);
            g090 g090Var = jcg0Var.d;
            kcg0 kcg0Var = (kcg0) ((LinkedHashMap) g090Var.f10448a).get(this);
            if (kcg0Var != null) {
                kcg0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) g090Var.f10448a;
                kcg0 kcg0Var2 = (kcg0) linkedHashMap.get(this);
                if (kcg0Var2 != null) {
                }
                linkedHashMap.remove(this);
                jcg0Var.c.add(kcg0Var);
            }
        }
    }

    public final void Z0(lub0 lub0Var) {
        kcg0 kcg0Var;
        if (!(lub0Var instanceof jub0)) {
            if (lub0Var instanceof kub0) {
                kcg0 kcg0Var2 = this.z;
                if (kcg0Var2 != null) {
                    kcg0Var2.d();
                    return;
                }
                return;
            }
            if (!(lub0Var instanceof iub0) || (kcg0Var = this.z) == null) {
                return;
            }
            kcg0Var.d();
            return;
        }
        jub0 jub0Var = (jub0) lub0Var;
        long j = this.v;
        float f = this.u;
        jcg0 jcg0Var = this.y;
        if (jcg0Var == null) {
            Object obj = (View) mbc.R(this, dy2.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    c99.s(f140.k(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    jcg0 jcg0Var2 = new jcg0(viewGroup.getContext());
                    viewGroup.addView(jcg0Var2);
                    jcg0Var = jcg0Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof jcg0) {
                        jcg0Var = (jcg0) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.y = jcg0Var;
        }
        ArrayList arrayList = jcg0Var.b;
        g090 g090Var = jcg0Var.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) g090Var.f10448a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) g090Var.f10448a;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) g090Var.b;
        kcg0 kcg0Var3 = (kcg0) linkedHashMap.get(this);
        if (kcg0Var3 == null) {
            ArrayList arrayList2 = jcg0Var.c;
            arrayList2.getClass();
            kcg0Var3 = (kcg0) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (kcg0Var3 == null) {
                if (jcg0Var.e > q3d.i(arrayList)) {
                    kcg0Var3 = new kcg0(jcg0Var.getContext());
                    jcg0Var.addView(kcg0Var3);
                    arrayList.add(kcg0Var3);
                } else {
                    kcg0Var3 = (kcg0) arrayList.get(jcg0Var.e);
                    p13 p13Var = (p13) linkedHashMap3.get(kcg0Var3);
                    if (p13Var != null) {
                        p13Var.z = null;
                        vfc.J(p13Var);
                        kcg0 kcg0Var4 = (kcg0) linkedHashMap2.get(p13Var);
                        if (kcg0Var4 != null) {
                        }
                        linkedHashMap2.remove(p13Var);
                        kcg0Var3.c();
                    }
                }
                int i2 = jcg0Var.e;
                if (i2 < jcg0Var.f16275a - 1) {
                    jcg0Var.e = i2 + 1;
                } else {
                    jcg0Var.e = 0;
                }
            }
            linkedHashMap2.put(this, kcg0Var3);
            linkedHashMap3.put(kcg0Var3, this);
        }
        kcg0 kcg0Var5 = kcg0Var3;
        kcg0Var5.b(jub0Var, this.p, j, si30.b(f), this.r.a(), ((hcg0) this.s.invoke()).d, new a13(this, (byte) 1));
        this.z = kcg0Var5;
        vfc.J(this);
    }

    @Override // a.g6z, a.xj30
    public final void a(long j) {
        float fW0;
        this.w = true;
        w6k w6kVar = vcc.Z(this).z;
        this.v = n2x.Q(j);
        float f = this.q;
        if (Float.isNaN(f)) {
            long j2 = this.v;
            fW0 = ne60.d(k9x.i(h7k0.e(j2), h7k0.c(j2))) / 2.0f;
            if (this.p) {
                fW0 += w6kVar.w0(10.0f);
            }
        } else {
            fW0 = w6kVar.w0(f);
        }
        this.u = fW0;
        vy40 vy40Var = this.x;
        Object[] objArr = vy40Var.f38232a;
        int i = vy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Z0((lub0) objArr[i2]);
        }
        vy40Var.d();
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        a6a a6aVar = g7zVar.f10839a;
        g7zVar.a();
        td9 td9Var = this.t;
        if (td9Var != null) {
            float f = this.u;
            long jA = this.r.a();
            float fFloatValue = ((Number) ((t33) td9Var.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jC = y3d.c(fFloatValue, jA);
                if (td9Var.f33756a) {
                    float fE = h7k0.e(a6aVar.d());
                    float fC = h7k0.c(a6aVar.d());
                    nr nrVar = a6aVar.b;
                    long jP = nrVar.p();
                    nrVar.i().l();
                    try {
                        ((fvt0) nrVar.b).k(0.0f, 0.0f, fE, fC, 1);
                        fhl.E(g7zVar, jC, f, 0L, 0.0f, null, 124);
                        defpackage.c.g(nrVar, jP);
                    } catch (Throwable th) {
                        defpackage.c.g(nrVar, jP);
                        throw th;
                    }
                } else {
                    fhl.E(g7zVar, jC, f, 0L, 0.0f, null, 124);
                }
            }
        }
        x5a x5aVarI = a6aVar.b.i();
        kcg0 kcg0Var = this.z;
        if (kcg0Var != null) {
            long j = this.v;
            kcg0Var.e(((hcg0) this.s.invoke()).d, si30.b(this.u), j, this.r.a());
            kcg0Var.draw(vw2.b(x5aVarI));
        }
    }
}
