package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bpd0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2977a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ xdr e;

    public /* synthetic */ bpd0(mm40 mm40Var, boolean z, Function0 function0, xdr xdrVar, byte b) {
        this.f2977a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = function0;
        this.e = xdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2977a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        xdr xdrVar = this.e;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 32.0f);
                    long j = ((y3d) fetVar.k(vld0.b)).f41946a;
                    zcl zclVar2 = qmk.f;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 0.0f, 2);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    mm40 mm40VarW = y860.W(mm40VarL, (gy40) objP, null, this.c, null, this.d, 24);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                    if (xdrVar == null) {
                        fetVar.e0(1969938143);
                    } else {
                        fetVar.e0(-1737568926);
                        xdrVar.F(jr8Var, fetVar, 6);
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40Var, 40.0f);
                    long j2 = ((y3d) fetVar2.k(uld0.b)).f41946a;
                    zcl zclVar4 = qmk.f;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE2, j2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 12.0f, 10.0f);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = dw9.j(fetVar2);
                    }
                    mm40 mm40VarW2 = y860.W(mm40VarK, (gy40) objP2, null, this.c, null, this.d, 24);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
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
                    if (xdrVar == null) {
                        fetVar2.e0(1909443889);
                    } else {
                        fetVar2.e0(-76952368);
                        xdrVar.F(jr8Var, fetVar2, 6);
                    }
                    fetVar2.r(false);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
