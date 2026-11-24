package a;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ewf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f8522a;
    public final y3v b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public a8q0 j;
    public a9q0 k;
    public qe60 l;
    public jge0 n;
    public jge0 o;
    public final Object c = new Object();
    public Function1 m = ske.h;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = ui30.a();
    public final Matrix r = new Matrix();

    public ewf(AndroidComposeView androidComposeView, y3v y3vVar) {
        this.f8522a = androidComposeView;
        this.b = y3vVar;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        y3v y3vVar = this.b;
        a8z a8zVar = (a8z) y3vVar.c;
        InputMethodManager inputMethodManager = (InputMethodManager) a8zVar.getValue();
        View view = (View) y3vVar.b;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.m;
            float[] fArr = this.q;
            function1.invoke(new ui30(fArr));
            this.f8522a.q(fArr);
            Matrix matrix = this.r;
            tke.a0(matrix, fArr);
            a8q0 a8q0Var = this.j;
            a8q0Var.getClass();
            long j = a8q0Var.b;
            qe60 qe60Var = this.l;
            qe60Var.getClass();
            a9q0 a9q0Var = this.k;
            a9q0Var.getClass();
            bw40 bw40Var = a9q0Var.b;
            jge0 jge0Var = this.n;
            jge0Var.getClass();
            float f = jge0Var.d;
            float f2 = jge0Var.b;
            jge0 jge0Var2 = this.o;
            jge0Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder2 = this.p;
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
                boolean zH = f7k.H(jge0Var, fC, jge0VarC.b);
                boolean zH2 = f7k.H(jge0Var, fC, jge0VarC.d);
                boolean z5 = a9q0Var.a(iS) == xsf0.b;
                int i = (zH || zH2) ? 1 : 0;
                if (!zH || !zH2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = jge0VarC.b;
                float f4 = jge0VarC.d;
                builder2.setInsertionMarkerLocation(fC, f3, f4, f4, i);
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
                        float f5 = fArr2[i2];
                        float f6 = fArr2[i2 + 1];
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i3 = iE;
                        int i4 = (jge0Var.f16474a < f7 ? 1 : 0) & (f5 < jge0Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!f7k.H(jge0Var, f5, f6) || !f7k.H(jge0Var, f7, f8)) {
                            i4 |= 2;
                        }
                        if (a9q0Var.a(iS4) == xsf0.b) {
                            i4 |= 4;
                        }
                        int i5 = iF2;
                        builder3.addCharacterBounds(i5, f5, f6, f7, f8, i4);
                        builder = builder3;
                        iF2 = i5 + 1;
                        iE = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                f7.v(builder, jge0Var2);
            }
            if (i6 >= 34 && z4 && !jge0Var.j()) {
                int i7 = bw40Var.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iD = l1e0.d(bw40Var.e(f2), 0, i7);
                int iD2 = l1e0.d(bw40Var.e(f), 0, i7);
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
            ((InputMethodManager) a8zVar.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
