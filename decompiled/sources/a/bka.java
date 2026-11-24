package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bka implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2738a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ ugd f;

    public /* synthetic */ bka(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, byte b) {
        this.f2738a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = ugdVar2;
        this.e = ugdVar3;
        this.f = ugdVar4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2738a;
        zhg0 zhg0Var = zhg0.f44392a;
        jm40 jm40Var = jm40.b;
        y5d y5dVar = y5d.f42040a;
        pcy pcyVar = e7z.u1;
        ugd ugdVar = this.f;
        ugd ugdVar2 = this.e;
        ugd ugdVar3 = this.d;
        ugd ugdVar4 = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    ugdVar4.F(y5dVar, fetVar, 6);
                    mm40 mm40VarA = y5dVar.a(jm40Var, gqw0.n);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    ugdVar3.F(zhg0Var, fetVar, 6);
                    ugdVar2.F(zhg0Var, fetVar, 6);
                    ugdVar.F(zhg0Var, fetVar, 6);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar2, x5dVarA2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM3, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf2, shdVar7);
                    jpm0.n(fetVar2);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC2, shdVar8);
                    ugdVar4.F(y5dVar, fetVar2, 6);
                    mm40 mm40VarA2 = y5dVar.a(jm40Var, gqw0.n);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarA2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, shdVar5);
                    jpm0.o(fetVar2, bh90VarM4, shdVar6);
                    vqd.u(iHashCode4, fetVar2, shdVar7, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar8);
                    ugdVar3.F(zhg0Var, fetVar2, 6);
                    ugdVar2.F(zhg0Var, fetVar2, 6);
                    h97.p(6, ugdVar, zhg0Var, fetVar2, true);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                g1x.d(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(28081));
                break;
            default:
                ((Integer) obj2).getClass();
                c3x.n(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(28081));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bka(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, int i, byte b) {
        this.f2738a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = ugdVar2;
        this.e = ugdVar3;
        this.f = ugdVar4;
    }
}
