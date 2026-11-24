package a;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class tz5 implements thl, oz5, uky {
    public float A;
    public BlurMaskFilter B;
    public sty C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f34789a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final sty d = new sty(1, (byte) 0);
    public final sty e;
    public final sty f;
    public final sty g;
    public final sty h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final bb10 o;
    public final y5z p;
    public final gxu q;
    public final hlq r;
    public tz5 s;
    public tz5 t;
    public List u;
    public final ArrayList v;
    public final hls0 w;
    public boolean x;
    public boolean y;
    public sty z;

    public tz5(bb10 bb10Var, y5z y5zVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new sty(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new sty(mode2);
        sty styVar = new sty(1, (byte) 0);
        this.g = styVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        sty styVar2 = new sty();
        styVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = styVar2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = bb10Var;
        this.p = y5zVar;
        List list = y5zVar.h;
        byte b = 3;
        if (y5zVar.u == 3) {
            styVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            styVar.setXfermode(new PorterDuffXfermode(mode));
        }
        z33 z33Var = y5zVar.i;
        z33Var.getClass();
        hls0 hls0Var = new hls0(z33Var);
        this.w = hls0Var;
        hls0Var.b(this);
        if (list != null && !list.isEmpty()) {
            gxu gxuVar = new gxu();
            gxuVar.c = list;
            gxuVar.f12096a = new ArrayList(list.size());
            gxuVar.b = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                ((ArrayList) gxuVar.f12096a).add(new lkj0((List) ((e930) list.get(i)).b.b));
                ((ArrayList) gxuVar.b).add(((e930) list.get(i)).c.f0());
            }
            this.q = gxuVar;
            Iterator it = ((ArrayList) gxuVar.f12096a).iterator();
            while (it.hasNext()) {
                ((sz5) it.next()).a(this);
            }
            for (sz5 sz5Var : (ArrayList) this.q.b) {
                f(sz5Var);
                sz5Var.a(this);
            }
        }
        y5z y5zVar2 = this.p;
        if (y5zVar2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        hlq hlqVar = new hlq(y5zVar2.t);
        this.r = hlqVar;
        hlqVar.b = true;
        hlqVar.a(new gls0(this, b));
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        f(this.r);
    }

    @Override // a.oz5
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        tz5 tz5Var = this.s;
        y5z y5zVar = this.p;
        if (tz5Var != null) {
            String str = tz5Var.p.c;
            tky tkyVar3 = new tky(tkyVar2);
            tkyVar3.f34119a.add(str);
            if (tkyVar.a(i, this.s.p.c)) {
                tz5 tz5Var2 = this.s;
                tky tkyVar4 = new tky(tkyVar3);
                tkyVar4.b = tz5Var2;
                arrayList.add(tkyVar4);
            }
            if (tkyVar.c(i, this.s.p.c) && tkyVar.d(i, y5zVar.c)) {
                this.s.p(tkyVar, tkyVar.b(i, this.s.p.c) + i, arrayList, tkyVar3);
            }
        }
        String str2 = y5zVar.c;
        String str3 = y5zVar.c;
        if (tkyVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                tky tkyVar5 = new tky(tkyVar2);
                tkyVar5.f34119a.add(str3);
                if (tkyVar.a(i, str3)) {
                    tky tkyVar6 = new tky(tkyVar5);
                    tkyVar6.b = this;
                    arrayList.add(tkyVar6);
                }
                tkyVar2 = tkyVar5;
            }
            if (tkyVar.d(i, str3)) {
                p(tkyVar, tkyVar.b(i, str3) + i, arrayList, tkyVar2);
            }
        }
    }

    @Override // a.thl
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((tz5) this.u.get(size)).w.e());
                }
            } else {
                tz5 tz5Var = this.t;
                if (tz5Var != null) {
                    matrix2.preConcat(tz5Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void f(sz5 sz5Var) {
        if (sz5Var == null) {
            return;
        }
        this.v.add(sz5Var);
    }

    public void g(zn00 zn00Var, Object obj) {
        this.w.c(zn00Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:111:0x0235  */
    /* JADX WARN: Code duplicated, block: B:113:0x025c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0261  */
    /* JADX WARN: Code duplicated, block: B:117:0x0264  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267  */
    /* JADX WARN: Code duplicated, block: B:120:0x026e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x0276  */
    /* JADX WARN: Code duplicated, block: B:126:0x027d  */
    /* JADX WARN: Code duplicated, block: B:130:0x028e A[LOOP:2: B:124:0x0277->B:130:0x028e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x029b  */
    /* JADX WARN: Code duplicated, block: B:134:0x029f  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:140:0x030d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0311  */
    /* JADX WARN: Code duplicated, block: B:143:0x033d  */
    /* JADX WARN: Code duplicated, block: B:144:0x034d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0354  */
    /* JADX WARN: Code duplicated, block: B:147:0x0380  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:162:0x03a6 A[EDGE_INSN: B:162:0x03a6->B:149:0x03a6 BREAK  A[LOOP:1: B:109:0x0227->B:148:0x03a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0288 A[EDGE_INSN: B:170:0x0288->B:128:0x0288 BREAK  A[LOOP:2: B:124:0x0277->B:130:0x028e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    @Override // a.thl
    public final void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        gxu gxuVar;
        Path path;
        float f;
        int i2;
        RectF rectF;
        sty styVar;
        n78 n78Var;
        Paint paint;
        int i3;
        List list;
        ArrayList arrayList;
        sz5 sz5Var;
        sz5 sz5Var2;
        boolean z;
        int iE;
        int i4;
        Paint paint2;
        Path path2;
        Path path3;
        int i5;
        Integer num;
        if (this.x) {
            y5z y5zVar = this.p;
            boolean z2 = y5zVar.v;
            int i6 = y5zVar.y;
            if (z2) {
                return;
            }
            i();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((tz5) this.u.get(size)).w.e());
            }
            hls0 hls0Var = this.w;
            sz5 sz5Var3 = hls0Var.p;
            int iIntValue = (int) ((((i / 255.0f) * ((sz5Var3 == null || (num = (Integer) sz5Var3.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !m() && i6 == 1) {
                matrix2.preConcat(hls0Var.e());
                k(canvas, matrix2, iIntValue, kilVar);
                n();
                return;
            }
            RectF rectF2 = this.i;
            e(rectF2, matrix2, false);
            if (this.s != null && y5zVar.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.e(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(hls0Var.e());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zM = m();
            gxu gxuVar2 = this.q;
            Path path4 = this.f34789a;
            if (zM) {
                int size2 = ((List) gxuVar2.c).size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        e930 e930Var = (e930) ((List) gxuVar2.c).get(i7);
                        Path path5 = (Path) ((sz5) ((ArrayList) gxuVar2.f12096a).get(i7)).e();
                        if (path5 == null) {
                            i2 = size2;
                        } else {
                            path4.set(path5);
                            path4.transform(matrix2);
                            int iE2 = hne.E(e930Var.f7401a);
                            i2 = size2;
                            if (iE2 != 0) {
                                if (iE2 != 1) {
                                    if (iE2 != 2) {
                                        if (iE2 == 3) {
                                        }
                                        rectF = this.m;
                                        path4.computeBounds(rectF, false);
                                        if (i7 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                        i7++;
                                        size2 = i2;
                                        gxuVar2 = gxuVar2;
                                        path4 = path4;
                                    }
                                }
                                gxuVar = gxuVar2;
                                path = path4;
                                f = 0.0f;
                            }
                            if (e930Var.d) {
                                gxuVar = gxuVar2;
                                path = path4;
                                f = 0.0f;
                            }
                            rectF = this.m;
                            path4.computeBounds(rectF, false);
                            if (i7 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                            i7++;
                            size2 = i2;
                            gxuVar2 = gxuVar2;
                            path4 = path4;
                        }
                        i7++;
                        size2 = i2;
                        gxuVar2 = gxuVar2;
                        path4 = path4;
                    } else {
                        gxuVar = gxuVar2;
                        path = path4;
                        if (rectF2.intersect(rectF4)) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            } else {
                gxuVar = gxuVar2;
                path = path4;
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                sty styVar2 = this.d;
                styVar2.setAlpha(255);
                int iE3 = hne.E(i6);
                if (iE3 == 1) {
                    n78Var = Build.VERSION.SDK_INT >= 29 ? n78.MULTIPLY : n78.MODULATE;
                } else if (iE3 == 2) {
                    n78Var = n78.SCREEN;
                } else if (iE3 == 3) {
                    n78Var = n78.OVERLAY;
                } else if (iE3 == 4) {
                    n78Var = n78.DARKEN;
                } else if (iE3 != 5) {
                    n78Var = iE3 != 16 ? null : n78.PLUS;
                } else {
                    n78Var = n78.LIGHTEN;
                }
                p7x.H(styVar2, n78Var);
                Matrix matrix4 = cut0.f5002a;
                canvas.saveLayer(rectF2, styVar2);
                if (i6 != 2) {
                    j(canvas);
                } else {
                    if (Build.VERSION.SDK_INT < 29) {
                        if (this.C == null) {
                            sty styVar3 = new sty();
                            this.C = styVar3;
                            styVar3.setColor(-1);
                        }
                        canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.C);
                    }
                    k(canvas, matrix2, iIntValue, kilVar);
                    if (m()) {
                        paint = this.e;
                        canvas.saveLayer(rectF2, paint);
                        if (Build.VERSION.SDK_INT < 28) {
                            j(canvas);
                        }
                        i3 = 0;
                        while (true) {
                            list = (List) gxuVar.c;
                            arrayList = (ArrayList) gxuVar.f12096a;
                            if (i3 < list.size()) {
                                break;
                            }
                            e930 e930Var2 = (e930) list.get(i3);
                            sz5Var = (sz5) arrayList.get(i3);
                            sz5Var2 = (sz5) ((ArrayList) gxuVar.b).get(i3);
                            int i8 = e930Var2.f7401a;
                            z = e930Var2.d;
                            iE = hne.E(i8);
                            i4 = i3;
                            paint2 = this.f;
                            if (iE != 0) {
                                path2 = path;
                                if (z) {
                                    Matrix matrix5 = cut0.f5002a;
                                    canvas.saveLayer(rectF2, styVar2);
                                    canvas.drawRect(rectF2, styVar2);
                                    path2.set((Path) sz5Var.e());
                                    path2.transform(matrix2);
                                    styVar2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) sz5Var.e());
                                    path2.transform(matrix2);
                                    styVar2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, styVar2);
                                }
                            } else if (iE != 1) {
                                path2 = path;
                                if (i4 == 0) {
                                    styVar2.setColor(-16777216);
                                    styVar2.setAlpha(255);
                                    canvas.drawRect(rectF2, styVar2);
                                }
                                if (z) {
                                    Matrix matrix6 = cut0.f5002a;
                                    canvas.saveLayer(rectF2, paint2);
                                    canvas.drawRect(rectF2, styVar2);
                                    paint2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                    path2.set((Path) sz5Var.e());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) sz5Var.e());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                }
                            } else if (iE != 2) {
                                if (z) {
                                    Matrix matrix7 = cut0.f5002a;
                                    canvas.saveLayer(rectF2, paint);
                                    canvas.drawRect(rectF2, styVar2);
                                    paint2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                    path3 = path;
                                    path3.set((Path) sz5Var.e());
                                    path3.transform(matrix2);
                                    canvas.drawPath(path3, paint2);
                                    canvas.restore();
                                } else {
                                    path3 = path;
                                    Matrix matrix8 = cut0.f5002a;
                                    canvas.saveLayer(rectF2, paint);
                                    path3.set((Path) sz5Var.e());
                                    path3.transform(matrix2);
                                    styVar2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path3, styVar2);
                                    canvas.restore();
                                }
                                path2 = path3;
                            } else if (iE != 3) {
                                path2 = path;
                            } else {
                                if (arrayList.isEmpty()) {
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < list.size()) {
                                            styVar2.setAlpha(255);
                                            canvas.drawRect(rectF2, styVar2);
                                            break;
                                        } else if (((e930) list.get(i5)).f7401a != 4) {
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                path2 = path;
                            }
                            i3 = i4 + 1;
                            path = path2;
                        }
                        canvas.restore();
                    }
                    if (this.s != null) {
                        canvas.saveLayer(rectF2, this.g);
                        j(canvas);
                        this.s.h(canvas, matrix, i, null);
                        canvas.restore();
                    }
                    canvas.restore();
                }
                k(canvas, matrix2, iIntValue, kilVar);
                if (m()) {
                    paint = this.e;
                    canvas.saveLayer(rectF2, paint);
                    if (Build.VERSION.SDK_INT < 28) {
                        j(canvas);
                    }
                    i3 = 0;
                    while (true) {
                        list = (List) gxuVar.c;
                        arrayList = (ArrayList) gxuVar.f12096a;
                        if (i3 < list.size()) {
                            break;
                            break;
                        }
                        e930 e930Var3 = (e930) list.get(i3);
                        sz5Var = (sz5) arrayList.get(i3);
                        sz5Var2 = (sz5) ((ArrayList) gxuVar.b).get(i3);
                        int i9 = e930Var3.f7401a;
                        z = e930Var3.d;
                        iE = hne.E(i9);
                        i4 = i3;
                        paint2 = this.f;
                        if (iE != 0) {
                            path2 = path;
                            if (z) {
                                Matrix matrix9 = cut0.f5002a;
                                canvas.saveLayer(rectF2, styVar2);
                                canvas.drawRect(rectF2, styVar2);
                                path2.set((Path) sz5Var.e());
                                path2.transform(matrix2);
                                styVar2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) sz5Var.e());
                                path2.transform(matrix2);
                                styVar2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, styVar2);
                            }
                        } else if (iE != 1) {
                            path2 = path;
                            if (i4 == 0) {
                                styVar2.setColor(-16777216);
                                styVar2.setAlpha(255);
                                canvas.drawRect(rectF2, styVar2);
                            }
                            if (z) {
                                Matrix matrix10 = cut0.f5002a;
                                canvas.saveLayer(rectF2, paint2);
                                canvas.drawRect(rectF2, styVar2);
                                paint2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                path2.set((Path) sz5Var.e());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) sz5Var.e());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                            }
                        } else if (iE != 2) {
                            if (z) {
                                Matrix matrix11 = cut0.f5002a;
                                canvas.saveLayer(rectF2, paint);
                                canvas.drawRect(rectF2, styVar2);
                                paint2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                path3 = path;
                                path3.set((Path) sz5Var.e());
                                path3.transform(matrix2);
                                canvas.drawPath(path3, paint2);
                                canvas.restore();
                            } else {
                                path3 = path;
                                Matrix matrix12 = cut0.f5002a;
                                canvas.saveLayer(rectF2, paint);
                                path3.set((Path) sz5Var.e());
                                path3.transform(matrix2);
                                styVar2.setAlpha((int) (((Integer) sz5Var2.e()).intValue() * 2.55f));
                                canvas.drawPath(path3, styVar2);
                                canvas.restore();
                            }
                            path2 = path3;
                        } else if (iE != 3) {
                            path2 = path;
                        } else {
                            if (arrayList.isEmpty()) {
                                i5 = 0;
                                while (true) {
                                    if (i5 < list.size()) {
                                        styVar2.setAlpha(255);
                                        canvas.drawRect(rectF2, styVar2);
                                        break;
                                    } else {
                                        if (((e930) list.get(i5)).f7401a != 4) {
                                            break;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            }
                            path2 = path;
                        }
                        i3 = i4 + 1;
                        path = path2;
                    }
                    canvas.restore();
                }
                if (this.s != null) {
                    canvas.saveLayer(rectF2, this.g);
                    j(canvas);
                    this.s.h(canvas, matrix, i, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.y && (styVar = this.z) != null) {
                styVar.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas.drawRect(rectF2, this.z);
            }
            n();
        }
    }

    public final void i() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (tz5 tz5Var = this.t; tz5Var != null; tz5Var = tz5Var.t) {
            this.u.add(tz5Var);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public r7v l() {
        return this.p.w;
    }

    public final boolean m() {
        gxu gxuVar = this.q;
        return (gxuVar == null || ((ArrayList) gxuVar.f12096a).isEmpty()) ? false : true;
    }

    public final void n() {
        td90 td90Var = this.o.f2286a.f9184a;
        String str = this.p.c;
        HashMap map = td90Var.c;
        if (td90Var.f33757a) {
            oj30 oj30Var = (oj30) map.get(str);
            if (oj30Var == null) {
                oj30Var = new oj30();
                map.put(str, oj30Var);
            }
            int i = oj30Var.f25342a + 1;
            oj30Var.f25342a = i;
            if (i == Integer.MAX_VALUE) {
                oj30Var.f25342a = i / 2;
            }
            if (str.equals("__container")) {
                bx3 bx3Var = new bx3(td90Var.b);
                if (bx3Var.hasNext()) {
                    bx3Var.next().getClass();
                    hny.b();
                }
            }
        }
    }

    public final void o(sz5 sz5Var) {
        this.v.remove(sz5Var);
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new sty();
        }
        this.y = z;
    }

    public void r(float f) {
        hls0 hls0Var = this.w;
        sz5 sz5Var = hls0Var.p;
        if (sz5Var != null) {
            sz5Var.i(f);
        }
        sz5 sz5Var2 = hls0Var.v;
        if (sz5Var2 != null) {
            sz5Var2.i(f);
        }
        sz5 sz5Var3 = hls0Var.w;
        if (sz5Var3 != null) {
            sz5Var3.i(f);
        }
        sz5 sz5Var4 = hls0Var.l;
        if (sz5Var4 != null) {
            sz5Var4.i(f);
        }
        sz5 sz5Var5 = hls0Var.m;
        if (sz5Var5 != null) {
            sz5Var5.i(f);
        }
        sz5 sz5Var6 = hls0Var.n;
        if (sz5Var6 != null) {
            sz5Var6.i(f);
        }
        sz5 sz5Var7 = hls0Var.o;
        if (sz5Var7 != null) {
            sz5Var7.i(f);
        }
        hlq hlqVar = hls0Var.q;
        if (hlqVar != null) {
            hlqVar.i(f);
        }
        hlq hlqVar2 = hls0Var.r;
        if (hlqVar2 != null) {
            hlqVar2.i(f);
        }
        hlq hlqVar3 = hls0Var.s;
        if (hlqVar3 != null) {
            hlqVar3.i(f);
        }
        hlq hlqVar4 = hls0Var.t;
        if (hlqVar4 != null) {
            hlqVar4.i(f);
        }
        hlq hlqVar5 = hls0Var.u;
        if (hlqVar5 != null) {
            hlqVar5.i(f);
        }
        int i = 0;
        gxu gxuVar = this.q;
        if (gxuVar != null) {
            ArrayList arrayList = (ArrayList) gxuVar.f12096a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((sz5) arrayList.get(i2)).i(f);
            }
        }
        hlq hlqVar6 = this.r;
        if (hlqVar6 != null) {
            hlqVar6.i(f);
        }
        tz5 tz5Var = this.s;
        if (tz5Var != null) {
            tz5Var.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((sz5) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // a.qde
    public final void b(List list, List list2) {
    }

    public void k(Canvas canvas, Matrix matrix, int i, kil kilVar) {
    }

    public void p(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
    }
}
