package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i88 extends lm40 implements v6z, qai0 {
    public Function1 o;

    public i88(Function1 function1) {
        this.o = function1;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS = pj30Var.S(j);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new op7(pu90VarS, this, (byte) 5));
    }

    @Override // a.qai0
    public final boolean e() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.o + Separators.RPAREN;
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        yjj0 yjj0Var;
        boolean z;
        s460 s460VarX = vcc.X(this, 2);
        if (s460VarX.o1) {
            yjj0Var = s460VarX.k1;
            z = s460VarX.n1;
        } else {
            uag0 uag0Var = i4w0.l;
            if (uag0Var == null) {
                i4w0.l = new uag0();
            } else {
                uag0Var.a();
            }
            uag0 uag0Var2 = i4w0.l;
            uag0Var2.getClass();
            uag0Var2.t = s460VarX.u.z;
            uag0Var2.r = n2x.Q(s460VarX.c);
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                this.o.invoke(uag0Var2);
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                yjj0Var = uag0Var2.o;
                z = uag0Var2.p;
            } catch (Throwable th) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th;
            }
        }
        if (z) {
            yai0.g(abi0Var, yjj0Var);
        }
    }
}
