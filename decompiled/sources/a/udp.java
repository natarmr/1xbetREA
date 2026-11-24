package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class udp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35491a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ dhm c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ udp(mm40 mm40Var, dhm dhmVar, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = dhmVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35491a;
        Function1 function1 = this.d;
        dhm dhmVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 120.0f);
                    zfn zfnVar = zaq0.b;
                    mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.a(16.0f));
                    boolean zG = fetVar.g(function1) | fetVar.g(dhmVar);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new gmo(function1, dhmVar, (byte) 5);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
                    mm40 mm40VarE2 = o7k0.e(s5x0.N(jm40Var, 12.0f, 6.0f, 12.0f, 0.0f, 8), 28.0f);
                    thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
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
                    gkb.N(null, dhmVar.k, dhmVar.l, fetVar, 0);
                    v8q0.a(dhmVar.j, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, idm0.t(10), 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, 0, 25008, 108538);
                    fetVar.r(true);
                    mm40 mm40VarM = s5x0.M(jm40Var, 12.0f, 8.0f, 12.0f, 12.0f);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    zhg0 zhg0Var = zhg0.f44392a;
                    gkb.w(0, fetVar, zhg0Var.a(0.33f, jm40Var, true), dhmVar.c, dhmVar.b);
                    gkb.v(zhg0Var.a(0.33f, jm40Var, true), dhmVar, fetVar, 0);
                    gkb.w(0, fetVar, zhg0Var.a(0.33f, jm40Var, true), dhmVar.e, dhmVar.d);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                gkb.p(mm40Var, dhmVar, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ udp(mm40 mm40Var, Function1 function1, dhm dhmVar) {
        this.b = mm40Var;
        this.d = function1;
        this.c = dhmVar;
    }
}
