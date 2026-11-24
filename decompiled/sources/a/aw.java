package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aw implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1548a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aw(long j, long j2, rs20 rs20Var, mm40 mm40Var) {
        this.d = rs20Var;
        this.b = j;
        this.c = j2;
        this.e = mm40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f1548a;
        boolean z = true;
        Object obj4 = this.e;
        long j = this.c;
        long j2 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ow owVar = (ow) obj5;
                Function1 function1 = (Function1) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zx7 zx7Var = gqw0.e;
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    n0q n0qVar = o7k0.c;
                    mm40 mm40VarQ = i120.Q(s5x0.I(n0qVar, hh80Var), j2, jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    if (owVar != null) {
                        boolean z3 = owVar instanceof nw;
                        jm40 jm40Var = jm40.b;
                        if (z3) {
                            fetVar2.e0(1329273526);
                            p3c0.a(jr8.f16991a.b(jm40Var, zx7Var), ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), 0.0f, 0L, 0, 0.0f, fetVar2, 0, 60);
                            fetVar = fetVar2;
                            fetVar.r(false);
                        } else if (owVar instanceof mw) {
                            fetVar2.e0(1329631731);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarM = s5x0.M(n0qVar, 12.0f, 8.0f, 12.0f, 24.0f);
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode2 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM2 = fetVar2.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
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
                            hjm hjmVar = new hjm(rsm0.w(R.string.wallet_name_title, 0, fetVar2), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                            kjm kjmVar = kjm.b;
                            nkb.h(null, hjmVar, kjmVar, null, null, null, fetVar2, 384, 57);
                            mm40 mm40VarJ = s5x0.J(i120.Q(o7k0.d(jm40Var, 1.0f), j, vgg0.a(16.0f)), 16.0f);
                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                            int iHashCode3 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM3 = fetVar2.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC2, shdVar);
                            jpm0.o(fetVar2, bh90VarM3, shdVar2);
                            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                            jpm0.o(fetVar2, mm40VarC2, shdVar4);
                            mw mwVar = (mw) owVar;
                            c6q0 c6q0Var = mwVar.i;
                            boolean zG = fetVar2.g(owVar) | fetVar2.g(function1);
                            Object objP = fetVar2.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zG || objP == cl5Var) {
                                objP = new bw(owVar, function1);
                                fetVar2.o0(objP);
                            }
                            kly klyVar = new kly((Function1) objP, null, null, 62);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            boolean zG2 = fetVar2.g(function1);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new y7(function1, (byte) 13);
                                fetVar2.o0(objP2);
                            }
                            wvb.t(mm40VarD, c6q0Var, 7, klyVar, (Function1) objP2, fetVar2, 390, 0);
                            fetVar2.r(true);
                            qxw.o(fetVar2, o7k0.e(jm40Var, 16.0f));
                            nkb.h(null, new hjm(rsm0.w(R.string.currency, 0, fetVar2), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjmVar, null, null, null, fetVar2, 384, 57);
                            rqm rqmVar = mwVar.j;
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            boolean zG3 = fetVar2.g(function1);
                            Object objP3 = fetVar2.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new dn(function1, (byte) 5);
                                fetVar2.o0(objP3);
                            }
                            obc.q(mm40VarD2, rqmVar, false, null, (Function0) objP3, null, null, null, fetVar2, 390, 232);
                            fetVar = fetVar2;
                            z = true;
                            fetVar.r(true);
                            fetVar.r(false);
                        }
                        fetVar.r(z);
                    }
                    throw b1j.f(1012712548, fetVar2, false);
                }
                fetVar2.X();
                return Unit.f46060a;
            default:
                rs20 rs20Var = (rs20) obj5;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    l7m0 l7m0VarB = m5k0.b(((qs20) rs20Var).c ? j2 : j, ro4.m0(Response.OK, 0, ihn.f14788a, 2), fetVar3, 384, 8);
                    zcl zclVar2 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_popular, 0, fetVar3), null, o7k0.n(mm40Var, 20.0f), ((y3d) l7m0VarB.getValue()).f41946a, fetVar3, 56, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ aw(long j, ow owVar, long j2, Function1 function1) {
        this.b = j;
        this.d = owVar;
        this.c = j2;
        this.e = function1;
    }
}
