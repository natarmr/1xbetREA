package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i57 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14179a;
    public final /* synthetic */ z77 b;
    public final /* synthetic */ wom c;
    public final /* synthetic */ w2d d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ xcz f;

    public /* synthetic */ i57(z77 z77Var, wom womVar, w2d w2dVar, Function1 function1, xcz xczVar, byte b) {
        this.f14179a = b;
        this.b = z77Var;
        this.c = womVar;
        this.d = w2dVar;
        this.e = function1;
        this.f = xczVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f14179a;
        byte b2 = 3;
        cl5 cl5Var = ukd.f35823a;
        xcz xczVar = this.f;
        Function1 function1 = this.e;
        z77 z77Var = this.b;
        Object[] objArr = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zD = z77Var.d();
                    boolean z = !z77Var.d();
                    n0q n0qVar = o7k0.c;
                    mm40 mm40VarE0 = o2e.e0(s5x0.I(n0qVar, hh80Var), "PULL_TO_REFRESH_HISTORY_BOX");
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new to6(function1, (byte) 6);
                        fetVar.o0(objP);
                    }
                    bdx.B(mm40VarE0, zD, z, this.c, this.d, null, (Function0) objP, null, u1c.M(622768003, new sbd(b3, z77Var, xczVar, function1), fetVar), fetVar, 100696064);
                    if (z77Var.c()) {
                        fetVar.e0(-1659557782);
                        Object objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new t07((byte) 7);
                            fetVar.o0(objP2);
                        }
                        mm40 mm40VarY = y860.Y(n0qVar, false, null, null, (Function0) objP2, 14);
                        zfn zfnVar = m8m0.f21378a;
                        mm40 mm40VarQ = i120.Q(mm40VarY, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        kpb.j(jr8.f16991a.b(jm40.b, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar, 0, 0);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1659099385);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(hh80Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zD2 = z77Var.d();
                    boolean z2 = !z77Var.d();
                    mm40 mm40VarI = s5x0.I(o7k0.c, hh80Var2);
                    boolean zG2 = fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new dib(function1, (byte) 15);
                        fetVar2.o0(objP3);
                    }
                    bdx.B(mm40VarI, zD2, z2, this.c, this.d, null, (Function0) objP3, null, u1c.M(539070742, new sbd(objArr == true ? 1 : 0, z77Var, xczVar, function1), fetVar2), fetVar2, 100696064);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                hh80 hh80Var3 = (hh80) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                hh80Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(hh80Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zD3 = z77Var.d();
                    boolean z3 = !z77Var.d();
                    mm40 mm40VarI2 = s5x0.I(o7k0.c, hh80Var3);
                    boolean zG3 = fetVar3.g(function1);
                    Object objP4 = fetVar3.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new gno0(function1, (byte) 7);
                        fetVar3.o0(objP4);
                    }
                    bdx.B(mm40VarI2, zD3, z3, this.c, this.d, null, (Function0) objP4, null, u1c.M(1013354297, new sbd(b2, z77Var, xczVar, function1), fetVar3), fetVar3, 100696064);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
