package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kw0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18979a = 0;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ kw0(ugd ugdVar, l7m0 l7m0Var) {
        this.b = ugdVar;
        this.c = l7m0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f18979a;
        l7m0 l7m0Var = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar.U(1 & iIntValue, (iIntValue & 17) != 16)) {
                    if (((nw0) l7m0Var.getValue()).e) {
                        fetVar.e0(-1498383036);
                        this.b.invoke(fetVar, 0);
                    } else {
                        fetVar.e0(794780557);
                    }
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                hh80 hh80Var = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(hh80Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40.b, 0.0f, hh80Var.d(), 0.0f, 0.0f, 13), "TAG_FEEDS_CHAMPS_ROOT");
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    this.b.O(((qnp) l7m0Var.getValue()).c, ((qnp) l7m0Var.getValue()).e, ((qnp) l7m0Var.getValue()).b, fetVar2, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kw0(l7m0 l7m0Var, ugd ugdVar) {
        this.c = l7m0Var;
        this.b = ugdVar;
    }
}
