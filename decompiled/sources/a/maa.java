package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class maa implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21449a;
    public final /* synthetic */ waa b;

    public /* synthetic */ maa(waa waaVar, byte b) {
        this.f21449a = b;
        this.b = waaVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f21449a;
        waa waaVar = this.b;
        y5d y5dVar = (y5d) obj;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        Integer num = (Integer) obj4;
        switch (b) {
            case 0:
                int iD = dw9.d(num, y5dVar, mm40Var);
                if ((iD & 48) == 0) {
                    iD |= fetVar.g(mm40Var) ? 32 : 16;
                }
                if (fetVar.U(iD & 1, (iD & 145) != 144)) {
                    zcl zclVar = qmk.f28987a;
                    ahy.k(o7k0.e(mm40Var, 24.0f), waaVar.f38816a, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iD2 = dw9.d(num, y5dVar, mm40Var);
                if ((iD2 & 6) == 0) {
                    iD2 |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iD2 & 1, (iD2 & 131) != 130)) {
                    zcl zclVar2 = qmk.f28987a;
                    wdx.m(y5dVar.a(o7k0.s(jm40.b, 80.0f), gqw0.n), waaVar.b, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                int iD3 = dw9.d(num, y5dVar, mm40Var);
                if ((iD3 & 48) == 0) {
                    iD3 |= fetVar.g(mm40Var) ? 32 : 16;
                }
                if (fetVar.U(iD3 & 1, (iD3 & 145) != 144)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 32.0f);
                    j83 j83Var = waaVar.j;
                    yx7 yx7Var = gqw0.k;
                    nw3 nw3Var = uc9.e;
                    ugd ugdVar = p8a.c;
                    thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    ugdVar.j(zhg0.f44392a, j83Var, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
