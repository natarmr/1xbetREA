package a;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wm40 implements vlc, goc {
    public abstract kzj0 I();

    public abstract cr30 J(vzs0 vzs0Var);

    public cr30 K(vzs0 vzs0Var, cty ctyVar) {
        if (!vzs0Var.e()) {
            return new bfn0(l0(ctyVar), new xzs0(vzs0Var));
        }
        cr30 cr30VarL0 = l0(ctyVar);
        if (cr30VarL0 != null) {
            return cr30VarL0;
        }
        h1.s0(12);
        throw null;
    }

    public List M() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        llc.s0(18);
        throw null;
    }

    public cr30 U() {
        return br30.b;
    }

    public c8z f0() {
        throw new UnsupportedOperationException();
    }

    public Collection g() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        f0o.s0(16);
        throw null;
    }

    public tek getVisibility() {
        tek tekVar = uek.e;
        if (tekVar != null) {
            return tekVar;
        }
        llc.s0(17);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    public abstract cr30 j0();

    public cr30 k0() {
        rek.h(oek.c(this));
        cr30 cr30VarL0 = l0(cty.b0);
        if (cr30VarL0 != null) {
            return cr30VarL0;
        }
        h1.s0(17);
        throw null;
    }

    public cr30 l0(cty ctyVar) {
        return br30.b;
    }

    public gm40 m() {
        return gm40.b;
    }

    public flc m0() {
        return null;
    }

    public k2u0 n0() {
        return null;
    }

    public boolean o0() {
        return false;
    }

    public List p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        h1.s0(6);
        throw null;
    }

    public boolean p0() {
        return false;
    }

    public boolean q0() {
        return false;
    }

    public slc r() {
        return slc.d;
    }

    public boolean r0() {
        return false;
    }

    public wm40 S() {
        return this;
    }
}
