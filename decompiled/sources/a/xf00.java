package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40768a;
    public final /* synthetic */ qdm0 b;

    public /* synthetic */ xf00(qdm0 qdm0Var, byte b) {
        this.f40768a = b;
        this.b = qdm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40768a;
        qdm0 qdm0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    yyw.h(qdm0Var.f28542a, fetVar, 0);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f);
                    String str = qdm0Var.b;
                    long j = qmk.q;
                    long j2 = qmk.r;
                    v8q0.a(str, mm40VarD, 0L, new n05(j, j2, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, ibm0.t(new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 24960, 109556);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ucx.f(qdm0Var.f28542a, fetVar2, 0);
                    mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD2, 0.0f, 8.0f, 1);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
                    ucx.c(qdm0Var.b, 3, 3, fetVar2, 384);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    hfm0.c(qdm0Var.f28542a, fetVar3, 0);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarD3 = o7k0.d(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f);
                    String str2 = qdm0Var.b;
                    long j3 = qmk.q;
                    long j4 = qmk.r;
                    v8q0.a(str2, mm40VarD3, ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(j3, j4, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, j4, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 24960, 109552);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
