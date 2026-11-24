package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o1i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24481a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ p4i c;

    public /* synthetic */ o1i(mm40 mm40Var, p4i p4iVar) {
        this.b = mm40Var;
        this.c = p4iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24481a;
        p4i p4iVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
                    vzb.t(new x7z(0.35f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.35f, true), p4iVar.f26354a, fetVar, 0);
                    n4c.l(s5x0.L(jm40Var, 8.0f, 0.0f, 2), new lpm(opm.f25648a, new hpm(0L, 3)), p4iVar.e, fetVar, 0);
                    if (0.35f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    vzb.u(new x7z(0.35f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.35f, true), p4iVar.b, fetVar, 0);
                    fetVar.r(true);
                    vzb.x(null, p4iVar.c, p4iVar.d, fetVar, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vzb.c(mm40Var, p4iVar, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o1i(mm40 mm40Var, p4i p4iVar, int i) {
        this.b = mm40Var;
        this.c = p4iVar;
    }
}
