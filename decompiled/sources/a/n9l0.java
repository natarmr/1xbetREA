package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n9l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23147a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ i3n c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ n9l0(mm40 mm40Var, i3n i3nVar, Function2 function2, byte b) {
        this.f23147a = b;
        this.b = mm40Var;
        this.c = i3nVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23147a;
        Function2 function2 = this.d;
        i3n i3nVar = this.c;
        mm40 mm40Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = false;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z = true;
                }
                if (fetVar.U(iIntValue & 1, z)) {
                    obc.d(gap.f10979a.a(fetVar.k(bmd.n)), u1c.M(438983179, new n9l0(mm40Var, i3nVar, function2, b2), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    boolean z2 = fetVar2.S;
                    pcy pcyVar = e7z.u1;
                    if (z2) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, thg0VarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    Object objP = fetVar2.P();
                    if (objP == ukd.f35823a) {
                        objP = o7k0.w(new x7z(1.0f, true), null, false, 3);
                        fetVar2.o0(objP);
                    }
                    mm40 mm40Var2 = (mm40) objP;
                    byte b3 = 6;
                    k7x.u(mm40Var2, i3nVar.d, function2, fetVar2, 6);
                    zcl zclVar = qmk.f28987a;
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    g1x.m(i3nVar.f, fetVar2, 6);
                    qal0 qal0Var = i3nVar.b;
                    if (qal0Var == null) {
                        fetVar2.e0(-483294691);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-483294690);
                        c3x.n(null, u1c.M(330719769, new ygd(qal0Var, (byte) 4), fetVar2), u1c.M(2071803808, new ygd(qal0Var, (byte) 5), fetVar2), u1c.M(377727551, new ygd(qal0Var, b3), fetVar2), u1c.M(-1316348706, new ygd(qal0Var, (byte) 7), fetVar2), fetVar2, 28080);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    k7x.u(mm40Var2, i3nVar.e, function2, fetVar2, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
