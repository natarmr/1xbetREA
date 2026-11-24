package a;

/* JADX INFO: loaded from: classes6.dex */
public final class taz extends lm40 implements v6z {
    public static final raz s = new raz();
    public uaz o;
    public hru p;
    public boolean q;
    public ma80 r;

    public final boolean Z0(paz pazVar, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.r != ma80.f21447a) {
                }
            } else if (i != 1 && i != 2) {
                jf4.n("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (a1(i) ? pazVar.f26678a > 0 : pazVar.b < this.o.b() - 1) {
                return true;
            }
        } else if (this.r != ma80.b) {
            if (a1(i)) {
            }
        }
        return false;
    }

    public final boolean a1(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.q;
            }
            if (i == 6) {
                if (this.q) {
                    return false;
                }
            } else if (i == 3) {
                int iOrdinal = vcc.Z(this).A.ordinal();
                if (iOrdinal == 0) {
                    return this.q;
                }
                if (iOrdinal != 1) {
                    t9f.b();
                    return false;
                }
                if (this.q) {
                    return false;
                }
            } else {
                if (i != 4) {
                    jf4.n("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int iOrdinal2 = vcc.Z(this).A.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.q;
                    }
                    t9f.b();
                    return false;
                }
                if (this.q) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS = pj30Var.S(j);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 11));
    }
}
