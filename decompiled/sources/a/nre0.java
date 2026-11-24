package a;

/* JADX INFO: loaded from: classes2.dex */
public final class nre0 extends q8a {
    public final x83 l;
    public final boolean m;

    public nre0(x83 x83Var, boolean z) {
        this.l = x83Var;
        this.m = z;
    }

    @Override // a.q8a
    public final x83 X() {
        return this.l;
    }

    @Override // a.q8a
    public final boolean Z() {
        return this.m;
    }

    @Override // a.q8a
    public final twq d0(dcg0 dcg0Var) {
        qlc qlcVarU;
        swq swqVarA;
        String strV;
        dcg0Var.getClass();
        v2 v2Var = (v2) dcg0Var;
        sgy sgyVarJ = v2Var.j();
        if (sgyVarJ != null && (strV = sgyVarJ.v()) != null) {
            return new twq(strV);
        }
        fhy fhyVarO = v2Var.o();
        xgy xgyVar = fhyVarO instanceof xgy ? (xgy) fhyVarO : null;
        if (xgyVar == null || (qlcVarU = xgyVar.U()) == null || (swqVarA = qlcVarU.a()) == null) {
            return null;
        }
        return swqVarA.f32934a;
    }

    @Override // a.q8a
    public final boolean l0(aty atyVar) {
        atyVar.getClass();
        v2 v2Var = atyVar instanceof v2 ? (v2) atyVar : null;
        fhy fhyVarO = v2Var != null ? v2Var.o() : null;
        sgy sgyVar = fhyVarO instanceof sgy ? (sgy) fhyVarO : null;
        if (sgyVar == null) {
            return false;
        }
        return azw.G(sgyVar).isArray();
    }

    @Override // a.q8a
    public final boolean m0() {
        return this.l == x83.METHOD_RETURN_TYPE;
    }

    @Override // a.q8a
    public final boolean o0(jzs0 jzs0Var) {
        jzs0Var.getClass();
        xgy xgyVar = null;
        niy niyVar = jzs0Var instanceof niy ? (niy) jzs0Var : null;
        if (niyVar == null) {
            return false;
        }
        oiy oiyVar = niyVar.c;
        if (oiyVar instanceof xgy) {
            xgyVar = (xgy) oiyVar;
        } else if (oiyVar instanceof dre0) {
            ihy ihyVarK = ((dre0) oiyVar).K();
            if (ihyVarK instanceof xgy) {
                xgyVar = (xgy) ihyVarK;
            }
        }
        return xgyVar != null && xgyVar.X() == null;
    }
}
