package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lkd0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20197a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ agk0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ cgk0 f;

    public /* synthetic */ lkd0(Function0 function0, agk0 agk0Var, float f, long j, cgk0 cgk0Var, byte b) {
        this.f20197a = b;
        this.b = function0;
        this.c = agk0Var;
        this.d = f;
        this.e = j;
        this.f = cgk0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20197a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        cgk0 cgk0Var = this.f;
        float f = this.d;
        agk0 agk0Var = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarP = o7k0.p(jm40Var, 28.0f, 32.0f);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zG = fetVar.g(function0);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new zhq(function0, agk0Var, (byte) 2);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarW = y860.W(mm40VarP, gy40Var, null, false, null, (Function0) objP2, 28);
                    tj30 tj30VarC = zq8.c(gqw0.f, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    dww.b(jpm0.t(cgk0Var.l(), 6, fetVar), null, o2e.e0(a8k0.I(o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), f), "ICON_ARROWS_CIRCLE"), this.e, fetVar, 48, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarE0 = o2e.e0(o7k0.p(jm40Var2, 36.0f, 40.0f), "UPDATE_ACCOUNT_BTN");
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = dw9.j(fetVar2);
                    }
                    gy40 gy40Var2 = (gy40) objP3;
                    boolean zG2 = fetVar2.g(function0);
                    Object objP4 = fetVar2.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new zhq(function0, agk0Var, (byte) 4);
                        fetVar2.o0(objP4);
                    }
                    mm40 mm40VarW2 = y860.W(mm40VarE0, gy40Var2, null, false, null, (Function0) objP4, 28);
                    tj30 tj30VarC2 = zq8.c(gqw0.f, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    dww.b(jpm0.t(cgk0Var.l(), 6, fetVar2), null, a8k0.I(o7k0.n(s5x0.N(jm40Var2, 8.0f, 0.0f, 4.0f, 0.0f, 10), 24.0f), f), this.e, fetVar2, 48, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
