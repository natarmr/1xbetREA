package a;

import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x8q0 extends tz5 {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final sty J;
    public final sty K;
    public final HashMap L;
    public final u710 M;
    public final ArrayList N;
    public final ArrayList O;
    public final e4d P;
    public final bb10 Q;
    public final fa10 R;
    public final int S;
    public final e4d T;
    public h2u0 U;
    public final e4d V;
    public h2u0 W;
    public final hlq X;
    public h2u0 Y;
    public final hlq Z;
    public h2u0 a0;
    public final e4d b0;
    public h2u0 c0;
    public h2u0 d0;
    public final e4d e0;
    public final e4d f0;
    public final e4d g0;

    public x8q0(bb10 bb10Var, y5z y5zVar) {
        sbx0 sbx0Var;
        sbx0 sbx0Var2;
        u33 u33Var;
        sbx0 sbx0Var3;
        u33 u33Var2;
        sbx0 sbx0Var4;
        u33 u33Var3;
        gr00 gr00Var;
        u33 u33Var4;
        gr00 gr00Var2;
        v33 v33Var;
        gr00 gr00Var3;
        v33 v33Var2;
        gr00 gr00Var4;
        u33 u33Var5;
        gr00 gr00Var5;
        u33 u33Var6;
        super(bb10Var, y5zVar);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        sty styVar = new sty(1, (byte) 1);
        styVar.setStyle(Paint.Style.FILL);
        this.J = styVar;
        sty styVar2 = new sty(1, (byte) 2);
        styVar2.setStyle(Paint.Style.STROKE);
        this.K = styVar2;
        this.L = new HashMap();
        this.M = new u710((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = bb10Var;
        this.R = y5zVar.b;
        e4d e4dVar = new e4d((List) y5zVar.q.b, (byte) 2);
        this.P = e4dVar;
        e4dVar.a(this);
        f(e4dVar);
        xr xrVar = y5zVar.r;
        if (xrVar != null && (gr00Var5 = (gr00) xrVar.f41344a) != null && (u33Var6 = (u33) gr00Var5.f11760a) != null) {
            sz5 sz5VarF0 = u33Var6.f0();
            this.T = (e4d) sz5VarF0;
            sz5VarF0.a(this);
            f(sz5VarF0);
        }
        if (xrVar != null && (gr00Var4 = (gr00) xrVar.f41344a) != null && (u33Var5 = (u33) gr00Var4.b) != null) {
            sz5 sz5VarF1 = u33Var5.f0();
            this.V = (e4d) sz5VarF1;
            sz5VarF1.a(this);
            f(sz5VarF1);
        }
        if (xrVar != null && (gr00Var3 = (gr00) xrVar.f41344a) != null && (v33Var2 = (v33) gr00Var3.c) != null) {
            hlq hlqVarF0 = v33Var2.f0();
            this.X = hlqVarF0;
            hlqVarF0.a(this);
            f(hlqVarF0);
        }
        if (xrVar != null && (gr00Var2 = (gr00) xrVar.f41344a) != null && (v33Var = (v33) gr00Var2.d) != null) {
            hlq hlqVarF1 = v33Var.f0();
            this.Z = hlqVarF1;
            hlqVarF1.a(this);
            f(hlqVarF1);
        }
        if (xrVar != null && (gr00Var = (gr00) xrVar.f41344a) != null && (u33Var4 = (u33) gr00Var.e) != null) {
            sz5 sz5VarF2 = u33Var4.f0();
            this.b0 = (e4d) sz5VarF2;
            sz5VarF2.a(this);
            f(sz5VarF2);
        }
        if (xrVar != null && (sbx0Var4 = (sbx0) xrVar.b) != null && (u33Var3 = (u33) sbx0Var4.c) != null) {
            sz5 sz5VarF3 = u33Var3.f0();
            this.e0 = (e4d) sz5VarF3;
            sz5VarF3.a(this);
            f(sz5VarF3);
        }
        if (xrVar != null && (sbx0Var3 = (sbx0) xrVar.b) != null && (u33Var2 = (u33) sbx0Var3.d) != null) {
            sz5 sz5VarF4 = u33Var2.f0();
            this.f0 = (e4d) sz5VarF4;
            sz5VarF4.a(this);
            f(sz5VarF4);
        }
        if (xrVar != null && (sbx0Var2 = (sbx0) xrVar.b) != null && (u33Var = (u33) sbx0Var2.e) != null) {
            sz5 sz5VarF5 = u33Var.f0();
            this.g0 = (e4d) sz5VarF5;
            sz5VarF5.a(this);
            f(sz5VarF5);
        }
        if (xrVar == null || (sbx0Var = (sbx0) xrVar.b) == null) {
            return;
        }
        this.S = sbx0Var.b;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // a.tz5, a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        fa10 fa10Var = this.R;
        rectF.set(0.0f, 0.0f, fa10Var.k.width(), fa10Var.k.height());
    }

    @Override // a.tz5, a.uky
    public final void g(zn00 zn00Var, Object obj) {
        super.g(zn00Var, obj);
        PointF pointF = nb10.f23218a;
        if (obj == 1) {
            h2u0 h2u0Var = this.U;
            if (h2u0Var != null) {
                o(h2u0Var);
            }
            h2u0 h2u0Var2 = new h2u0(zn00Var, null);
            this.U = h2u0Var2;
            h2u0Var2.a(this);
            f(this.U);
            return;
        }
        if (obj == 2) {
            h2u0 h2u0Var3 = this.W;
            if (h2u0Var3 != null) {
                o(h2u0Var3);
            }
            h2u0 h2u0Var4 = new h2u0(zn00Var, null);
            this.W = h2u0Var4;
            h2u0Var4.a(this);
            f(this.W);
            return;
        }
        if (obj == nb10.q) {
            h2u0 h2u0Var5 = this.Y;
            if (h2u0Var5 != null) {
                o(h2u0Var5);
            }
            h2u0 h2u0Var6 = new h2u0(zn00Var, null);
            this.Y = h2u0Var6;
            h2u0Var6.a(this);
            f(this.Y);
            return;
        }
        if (obj == nb10.r) {
            h2u0 h2u0Var7 = this.a0;
            if (h2u0Var7 != null) {
                o(h2u0Var7);
            }
            h2u0 h2u0Var8 = new h2u0(zn00Var, null);
            this.a0 = h2u0Var8;
            h2u0Var8.a(this);
            f(this.a0);
            return;
        }
        if (obj == nb10.D) {
            h2u0 h2u0Var9 = this.c0;
            if (h2u0Var9 != null) {
                o(h2u0Var9);
            }
            h2u0 h2u0Var10 = new h2u0(zn00Var, null);
            this.c0 = h2u0Var10;
            h2u0Var10.a(this);
            f(this.c0);
            return;
        }
        if (obj != nb10.K) {
            if (obj == nb10.M) {
                e4d e4dVar = this.P;
                e4dVar.getClass();
                e4dVar.j(new s8q0(new gb10(), zn00Var, new uxk()));
                return;
            }
            return;
        }
        h2u0 h2u0Var11 = this.d0;
        if (h2u0Var11 != null) {
            o(h2u0Var11);
        }
        h2u0 h2u0Var12 = new h2u0(zn00Var, null);
        this.d0 = h2u0Var12;
        h2u0Var12.a(this);
        f(this.d0);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0360  */
    /* JADX WARN: Code duplicated, block: B:103:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0365  */
    /* JADX WARN: Code duplicated, block: B:105:0x0368  */
    /* JADX WARN: Code duplicated, block: B:109:0x0370  */
    /* JADX WARN: Code duplicated, block: B:111:0x0378  */
    /* JADX WARN: Code duplicated, block: B:129:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:131:0x0405  */
    /* JADX WARN: Code duplicated, block: B:132:0x0407  */
    /* JADX WARN: Code duplicated, block: B:136:0x041a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0433  */
    /* JADX WARN: Code duplicated, block: B:140:0x044a  */
    /* JADX WARN: Code duplicated, block: B:142:0x045f A[LOOP:7: B:141:0x045d->B:142:0x045f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0481  */
    /* JADX WARN: Code duplicated, block: B:147:0x049f  */
    /* JADX WARN: Code duplicated, block: B:148:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:151:0x04b3 A[LOOP:9: B:149:0x04ad->B:151:0x04b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x04e8 A[LOOP:10: B:157:0x04e2->B:159:0x04e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0513  */
    /* JADX WARN: Code duplicated, block: B:169:0x0520  */
    /* JADX WARN: Code duplicated, block: B:172:0x0536 A[LOOP:13: B:167:0x051a->B:172:0x0536, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x054e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0555  */
    /* JADX WARN: Code duplicated, block: B:179:0x056f  */
    /* JADX WARN: Code duplicated, block: B:205:0x053c A[EDGE_INSN: B:205:0x053c->B:173:0x053c BREAK  A[LOOP:12: B:164:0x050d->B:171:0x052d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:29:0x0104  */
    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123  */
    /* JADX WARN: Code duplicated, block: B:36:0x0142  */
    /* JADX WARN: Code duplicated, block: B:37:0x0154  */
    /* JADX WARN: Code duplicated, block: B:39:0x015f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0170  */
    /* JADX WARN: Code duplicated, block: B:42:0x0187 A[LOOP:4: B:41:0x0185->B:42:0x0187, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0250  */
    /* JADX WARN: Code duplicated, block: B:78:0x02de  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0311  */
    /* JADX WARN: Code duplicated, block: B:90:0x0314  */
    /* JADX WARN: Code duplicated, block: B:92:0x0320  */
    /* JADX WARN: Code duplicated, block: B:93:0x0325  */
    /* JADX WARN: Code duplicated, block: B:95:0x0329  */
    /* JADX WARN: Code duplicated, block: B:96:0x032d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.tz5
    public final void k(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        int i2;
        kki kkiVar;
        String str;
        Typeface typefaceCreateFromAsset;
        rd9 rd9Var;
        HashMap map;
        Typeface typeface;
        HashMap map2;
        Typeface typeface2;
        Typeface typeface3;
        boolean zContains;
        boolean zContains2;
        int i3;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i4;
        int length;
        int i5;
        PointF pointF;
        float f;
        float f2;
        int i6;
        List listZ;
        int i7;
        w8q0 w8q0Var;
        int i8;
        String string;
        ArrayList arrayList;
        int length2;
        int i9;
        StringBuilder sb;
        int i10;
        String string2;
        String str2;
        int i11;
        ArrayList arrayList2;
        Bidi bidi;
        int runCount;
        byte[] bArr;
        Integer[] numArr;
        int i12;
        StringBuilder sb2;
        int i13;
        int runLevel;
        String strSubstring;
        StringBuilder sb3;
        int length3;
        Canvas canvas2;
        float fFloatValue2;
        float f3;
        int i14;
        int i15;
        PointF pointF2;
        float f4;
        float f5;
        List listZ2;
        int i16;
        w8q0 w8q0Var2;
        String str3;
        int i17;
        float f6;
        fa10 fa10Var;
        krq krqVar;
        HashMap map3;
        ArrayList arrayList3;
        int size2;
        ArrayList arrayList4;
        int i18;
        List list;
        int i19;
        sty styVar;
        sty styVar2;
        Path pathC;
        sty styVar3;
        sty styVar4;
        uxk uxkVar = (uxk) this.P.e();
        fa10 fa10Var2 = this.R;
        irq irqVar = (irq) fa10Var2.f.get(uxkVar.b);
        if (irqVar == null) {
            return;
        }
        String str4 = irqVar.c;
        String str5 = irqVar.f15272a;
        canvas.save();
        canvas.concat(matrix);
        t(uxkVar, i, 0);
        bb10 bb10Var = this.Q;
        Map map4 = bb10Var.j;
        String str6 = Separators.RETURN;
        hlq hlqVar = this.Z;
        int i20 = 0;
        sty styVar5 = this.J;
        sty styVar6 = this.K;
        if (map4 == null) {
            i2 = 2;
            if (bb10Var.f2286a.h.c > 0) {
                h2u0 h2u0Var = this.c0;
                float fFloatValue3 = h2u0Var != null ? ((Float) h2u0Var.e()).floatValue() : uxkVar.c;
                float f7 = 0.0f;
                float[] fArr = (float[]) cut0.e.get();
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f8 = cut0.f;
                fArr[2] = f8;
                fArr[3] = f8;
                float f9 = fFloatValue3 / 100.0f;
                matrix.mapPoints(fArr);
                sty styVar7 = styVar5;
                bb10 bb10Var2 = bb10Var;
                fa10 fa10Var3 = fa10Var2;
                String str7 = str4;
                Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
                List listAsList2 = Arrays.asList(uxkVar.f36444a.replaceAll(Separators.NEWLINE, "\r").replaceAll("\u0003", "\r").replaceAll(Separators.RETURN, "\r").split("\r"));
                int size3 = listAsList2.size();
                float f10 = uxkVar.e / 10.0f;
                h2u0 h2u0Var2 = this.a0;
                if (h2u0Var2 != null) {
                    fFloatValue2 = ((Float) h2u0Var2.e()).floatValue();
                } else {
                    if (hlqVar != null) {
                        fFloatValue2 = ((Float) hlqVar.e()).floatValue();
                    }
                    f3 = f10;
                    i14 = 0;
                    i15 = -1;
                    while (i14 < size3) {
                        String str8 = (String) listAsList2.get(i14);
                        pointF2 = uxkVar.m;
                        if (pointF2 == null) {
                            f4 = f7;
                        } else {
                            f4 = pointF2.x;
                        }
                        f5 = f9;
                        i16 = i20;
                        for (listZ2 = z(str8, f4, irqVar, f5, f3, true); i16 < listZ2.size(); listZ2 = listZ2) {
                            w8q0Var2 = (w8q0) listZ2.get(i16);
                            i15++;
                            canvas.save();
                            if (y(canvas, uxkVar, i15, w8q0Var2.b)) {
                                str3 = w8q0Var2.f38736a;
                                i17 = i20;
                                while (i17 < str3.length()) {
                                    List list2 = listAsList2;
                                    String str9 = str7;
                                    int iA = krq.a(str3.charAt(i17), str5, str9);
                                    int i21 = i16;
                                    f6 = f3;
                                    fa10Var = fa10Var3;
                                    gnk0 gnk0Var = fa10Var.h;
                                    gnk0Var.getClass();
                                    krqVar = (krq) j2e.L(gnk0Var, iA);
                                    if (krqVar == null) {
                                        fa10Var3 = fa10Var;
                                        str3 = str3;
                                        size3 = size3;
                                        i14 = i14;
                                        i17 = i17;
                                        styVar = styVar6;
                                        bb10Var2 = bb10Var2;
                                        styVar2 = styVar7;
                                    } else {
                                        t(uxkVar, i, i17);
                                        map3 = this.L;
                                        if (map3.containsKey(krqVar)) {
                                            list = (List) map3.get(krqVar);
                                        } else {
                                            arrayList3 = krqVar.f18779a;
                                            size2 = arrayList3.size();
                                            arrayList4 = new ArrayList(size2);
                                            i18 = i20;
                                            while (i18 < size2) {
                                                arrayList4.add(new dee(bb10Var2, this, (ikj0) arrayList3.get(i18), fa10Var));
                                                size2 = size2;
                                                i18++;
                                                arrayList3 = arrayList3;
                                            }
                                            map3.put(krqVar, arrayList4);
                                            list = arrayList4;
                                        }
                                        i19 = i20;
                                        while (i19 < list.size()) {
                                            pathC = ((dee) list.get(i19)).c();
                                            fa10 fa10Var4 = fa10Var;
                                            pathC.computeBounds(this.H, i20);
                                            Matrix matrix2 = this.I;
                                            matrix2.reset();
                                            List list3 = list;
                                            matrix2.preTranslate(f7, (-uxkVar.g) * cut0.c());
                                            matrix2.preScale(f5, f5);
                                            pathC.transform(matrix2);
                                            if (uxkVar.k) {
                                                styVar4 = styVar7;
                                                v(pathC, styVar4, canvas);
                                                styVar3 = styVar6;
                                                v(pathC, styVar3, canvas);
                                            } else {
                                                styVar3 = styVar6;
                                                styVar4 = styVar7;
                                                v(pathC, styVar3, canvas);
                                                v(pathC, styVar4, canvas);
                                            }
                                            i19++;
                                            styVar6 = styVar3;
                                            styVar7 = styVar4;
                                            list = list3;
                                            fa10Var = fa10Var4;
                                            i20 = 0;
                                            f7 = 0.0f;
                                        }
                                        fa10Var3 = fa10Var;
                                        styVar = styVar6;
                                        styVar2 = styVar7;
                                        canvas.translate((cut0.c() * ((float) krqVar.c) * f5) + f6, 0.0f);
                                    }
                                    f3 = f6;
                                    styVar6 = styVar;
                                    str7 = str9;
                                    styVar7 = styVar2;
                                    bb10Var2 = bb10Var2;
                                    i16 = i21;
                                    listAsList2 = list2;
                                    str3 = str3;
                                    i14 = i14;
                                    size3 = size3;
                                    i20 = 0;
                                    f7 = 0.0f;
                                    i17++;
                                }
                            }
                            int i22 = i16;
                            float f11 = f3;
                            List list4 = listAsList2;
                            int i23 = size3;
                            int i24 = i14;
                            sty styVar8 = styVar6;
                            bb10 bb10Var3 = bb10Var2;
                            sty styVar9 = styVar7;
                            String str10 = str7;
                            canvas.restore();
                            f3 = f11;
                            styVar6 = styVar8;
                            str7 = str10;
                            styVar7 = styVar9;
                            bb10Var2 = bb10Var3;
                            listAsList2 = list4;
                            i14 = i24;
                            size3 = i23;
                            i20 = 0;
                            f7 = 0.0f;
                            i16 = i22 + 1;
                        }
                        f9 = f5;
                        listAsList2 = listAsList2;
                        i20 = 0;
                        f7 = 0.0f;
                        i14++;
                    }
                    canvas2 = canvas;
                }
                f10 += fFloatValue2;
                f3 = f10;
                i14 = 0;
                i15 = -1;
                while (i14 < size3) {
                    String str11 = (String) listAsList2.get(i14);
                    pointF2 = uxkVar.m;
                    if (pointF2 == null) {
                        f4 = f7;
                    } else {
                        f4 = pointF2.x;
                    }
                    f5 = f9;
                    i16 = i20;
                    while (i16 < listZ2.size()) {
                        w8q0Var2 = (w8q0) listZ2.get(i16);
                        i15++;
                        canvas.save();
                        if (y(canvas, uxkVar, i15, w8q0Var2.b)) {
                            str3 = w8q0Var2.f38736a;
                            i17 = i20;
                            while (i17 < str3.length()) {
                                List list5 = listAsList2;
                                String str12 = str7;
                                int iA2 = krq.a(str3.charAt(i17), str5, str12);
                                int i25 = i16;
                                f6 = f3;
                                fa10Var = fa10Var3;
                                gnk0 gnk0Var2 = fa10Var.h;
                                gnk0Var2.getClass();
                                krqVar = (krq) j2e.L(gnk0Var2, iA2);
                                if (krqVar == null) {
                                    fa10Var3 = fa10Var;
                                    str3 = str3;
                                    size3 = size3;
                                    i14 = i14;
                                    i17 = i17;
                                    styVar = styVar6;
                                    bb10Var2 = bb10Var2;
                                    styVar2 = styVar7;
                                } else {
                                    t(uxkVar, i, i17);
                                    map3 = this.L;
                                    if (map3.containsKey(krqVar)) {
                                        list = (List) map3.get(krqVar);
                                    } else {
                                        arrayList3 = krqVar.f18779a;
                                        size2 = arrayList3.size();
                                        arrayList4 = new ArrayList(size2);
                                        i18 = i20;
                                        while (i18 < size2) {
                                            arrayList4.add(new dee(bb10Var2, this, (ikj0) arrayList3.get(i18), fa10Var));
                                            size2 = size2;
                                            i18++;
                                            arrayList3 = arrayList3;
                                        }
                                        map3.put(krqVar, arrayList4);
                                        list = arrayList4;
                                    }
                                    i19 = i20;
                                    while (i19 < list.size()) {
                                        pathC = ((dee) list.get(i19)).c();
                                        fa10 fa10Var5 = fa10Var;
                                        pathC.computeBounds(this.H, i20);
                                        Matrix matrix3 = this.I;
                                        matrix3.reset();
                                        List list6 = list;
                                        matrix3.preTranslate(f7, (-uxkVar.g) * cut0.c());
                                        matrix3.preScale(f5, f5);
                                        pathC.transform(matrix3);
                                        if (uxkVar.k) {
                                            styVar4 = styVar7;
                                            v(pathC, styVar4, canvas);
                                            styVar3 = styVar6;
                                            v(pathC, styVar3, canvas);
                                        } else {
                                            styVar3 = styVar6;
                                            styVar4 = styVar7;
                                            v(pathC, styVar3, canvas);
                                            v(pathC, styVar4, canvas);
                                        }
                                        i19++;
                                        styVar6 = styVar3;
                                        styVar7 = styVar4;
                                        list = list6;
                                        fa10Var = fa10Var5;
                                        i20 = 0;
                                        f7 = 0.0f;
                                    }
                                    fa10Var3 = fa10Var;
                                    styVar = styVar6;
                                    styVar2 = styVar7;
                                    canvas.translate((cut0.c() * ((float) krqVar.c) * f5) + f6, 0.0f);
                                }
                                f3 = f6;
                                styVar6 = styVar;
                                str7 = str12;
                                styVar7 = styVar2;
                                bb10Var2 = bb10Var2;
                                i16 = i25;
                                listAsList2 = list5;
                                str3 = str3;
                                i14 = i14;
                                size3 = size3;
                                i20 = 0;
                                f7 = 0.0f;
                                i17++;
                            }
                        }
                        int i26 = i16;
                        float f12 = f3;
                        List list7 = listAsList2;
                        int i27 = size3;
                        int i28 = i14;
                        sty styVar10 = styVar6;
                        bb10 bb10Var4 = bb10Var2;
                        sty styVar11 = styVar7;
                        String str13 = str7;
                        canvas.restore();
                        f3 = f12;
                        styVar6 = styVar10;
                        str7 = str13;
                        styVar7 = styVar11;
                        bb10Var2 = bb10Var4;
                        listAsList2 = list7;
                        i14 = i28;
                        size3 = i27;
                        i20 = 0;
                        f7 = 0.0f;
                        i16 = i26 + 1;
                    }
                    f9 = f5;
                    listAsList2 = listAsList2;
                    i20 = 0;
                    f7 = 0.0f;
                    i14++;
                }
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        i2 = 2;
        h2u0 h2u0Var3 = this.d0;
        if (h2u0Var3 == null || (typefaceCreateFromAsset = (Typeface) h2u0Var3.e()) == null) {
            Map map5 = bb10Var.j;
            if (map5 == null) {
                if (bb10Var.getCallback() == null) {
                    kkiVar = null;
                } else {
                    kkiVar = bb10Var.i;
                    if (kkiVar == null) {
                        kkiVar = new kki(bb10Var.getCallback());
                        bb10Var.i = kkiVar;
                        str = bb10Var.k;
                        if (str != null) {
                            kkiVar.f = str;
                        }
                    }
                }
                if (kkiVar != null) {
                    rd9Var = (rd9) kkiVar.e;
                    rd9Var.b = str5;
                    rd9Var.c = str4;
                    map = (HashMap) kkiVar.b;
                    typeface = (Typeface) map.get(rd9Var);
                    if (typeface != null) {
                        typefaceCreateFromAsset = typeface;
                        str6 = Separators.RETURN;
                    } else {
                        map2 = (HashMap) kkiVar.c;
                        typeface2 = (Typeface) map2.get(str5);
                        if (typeface2 != null) {
                            typefaceCreateFromAsset = typeface2;
                        } else {
                            typeface3 = irqVar.d;
                            if (typeface3 != null) {
                                typefaceCreateFromAsset = typeface3;
                            } else {
                                StringBuilder sbT = brm0.t("fonts/", str5);
                                sbT.append((String) kkiVar.f);
                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) kkiVar.d, sbT.toString());
                                map2.put(str5, typefaceCreateFromAsset);
                            }
                        }
                        zContains = str4.contains("Italic");
                        zContains2 = str4.contains("Bold");
                        if (!zContains && zContains2) {
                            i3 = 3;
                        } else if (zContains) {
                            i3 = i2;
                        } else if (zContains2) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i3) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                        }
                        map.put(rd9Var, typefaceCreateFromAsset);
                    }
                } else {
                    str6 = Separators.RETURN;
                    typefaceCreateFromAsset = null;
                }
            } else {
                if (map5.containsKey(str5)) {
                    typefaceCreateFromAsset = (Typeface) map5.get(str5);
                } else {
                    String str14 = irqVar.b;
                    if (map5.containsKey(str14)) {
                        typefaceCreateFromAsset = (Typeface) map5.get(str14);
                    } else {
                        String strQ = w6x.q(str5, "-", str4);
                        if (map5.containsKey(strQ)) {
                            typefaceCreateFromAsset = (Typeface) map5.get(strQ);
                        } else {
                            if (bb10Var.getCallback() == null) {
                                kkiVar = null;
                            } else {
                                kkiVar = bb10Var.i;
                                if (kkiVar == null) {
                                    kkiVar = new kki(bb10Var.getCallback());
                                    bb10Var.i = kkiVar;
                                    str = bb10Var.k;
                                    if (str != null) {
                                        kkiVar.f = str;
                                    }
                                }
                            }
                            if (kkiVar != null) {
                                rd9Var = (rd9) kkiVar.e;
                                rd9Var.b = str5;
                                rd9Var.c = str4;
                                map = (HashMap) kkiVar.b;
                                typeface = (Typeface) map.get(rd9Var);
                                if (typeface != null) {
                                    typefaceCreateFromAsset = typeface;
                                } else {
                                    map2 = (HashMap) kkiVar.c;
                                    typeface2 = (Typeface) map2.get(str5);
                                    if (typeface2 != null) {
                                        typefaceCreateFromAsset = typeface2;
                                    } else {
                                        typeface3 = irqVar.d;
                                        if (typeface3 != null) {
                                            typefaceCreateFromAsset = typeface3;
                                        } else {
                                            StringBuilder sbT2 = brm0.t("fonts/", str5);
                                            sbT2.append((String) kkiVar.f);
                                            typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) kkiVar.d, sbT2.toString());
                                            map2.put(str5, typefaceCreateFromAsset);
                                        }
                                    }
                                    zContains = str4.contains("Italic");
                                    zContains2 = str4.contains("Bold");
                                    if (!zContains) {
                                        if (zContains) {
                                            i3 = i2;
                                        } else if (zContains2) {
                                            i3 = 1;
                                        } else {
                                            i3 = 0;
                                        }
                                    } else if (zContains) {
                                        i3 = i2;
                                    } else if (zContains2) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    if (typefaceCreateFromAsset.getStyle() != i3) {
                                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                                    }
                                    map.put(rd9Var, typefaceCreateFromAsset);
                                }
                            } else {
                                str6 = Separators.RETURN;
                                typefaceCreateFromAsset = null;
                            }
                        }
                    }
                }
                str6 = Separators.RETURN;
            }
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = irqVar.d;
            }
        } else {
            str6 = Separators.RETURN;
        }
        if (typefaceCreateFromAsset != null) {
            String str15 = uxkVar.f36444a;
            styVar5.setTypeface(typefaceCreateFromAsset);
            h2u0 h2u0Var4 = this.c0;
            float fFloatValue4 = h2u0Var4 != null ? ((Float) h2u0Var4.e()).floatValue() : uxkVar.c;
            styVar5.setTextSize(cut0.c() * fFloatValue4);
            styVar6.setTypeface(styVar5.getTypeface());
            styVar6.setTextSize(styVar5.getTextSize());
            float f13 = uxkVar.e / 10.0f;
            h2u0 h2u0Var5 = this.a0;
            if (h2u0Var5 != null) {
                fFloatValue = ((Float) h2u0Var5.e()).floatValue();
            } else {
                if (hlqVar != null) {
                    fFloatValue = ((Float) hlqVar.e()).floatValue();
                }
                fC = ((cut0.c() * f13) * fFloatValue4) / 100.0f;
                listAsList = Arrays.asList(str15.replaceAll(Separators.NEWLINE, "\r").replaceAll("\u0003", "\r").replaceAll(str6, "\r").split("\r"));
                size = listAsList.size();
                i4 = 0;
                length = 0;
                i5 = -1;
                while (i4 < size) {
                    String str16 = (String) listAsList.get(i4);
                    pointF = uxkVar.m;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    f2 = fC;
                    i6 = i2;
                    i7 = 0;
                    for (listZ = z(str16, f, irqVar, 0.0f, f2, false); i7 < listZ.size(); listZ = listZ) {
                        w8q0Var = (w8q0) listZ.get(i7);
                        i5++;
                        canvas.save();
                        if (y(canvas, uxkVar, i5, styVar5.measureText(w8q0Var.f38736a))) {
                            string = w8q0Var.f38736a;
                            if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                                bidi = new Bidi(string, -2);
                                runCount = bidi.getRunCount();
                                bArr = new byte[runCount];
                                numArr = new Integer[runCount];
                                i12 = 0;
                                while (i12 < runCount) {
                                    bArr[i12] = (byte) bidi.getRunLevel(i12);
                                    numArr[i12] = Integer.valueOf(i12);
                                    i12++;
                                    size = size;
                                }
                                i8 = size;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                sb2 = this.F;
                                sb2.setLength(0);
                                i13 = 0;
                                while (i13 < runCount) {
                                    int iIntValue = numArr[i13].intValue();
                                    int i29 = runCount;
                                    int runStart = bidi.getRunStart(iIntValue);
                                    Integer[] numArr2 = numArr;
                                    int runLimit = bidi.getRunLimit(iIntValue);
                                    runLevel = bidi.getRunLevel(iIntValue);
                                    strSubstring = string.substring(runStart, runLimit);
                                    if ((runLevel & 1) == 0) {
                                        sb2.append(strSubstring);
                                    } else {
                                        sb3 = this.G;
                                        length3 = 0;
                                        sb3.setLength(0);
                                        while (length3 < strSubstring.length()) {
                                            String strS = s(length3, strSubstring);
                                            sb3.insert(0, strS);
                                            length3 += strS.length();
                                            strSubstring = strSubstring;
                                        }
                                        sb2.append((CharSequence) sb3);
                                    }
                                    i13++;
                                    runCount = i29;
                                    numArr = numArr2;
                                    bidi = bidi;
                                }
                                string = sb2.toString();
                            } else {
                                i8 = size;
                            }
                            arrayList = this.N;
                            arrayList.clear();
                            length2 = 0;
                            while (length2 < string.length()) {
                                String strS2 = s(length2, string);
                                arrayList.add(strS2);
                                length2 += strS2.length();
                            }
                            i9 = 0;
                            while (i9 < arrayList.size()) {
                                sb = this.E;
                                sb.setLength(0);
                                sb.append((String) arrayList.get(i9));
                                i10 = i9 + 1;
                                while (i10 < arrayList.size()) {
                                    str2 = (String) arrayList.get(i10);
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < str2.length()) {
                                            break;
                                        }
                                        arrayList2 = arrayList;
                                        if (Character.getDirectionality(str2.codePointAt(i11)) == 2) {
                                            break;
                                        }
                                        i11++;
                                        arrayList = arrayList2;
                                    }
                                    sb.insert(0, str2);
                                    i10++;
                                    arrayList = arrayList2;
                                }
                                ArrayList arrayList5 = arrayList;
                                string2 = sb.toString();
                                t(uxkVar, i, i9 + length);
                                if (uxkVar.k) {
                                    u(string2, styVar5, canvas);
                                    u(string2, styVar6, canvas);
                                } else {
                                    u(string2, styVar6, canvas);
                                    u(string2, styVar5, canvas);
                                }
                                canvas.translate(styVar5.measureText(string2) + f2, 0.0f);
                                i9 = i10;
                                arrayList = arrayList5;
                            }
                        } else {
                            f2 = f2;
                            listAsList = listAsList;
                            i8 = size;
                        }
                        length += w8q0Var.f38736a.length();
                        canvas.restore();
                        i7++;
                        irqVar = irqVar;
                        i6 = 2;
                        f2 = f2;
                        listAsList = listAsList;
                        size = i8;
                    }
                    i4++;
                    irqVar = irqVar;
                    i2 = i6;
                    fC = f2;
                    size = size;
                }
            }
            f13 += fFloatValue;
            fC = ((cut0.c() * f13) * fFloatValue4) / 100.0f;
            listAsList = Arrays.asList(str15.replaceAll(Separators.NEWLINE, "\r").replaceAll("\u0003", "\r").replaceAll(str6, "\r").split("\r"));
            size = listAsList.size();
            i4 = 0;
            length = 0;
            i5 = -1;
            while (i4 < size) {
                String str17 = (String) listAsList.get(i4);
                pointF = uxkVar.m;
                if (pointF == null) {
                    f = 0.0f;
                } else {
                    f = pointF.x;
                }
                f2 = fC;
                i6 = i2;
                i7 = 0;
                while (i7 < listZ.size()) {
                    w8q0Var = (w8q0) listZ.get(i7);
                    i5++;
                    canvas.save();
                    if (y(canvas, uxkVar, i5, styVar5.measureText(w8q0Var.f38736a))) {
                        string = w8q0Var.f38736a;
                        if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                            bidi = new Bidi(string, -2);
                            runCount = bidi.getRunCount();
                            bArr = new byte[runCount];
                            numArr = new Integer[runCount];
                            i12 = 0;
                            while (i12 < runCount) {
                                bArr[i12] = (byte) bidi.getRunLevel(i12);
                                numArr[i12] = Integer.valueOf(i12);
                                i12++;
                                size = size;
                            }
                            i8 = size;
                            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                            sb2 = this.F;
                            sb2.setLength(0);
                            i13 = 0;
                            while (i13 < runCount) {
                                int iIntValue2 = numArr[i13].intValue();
                                int i210 = runCount;
                                int runStart2 = bidi.getRunStart(iIntValue2);
                                Integer[] numArr3 = numArr;
                                int runLimit2 = bidi.getRunLimit(iIntValue2);
                                runLevel = bidi.getRunLevel(iIntValue2);
                                strSubstring = string.substring(runStart2, runLimit2);
                                if ((runLevel & 1) == 0) {
                                    sb2.append(strSubstring);
                                } else {
                                    sb3 = this.G;
                                    length3 = 0;
                                    sb3.setLength(0);
                                    while (length3 < strSubstring.length()) {
                                        String strS3 = s(length3, strSubstring);
                                        sb3.insert(0, strS3);
                                        length3 += strS3.length();
                                        strSubstring = strSubstring;
                                    }
                                    sb2.append((CharSequence) sb3);
                                }
                                i13++;
                                runCount = i210;
                                numArr = numArr3;
                                bidi = bidi;
                            }
                            string = sb2.toString();
                        } else {
                            i8 = size;
                        }
                        arrayList = this.N;
                        arrayList.clear();
                        length2 = 0;
                        while (length2 < string.length()) {
                            String strS4 = s(length2, string);
                            arrayList.add(strS4);
                            length2 += strS4.length();
                        }
                        i9 = 0;
                        while (i9 < arrayList.size()) {
                            sb = this.E;
                            sb.setLength(0);
                            sb.append((String) arrayList.get(i9));
                            i10 = i9 + 1;
                            while (i10 < arrayList.size()) {
                                str2 = (String) arrayList.get(i10);
                                i11 = 0;
                                while (true) {
                                    if (i11 < str2.length()) {
                                        break;
                                        break;
                                    }
                                    arrayList2 = arrayList;
                                    if (Character.getDirectionality(str2.codePointAt(i11)) == 2) {
                                        break;
                                    }
                                    i11++;
                                    arrayList = arrayList2;
                                }
                                sb.insert(0, str2);
                                i10++;
                                arrayList = arrayList2;
                            }
                            ArrayList arrayList6 = arrayList;
                            string2 = sb.toString();
                            t(uxkVar, i, i9 + length);
                            if (uxkVar.k) {
                                u(string2, styVar5, canvas);
                                u(string2, styVar6, canvas);
                            } else {
                                u(string2, styVar6, canvas);
                                u(string2, styVar5, canvas);
                            }
                            canvas.translate(styVar5.measureText(string2) + f2, 0.0f);
                            i9 = i10;
                            arrayList = arrayList6;
                        }
                    } else {
                        f2 = f2;
                        listAsList = listAsList;
                        i8 = size;
                    }
                    length += w8q0Var.f38736a.length();
                    canvas.restore();
                    i7++;
                    irqVar = irqVar;
                    i6 = 2;
                    f2 = f2;
                    listAsList = listAsList;
                    size = i8;
                }
                i4++;
                irqVar = irqVar;
                i2 = i6;
                fC = f2;
                size = size;
            }
        }
        canvas2 = canvas;
        canvas2.restore();
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
    public final String s(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        u710 u710Var = this.M;
        if (u710Var.c(j) >= 0) {
            return (String) u710Var.b(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        u710Var.f(string, j);
        return string;
    }

    public final void t(uxk uxkVar, int i, int i2) {
        h2u0 h2u0Var = this.U;
        sty styVar = this.J;
        if (h2u0Var != null) {
            styVar.setColor(((Integer) h2u0Var.e()).intValue());
        } else {
            e4d e4dVar = this.T;
            if (e4dVar == null || !x(i2)) {
                styVar.setColor(uxkVar.h);
            } else {
                styVar.setColor(((Integer) e4dVar.e()).intValue());
            }
        }
        h2u0 h2u0Var2 = this.W;
        sty styVar2 = this.K;
        if (h2u0Var2 != null) {
            styVar2.setColor(((Integer) h2u0Var2.e()).intValue());
        } else {
            e4d e4dVar2 = this.V;
            if (e4dVar2 == null || !x(i2)) {
                styVar2.setColor(uxkVar.i);
            } else {
                styVar2.setColor(((Integer) e4dVar2.e()).intValue());
            }
        }
        sz5 sz5Var = this.w.p;
        int iIntValue = 100;
        int iIntValue2 = sz5Var == null ? 100 : ((Integer) sz5Var.e()).intValue();
        e4d e4dVar3 = this.b0;
        if (e4dVar3 != null && x(i2)) {
            iIntValue = ((Integer) e4dVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        styVar.setAlpha(iRound);
        styVar2.setAlpha(iRound);
        h2u0 h2u0Var3 = this.Y;
        if (h2u0Var3 != null) {
            styVar2.setStrokeWidth(((Float) h2u0Var3.e()).floatValue());
            return;
        }
        hlq hlqVar = this.X;
        if (hlqVar == null || !x(i2)) {
            styVar2.setStrokeWidth(cut0.c() * uxkVar.j);
        } else {
            styVar2.setStrokeWidth(((Float) hlqVar.e()).floatValue());
        }
    }

    public final w8q0 w(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            w8q0 w8q0Var = new w8q0();
            w8q0Var.f38736a = "";
            w8q0Var.b = 0.0f;
            arrayList.add(w8q0Var);
        }
        return (w8q0) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        e4d e4dVar;
        int length = ((uxk) this.P.e()).f36444a.length();
        e4d e4dVar2 = this.e0;
        if (e4dVar2 == null || (e4dVar = this.f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) e4dVar2.e()).intValue(), ((Integer) e4dVar.e()).intValue());
        int iMax = Math.max(((Integer) e4dVar2.e()).intValue(), ((Integer) e4dVar.e()).intValue());
        e4d e4dVar3 = this.g0;
        if (e4dVar3 != null) {
            int iIntValue = ((Integer) e4dVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean y(Canvas canvas, uxk uxkVar, int i, float f) {
        PointF pointF = uxkVar.l;
        PointF pointF2 = uxkVar.m;
        float fC = cut0.c();
        float f2 = (i * uxkVar.f * fC) + (pointF == null ? 0.0f : (uxkVar.f * fC) + pointF.y);
        if (this.Q.u && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + uxkVar.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iE = hne.E(uxkVar.d);
        if (iE == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iE == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iE != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List z(String str, float f, irq irqVar, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = krq.a(cCharAt, irqVar.f15272a, irqVar.c);
                gnk0 gnk0Var = this.R.h;
                gnk0Var.getClass();
                krq krqVar = (krq) j2e.L(gnk0Var, iA);
                if (krqVar != null) {
                    fMeasureText = (cut0.c() * ((float) krqVar.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                w8q0 w8q0VarW = w(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    w8q0VarW.f38736a = strTrim;
                    w8q0VarW.b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    w8q0VarW.f38736a = strTrim2;
                    w8q0VarW.b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            w8q0 w8q0VarW2 = w(i);
            w8q0VarW2.f38736a = str.substring(i2);
            w8q0VarW2.b = f4;
        }
        return this.O.subList(0, i);
    }
}
