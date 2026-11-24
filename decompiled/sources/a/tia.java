package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tia implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33999a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ tia(pz40 pz40Var, pz40 pz40Var2, Function1 function1) {
        this.f33999a = (byte) 2;
        this.c = pz40Var;
        this.b = function1;
        this.d = pz40Var2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        byte b = this.f33999a;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        pz40 pz40Var = this.d;
        pz40 pz40Var2 = this.c;
        switch (b) {
            case 0:
                y5d y5dVar = (y5d) obj;
                mm40 mm40Var = (mm40) obj2;
                fet fetVar = (fet) obj3;
                int iD = dw9.d((Integer) obj4, y5dVar, mm40Var);
                if ((iD & 6) == 0) {
                    i = iD | (fetVar.g(y5dVar) ? 4 : 2);
                } else {
                    i = iD;
                }
                if ((iD & 48) == 0) {
                    i |= fetVar.g(mm40Var) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN = s5x0.N(y5dVar.b(mm40Var, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    vfc.x(dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), (nsw) pz40Var2.getValue(), fetVar, 0);
                    jcb.s(new wkw(gqw0.n), (imo) pz40Var.getValue(), this.b, fetVar, 0, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                y5d y5dVar2 = (y5d) obj;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar2 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, y5dVar2, mm40Var2);
                if ((iD2 & 6) == 0) {
                    i2 = iD2 | (fetVar2.g(y5dVar2) ? 4 : 2);
                } else {
                    i2 = iD2;
                }
                if ((iD2 & 48) == 0) {
                    i2 |= fetVar2.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    zcl zclVar2 = qmk.f28987a;
                    qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN2 = s5x0.N(y5dVar2.b(mm40Var2, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    x5d x5dVarA2 = w5d.a(qw3Var2, gqw0.m, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    agc.z(dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), (osw) pz40Var2.getValue(), fetVar2, 0);
                    feb.t(new wkw(gqw0.n), (mmo) pz40Var.getValue(), this.b, fetVar2, 0, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                y5d y5dVar3 = (y5d) obj;
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar3 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, y5dVar3, mm40Var3);
                if ((iD3 & 6) == 0) {
                    i3 = iD3 | (fetVar3.g(y5dVar3) ? 4 : 2);
                } else {
                    i3 = iD3;
                }
                if ((iD3 & 48) == 0) {
                    i3 |= fetVar3.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    zcl zclVar3 = qmk.f28987a;
                    qw3 qw3Var3 = new qw3(4.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN3 = s5x0.N(y5dVar3.b(mm40Var3, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    x5d x5dVarA3 = w5d.a(qw3Var3, gqw0.m, fetVar3, 0);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarN3);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    m7x.o(dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), pz40Var2, fetVar3, 0);
                    feb.t(new wkw(gqw0.n), (mmo) pz40Var.getValue(), this.b, fetVar3, 0, 0);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ tia(Function1 function1, pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f33999a = b;
        this.b = function1;
        this.c = pz40Var;
        this.d = pz40Var2;
    }
}
