package a;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x26 implements oz5, vky, thl {
    public final bb10 e;
    public final tz5 f;
    public final float[] h;
    public final sty i;
    public final hlq j;
    public final e4d k;
    public final ArrayList l;
    public final hlq m;
    public h2u0 n;
    public sz5 o;
    public float p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f40152a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public x26(bb10 bb10Var, tz5 tz5Var, Paint.Cap cap, Paint.Join join, float f, u33 u33Var, v33 v33Var, ArrayList arrayList, v33 v33Var2) {
        sty styVar = new sty(1, (byte) 0);
        this.i = styVar;
        this.p = 0.0f;
        this.e = bb10Var;
        this.f = tz5Var;
        styVar.setStyle(Paint.Style.STROKE);
        styVar.setStrokeCap(cap);
        styVar.setStrokeJoin(join);
        styVar.setStrokeMiter(f);
        this.k = (e4d) u33Var.f0();
        this.j = v33Var.f0();
        if (v33Var2 == null) {
            this.m = null;
        } else {
            this.m = v33Var2.f0();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((v33) arrayList.get(i)).f0());
        }
        tz5Var.f(this.k);
        tz5Var.f(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            tz5Var.f((sz5) this.l.get(i2));
        }
        hlq hlqVar = this.m;
        if (hlqVar != null) {
            tz5Var.f(hlqVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((sz5) this.l.get(i3)).a(this);
        }
        hlq hlqVar2 = this.m;
        if (hlqVar2 != null) {
            hlqVar2.a(this);
        }
        if (tz5Var.l() != null) {
            hlq hlqVarF0 = ((v33) tz5Var.l().f29996a).f0();
            this.o = hlqVarF0;
            hlqVarF0.a(this);
            tz5Var.f(this.o);
        }
    }

    @Override // a.oz5
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // a.qde
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        w26 w26Var = null;
        lrs0 lrs0Var = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            qde qdeVar = (qde) arrayList2.get(size);
            if (qdeVar instanceof lrs0) {
                lrs0 lrs0Var2 = (lrs0) qdeVar;
                if (lrs0Var2.c == 2) {
                    lrs0Var = lrs0Var2;
                }
            }
        }
        if (lrs0Var != null) {
            lrs0Var.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            qde qdeVar2 = (qde) list2.get(size2);
            if (qdeVar2 instanceof lrs0) {
                lrs0 lrs0Var3 = (lrs0) qdeVar2;
                if (lrs0Var3.c == 2) {
                    if (w26Var != null) {
                        arrayList.add(w26Var);
                    }
                    w26 w26Var2 = new w26(lrs0Var3);
                    lrs0Var3.d(this);
                    w26Var = w26Var2;
                } else if (!(qdeVar2 instanceof b290)) {
                    if (w26Var == null) {
                        w26Var = new w26(lrs0Var);
                    }
                    w26Var.f38435a.add((b290) qdeVar2);
                }
            } else if (!(qdeVar2 instanceof b290)) {
                if (w26Var == null) {
                    w26Var = new w26(lrs0Var);
                }
                w26Var.f38435a.add((b290) qdeVar2);
            }
        }
        if (w26Var != null) {
            arrayList.add(w26Var);
        }
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        ah40.g(tkyVar, i, arrayList, tkyVar2, this);
    }

    @Override // a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            w26 w26Var = (w26) arrayList.get(i);
            for (int i2 = 0; i2 < w26Var.f38435a.size(); i2++) {
                path.addPath(((b290) w26Var.f38435a.get(i2)).c(), matrix);
            }
            i++;
        }
    }

    public void g(zn00 zn00Var, Object obj) {
        PointF pointF = nb10.f23218a;
        if (obj == 4) {
            this.k.j(zn00Var);
            return;
        }
        if (obj == nb10.q) {
            this.j.j(zn00Var);
            return;
        }
        ColorFilter colorFilter = nb10.I;
        tz5 tz5Var = this.f;
        if (obj == colorFilter) {
            h2u0 h2u0Var = this.n;
            if (h2u0Var != null) {
                tz5Var.o(h2u0Var);
            }
            h2u0 h2u0Var2 = new h2u0(zn00Var, null);
            this.n = h2u0Var2;
            h2u0Var2.a(this);
            tz5Var.f(this.n);
            return;
        }
        if (obj == nb10.e) {
            sz5 sz5Var = this.o;
            if (sz5Var != null) {
                sz5Var.j(zn00Var);
                return;
            }
            h2u0 h2u0Var3 = new h2u0(zn00Var, null);
            this.o = h2u0Var3;
            h2u0Var3.a(this);
            tz5Var.f(this.o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
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
    public void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        x26 x26Var = this;
        float[] fArr2 = (float[]) cut0.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = ((Integer) x26Var.k.e()).intValue() / 100.0f;
        int iC = ah40.c((int) (i * fIntValue));
        sty styVar = x26Var.i;
        styVar.setAlpha(iC);
        styVar.setStrokeWidth(x26Var.j.l());
        if (styVar.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = x26Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = x26Var.h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((sz5) arrayList.get(i4)).e()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            hlq hlqVar = x26Var.m;
            styVar.setPathEffect(new DashPathEffect(fArr, hlqVar == null ? 0.0f : ((Float) hlqVar.e()).floatValue()));
        }
        h2u0 h2u0Var = x26Var.n;
        if (h2u0Var != null) {
            styVar.setColorFilter((ColorFilter) h2u0Var.e());
        }
        sz5 sz5Var = x26Var.o;
        if (sz5Var != null) {
            float fFloatValue2 = ((Float) sz5Var.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                styVar.setMaskFilter(null);
            } else if (fFloatValue2 != x26Var.p) {
                tz5 tz5Var = x26Var.f;
                if (tz5Var.A == fFloatValue2) {
                    maskFilter = tz5Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    tz5Var.B = blurMaskFilter;
                    tz5Var.A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                styVar.setMaskFilter(maskFilter);
            }
            x26Var.p = fFloatValue2;
        }
        if (kilVar != null) {
            kilVar.a((int) (fIntValue * 255.0f), styVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = x26Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            w26 w26Var = (w26) arrayList2.get(i5);
            lrs0 lrs0Var = w26Var.b;
            ArrayList arrayList3 = w26Var.f38435a;
            Path path = x26Var.b;
            if (lrs0Var != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((b290) arrayList3.get(size2)).c());
                }
                float fFloatValue3 = ((Float) lrs0Var.d.e()).floatValue() / f2;
                float fFloatValue4 = ((Float) lrs0Var.e.e()).floatValue() / f2;
                float fFloatValue5 = ((Float) lrs0Var.f.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = x26Var.f40152a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path pathC = ((b290) arrayList3.get(size3)).c();
                        Path path2 = x26Var.c;
                        path2.set(pathC);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        cut0.a(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path2, styVar);
                                    } else {
                                        canvas.drawPath(path2, styVar);
                                    }
                                }
                            } else {
                                cut0.a(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, styVar);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        x26Var = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, styVar);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((b290) arrayList3.get(size4)).c());
                }
                canvas.drawPath(path, styVar);
            }
            i5++;
            x26Var = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }
}
