package a;

import android.content.res.Configuration;
import android.javax.sip.message.Response;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qk7 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28871a = 1;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ l7m0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ l7m0 l;
    public final /* synthetic */ l7m0 m;

    public /* synthetic */ qk7(mm40 mm40Var, Function1 function1, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7, l7m0 l7m0Var8, l7m0 l7m0Var9) {
        this.f = mm40Var;
        this.g = function1;
        this.b = xczVar;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = l7m0Var3;
        this.h = l7m0Var4;
        this.i = l7m0Var5;
        this.j = l7m0Var6;
        this.k = l7m0Var7;
        this.l = l7m0Var8;
        this.m = l7m0Var9;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f28871a;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj8;
                Function1 function1 = (Function1) obj7;
                l7m0 l7m0Var2 = (l7m0) obj6;
                l7m0 l7m0Var3 = (l7m0) obj5;
                l7m0 l7m0Var4 = (l7m0) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarE = knm0.r(s5x0.I(o7k0.c, hh80Var)).e(mm40Var);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
                    kje kjeVar = (kje) ((l7m0) l7m0Var.getValue()).getValue();
                    boolean z = kjeVar instanceof zie;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar2.e0(-1746609450);
                        mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                        mdm mdmVar = ((zie) kjeVar).f44436a;
                        boolean zG = fetVar2.g(function1);
                        Object objP = fetVar2.P();
                        if (zG || objP == cl5Var) {
                            objP = new to6(function1, (byte) 17);
                            fetVar2.o0(objP);
                        }
                        jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar2, 0, 4);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar2;
                        if (Intrinsics.d(kjeVar, dje.f6181a)) {
                            fetVar.e0(-1746115682);
                            m7x.m(0, fetVar, s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2));
                            fetVar.r(false);
                        } else {
                            if (!Intrinsics.d(kjeVar, fje.f9636a)) {
                                throw b1j.f(359302101, fetVar, false);
                            }
                            fetVar.e0(-1745705769);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 32.0f);
                            l7m0 l7m0Var5 = this.c;
                            boolean zG2 = fetVar.g(l7m0Var5);
                            l7m0 l7m0Var6 = this.d;
                            boolean zG3 = zG2 | fetVar.g(l7m0Var6);
                            l7m0 l7m0Var7 = this.e;
                            boolean zG4 = zG3 | fetVar.g(l7m0Var7) | fetVar.g(l7m0Var2);
                            l7m0 l7m0Var8 = this.i;
                            boolean zG5 = zG4 | fetVar.g(l7m0Var8) | fetVar.g(l7m0Var3) | fetVar.g(l7m0Var4) | fetVar.g(function1);
                            Object objP2 = fetVar.P();
                            if (zG5 || objP2 == cl5Var) {
                                mk7 mk7Var = new mk7(l7m0Var5, this.m, function1, l7m0Var6, l7m0Var7, l7m0Var2, l7m0Var8, l7m0Var3, l7m0Var4);
                                fetVar.o0(mk7Var);
                                objP2 = mk7Var;
                            }
                            b8k0.e(mm40VarD, this.b, lh80Var, null, null, null, false, null, (Function1) objP2, fetVar, 6, Response.SERVER_TIMEOUT);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                hh80 hh80Var2 = (hh80) obj8;
                final pz40 pz40Var = (pz40) obj7;
                final dk5 dk5Var = (dk5) obj6;
                final pz40 pz40Var2 = (pz40) this.i;
                final vne vneVar = (vne) obj5;
                final d9d0 d9d0Var = (d9d0) obj4;
                final pz40 pz40Var3 = (pz40) l7m0Var;
                final pz40 pz40Var4 = (pz40) this.m;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarN2 = s5x0.N(o7k0.c, 0.0f, hh80Var2.d(), 0.0f, 0.0f, 13);
                    boolean z2 = !((Boolean) pz40Var.getValue()).booleanValue();
                    ch80 ch80VarF = knm0.f(s5x0.t(0.0f, 0.0f, 3), fetVar3);
                    final l7m0 l7m0Var9 = this.c;
                    boolean zG6 = fetVar3.g(l7m0Var9) | fetVar3.i(dk5Var);
                    final l7m0 l7m0Var10 = this.d;
                    boolean zG7 = zG6 | fetVar3.g(l7m0Var10) | fetVar3.g(pz40Var2) | fetVar3.i(vneVar) | fetVar3.g(d9d0Var);
                    final l7m0 l7m0Var11 = this.e;
                    boolean zG8 = zG7 | fetVar3.g(l7m0Var11);
                    Object objP3 = fetVar3.P();
                    if (zG8 || objP3 == cl5Var) {
                        Function1 function2 = new Function1() { // from class: a.lbd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                hcz hczVar = (hcz) obj9;
                                hczVar.getClass();
                                final dk5 dk5Var2 = dk5Var;
                                hcz.e(hczVar, null, null, new ugd(466295718, true, new qb(dk5Var2, l7m0Var9, l7m0Var10, (byte) 23, (byte) 0)), 3);
                                final pz40 pz40Var5 = pz40Var;
                                final pz40 pz40Var6 = pz40Var2;
                                final pz40 pz40Var7 = pz40Var3;
                                final vne vneVar2 = vneVar;
                                final d9d0 d9d0Var2 = d9d0Var;
                                final pz40 pz40Var8 = pz40Var4;
                                final l7m0 l7m0Var12 = l7m0Var11;
                                hcz.e(hczVar, null, null, new ugd(-643434353, true, new xdr() { // from class: a.mbd
                                    @Override // a.xdr
                                    public final Object F(Object obj10, Object obj11, Object obj12) {
                                        Object encVar;
                                        dk5 dk5Var3;
                                        pz40 pz40Var9;
                                        Object encVar2;
                                        dk5 dk5Var4;
                                        fet fetVar4 = (fet) obj11;
                                        int iIntValue3 = ((Integer) obj12).intValue();
                                        ((g9z) obj10).getClass();
                                        if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            long background = ((ThemeColors) fetVar4.k(zaq0.b)).getBackground();
                                            zcl zclVar3 = qmk.f28987a;
                                            ugg0 ugg0VarC = vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12);
                                            jm40 jm40Var2 = jm40.b;
                                            mm40 mm40VarE2 = o7k0.g(i120.Q(jm40Var2, background, ugg0VarC), 128.0f, 0.0f, 2).e(o7k0.c);
                                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                                            int iHashCode2 = Long.hashCode(fetVar4.T);
                                            bh90 bh90VarM2 = fetVar4.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarE2);
                                            mkd.c0.getClass();
                                            fetVar4.i0();
                                            if (fetVar4.S) {
                                                fetVar4.l(e7z.u1);
                                            } else {
                                                fetVar4.r0();
                                            }
                                            jpm0.o(fetVar4, x5dVarA, gqw0.x);
                                            jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                                            jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                                            jpm0.n(fetVar4);
                                            jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                                            pz40 pz40Var10 = pz40Var5;
                                            boolean zBooleanValue = ((Boolean) pz40Var10.getValue()).booleanValue();
                                            pz40 pz40Var11 = pz40Var6;
                                            dk5 dk5Var5 = dk5Var2;
                                            cl5 cl5Var2 = ukd.f35823a;
                                            if (zBooleanValue) {
                                                fetVar4.e0(2003736138);
                                                mm40 mm40VarN3 = s5x0.N(o7k0.u(o7k0.g(jm40Var2, 0.0f, 1024.0f, 1), 0.0f, ((Configuration) fetVar4.k(dy2.f6873a)).screenWidthDp, 1), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                boolean zG9 = fetVar4.g(pz40Var11) | fetVar4.i(dk5Var5);
                                                Object objP4 = fetVar4.P();
                                                if (zG9 || objP4 == cl5Var2) {
                                                    objP4 = new h6c(dk5Var5, pz40Var11, (byte) 13);
                                                    fetVar4.o0(objP4);
                                                }
                                                dwi0.b((Function1) objP4, mm40VarN3, null, fetVar4, 0, 4);
                                                fetVar4.r(false);
                                            } else {
                                                fetVar4.e0(2005118025);
                                                fetVar4.r(false);
                                            }
                                            mm40 mm40VarE0 = o2e.e0(s5x0.N(s5x0.L(jm40Var2, xfn.a(fetVar4).d, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13), "HistoryInfoComponent");
                                            pk5 pk5Var = (pk5) pz40Var11.getValue();
                                            boolean zI = fetVar4.i(dk5Var5);
                                            Object objP5 = fetVar4.P();
                                            if (zI || objP5 == cl5Var2) {
                                                encVar = new enc(1, dk5Var5, dk5.class, "onErrorWhenRequestScrollContent", "onErrorWhenRequestScrollContent(Ljava/lang/Throwable;)V", 0, (byte) 12);
                                                dk5Var3 = dk5Var5;
                                                fetVar4.o0(encVar);
                                            } else {
                                                encVar = objP5;
                                                dk5Var3 = dk5Var5;
                                            }
                                            Function1 function3 = (Function1) ((jhy) encVar);
                                            Object objP6 = fetVar4.P();
                                            pz40 pz40Var12 = pz40Var7;
                                            if (objP6 == cl5Var2) {
                                                dg dgVar = new dg(vneVar2, pz40Var12, pz40Var10, d9d0Var2, pz40Var8, (byte) 9);
                                                pz40Var9 = pz40Var12;
                                                fetVar4.o0(dgVar);
                                                objP6 = dgVar;
                                            } else {
                                                pz40Var9 = pz40Var12;
                                            }
                                            Function1 function4 = (Function1) objP6;
                                            boolean zI2 = fetVar4.i(dk5Var3);
                                            Object objP7 = fetVar4.P();
                                            if (zI2 || objP7 == cl5Var2) {
                                                dk5 dk5Var6 = dk5Var3;
                                                encVar2 = new enc(1, dk5Var6, dk5.class, "onFullHistoryClick", "onFullHistoryClick(Z)V", 0, (byte) 13);
                                                dk5Var4 = dk5Var6;
                                                fetVar4.o0(encVar2);
                                            } else {
                                                encVar2 = objP7;
                                                dk5Var4 = dk5Var3;
                                            }
                                            ahb.q(mm40VarE0, pk5Var, function3, function4, (Function1) ((jhy) encVar2), fetVar4, 3072);
                                            if (((Boolean) pz40Var9.getValue()).booleanValue() || ((Boolean) pz40Var10.getValue()).booleanValue()) {
                                                fetVar4.e0(2006976041);
                                                fetVar4.r(false);
                                            } else {
                                                fetVar4.e0(2006523441);
                                                mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var2, 1.0f), xfn.a(fetVar4).d, 0.0f, 2);
                                                boolean zI3 = fetVar4.i(dk5Var4);
                                                Object objP8 = fetVar4.P();
                                                if (zI3 || objP8 == cl5Var2) {
                                                    enc encVar3 = new enc(1, dk5Var4, dk5.class, "onLegalItemClick", "onLegalItemClick(Lorg/xplatform/feature/balance_management_old/impl/presentation/adapter/models/LegalUiModel;)V", 0, (byte) 14);
                                                    fetVar4.o0(encVar3);
                                                    objP8 = encVar3;
                                                }
                                                bfb.k(0, fetVar4, mm40VarL, (List) l7m0Var12.getValue(), (Function1) ((jhy) objP8));
                                                fetVar4.r(false);
                                            }
                                            fetVar4.r(true);
                                        } else {
                                            fetVar4.X();
                                        }
                                        return Unit.f46060a;
                                    }
                                }), 3);
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(function2);
                        objP3 = function2;
                    }
                    b8k0.e(mm40VarN2, this.b, ch80VarF, null, null, null, z2, null, (Function1) objP3, fetVar3, 0, 376);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ qk7(hh80 hh80Var, pz40 pz40Var, xcz xczVar, l7m0 l7m0Var, dk5 dk5Var, l7m0 l7m0Var2, pz40 pz40Var2, vne vneVar, d9d0 d9d0Var, l7m0 l7m0Var3, pz40 pz40Var3, pz40 pz40Var4) {
        this.f = hh80Var;
        this.g = pz40Var;
        this.b = xczVar;
        this.c = l7m0Var;
        this.h = dk5Var;
        this.d = l7m0Var2;
        this.i = pz40Var2;
        this.j = vneVar;
        this.k = d9d0Var;
        this.e = l7m0Var3;
        this.l = pz40Var3;
        this.m = pz40Var4;
    }
}
