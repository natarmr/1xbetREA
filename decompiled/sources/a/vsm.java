package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vsm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37957a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ q1n c;

    public /* synthetic */ vsm(mm40 mm40Var, q1n q1nVar) {
        this.b = mm40Var;
        this.c = q1nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37957a;
        q1n q1nVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
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
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 54.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
                    if (0.35f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    mm40 mm40VarD2 = o7k0.d(new x7z(0.35f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.35f, true), 1.0f);
                    w1n w1nVar = q1nVar.f27962a;
                    t1n t1nVar = q1nVar.c;
                    jcb.y(mm40VarD2, w1nVar, fetVar, 0);
                    n4c.l(s5x0.L(jm40Var, 8.0f, 0.0f, 2), new kpm(opm.f25648a, new hpm(0L, 3), d5c.O(ttm0.L(3, t1nVar.f33174a), ttm0.L(3, t1nVar.b), false, false, new hpm(0L, 3))), q1nVar.g, fetVar, 0);
                    if (0.35f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    jcb.z(new x7z(0.35f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.35f, true), q1nVar.b, fetVar, 0);
                    fetVar.r(true);
                    tlb.l(null, q1nVar.d, q1nVar.e, q1nVar.f, 0L, fetVar, 0, 17);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jcb.m(mm40Var, q1nVar, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vsm(mm40 mm40Var, q1n q1nVar, int i) {
        this.b = mm40Var;
        this.c = q1nVar;
    }
}
