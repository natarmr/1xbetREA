package a;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qn20 extends zx5 {
    public static final pn20 q = new pn20((byte) 0);
    public final ms2 o;
    public final m0k0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn20(androidx.fragment.app.e eVar, glz glzVar, ms2 ms2Var, m0k0 m0k0Var) {
        super(eVar, glzVar, q);
        eVar.getClass();
        glzVar.getClass();
        this.o = ms2Var;
        this.p = m0k0Var;
    }

    @Override // a.zx5, a.f5r
    public final boolean A(long j) {
        List list = ((yz3) this.n).f;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((fo7) it.next()).f9867a == j) {
                return true;
            }
        }
        return false;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        fo7 fo7Var = (fo7) G(i);
        boolean zD = Intrinsics.d(fo7Var, co7.b);
        m0k0 m0k0Var = this.p;
        ms2 ms2Var = this.o;
        if (zD) {
            jvj0.W1.getClass();
            ms2Var.getClass();
            m0k0Var.getClass();
            jvj0 jvj0Var = new jvj0();
            iiy[] iiyVarArr = jvj0.X1;
            jvj0Var.Q1.u(jvj0Var, iiyVarArr[0], ms2Var);
            jvj0Var.R1.u(jvj0Var, iiyVarArr[1], m0k0Var);
            return jvj0Var;
        }
        if (Intrinsics.d(fo7Var, zn7.b)) {
            h6c0.W1.getClass();
            ms2Var.getClass();
            m0k0Var.getClass();
            h6c0 h6c0Var = new h6c0();
            iiy[] iiyVarArr2 = h6c0.X1;
            h6c0Var.Q1.u(h6c0Var, iiyVarArr2[0], ms2Var);
            h6c0Var.R1.u(h6c0Var, iiyVarArr2[1], m0k0Var);
            return h6c0Var;
        }
        if (!Intrinsics.d(fo7Var, xn7.b)) {
            t9f.b();
            return null;
        }
        rw4.W1.getClass();
        ms2Var.getClass();
        m0k0Var.getClass();
        rw4 rw4Var = new rw4();
        iiy[] iiyVarArr3 = rw4.X1;
        rw4Var.Q1.u(rw4Var, iiyVarArr3[0], ms2Var);
        rw4Var.R1.u(rw4Var, iiyVarArr3[1], m0k0Var);
        return rw4Var;
    }

    @Override // a.zx5, a.f5r, a.yge0
    public final long e(int i) {
        return ((fo7) G(i)).f9867a;
    }
}
