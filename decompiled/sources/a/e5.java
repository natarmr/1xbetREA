package a;

import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f5[] f7207a;
    public int b;
    public int c;
    public w6n0 d;

    public final f5 f() {
        f5 f5VarH;
        w6n0 w6n0Var;
        synchronized (this) {
            try {
                f5[] f5VarArrJ = this.f7207a;
                if (f5VarArrJ == null) {
                    f5VarArrJ = j();
                    this.f7207a = f5VarArrJ;
                } else if (this.b >= f5VarArrJ.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(f5VarArrJ, f5VarArrJ.length * 2);
                    this.f7207a = (f5[]) objArrCopyOf;
                    f5VarArrJ = (f5[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    f5VarH = f5VarArrJ[i];
                    if (f5VarH == null) {
                        f5VarH = h();
                        f5VarArrJ[i] = f5VarH;
                    }
                    i++;
                    if (i >= f5VarArrJ.length) {
                        i = 0;
                    }
                } while (!f5VarH.a(this));
                this.c = i;
                this.b++;
                w6n0Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (w6n0Var != null) {
            w6n0Var.z(1);
        }
        return f5VarH;
    }

    public f5 h() {
        return new r7m0();
    }

    public f5[] j() {
        return new r7m0[2];
    }

    public final void k(f5 f5Var) {
        w6n0 w6n0Var;
        int i;
        yje[] yjeVarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                w6n0Var = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                f5Var.getClass();
                yjeVarArrB = f5Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (yje yjeVar : yjeVarArrB) {
            if (yjeVar != null) {
                e0g0 e0g0Var = j0g0.b;
                yjeVar.resumeWith(Unit.f46060a);
            }
        }
        if (w6n0Var != null) {
            w6n0Var.z(-1);
        }
    }

    public final w6n0 l() {
        w6n0 w6n0Var;
        synchronized (this) {
            w6n0Var = this.d;
            if (w6n0Var == null) {
                int i = this.b;
                w6n0Var = new w6n0(1, Integer.MAX_VALUE, i99.b);
                w6n0Var.g(Integer.valueOf(i));
                this.d = w6n0Var;
            }
        }
        return w6n0Var;
    }
}
