package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dsw implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6634a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ dsw(pz40 pz40Var, byte b) {
        this.f6634a = b;
        this.b = pz40Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f6634a;
        byte b2 = 6;
        pz40 pz40Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj2;
                fet fetVar = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
                if ((iD & 48) == 0) {
                    iD |= fetVar.g(mm40Var) ? 32 : 16;
                }
                if (fetVar.U(iD & 1, (iD & 145) != 144)) {
                    obc.d(gzy.f12205a.a(fetVar.k(bmd.n)), u1c.M(-1715439666, new esw(z ? (byte) 1 : (byte) 0, mm40Var, pz40Var), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40.b, 1.0f), "COLUMN_PAGER_TAG");
                    x5d x5dVarA = w5d.a(new qw3(-16.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 6);
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
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    int i = iIntValue2 & 112;
                    wdx.b(pz40Var, iIntValue, fetVar2, i);
                    wdx.o(pz40Var, iIntValue, fetVar2, i);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar3 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar3.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar3.U(iD2 & 1, (iD2 & 145) != 144)) {
                    kr00.a(u1c.M(356851432, new esw(b2, mm40Var2, pz40Var), fetVar3), fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
