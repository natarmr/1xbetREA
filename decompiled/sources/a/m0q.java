package a;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0q implements thl, oz5, vky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f20967a;
    public final sty b;
    public final tz5 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final e4d g;
    public final e4d h;
    public h2u0 i;
    public final bb10 j;
    public sz5 k;
    public float l;

    public m0q(bb10 bb10Var, tz5 tz5Var, gkj0 gkj0Var) {
        Path path = new Path();
        this.f20967a = path;
        this.b = new sty(1, (byte) 0);
        this.f = new ArrayList();
        this.c = tz5Var;
        String str = gkj0Var.c;
        u33 u33Var = gkj0Var.e;
        u33 u33Var2 = gkj0Var.d;
        this.d = str;
        this.e = gkj0Var.f;
        this.j = bb10Var;
        if (tz5Var.l() != null) {
            hlq hlqVarF0 = ((v33) tz5Var.l().f29996a).f0();
            this.k = hlqVarF0;
            hlqVarF0.a(this);
            tz5Var.f(this.k);
        }
        if (u33Var2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(gkj0Var.b);
        sz5 sz5VarF0 = u33Var2.f0();
        this.g = (e4d) sz5VarF0;
        sz5VarF0.a(this);
        tz5Var.f(sz5VarF0);
        sz5 sz5VarF1 = u33Var.f0();
        this.h = (e4d) sz5VarF1;
        sz5VarF1.a(this);
        tz5Var.f(sz5VarF1);
    }

    @Override // a.oz5
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // a.qde
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            qde qdeVar = (qde) list2.get(i);
            if (qdeVar instanceof b290) {
                this.f.add((b290) qdeVar);
            }
        }
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        ah40.g(tkyVar, i, arrayList, tkyVar2, this);
    }

    @Override // a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f20967a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((b290) arrayList.get(i)).c(), matrix);
                i++;
            }
        }
    }

    @Override // a.uky
    public final void g(zn00 zn00Var, Object obj) {
        PointF pointF = nb10.f23218a;
        if (obj == 1) {
            this.g.j(zn00Var);
            return;
        }
        if (obj == 4) {
            this.h.j(zn00Var);
            return;
        }
        ColorFilter colorFilter = nb10.I;
        tz5 tz5Var = this.c;
        if (obj == colorFilter) {
            h2u0 h2u0Var = this.i;
            if (h2u0Var != null) {
                tz5Var.o(h2u0Var);
            }
            h2u0 h2u0Var2 = new h2u0(zn00Var, null);
            this.i = h2u0Var2;
            h2u0Var2.a(this);
            tz5Var.f(this.i);
            return;
        }
        if (obj == nb10.e) {
            sz5 sz5Var = this.k;
            if (sz5Var != null) {
                sz5Var.j(zn00Var);
                return;
            }
            h2u0 h2u0Var3 = new h2u0(zn00Var, null);
            this.k = h2u0Var3;
            h2u0Var3.a(this);
            tz5Var.f(this.k);
        }
    }

    @Override // a.qde
    public final String getName() {
        return this.d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.thl
    public final void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        MaskFilter maskFilter;
        if (this.e) {
            return;
        }
        e4d e4dVar = this.g;
        int iL = e4dVar.l(e4dVar.c.b(), e4dVar.c());
        float fIntValue = ((Integer) this.h.e()).intValue() / 100.0f;
        int iC = (ah40.c((int) (i * fIntValue)) << 24) | (iL & 16777215);
        sty styVar = this.b;
        styVar.setColor(iC);
        h2u0 h2u0Var = this.i;
        if (h2u0Var != null) {
            styVar.setColorFilter((ColorFilter) h2u0Var.e());
        }
        sz5 sz5Var = this.k;
        if (sz5Var != null) {
            float fFloatValue = ((Float) sz5Var.e()).floatValue();
            if (fFloatValue == 0.0f) {
                styVar.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                tz5 tz5Var = this.c;
                if (tz5Var.A == fFloatValue) {
                    maskFilter = tz5Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    tz5Var.B = blurMaskFilter;
                    tz5Var.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                styVar.setMaskFilter(maskFilter);
            }
            this.l = fFloatValue;
        }
        if (kilVar != null) {
            kilVar.a((int) (fIntValue * 255.0f), styVar);
        } else {
            styVar.clearShadowLayer();
        }
        Path path = this.f20967a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, styVar);
                return;
            } else {
                path.addPath(((b290) arrayList.get(i2)).c(), matrix);
                i2++;
            }
        }
    }
}
