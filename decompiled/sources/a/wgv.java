package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wgv extends hwt0 {
    public float[] b;
    public w03 h;
    public Function1 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = y3d.g;
    public List f = q4u0.f28120a;
    public boolean g = true;
    public final t3t j = new t3t(this, 17);
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // a.hwt0
    public final void a(fhl fhlVar) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = ui30.a();
                this.b = fArrA;
            } else {
                ui30.d(fArrA);
            }
            ui30.g(fArrA, this.q + this.m, this.r + this.n);
            ui30.e(this.l, fArrA);
            float f = this.o;
            float f2 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f;
                fArrA[1] = fArrA[1] * f;
                fArrA[2] = fArrA[2] * f;
                fArrA[3] = fArrA[3] * f;
                fArrA[4] = fArrA[4] * f2;
                fArrA[5] = fArrA[5] * f2;
                fArrA[6] = fArrA[6] * f2;
                fArrA[7] = fArrA[7] * f2;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            ui30.g(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                w03 w03VarA = this.h;
                if (w03VarA == null) {
                    w03VarA = z03.a();
                    this.h = w03VarA;
                }
                tfx.L(this.f, w03VarA);
            }
            this.g = false;
        }
        nr nrVarA0 = fhlVar.A0();
        long jP = nrVarA0.p();
        nrVarA0.i().l();
        try {
            fvt0 fvt0Var = (fvt0) nrVarA0.b;
            float[] fArr = this.b;
            if (fArr != null) {
                ((nr) fvt0Var.f10231a).i().o(fArr);
            }
            w03 w03Var = this.h;
            if (!this.f.isEmpty() && w03Var != null) {
                fvt0Var.i(w03Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((hwt0) arrayList.get(i)).a(fhlVar);
            }
        } finally {
            defpackage.c.g(nrVarA0, jP);
        }
    }

    @Override // a.hwt0
    public final Function1 b() {
        return this.i;
    }

    @Override // a.hwt0
    public final void d(t3t t3tVar) {
        this.i = t3tVar;
    }

    public final void e(int i, hwt0 hwt0Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, hwt0Var);
        } else {
            arrayList.add(hwt0Var);
        }
        g(hwt0Var);
        hwt0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            iun iunVar = q4u0.f28120a;
            if (y3d.h(j2) == y3d.h(j) && y3d.g(j2) == y3d.g(j) && y3d.e(j2) == y3d.e(j)) {
                return;
            }
            this.d = false;
            this.e = y3d.g;
        }
    }

    public final void g(hwt0 hwt0Var) {
        if (!(hwt0Var instanceof a290)) {
            if (hwt0Var instanceof wgv) {
                wgv wgvVar = (wgv) hwt0Var;
                if (wgvVar.d && this.d) {
                    f(wgvVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = y3d.g;
                    return;
                }
            }
            return;
        }
        a290 a290Var = (a290) hwt0Var;
        t89 t89Var = a290Var.b;
        if (this.d && t89Var != null) {
            if (t89Var instanceof skk0) {
                f(((skk0) t89Var).f32354a);
            } else {
                this.d = false;
                this.e = y3d.g;
            }
        }
        t89 t89Var2 = a290Var.g;
        if (this.d && t89Var2 != null) {
            if (t89Var2 instanceof skk0) {
                f(((skk0) t89Var2).f32354a);
            } else {
                this.d = false;
                this.e = y3d.g;
            }
        }
    }

    public final void h(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ((hwt0) arrayList.get(i)).d(null);
                arrayList.remove(i);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hwt0 hwt0Var = (hwt0) arrayList.get(i);
            sb.append(Separators.HT);
            sb.append(hwt0Var.toString());
            sb.append(Separators.RETURN);
        }
        return sb.toString();
    }
}
