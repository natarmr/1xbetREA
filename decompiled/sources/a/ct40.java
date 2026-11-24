package a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ct40 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot40 f4918a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct40(ot40 ot40Var, boolean z, boolean z2, boolean z3) {
        super(1);
        this.f4918a = ot40Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x026a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0278  */
    /* JADX WARN: Code duplicated, block: B:67:0x0280  */
    /* JADX WARN: Code duplicated, block: B:68:0x0285  */
    /* JADX WARN: Code duplicated, block: B:70:0x028b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0296  */
    /* JADX WARN: Code duplicated, block: B:76:0x029c  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:87:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0308 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x030a  */
    /* JADX WARN: Type inference failed for: r2v16, types: [float[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Canvas canvas;
        cry cryVar;
        zr40 zr40Var;
        int i;
        Paint paint;
        int i2;
        float f;
        double d;
        float f2;
        fhn fhnVar;
        float f3;
        double d2;
        double d3;
        aw3 aw3Var;
        Paint paint2;
        int i3;
        double[] dArr;
        fhn fhnVar2;
        float f4;
        fhl fhlVar = (fhl) obj;
        ot40 ot40Var = this.f4918a;
        fms0 fms0Var = ot40Var.i;
        x03 x03VarK = qjj.K(0.0f, new float[]{10.0f, 10.0f});
        ArrayList arrayList = ot40Var.f2731a.u0;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            k4e k4eVar = (k4e) arrayList.get(i5);
            fms0Var.getClass();
            vdv0 vdv0Var = fms0Var.a(i4, k4eVar.k).f8063a;
            vdv0 vdv0Var2 = fms0Var.a(1, k4eVar.k).b;
            if (this.b) {
                long j = y3d.e;
                ot40.g(fhlVar, vdv0Var, x03VarK, j);
                ot40.g(fhlVar, vdv0Var2, x03VarK, j);
                ((fvt0) fhlVar.A0().b).A(2.0f, 2.0f);
                try {
                    long j2 = y3d.c;
                    ot40.g(fhlVar, vdv0Var, x03VarK, j2);
                    ot40.g(fhlVar, vdv0Var2, x03VarK, j2);
                    ((fvt0) fhlVar.A0().b).A(-2.0f, -2.0f);
                } catch (Throwable th) {
                    ((fvt0) fhlVar.A0().b).A(-2.0f, -2.0f);
                    throw th;
                }
            }
            float fE = h7k0.e(fhlVar.d());
            float fC = h7k0.c(fhlVar.d());
            cry cryVar2 = new cry();
            new Rect();
            Paint paint3 = new Paint();
            cryVar2.f = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-21965);
            paint3.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            cryVar2.g = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-2067046);
            paint4.setStrokeWidth(2.0f);
            paint4.setStyle(style);
            Paint paint5 = new Paint();
            paint5.setAntiAlias(true);
            paint5.setColor(-13391360);
            paint5.setStrokeWidth(2.0f);
            paint5.setStyle(style);
            Paint paint6 = new Paint();
            paint6.setAntiAlias(true);
            paint6.setColor(-13391360);
            paint6.setTextSize(23.0f);
            Paint paint7 = new Paint();
            cryVar2.h = paint7;
            paint7.setAntiAlias(true);
            fhl fhlVar2 = fhlVar;
            ArrayList arrayList2 = arrayList;
            paint5.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            float[] fArr = new float[100];
            cryVar2.d = fArr;
            int[] iArr = new int[50];
            Canvas canvasB = vw2.b(fhlVar2.A0().i());
            zr40 zr40Var2 = fms0Var.a(0, vdv0Var.f37251a.k).d;
            int i6 = (int) fE;
            int i7 = (int) fC;
            ArrayList arrayList3 = zr40Var2.r;
            double[] dArrY = zr40Var2.g[0].Y();
            Iterator it = arrayList3.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                iArr[i8] = ((qt40) it.next()).n;
                i8++;
                fms0Var = fms0Var;
            }
            fms0 fms0Var2 = fms0Var;
            int i9 = 0;
            int i10 = 0;
            while (i9 < dArrY.length) {
                double[] dArr2 = dArrY;
                zr40Var2.g[0].P(dArrY[i9], zr40Var2.m);
                zr40Var2.c.c(dArr2[i9], zr40Var2.l, zr40Var2.m, fArr, i10);
                i10 += 2;
                i9++;
                dArrY = dArr2;
                i6 = i6;
                x03VarK = x03VarK;
            }
            x03 x03Var = x03VarK;
            int i11 = i6;
            cryVar2.b = i10 / 2;
            float[] fArr2 = (float[]) cryVar2.c;
            if (fArr2 == null || fArr2.length != 124) {
                cryVar2.c = new float[124];
                cryVar2.e = new Path();
            }
            canvasB.translate(1.0f, 1.0f);
            paint3.setColor(1996488704);
            paint7.setColor(1996488704);
            paint4.setColor(1996488704);
            paint5.setColor(1996488704);
            float[] fArr3 = (float[]) cryVar2.c;
            HashMap map = zr40Var2.v;
            zzk0 zzk0Var = map == null ? null : (zzk0) map.get("translationX");
            HashMap map2 = zr40Var2.v;
            zzk0 zzk0Var2 = map2 == null ? null : (zzk0) map2.get("translationY");
            float f5 = 1.0f;
            HashMap map3 = zr40Var2.w;
            cky ckyVar = map3 == null ? null : (cky) map3.get("translationX");
            HashMap map4 = zr40Var2.w;
            cky ckyVar2 = map4 == null ? null : (cky) map4.get("translationY");
            int i12 = 0;
            while (i12 < 62) {
                float fMin = 0.016393442f * i12;
                float f6 = zr40Var2.k;
                if (f6 != f5) {
                    i = i12;
                    float f7 = zr40Var2.j;
                    f = fMin < f7 ? 0.0f : fMin;
                    paint = paint5;
                    i2 = i5;
                    if (f > f7 && f < 1.0d) {
                        fMin = Math.min((f - f7) * f6, f5);
                    }
                    d = f;
                    fhn fhnVar3 = zr40Var2.c.f29283a;
                    f2 = Float.NaN;
                    fhnVar = fhnVar3;
                    f3 = 0.0f;
                    for (qt40 qt40Var : zr40Var2.r) {
                        double d4 = d;
                        fhnVar2 = qt40Var.f29283a;
                        if (fhnVar2 != null) {
                            f4 = qt40Var.b;
                            if (f4 < f) {
                                f3 = f4;
                                fhnVar = fhnVar2;
                            } else if (Float.isNaN(f2)) {
                                f2 = qt40Var.b;
                            }
                        }
                        d = d4;
                    }
                    d2 = d;
                    if (fhnVar != null) {
                        if (Float.isNaN(f2)) {
                            f2 = 1.0f;
                        }
                        float f8 = f2 - f3;
                        d3 = (((float) fhnVar.d((f - f3) / f8)) * f8) + f3;
                    } else {
                        d3 = d2;
                    }
                    int i13 = size;
                    zr40Var2.g[0].P(d3, zr40Var2.m);
                    aw3Var = zr40Var2.h;
                    if (aw3Var != null) {
                        dArr = zr40Var2.m;
                        paint2 = paint7;
                        if (dArr.length > 0) {
                            aw3Var.P(d3, dArr);
                        }
                    } else {
                        paint2 = paint7;
                    }
                    i3 = i * 2;
                    zr40Var2.c.c(d3, zr40Var2.l, zr40Var2.m, fArr3, i3);
                    if (ckyVar != null) {
                        fArr3[i3] = ckyVar.a(f) + fArr3[i3];
                    } else if (zzk0Var != null) {
                        fArr3[i3] = zzk0Var.a(f) + fArr3[i3];
                    }
                    if (ckyVar2 != null) {
                        int i14 = i3 + 1;
                        fArr3[i14] = ckyVar2.a(f) + fArr3[i14];
                    } else if (zzk0Var2 != null) {
                        int i15 = i3 + 1;
                        fArr3[i15] = zzk0Var2.a(f) + fArr3[i15];
                    }
                    i12 = i + 1;
                    size = i13;
                    i5 = i2;
                    paint5 = paint;
                    paint7 = paint2;
                    f5 = 1.0f;
                } else {
                    i = i12;
                    paint = paint5;
                    i2 = i5;
                }
                f = fMin;
                d = f;
                fhn fhnVar4 = zr40Var2.c.f29283a;
                f2 = Float.NaN;
                fhnVar = fhnVar4;
                f3 = 0.0f;
                while (r7.hasNext()) {
                    double d5 = d;
                    fhnVar2 = qt40Var.f29283a;
                    if (fhnVar2 != null) {
                        f4 = qt40Var.b;
                        if (f4 < f) {
                            f3 = f4;
                            fhnVar = fhnVar2;
                        } else if (Float.isNaN(f2)) {
                            f2 = qt40Var.b;
                        }
                    }
                    d = d5;
                }
                d2 = d;
                if (fhnVar != null) {
                    if (Float.isNaN(f2)) {
                        f2 = 1.0f;
                    }
                    float f9 = f2 - f3;
                    d3 = (((float) fhnVar.d((f - f3) / f9)) * f9) + f3;
                } else {
                    d3 = d2;
                }
                int i16 = size;
                zr40Var2.g[0].P(d3, zr40Var2.m);
                aw3Var = zr40Var2.h;
                if (aw3Var != null) {
                    dArr = zr40Var2.m;
                    paint2 = paint7;
                    if (dArr.length > 0) {
                        aw3Var.P(d3, dArr);
                    }
                } else {
                    paint2 = paint7;
                }
                i3 = i * 2;
                zr40Var2.c.c(d3, zr40Var2.l, zr40Var2.m, fArr3, i3);
                if (ckyVar != null) {
                    fArr3[i3] = ckyVar.a(f) + fArr3[i3];
                } else if (zzk0Var != null) {
                    fArr3[i3] = zzk0Var.a(f) + fArr3[i3];
                }
                if (ckyVar2 != null) {
                    int i17 = i3 + 1;
                    fArr3[i17] = ckyVar2.a(f) + fArr3[i17];
                } else if (zzk0Var2 != null) {
                    int i18 = i3 + 1;
                    fArr3[i18] = zzk0Var2.a(f) + fArr3[i18];
                }
                i12 = i + 1;
                size = i16;
                i5 = i2;
                paint5 = paint;
                paint7 = paint2;
                f5 = 1.0f;
            }
            Paint paint8 = paint7;
            Paint paint9 = paint5;
            int i19 = i5;
            int i20 = size;
            boolean z = this.c;
            if (z) {
                float[] fArr4 = (float[]) cryVar2.c;
                fArr4.getClass();
                canvasB.drawLines(fArr4, (Paint) cryVar2.f);
            }
            boolean z2 = this.d;
            if (z2) {
                zr40Var = zr40Var2;
                cryVar2.a(canvasB, cryVar2.b, zr40Var, i11, i7);
                cryVar = cryVar2;
                canvas = canvasB;
            } else {
                canvas = canvasB;
                cryVar = cryVar2;
                zr40Var = zr40Var2;
            }
            paint3.setColor(-21965);
            paint4.setColor(-2067046);
            paint8.setColor(-2067046);
            paint9.setColor(-13391360);
            canvas.translate(-1.0f, -1.0f);
            if (z) {
                float[] fArr5 = (float[]) cryVar.c;
                fArr5.getClass();
                canvas.drawLines(fArr5, (Paint) cryVar.f);
            }
            if (z2) {
                cryVar.a(canvas, cryVar.b, zr40Var, i11, i7);
            }
            i5 = i19 + 1;
            size = i20;
            arrayList = arrayList2;
            fhlVar = fhlVar2;
            fms0Var = fms0Var2;
            x03VarK = x03Var;
            i4 = 0;
        }
        return Unit.f46060a;
    }
}
