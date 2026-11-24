package a;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class viz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d03 f37505a;
    public final xex b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public a8q0 j;
    public a9q0 k;
    public qe60 l;
    public jge0 m;
    public jge0 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = ui30.a();
    public final Matrix q = new Matrix();

    public viz(d03 d03Var, xex xexVar) {
        this.f37505a = d03Var;
        this.b = xexVar;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        xex xexVar = this.b;
        InputMethodManager inputMethodManagerD = xexVar.D();
        View view = (View) xexVar.f40764a;
        if (!inputMethodManagerD.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        ui30.d(fArr);
        j6z j6zVar = (j6z) ((hgk0) this.f37505a.f5251a.r).getValue();
        if (j6zVar != null) {
            if (!j6zVar.h()) {
                j6zVar = null;
            }
            if (j6zVar != null) {
                j6zVar.J(fArr);
            }
        }
        jge0 jge0Var = this.n;
        jge0Var.getClass();
        float f = -jge0Var.f16474a;
        jge0 jge0Var2 = this.n;
        jge0Var2.getClass();
        ui30.g(fArr, f, -jge0Var2.b);
        Matrix matrix = this.q;
        tke.a0(matrix, fArr);
        a8q0 a8q0Var = this.j;
        a8q0Var.getClass();
        long j = a8q0Var.b;
        qe60 qe60Var = this.l;
        qe60Var.getClass();
        a9q0 a9q0Var = this.k;
        a9q0Var.getClass();
        bw40 bw40Var = a9q0Var.b;
        jge0 jge0Var3 = this.m;
        jge0Var3.getClass();
        float f2 = jge0Var3.d;
        float f3 = jge0Var3.b;
        jge0 jge0Var4 = this.n;
        jge0Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder2 = this.o;
        builder2.reset();
        builder2.setMatrix(matrix);
        o9q0 o9q0Var = a8q0Var.c;
        int iF = o9q0.f(j);
        builder2.setSelectionRange(iF, o9q0.e(j));
        if (!z || iF < 0) {
            builder = builder2;
        } else {
            int iS = qe60Var.s(iF);
            jge0 jge0VarC = a9q0Var.c(iS);
            float fC = l1e0.c(jge0VarC.f16474a, 0.0f, (int) (a9q0Var.c >> 32));
            boolean zF = yyw.F(jge0Var3, fC, jge0VarC.b);
            boolean zF2 = yyw.F(jge0Var3, fC, jge0VarC.d);
            boolean z5 = a9q0Var.a(iS) == xsf0.b;
            int i = (zF || zF2) ? 1 : 0;
            if (!zF || !zF2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f4 = jge0VarC.b;
            float f5 = jge0VarC.d;
            builder2.setInsertionMarkerLocation(fC, f4, f5, f5, i);
            builder = builder2;
        }
        if (z2) {
            int iF2 = o9q0Var != null ? o9q0.f(o9q0Var.f24893a) : -1;
            int iE = o9q0Var != null ? o9q0.e(o9q0Var.f24893a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder.setComposingText(iF2, a8q0Var.f440a.b.subSequence(iF2, iE));
                int iS2 = qe60Var.s(iF2);
                int iS3 = qe60Var.s(iE);
                float[] fArr2 = new float[(iS3 - iS2) * 4];
                bw40Var.a(s7n0.e(iS2, iS3), fArr2);
                while (iF2 < iE) {
                    int iS4 = qe60Var.s(iF2);
                    int i2 = (iS4 - iS2) * 4;
                    float f6 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f7 = fArr2[i2 + 1];
                    int i3 = iE;
                    float f8 = fArr2[i2 + 2];
                    float f9 = fArr2[i2 + 3];
                    int i4 = iS2;
                    int i5 = (jge0Var3.f16474a < f8 ? 1 : 0) & (f6 < jge0Var3.c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!yyw.F(jge0Var3, f6, f7) || !yyw.F(jge0Var3, f8, f9)) {
                        i5 |= 2;
                    }
                    if (a9q0Var.a(iS4) == xsf0.b) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder = builder3;
                    iF2 = i6 + 1;
                    iE = i3;
                    iS2 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            f7.w(builder, jge0Var4);
        }
        if (i7 >= 34 && z4 && !jge0Var3.j()) {
            int i8 = bw40Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iD = l1e0.d(bw40Var.e(f3), 0, i8);
            int iD2 = l1e0.d(bw40Var.e(f2), 0, i8);
            if (iD <= iD2) {
                while (true) {
                    builder.addVisibleLineBounds(a9q0Var.g(iD), bw40Var.f(iD), a9q0Var.h(iD), bw40Var.b(iD));
                    if (iD == iD2) {
                        break;
                    } else {
                        iD++;
                    }
                }
            }
        }
        xexVar.D().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
