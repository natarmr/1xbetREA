package a;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34675a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tx(Object obj, byte b) {
        this.f34675a = b;
        this.b = obj;
    }

    private final Object A(Object obj, Object obj2) {
        a830 a830Var = (a830) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        u430 u430Var = w430.Y1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            x730 x730Var = (x730) a830Var;
            tfx.e(o7k0.c, x730Var.f40394a, x730Var.b, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object B(Object obj, Object obj2) {
        p170 p170Var = (p170) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        xuz xuzVar = p170.Q1;
        byte b = 2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = p170Var.G0();
            boolean zI = fetVar.i(p170Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                cy60 cy60Var = new cy60(1, p170Var, p170.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/games_section/feature/promo/presentation/models/OneXGamesPromoSideEffect;)V", 0, (byte) 5);
                fetVar.o0(cy60Var);
                objP = cy60Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            byte b2 = 3;
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(p170Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                p000 p000Var = new p000(k3t0VarG0, p170Var, pz40VarF, null, (byte) 27);
                fetVar.o0(p000Var);
                objP2 = p000Var;
            }
            m0x0.t(fetVar, p170Var, (Function2) objP2);
            boolean zI3 = fetVar.i(p170Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new n170(p170Var, b);
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            boolean zI4 = fetVar.i(p170Var);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new n170(p170Var, b2);
                fetVar.o0(objP4);
            }
            v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
            n0q n0qVar = o7k0.c;
            e270 e270Var = (e270) ((i3t0) p170Var.G0()).y(fetVar).getValue();
            k3t0 k3t0VarG1 = p170Var.G0();
            boolean zI5 = fetVar.i(k3t0VarG1);
            Object objP5 = fetVar.P();
            if (zI5 || objP5 == cl5Var) {
                cy60 cy60Var2 = new cy60(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                fetVar.o0(cy60Var2);
                objP5 = cy60Var2;
            }
            bsr0.D(n0qVar, e270Var, (Function1) ((jhy) objP5), fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object a(Object obj, Object obj2) {
        d54 d54Var = (d54) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        gfk0 gfk0Var = d54.R1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) d54Var.G0()).y(fetVar);
            k3t0 k3t0VarG0 = d54Var.G0();
            boolean zI = fetVar.i(d54Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                bk2 bk2Var = new bk2(1, d54Var, d54.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/auth/impl/presentation/udf/AuthDefaultSideEffect;)V", 0, (byte) 24);
                fetVar.o0(bk2Var);
                objP = bk2Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            byte b = 3;
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(d54Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                l10 l10Var = new l10(k3t0VarG0, d54Var, pz40VarF, null, (byte) 22);
                fetVar.o0(l10Var);
                objP2 = l10Var;
            }
            m0x0.t(fetVar, d54Var, (Function2) objP2);
            mm40 mm40VarE = o050.S(jm40.b).e(o7k0.c);
            p54 p54Var = (p54) pz40VarY.getValue();
            k3t0 k3t0VarG1 = d54Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                bk2 bk2Var2 = new bk2(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                fetVar.o0(bk2Var2);
                objP3 = bk2Var2;
            }
            y9a.g(mm40VarE, p54Var, (Function1) ((jhy) objP3), u1c.M(47155475, new awh(d54Var, b), fetVar), u1c.M(-765992539, new un6(d54Var, (byte) 17), fetVar), fetVar, 27648);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        ig4 ig4Var = (ig4) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        rek0 rek0Var = ig4.O1;
        byte b = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new a04((byte) 7);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 54, 0);
            pz40 pz40VarY = ((i3t0) ((k3t0) ig4Var.M1.getValue())).y(fetVar);
            boolean zI = fetVar.i(ig4Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new eg4(ig4Var, (byte) 1);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zI2 = fetVar.i(ig4Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new eg4(ig4Var, (byte) 2);
                fetVar.o0(objP3);
            }
            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
            boolean z = fetVar.k(bmd.n) == k6z.b;
            n0q n0qVar = o7k0.c;
            boolean zH = fetVar.h(z) | fetVar.g(pz40VarY);
            Object objP4 = fetVar.P();
            if (zH || objP4 == cl5Var) {
                objP4 = new fg4(b, pz40VarY, z);
                fetVar.o0(objP4);
            }
            mm40 mm40VarL = rq8.L(n0qVar, (Function1) objP4);
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new or3((byte) 22);
                fetVar.o0(objP5);
            }
            mm40 mm40VarA = pai0.a(mm40VarL, false, (Function1) objP5);
            Unit unit = Unit.f46060a;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = i54.g;
                fetVar.o0(objP6);
            }
            zq8.a(0, fetVar, fnn0.a(mm40VarA, unit, (PointerInputEventHandler) objP6));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        Object l10Var;
        yj50 yj50Var;
        boolean z;
        n75 n75Var = (n75) this.b;
        kiu0 kiu0Var = n75Var.O1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        pek0 pek0Var = n75.S1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            d9z d9zVarA = f9z.a(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            g85 g85Var = (g85) kiu0Var.getValue();
            int i = g85.A;
            t75 t75Var = (t75) g85Var.y(fetVar).getValue();
            g85 g85Var2 = (g85) kiu0Var.getValue();
            boolean zI = fetVar.i(vneVar) | fetVar.g(d9zVarA) | fetVar.i(n75Var);
            Object objP2 = fetVar.P();
            byte b = 20;
            if (zI || objP2 == cl5Var) {
                objP2 = new on(vneVar, n75Var, d9zVarA, b);
                fetVar.o0(objP2);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP2, fetVar);
            boolean zI2 = fetVar.i(g85Var2) | fetVar.i(n75Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                yj50Var = null;
                l10Var = new l10(g85Var2, n75Var, pz40VarF, null, (byte) 25);
                fetVar.o0(l10Var);
            } else {
                l10Var = objP3;
                yj50Var = null;
            }
            m0x0.t(fetVar, n75Var, (Function2) l10Var);
            n0q n0qVar = o7k0.c;
            g85 g85Var3 = (g85) kiu0Var.getValue();
            boolean zI3 = fetVar.i(g85Var3);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new j94(1, g85Var3, g85.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/available_games/compose/models/AvailableGamesAction;)V", 0, (byte) 22);
                fetVar.o0(objP4);
            }
            Function1 function1 = (Function1) ((jhy) objP4);
            zx7 zx7Var = gqw0.e;
            n0qVar.getClass();
            t75Var.getClass();
            function1.getClass();
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
            mm40 mm40VarV = cjx.V(o050.W(o2e.e0(n0qVar, "AVAILABLE_GAMES_SCREEN")), cloVarB.e, yj50Var);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            ahy.b(i120.Q(jm40Var, backgroundContent, ljcVar), cloVarB, true, u1c.M(-60760519, new sr1(t75Var, function1, b), fetVar), xf0.j, fetVar, 28032, 0);
            fet fetVar2 = fetVar;
            mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ljcVar);
            boolean z3 = false;
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            z75 z75Var = t75Var.b;
            if (z75Var != null) {
                byte b2 = 21;
                if (z75Var instanceof w75) {
                    x7z x7zVarF = rz4.f(fetVar2, 668432078, 1.0f, true);
                    bml bmlVar = ((w75) z75Var).f38654a;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = knm0.f(new lh80(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 24.0f), fetVar2);
                    boolean zG = fetVar2.g(function1);
                    Object objP5 = fetVar2.P();
                    if (zG || objP5 == cl5Var) {
                        objP5 = new fj4(function1, (byte) 19);
                        fetVar2.o0(objP5);
                    }
                    Function0 function0 = (Function0) objP5;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP6 = fetVar2.P();
                    if (zG2 || objP6 == cl5Var) {
                        objP6 = new wc2(function1, b2);
                        fetVar2.o0(objP6);
                    }
                    Function1 function2 = (Function1) objP6;
                    boolean zG3 = fetVar2.g(function1);
                    Object objP7 = fetVar2.P();
                    if (zG3 || objP7 == cl5Var) {
                        objP7 = new wc2(function1, (byte) 22);
                        fetVar2.o0(objP7);
                    }
                    ckb.f(x7zVarF, bmlVar, null, ch80VarF, function0, null, function2, (Function1) objP7, fetVar2, 0, 36);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    z = true;
                } else if (z75Var instanceof x75) {
                    fetVar2.e0(670132490);
                    mm40 mm40VarS = o050.S(o7k0.d(new x7z(1.0f, true), 1.0f));
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar2, false), 7);
                    mdm mdmVar = ((x75) z75Var).f40397a;
                    boolean zG4 = fetVar2.g(function1);
                    Object objP8 = fetVar2.P();
                    if (zG4 || objP8 == cl5Var) {
                        objP8 = new fj4(function1, (byte) 20);
                        fetVar2.o0(objP8);
                    }
                    jcb.l(mm40VarN, mdmVar, false, (Function0) objP8, fetVar2, 0, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                    z = true;
                } else {
                    z3 = false;
                    if (z75Var instanceof y75) {
                        fetVar2.e0(671006442);
                        mm40 mm40VarS2 = o050.S(o7k0.d(new x7z(1.0f, true), 1.0f));
                        tj30 tj30VarC2 = zq8.c(zx7Var, false);
                        int iHashCode4 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM4 = fetVar2.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarS2);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC2, shdVar);
                        jpm0.o(fetVar2, bh90VarM4, shdVar2);
                        vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                        jpm0.o(fetVar2, mm40VarC3, shdVar4);
                        mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar2, false), 7);
                        mdm mdmVar2 = ((y75) z75Var).f42134a;
                        boolean zG5 = fetVar2.g(function1);
                        Object objP9 = fetVar2.P();
                        if (zG5 || objP9 == cl5Var) {
                            objP9 = new fj4(function1, b2);
                            fetVar2.o0(objP9);
                        }
                        jcb.l(mm40VarN2, mdmVar2, false, (Function0) objP9, fetVar2, 0, 4);
                        z = true;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z);
                fetVar2.r(z);
            }
            throw b1j.f(-1086817377, fetVar2, z3);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        gna0 gna0Var;
        k3t0 k3t0Var;
        l7m0 l7m0Var;
        final au7 au7Var = (au7) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        yk5 yk5Var = au7.U1;
        final byte b = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) au7Var.H0()).y(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarY);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new kk7(pz40VarY, (byte) 8);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarY);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new kk7(pz40VarY, (byte) 9);
                fetVar.o0(objP2);
            }
            final l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = new Object[0];
            boolean zG3 = fetVar.g(pz40VarY);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = new kk7(pz40VarY, (byte) 10);
                fetVar.o0(objP3);
            }
            final l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar);
            Object[] objArr4 = new Object[0];
            boolean zG4 = fetVar.g(pz40VarY);
            Object objP4 = fetVar.P();
            byte b2 = 11;
            if (zG4 || objP4 == cl5Var) {
                objP4 = new kk7(pz40VarY, b2);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP4, fetVar);
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new gna0();
                fetVar.o0(objP5);
            }
            gna0 gna0Var2 = (gna0) objP5;
            k3t0 k3t0VarH0 = au7Var.H0();
            boolean zI = fetVar.i(au7Var);
            Object objP6 = fetVar.P();
            if (zI || objP6 == cl5Var) {
                gna0Var = gna0Var2;
                k3t0Var = k3t0VarH0;
                l7m0Var = l7m0VarY4;
                ye7 ye7Var = new ye7(1, au7Var, au7.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/bets_on_players/impl/presentation/screen/BetsOnPlayersSideEffect;)V", 0, (byte) 13);
                fetVar.o0(ye7Var);
                objP6 = ye7Var;
            } else {
                l7m0Var = l7m0VarY4;
                gna0Var = gna0Var2;
                k3t0Var = k3t0VarH0;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(au7Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP7 = fetVar.P();
            if (zI2 || objP7 == cl5Var) {
                ua7 ua7Var = new ua7(k3t0Var, au7Var, pz40VarF, null, (byte) 3);
                fetVar.o0(ua7Var);
                objP7 = ua7Var;
            }
            m0x0.t(fetVar, au7Var, (Function2) objP7);
            boolean zI3 = fetVar.i(au7Var);
            Object objP8 = fetVar.P();
            if (zI3 || objP8 == cl5Var) {
                objP8 = new wt7(au7Var, b);
                fetVar.o0(objP8);
            }
            Function0 function0 = (Function0) objP8;
            boolean zI4 = fetVar.i(au7Var);
            Object objP9 = fetVar.P();
            if (zI4 || objP9 == cl5Var) {
                objP9 = new wt7(au7Var, (byte) 1);
                fetVar.o0(objP9);
            }
            v3c.A(function0, (Function0) objP9, null, fetVar, 0, 4);
            final byte b3 = 1;
            gna0 gna0Var3 = gna0Var;
            oja0.g(o7k0.c, u1c.M(-1924043473, new xdr() { // from class: a.xt7
                @Override // a.xdr
                public final Object F(Object obj3, Object obj4, Object obj5) {
                    byte b4 = b;
                    cl5 cl5Var2 = ukd.f35823a;
                    au7 au7Var2 = au7Var;
                    l7m0 l7m0Var2 = l7m0VarY3;
                    switch (b4) {
                        case 0:
                            mm40 mm40Var = (mm40) obj3;
                            fet fetVar2 = (fet) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            yk5 yk5Var2 = au7.U1;
                            mm40Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar2.g(mm40Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                imm immVar = (imm) l7m0Var2.getValue();
                                boolean zI5 = fetVar2.i(au7Var2);
                                Object objP10 = fetVar2.P();
                                if (zI5 || objP10 == cl5Var2) {
                                    objP10 = new wt7(au7Var2, (byte) 4);
                                    fetVar2.o0(objP10);
                                }
                                Function0 function1 = (Function0) objP10;
                                boolean zI6 = fetVar2.i(au7Var2);
                                Object objP11 = fetVar2.P();
                                if (zI6 || objP11 == cl5Var2) {
                                    objP11 = new wt7(au7Var2, (byte) 5);
                                    fetVar2.o0(objP11);
                                }
                                Function0 function2 = (Function0) objP11;
                                boolean zI7 = fetVar2.i(au7Var2);
                                Object objP12 = fetVar2.P();
                                if (zI7 || objP12 == cl5Var2) {
                                    objP12 = new yt7(au7Var2, (byte) 4);
                                    fetVar2.o0(objP12);
                                }
                                hlm.c(mm40Var, immVar, null, function1, function2, (Function1) objP12, null, null, null, null, null, null, fetVar2, iIntValue2 & 14, 0, 4036);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            mm40 mm40Var2 = (mm40) obj3;
                            fet fetVar3 = (fet) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            yk5 yk5Var3 = au7.U1;
                            mm40Var2.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar3.g(mm40Var2) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                boolean zI8 = fetVar3.i(au7Var2);
                                Object objP13 = fetVar3.P();
                                if (zI8 || objP13 == cl5Var2) {
                                    objP13 = new yt7(au7Var2, (byte) 3);
                                    fetVar3.o0(objP13);
                                }
                                ffb0.f(iIntValue3 & 14, fetVar3, mm40Var2, l7m0Var2, (Function1) objP13);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1747715216, new xdr() { // from class: a.xt7
                @Override // a.xdr
                public final Object F(Object obj3, Object obj4, Object obj5) {
                    byte b4 = b3;
                    cl5 cl5Var2 = ukd.f35823a;
                    au7 au7Var2 = au7Var;
                    l7m0 l7m0Var2 = l7m0VarY2;
                    switch (b4) {
                        case 0:
                            mm40 mm40Var = (mm40) obj3;
                            fet fetVar2 = (fet) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            yk5 yk5Var2 = au7.U1;
                            mm40Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar2.g(mm40Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                imm immVar = (imm) l7m0Var2.getValue();
                                boolean zI5 = fetVar2.i(au7Var2);
                                Object objP10 = fetVar2.P();
                                if (zI5 || objP10 == cl5Var2) {
                                    objP10 = new wt7(au7Var2, (byte) 4);
                                    fetVar2.o0(objP10);
                                }
                                Function0 function1 = (Function0) objP10;
                                boolean zI6 = fetVar2.i(au7Var2);
                                Object objP11 = fetVar2.P();
                                if (zI6 || objP11 == cl5Var2) {
                                    objP11 = new wt7(au7Var2, (byte) 5);
                                    fetVar2.o0(objP11);
                                }
                                Function0 function2 = (Function0) objP11;
                                boolean zI7 = fetVar2.i(au7Var2);
                                Object objP12 = fetVar2.P();
                                if (zI7 || objP12 == cl5Var2) {
                                    objP12 = new yt7(au7Var2, (byte) 4);
                                    fetVar2.o0(objP12);
                                }
                                hlm.c(mm40Var, immVar, null, function1, function2, (Function1) objP12, null, null, null, null, null, null, fetVar2, iIntValue2 & 14, 0, 4036);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            mm40 mm40Var2 = (mm40) obj3;
                            fet fetVar3 = (fet) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            yk5 yk5Var3 = au7.U1;
                            mm40Var2.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar3.g(mm40Var2) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                boolean zI8 = fetVar3.i(au7Var2);
                                Object objP13 = fetVar3.P();
                                if (zI8 || objP13 == cl5Var2) {
                                    objP13 = new yt7(au7Var2, (byte) 3);
                                    fetVar3.o0(objP13);
                                }
                                ffb0.f(iIntValue3 & 14, fetVar3, mm40Var2, l7m0Var2, (Function1) objP13);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1571386959, new v7i0(l7m0VarY, (byte) 11), fetVar), u1c.M(-1395058702, new qb((Object) l7m0Var, (Object) gna0Var3, (Object) au7Var, (byte) 4), fetVar), u1c.M(-1574969817, new ah10(pz40VarY, gna0Var3, au7Var, (byte) 1), fetVar), fetVar, 224694);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        ni8 ni8Var = (ni8) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        yk5 yk5Var = ni8.U1;
        byte b = 1;
        byte b2 = 2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            vl8 vl8Var = (vl8) ((i3t0) ni8Var.G0()).y(fetVar).getValue();
            k3t0 k3t0VarG0 = ni8Var.G0();
            boolean zI = fetVar.i(ni8Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                ye7 ye7Var = new ye7(1, ni8Var, ni8.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/games_section/feature/bonuses/presentation/models/BonusesSideEffect;)V", 0, (byte) 28);
                fetVar.o0(ye7Var);
                objP = ye7Var;
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            boolean z = false;
            if (zI2 || objP2 == cl5Var) {
                pc pcVar = new pc(k3t0VarG0, clzVar, pz40VarF, null, (byte) 4);
                fetVar.o0(pcVar);
                objP2 = pcVar;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP2);
            y3d y3dVar = new y3d(vl8Var.h());
            boolean zG = fetVar.g(vl8Var) | fetVar.i(ni8Var);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new yp6(vl8Var, ni8Var, z, (byte) 14);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, y3dVar, (Function2) objP3);
            boolean zI3 = fetVar.i(ni8Var);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new hi8(ni8Var, b);
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean zI4 = fetVar.i(ni8Var);
            Object objP5 = fetVar.P();
            if (zI4 || objP5 == cl5Var) {
                objP5 = new hi8(ni8Var, b2);
                fetVar.o0(objP5);
            }
            v3c.z(function0, (Function0) objP5, null, fetVar, 0, 4);
            n0q n0qVar = o7k0.c;
            boolean zF = vl8Var.f();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = n0qVar.e(zF ? knm0.r(jm40Var) : o050.S(jm40Var));
            k3t0 k3t0VarG1 = ni8Var.G0();
            boolean zI5 = fetVar.i(k3t0VarG1);
            Object objP6 = fetVar.P();
            if (zI5 || objP6 == cl5Var) {
                li8 li8Var = new li8(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                fetVar.o0(li8Var);
                objP6 = li8Var;
            }
            cwr0.d(mm40VarE, vl8Var, (Function1) ((jhy) objP6), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        Object ua7Var;
        yje yjeVar;
        uw8 uw8Var = (uw8) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        cl5 cl5Var = uw8.S1;
        byte b = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            float fT = fbc.T(fetVar);
            d9z d9zVarA = f9z.a(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            fy8 fy8Var = (fy8) ((i3t0) uw8Var.G0()).y(fetVar).getValue();
            k3t0 k3t0VarG0 = uw8Var.G0();
            boolean zI = fetVar.i(vneVar) | fetVar.g(d9zVarA) | fetVar.i(uw8Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var2) {
                objP2 = new sw8(vneVar, uw8Var, d9zVarA, b);
                fetVar.o0(objP2);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP2, fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(uw8Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var2) {
                yjeVar = null;
                ua7Var = new ua7(k3t0VarG0, uw8Var, pz40VarF, null, (byte) 7);
                fetVar.o0(ua7Var);
            } else {
                ua7Var = objP3;
                yjeVar = null;
            }
            m0x0.t(fetVar, uw8Var, (Function2) ua7Var);
            boolean zG = fetVar.g(d9zVarA) | fetVar.i(uw8Var);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var2) {
                objP4 = new xw5(d9zVarA, uw8Var, yjeVar, (byte) 28);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP4);
            n0q n0qVar = o7k0.c;
            lh80 lh80VarU = s5x0.u(0.0f, fT, 0.0f, 0.0f, 13);
            boolean z = true ^ ((uc0) uw8Var.Q1.n(uw8Var, uw8.U1[1])).i;
            k3t0 k3t0VarG1 = uw8Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == cl5Var2) {
                li8 li8Var = new li8(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                fetVar.o0(li8Var);
                objP5 = li8Var;
            }
            Function1 function1 = (Function1) ((jhy) objP5);
            fy8Var.getClass();
            d9zVarA.getClass();
            if (fy8Var instanceof ey8) {
                fetVar.e0(-1394275223);
                vbw0.k(s5x0.I(n0qVar, lh80VarU), (ey8) fy8Var, d9zVarA, z, function1, fetVar, 0);
                fetVar.r(false);
            } else if (fy8Var instanceof cy8) {
                fetVar.e0(-1393921389);
                hmw0.l(n0qVar, (cy8) fy8Var, d9zVarA, z, function1, fetVar, 6);
                fetVar.r(false);
            } else {
                if (!(fy8Var instanceof dy8)) {
                    throw b1j.f(1201948269, fetVar, false);
                }
                fetVar.e0(-1393608940);
                nnw0.i(n0qVar, (dy8) fy8Var, d9zVarA, z, function1, fetVar, 6);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2) {
        ugd ugdVarM;
        r59 r59Var = (r59) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        cl5 cl5Var = r59.P1;
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(r59Var);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zI || objP == cl5Var2) {
                objP = new o59(r59Var, (byte) 15);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(r59Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var2) {
                objP2 = new o59(r59Var, (byte) 16);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            k69 k69VarG0 = r59Var.G0();
            int i = k69.K;
            pz40 pz40VarY = k69VarG0.y(fetVar);
            mdm mdmVar = ((a69) pz40VarY.getValue()).d;
            eke ekeVar = ((a69) pz40VarY.getValue()).b;
            n0q n0qVar = o7k0.c;
            boolean zI3 = fetVar.i(r59Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var2) {
                objP3 = new o59(r59Var, b);
                fetVar.o0(objP3);
            }
            Function0 function1 = (Function0) objP3;
            if (mdmVar != null) {
                fetVar.e0(-333879528);
                ugdVarM = u1c.M(-123789528, new ab4((Object) mdmVar, (Object) r59Var, (byte) 11), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-333356899);
                ugdVarM = u1c.M(-1957289857, new ab4((Object) r59Var, (Object) pz40VarY, (byte) 12), fetVar);
                fetVar.r(false);
            }
            ugd ugdVar = ugdVarM;
            ugd ugdVarM2 = null;
            ugd ugdVar2 = ((a69) pz40VarY.getValue()).c ? dj8.b : null;
            if (ekeVar != null) {
                fetVar.e0(-332317314);
                ugdVarM2 = u1c.M(-227085722, new ab4((Object) ekeVar, (Object) r59Var, (byte) 13), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-331448942);
                fetVar.r(false);
            }
            wb.h(n0qVar, function1, ugdVar, ugdVar2, ugdVarM2, fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2) {
        ugd ugdVarM;
        j79 j79Var = (j79) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        kl5 kl5Var = j79.O1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(j79Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new f79(j79Var, (byte) 10);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(j79Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new f79(j79Var, (byte) 11);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            s79 s79VarG0 = j79Var.G0();
            int i = s79.A;
            pz40 pz40VarY = s79VarG0.y(fetVar);
            String str = ((p79) pz40VarY.getValue()).d;
            y3w0 y3w0Var = ((p79) pz40VarY.getValue()).f26495a;
            v3w0 v3w0Var = ((p79) pz40VarY.getValue()).b;
            n0q n0qVar = o7k0.c;
            boolean zI3 = fetVar.i(j79Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new f79(j79Var, (byte) 12);
                fetVar.o0(objP3);
            }
            Function0 function1 = (Function0) objP3;
            ugd ugdVarM2 = null;
            if (str != null) {
                fetVar.e0(519246480);
                ugdVarM = u1c.M(-1850240357, new h0(str, (byte) 3), fetVar);
                fetVar.r(false);
            } else if (y3w0Var != null) {
                fetVar.e0(519253452);
                ugdVarM = u1c.M(-718077230, new ab4((Object) y3w0Var, (Object) j79Var, (byte) 14), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1081544662);
                fetVar.r(false);
                ugdVarM = null;
            }
            ugd ugdVar = ((p79) pz40VarY.getValue()).c ? rq8.d : null;
            if (v3w0Var == null || str != null) {
                fetVar.e0(-1080187357);
                fetVar.r(false);
            } else {
                fetVar.e0(-1081048041);
                ugdVarM2 = u1c.M(1307758166, new ab4((Object) v3w0Var, (Object) j79Var, (byte) 15), fetVar);
                fetVar.r(false);
            }
            cy2.d(n0qVar, function1, ugdVarM, ugdVar, ugdVarM2, fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2) {
        cmb cmbVar = (cmb) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        yk5 yk5Var = cmb.O1;
        byte b = 2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            qj2 qj2Var = (qj2) ((i3t0) cmbVar.G0()).y(fetVar).getValue();
            k3t0 k3t0VarG0 = cmbVar.G0();
            boolean zI = fetVar.i(cmbVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                zhb zhbVar = new zhb(1, cmbVar, cmb.class, "handleAltSportTournamentsSideEffect", "handleAltSportTournamentsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tournaments/models/AltSportTournamentsSideEffect;)V", 0, (byte) 3);
                fetVar.o0(zhbVar);
                objP = zhbVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(cmbVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                ua7 ua7Var = new ua7(k3t0VarG0, cmbVar, pz40VarF, null, (byte) 15);
                fetVar.o0(ua7Var);
                objP2 = ua7Var;
            }
            m0x0.t(fetVar, cmbVar, (Function2) objP2);
            mm40 mm40VarH = phu0.H(jm40.b, null, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            imm immVar = qj2Var.f28816a;
            boolean zI3 = fetVar.i(cmbVar);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new amb(cmbVar, b);
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            boolean zI4 = fetVar.i(cmbVar);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new lya(cmbVar, (byte) 8);
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP4, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            bdz bdzVar = (bdz) cmbVar.K1.getValue();
            k3t0 k3t0VarG1 = cmbVar.G0();
            boolean zI5 = fetVar.i(k3t0VarG1);
            Object objP5 = fetVar.P();
            if (zI5 || objP5 == cl5Var) {
                zhb zhbVar2 = new zhb(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                fetVar.o0(zhbVar2);
                objP5 = zhbVar2;
            }
            epv0.a(mm40VarQ, bdzVar, qj2Var, (Function1) ((jhy) objP5), fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2) {
        w9n w9nVar = (w9n) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Integer numS = w9nVar.s();
            if (numS == null) {
                fetVar.e0(-763591306);
                fetVar.r(false);
            } else {
                fetVar.e0(-763591305);
                j0x.b(a8k0.F(numS.intValue(), 0, fetVar), null, o2e.e0(o7k0.c, "ASYNC_IMAGE"), null, gqw0.h1, 0.0f, null, fetVar, 25016, 104);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0298  */
    /* JADX WARN: Code duplicated, block: B:60:0x02af  */
    private final Object r(Object obj, Object obj2) {
        boolean z;
        cl5 cl5Var;
        boolean zG;
        Object objP;
        boolean zG2;
        Object objP2;
        j4j j4jVar = (j4j) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        kud kudVar = j4j.R1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            float fT = fbc.T(fetVar);
            x5j x5jVar = (x5j) ((i3t0) j4jVar.G0()).y(fetVar).getValue();
            k3t0 k3t0VarG0 = j4jVar.G0();
            boolean zI = fetVar.i(j4jVar);
            Object objP3 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zI || objP3 == cl5Var2) {
                y6h y6hVar = new y6h(1, j4jVar, j4j.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/daily_tasks/impl/presentation/dailytasks/models/DailyTasksSideEffect;)V", 0, (byte) 11);
                fetVar.o0(y6hVar);
                objP3 = y6hVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP3), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(j4jVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == cl5Var2) {
                ua7 ua7Var = new ua7(k3t0VarG0, j4jVar, pz40VarF, null, (byte) 22);
                fetVar.o0(ua7Var);
                objP4 = ua7Var;
            }
            m0x0.t(fetVar, j4jVar, (Function2) objP4);
            lh80 lh80VarU = s5x0.u(0.0f, fT, 0.0f, 0.0f, 13);
            k3t0 k3t0VarG1 = j4jVar.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == cl5Var2) {
                y6h y6hVar2 = new y6h(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                fetVar.o0(y6hVar2);
                objP5 = y6hVar2;
            }
            Function1 function1 = (Function1) ((jhy) objP5);
            x5jVar.getClass();
            function1.getClass();
            mm40 mm40VarQ = i120.Q(s5x0.I(o2e.e0(o7k0.c, "DAILY_TASKS_SCREEN"), lh80VarU), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DAILY_TASKS_SCREEN_NAVBAR");
            imm immVar = x5jVar.f40320a;
            g4j g4jVar = x5jVar.b;
            boolean zG3 = fetVar.g(function1);
            Object objP6 = fetVar.P();
            byte b = 9;
            if (zG3 || objP6 == cl5Var2) {
                objP6 = new ouh(function1, b);
                fetVar.o0(objP6);
            }
            Function0 function0 = (Function0) objP6;
            boolean zG4 = fetVar.g(function1);
            Object objP7 = fetVar.P();
            if (zG4 || objP7 == cl5Var2) {
                objP7 = new olh(function1, (byte) 9);
                fetVar.o0(objP7);
            }
            hlm.c(mm40VarE0, immVar, null, function0, null, (Function1) objP7, null, null, null, null, null, null, fetVar, 6, 0, 4052);
            fet fetVar2 = fetVar;
            mm40 mm40VarA0 = wha0.a0(dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), wha0.T(fetVar2), false, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarA0, 0.0f, 0.0f, 0.0f, 32.0f, 7);
            x5d x5dVarA2 = w5d.a(uc9.e, xx7Var, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (g4jVar != null) {
                boolean z3 = g4jVar instanceof e4j;
                byte b2 = 11;
                if (z3) {
                    fetVar2.e0(-1863753926);
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
                    x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA3, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    mm40 mm40VarD = o7k0.d(o2e.e0(jm40Var, "DAILY_TASKS_COLLECTION"), 1.0f);
                    tll tllVar = ((e4j) g4jVar).f7184a;
                    boolean zG5 = fetVar2.g(function1);
                    Object objP8 = fetVar2.P();
                    if (zG5) {
                        cl5Var = cl5Var2;
                    } else {
                        cl5Var = cl5Var2;
                        if (objP8 == cl5Var) {
                        }
                        Function1 function2 = (Function1) objP8;
                        zG = fetVar2.g(function1);
                        objP = fetVar2.P();
                        if (zG || objP == cl5Var) {
                            objP = new olh(function1, b2);
                            fetVar2.o0(objP);
                        }
                        Function1 function3 = (Function1) objP;
                        zG2 = fetVar2.g(function1);
                        objP2 = fetVar2.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new olh(function1, (byte) 12);
                            fetVar2.o0(objP2);
                        }
                        zjb.e(mm40VarD, tllVar, function2, function3, (Function1) objP2, fetVar2, 6);
                        fetVar2 = fetVar2;
                        z = true;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                    objP8 = new olh(function1, (byte) 10);
                    fetVar2.o0(objP8);
                    Function1 function4 = (Function1) objP8;
                    zG = fetVar2.g(function1);
                    objP = fetVar2.P();
                    if (zG) {
                        objP = new olh(function1, b2);
                        fetVar2.o0(objP);
                    } else {
                        objP = new olh(function1, b2);
                        fetVar2.o0(objP);
                    }
                    Function1 function5 = (Function1) objP;
                    zG2 = fetVar2.g(function1);
                    objP2 = fetVar2.P();
                    if (zG2) {
                        objP2 = new olh(function1, (byte) 12);
                        fetVar2.o0(objP2);
                    } else {
                        objP2 = new olh(function1, (byte) 12);
                        fetVar2.o0(objP2);
                    }
                    zjb.e(mm40VarD, tllVar, function4, function5, (Function1) objP2, fetVar2, 6);
                    fetVar2 = fetVar2;
                    z = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else if (g4jVar instanceof f4j) {
                    fetVar2.e0(-1862245962);
                    mm40 mm40VarN3 = s5x0.N(o2e.e0(jm40Var, "DAILY_TASKS_SCREEN_LOTTI"), 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
                    mdm mdmVar = ((f4j) g4jVar).f8915a;
                    boolean zG6 = fetVar2.g(function1);
                    Object objP9 = fetVar2.P();
                    if (zG6 || objP9 == cl5Var2) {
                        objP9 = new ouh(function1, b2);
                        fetVar2.o0(objP9);
                    }
                    jcb.l(mm40VarN3, mdmVar, true, (Function0) objP9, fetVar2, 384, 0);
                    fetVar2.r(false);
                    z = true;
                }
                fetVar2.r(z);
                fetVar2.r(z);
            }
            throw b1j.f(-1722691696, fetVar2, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2) {
        Object bioVar;
        cio cioVar = (cio) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ddk ddkVar = cio.P1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            vg2 vg2Var = (vg2) ((i3t0) cioVar.H0()).y(fetVar).getValue();
            k3t0 k3t0VarH0 = cioVar.H0();
            boolean zI = fetVar.i(cioVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                hin hinVar = new hin(1, cioVar, cio.class, "handleAltSportEventsSideEffect", "handleAltSportEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_events/models/AltSportEventsSideEffect;)V", 0, (byte) 14);
                fetVar.o0(hinVar);
                objP = hinVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            byte b = 3;
            boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(cioVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                bioVar = new bio(k3t0VarH0, cioVar, pz40VarF, null, (byte) 0);
                fetVar.o0(bioVar);
            } else {
                bioVar = objP2;
            }
            m0x0.t(fetVar, cioVar, (Function2) bioVar);
            boolean z = vg2Var.f37362a.b instanceof nlm;
            boolean zI3 = fetVar.i(cioVar);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new yho(cioVar, b);
                fetVar.o0(objP3);
            }
            nkb.n(z, (Function0) objP3, null, fetVar, 0, 4);
            mm40 mm40VarH = phu0.H(jm40.b, 0, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            imm immVar = vg2Var.f37362a;
            boolean zI4 = fetVar.i(cioVar);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new yho(cioVar, (byte) 4);
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean zI5 = fetVar.i(cioVar);
            Object objP5 = fetVar.P();
            if (zI5 || objP5 == cl5Var) {
                objP5 = new zho(cioVar, (byte) 1);
                fetVar.o0(objP5);
            }
            Function1 function1 = (Function1) objP5;
            boolean zI6 = fetVar.i(cioVar);
            Object objP6 = fetVar.P();
            if (zI6 || objP6 == cl5Var) {
                objP6 = new zho(cioVar, (byte) 2);
                fetVar.o0(objP6);
            }
            Function1 function2 = (Function1) objP6;
            boolean zI7 = fetVar.i(cioVar);
            Object objP7 = fetVar.P();
            if (zI7 || objP7 == cl5Var) {
                objP7 = new yho(cioVar, (byte) 5);
                fetVar.o0(objP7);
            }
            hlm.c(null, immVar, null, function0, null, function1, function2, null, (Function0) objP7, null, null, null, fetVar, 0, 0, 3733);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            bdz bdzVar = (bdz) cioVar.L1.getValue();
            k3t0 k3t0VarH1 = cioVar.H0();
            boolean zI8 = fetVar.i(k3t0VarH1);
            Object objP8 = fetVar.P();
            if (zI8 || objP8 == cl5Var) {
                hin hinVar2 = new hin(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                fetVar.o0(hinVar2);
                objP8 = hinVar2;
            }
            f1t0.c(mm40VarQ, bdzVar, null, vg2Var, 0.0f, (Function1) ((jhy) objP8), fetVar, 384, 16);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2) {
        i7s i7sVar = (i7s) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        nek nekVar = i7s.a2;
        byte b = 1;
        byte b2 = 2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarI0 = i7sVar.I0();
            boolean zI = fetVar.i(i7sVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                h2s h2sVar = new h2s(1, i7sVar, i7s.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/dashboard/impl/presentation/GameDashboardSideEffect;)V", 0, (byte) 2);
                fetVar.o0(h2sVar);
                objP = h2sVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            byte b3 = 3;
            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(i7sVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zI2 || objP2 == cl5Var) {
                bio bioVar = new bio(k3t0VarI0, i7sVar, pz40VarF, null, (byte) 9);
                fetVar.o0(bioVar);
                objP2 = bioVar;
            }
            m0x0.t(fetVar, i7sVar, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) i7sVar.I0()).y(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarY);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new z6s(pz40VarY, b3);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarY);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new z6s(pz40VarY, (byte) 4);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
            Object[] objArr3 = new Object[0];
            boolean zG3 = fetVar.g(pz40VarY);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == cl5Var) {
                objP5 = new z6s(pz40VarY, (byte) 5);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP5, fetVar);
            Object[] objArr4 = new Object[0];
            boolean zG4 = fetVar.g(pz40VarY);
            Object objP6 = fetVar.P();
            byte b4 = 6;
            if (zG4 || objP6 == cl5Var) {
                objP6 = new z6s(pz40VarY, b4);
                fetVar.o0(objP6);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP6, fetVar);
            Object[] objArr5 = new Object[0];
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = new s9r((byte) 24);
                fetVar.o0(objP7);
            }
            cgk0 cgk0Var = (cgk0) e9x.Q(objArr5, (Function0) objP7, fetVar, 48);
            Object[] objArr6 = new Object[0];
            boolean zG5 = fetVar.g(pz40VarY);
            Object objP8 = fetVar.P();
            if (zG5 || objP8 == cl5Var) {
                objP8 = new z6s(pz40VarY, b);
                fetVar.o0(objP8);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr6, (Function0) objP8, fetVar);
            Object[] objArr7 = new Object[0];
            boolean zG6 = fetVar.g(pz40VarY);
            Object objP9 = fetVar.P();
            if (zG6 || objP9 == cl5Var) {
                objP9 = new z6s(pz40VarY, b2);
                fetVar.o0(objP9);
            }
            l7m0 l7m0VarY6 = v3c.Y(objArr7, (Function0) objP9, fetVar);
            Object value = l7m0VarY6.getValue();
            boolean zI3 = fetVar.i(i7sVar) | fetVar.g(l7m0VarY6);
            Object objP10 = fetVar.P();
            if (zI3 || objP10 == cl5Var) {
                objP10 = new j0s(i7sVar, l7m0VarY6, yjeVar, b2);
                fetVar.o0(objP10);
            }
            m0x0.t(fetVar, value, (Function2) objP10);
            n0q n0qVar = o7k0.c;
            int iL = cgk0Var.l();
            py20 py20Var = (py20) l7m0VarY4.getValue();
            boolean zI4 = fetVar.i(i7sVar);
            Object objP11 = fetVar.P();
            if (zI4 || objP11 == cl5Var) {
                objP11 = new g7p((Object) i7sVar, (byte) 21);
                fetVar.o0(objP11);
            }
            fxb.r(n0qVar, py20Var, l7m0VarY5, iL, (Function1) objP11, u1c.M(-443649124, new v7i0(l7m0VarY2, (byte) 29), fetVar), u1c.M(149839547, new rgh(l7m0VarY, i7sVar, (byte) 20), fetVar), u1c.M(743328218, new eyn(i7sVar, pz40VarY, cgk0Var, (byte) 11), fetVar), u1c.M(1860463749, new z1s(l7m0VarY3, i7sVar, (byte) 6), fetVar), fetVar, 115015686);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2) {
        final cjs cjsVar = (cjs) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        nek nekVar = cjs.a2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarI0 = cjsVar.I0();
            boolean zI = fetVar.i(cjsVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new h2s(1, cjsVar, cjs.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/lite/impl/presentation/GameLiteSideEffect;)V", 0, (byte) 10);
                fetVar.o0(objP);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(cjsVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zI2 || objP2 == cl5Var) {
                objP2 = new bio(k3t0VarI0, cjsVar, pz40VarF, null, (byte) 10);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, cjsVar, (Function2) objP2);
            zfn zfnVar = zaq0.b;
            final long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            final long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            final float f = qmk.a(fetVar).c;
            final pz40 pz40VarY = ((i3t0) cjsVar.I0()).y(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarY);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new z6s(pz40VarY, (byte) 11);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarY);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new z6s(pz40VarY, (byte) 12);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
            Object value = l7m0VarY2.getValue();
            boolean zI3 = fetVar.i(cjsVar) | fetVar.g(l7m0VarY2);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == cl5Var) {
                objP5 = new j0s(cjsVar, l7m0VarY2, yjeVar, (byte) 4);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, value, (Function2) objP5);
            qcc.s(432, u1c.M(-679863008, new rgh(l7m0VarY, cjsVar, (byte) 21), fetVar), u1c.M(502369727, new xdr() { // from class: a.ajs
                @Override // a.xdr
                public final Object F(Object obj3, Object obj4, Object obj5) {
                    mm40 mm40Var = (mm40) obj3;
                    fet fetVar2 = (fet) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    nek nekVar2 = cjs.a2;
                    mm40Var.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= fetVar2.g(mm40Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        mm40 mm40VarE = mm40Var.e(o7k0.c);
                        final cjs cjsVar2 = cjsVar;
                        final nek nekVar3 = cjsVar2.R1;
                        if (nekVar3 == null) {
                            Intrinsics.h("gameVideoFactory");
                            throw null;
                        }
                        final xak xakVar = cjsVar2.S1;
                        if (xakVar == null) {
                            Intrinsics.h("gameZoneFactory");
                            throw null;
                        }
                        k3t0 k3t0VarI1 = cjsVar2.I0();
                        boolean zI4 = fetVar2.i(k3t0VarI1);
                        Object objP6 = fetVar2.P();
                        cl5 cl5Var2 = ukd.f35823a;
                        if (zI4 || objP6 == cl5Var2) {
                            h2s h2sVar = new h2s(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                            fetVar2.o0(h2sVar);
                            objP6 = h2sVar;
                        }
                        final Function1 function1 = (Function1) ((jhy) objP6);
                        final long j = backgroundContent;
                        final float f2 = f;
                        final long j2 = background;
                        final ugd ugdVarM = u1c.M(-816845926, new ydr() { // from class: a.yis
                            @Override // a.ydr
                            public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                int i;
                                mm40 mm40Var2 = (mm40) obj6;
                                RelatedParams relatedParams = (RelatedParams) obj7;
                                fet fetVar3 = (fet) obj8;
                                int iIntValue3 = ((Integer) obj9).intValue();
                                nek nekVar4 = cjs.a2;
                                mm40Var2.getClass();
                                relatedParams.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    i = (fetVar3.g(mm40Var2) ? 4 : 2) | iIntValue3;
                                } else {
                                    i = iIntValue3;
                                }
                                if ((iIntValue3 & 48) == 0) {
                                    i |= fetVar3.g(relatedParams) ? 32 : 16;
                                }
                                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                    cjs cjsVar3 = cjsVar2;
                                    ndf0 ndf0Var = cjsVar3.P1;
                                    if (ndf0Var == null) {
                                        Intrinsics.h("relatedGamesFactory");
                                        throw null;
                                    }
                                    zcl zclVar2 = qmk.l;
                                    zcl zclVar3 = qmk.f28987a;
                                    mm40 mm40VarQ = i120.Q(mm40Var2, j, new ugg0(zclVar2, zclVar2, zclVar3, zclVar3));
                                    mm40 mm40VarE2 = s5x0.L(jm40.b, f2, 0.0f, 2).e(o7k0.c);
                                    zcl zclVar4 = qmk.k;
                                    ndf0Var.a(mm40VarQ, s5x0.L(h97.e(zclVar4, zclVar4, zclVar3, zclVar3, i120.Q(mm40VarE2, j2, new ugg0(zclVar4, zclVar4, zclVar3, zclVar3))), 4.0f, 0.0f, 2), cjsVar3, relatedParams, fetVar3);
                                } else {
                                    fetVar3.X();
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar2);
                        final ugd ugdVarM2 = u1c.M(-1238575789, new zis((Object) cjsVar2, j, (byte) 0), fetVar2);
                        final l7m0 l7m0Var = pz40VarY;
                        l7m0Var.getClass();
                        function1.getClass();
                        Object[] objArr3 = new Object[0];
                        boolean zG3 = fetVar2.g(l7m0Var);
                        Object objP7 = fetVar2.P();
                        if (zG3 || objP7 == cl5Var2) {
                            objP7 = new z6s(l7m0Var, (byte) 9);
                            fetVar2.o0(objP7);
                        }
                        final l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP7, fetVar2);
                        Object[] objArr4 = new Object[0];
                        boolean zG4 = fetVar2.g(l7m0Var);
                        Object objP8 = fetVar2.P();
                        if (zG4 || objP8 == cl5Var2) {
                            objP8 = new z6s(l7m0Var, (byte) 10);
                            fetVar2.o0(objP8);
                        }
                        final l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP8, fetVar2);
                        tf50 tf50Var = (tf50) l7m0VarY3.getValue();
                        Object objP9 = fetVar2.P();
                        if (objP9 == cl5Var2) {
                            objP9 = new dcr((byte) 24);
                            fetVar2.o0(objP9);
                        }
                        Function1 function2 = (Function1) objP9;
                        Object objP10 = fetVar2.P();
                        if (objP10 == cl5Var2) {
                            objP10 = new dcr((byte) 25);
                            fetVar2.o0(objP10);
                        }
                        ay3.f(tf50Var, mm40VarE, function2, null, null, (Function1) objP10, u1c.M(-1956970015, new ydr() { // from class: a.vis
                            @Override // a.ydr
                            public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                tf50 tf50Var2 = (tf50) obj7;
                                fet fetVar3 = (fet) obj8;
                                int iIntValue3 = ((Integer) obj9).intValue();
                                ((b53) obj6).getClass();
                                tf50Var2.getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= fetVar3.e(tf50Var2.ordinal()) ? 32 : 16;
                                }
                                byte b = 0;
                                byte b2 = 1;
                                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                    int i = wis.f39233a[tf50Var2.ordinal()];
                                    l7m0 l7m0Var2 = l7m0Var;
                                    Function1 function3 = function1;
                                    cl5 cl5Var3 = ukd.f35823a;
                                    if (i != 1) {
                                        fetVar3.e0(-206727234);
                                        n0q n0qVar = o7k0.c;
                                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                                        int iHashCode = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM = fetVar3.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(e7z.u1);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, x5dVarA, gqw0.x);
                                        jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                        jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                        jpm0.n(fetVar3);
                                        jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                        Object value2 = l7m0VarY3.getValue();
                                        Object objP11 = fetVar3.P();
                                        if (objP11 == cl5Var3) {
                                            objP11 = new dcr((byte) 26);
                                            fetVar3.o0(objP11);
                                        }
                                        ay3.f(value2, null, (Function1) objP11, null, null, null, u1c.M(-1499219602, new g54((Object) l7m0Var2, (Object) xakVar, (Object) nekVar3, (Object) function3, (byte) 10), fetVar3), fetVar3, 1573248, 58);
                                        ugd ugdVarM3 = u1c.M(368879915, new uis(ugdVarM, b), fetVar3);
                                        ugd ugdVarM4 = u1c.M(940021586, new uis(ugdVarM2, b2), fetVar3);
                                        l7m0 l7m0Var3 = l7m0VarY4;
                                        l7m0Var3.getClass();
                                        yym0 yym0Var = (yym0) l7m0Var3.getValue();
                                        if (yym0Var != null) {
                                            if (yym0Var instanceof sym0) {
                                                fetVar3.e0(-333719065);
                                                ugdVarM4.F(((sym0) yym0Var).f33029a, fetVar3, 48);
                                                fetVar3.r(false);
                                            } else if (yym0Var instanceof vym0) {
                                                fetVar3.e0(-333716195);
                                                ugdVarM3.F(((vym0) yym0Var).f38256a, fetVar3, 48);
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(true);
                                            fetVar3.r(false);
                                        }
                                        throw b1j.f(-333721800, fetVar3, false);
                                    }
                                    fetVar3.e0(-207523996);
                                    mm40 mm40VarR = knm0.r(o7k0.c);
                                    boolean zG5 = fetVar3.g(function3);
                                    Object objP12 = fetVar3.P();
                                    if (zG5 || objP12 == cl5Var3) {
                                        objP12 = new x6s(function3, (byte) 2);
                                        fetVar3.o0(objP12);
                                    }
                                    Function2 function4 = (Function2) objP12;
                                    boolean zG6 = fetVar3.g(function3);
                                    Object objP13 = fetVar3.P();
                                    if (zG6 || objP13 == cl5Var3) {
                                        objP13 = new baq(function3, (byte) 19);
                                        fetVar3.o0(objP13);
                                    }
                                    Function1 function5 = (Function1) objP13;
                                    boolean zG7 = fetVar3.g(function3);
                                    Object objP14 = fetVar3.P();
                                    if (zG7 || objP14 == cl5Var3) {
                                        objP14 = new baq(function3, (byte) 20);
                                        fetVar3.o0(objP14);
                                    }
                                    Function1 function6 = (Function1) objP14;
                                    l7m0Var2.getClass();
                                    function4.getClass();
                                    function5.getClass();
                                    function6.getClass();
                                    zcl zclVar2 = qmk.f28987a;
                                    obc.d(kr00.f18743a.a(Boolean.valueOf(((pjs) l7m0Var2.getValue()).h)), u1c.M(1906612803, new gc3(mm40VarR, l7m0Var2, qmk.a(fetVar3).c, function4, function5, function6), fetVar3), fetVar3, 56);
                                    fetVar3.r(false);
                                } else {
                                    fetVar3.X();
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar2), fetVar2, 1769856, 24);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2) {
        lhx lhxVar = (lhx) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ihx ihxVar = lhx.Y1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            shx shxVar = (shx) ((i3t0) lhxVar.G0()).y(fetVar).getValue();
            if (shxVar != null) {
                if (shxVar instanceof qhx) {
                    fetVar.e0(1442792211);
                    qhx qhxVar = (qhx) shxVar;
                    tfx.e(o7k0.c, qhxVar.f28764a, qhxVar.b, fetVar, 6, 0);
                    fetVar.r(false);
                } else {
                    boolean z = shxVar instanceof rhx;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(1443137706);
                        zcl zclVar = qmk.f28987a;
                        float f = qmk.a(fetVar).c;
                        ndf0 ndf0Var = lhxVar.L1;
                        if (ndf0Var == null) {
                            Intrinsics.h("relatedGamesFactory");
                            throw null;
                        }
                        ndf0Var.a(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), s5x0.L(o7k0.c, f, 0.0f, 2), lhxVar, ((rhx) shxVar).b, fetVar);
                        fetVar.r(false);
                    } else if (shxVar instanceof phx) {
                        fetVar.e0(1443772245);
                        phx phxVar = (phx) shxVar;
                        pz40 pz40VarF = androidx.compose.runtime.e.f(phxVar.c, fetVar);
                        udl0 udl0Var = phxVar.f27019a;
                        boolean z2 = phxVar.b;
                        zcl zclVar2 = qmk.f28987a;
                        ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar);
                        boolean zI = fetVar.i(lhxVar);
                        Object objP = fetVar.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (zI || objP == cl5Var) {
                            objP = new ghx(lhxVar, (byte) 1);
                            fetVar.o0(objP);
                        }
                        Function1 function1 = (Function1) objP;
                        boolean zI2 = fetVar.i(lhxVar);
                        Object objP2 = fetVar.P();
                        if (zI2 || objP2 == cl5Var) {
                            objP2 = new ghx(lhxVar, (byte) 2);
                            fetVar.o0(objP2);
                        }
                        Function1 function2 = (Function1) objP2;
                        boolean zI3 = fetVar.i(lhxVar);
                        Object objP3 = fetVar.P();
                        if (zI3 || objP3 == cl5Var) {
                            objP3 = new elm(lhxVar, (byte) 23);
                            fetVar.o0(objP3);
                        }
                        fww.c(jm40Var, pz40VarF, udl0Var, z2, null, ch80VarG, function1, function2, (xdr) objP3, fetVar, 6, 16);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(-1200384762, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2) {
        co00 co00Var = (co00) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        xuz xuzVar = co00.R1;
        byte b = 1;
        byte b2 = 0;
        byte b3 = 2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) co00Var.G0()).y(fetVar);
            k3t0 k3t0VarG0 = co00Var.G0();
            boolean zI = fetVar.i(co00Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                svz svzVar = new svz(1, co00Var, co00.class, "onHandleSideEffect", "onHandleSideEffect(Lorg/xplatform/app_start/impl/presentation/udf/LoadSideEffect;)V", 0, (byte) 16);
                fetVar.o0(svzVar);
                objP = svzVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(co00Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zI2 || objP2 == cl5Var) {
                p000 p000Var = new p000(k3t0VarG0, co00Var, pz40VarF, null, (byte) 1);
                fetVar.o0(p000Var);
                objP2 = p000Var;
            }
            m0x0.t(fetVar, co00Var, (Function2) objP2);
            n0q n0qVar = o7k0.c;
            mp00 mp00Var = (mp00) pz40VarY.getValue();
            boolean zI3 = fetVar.i(co00Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new ao00(co00Var, b3);
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            mp00Var.getClass();
            function0.getClass();
            if (mp00Var instanceof kp00) {
                fetVar.e0(1285348188);
                kp00 kp00Var = (kp00) mp00Var;
                if (kp00Var instanceof ip00) {
                    fetVar.e0(1285402810);
                    Context context = (Context) fetVar.k(dy2.b);
                    ip00 ip00Var = (ip00) mp00Var;
                    List list = ip00Var.g;
                    boolean zG = fetVar.g(mp00Var) | fetVar.i(context);
                    Object objP4 = fetVar.P();
                    if (zG || objP4 == cl5Var) {
                        objP4 = new so00(mp00Var, context, yjeVar, b2);
                        fetVar.o0(objP4);
                    }
                    m0x0.t(fetVar, list, (Function2) objP4);
                    String str = ip00Var.h;
                    boolean zG2 = fetVar.g(mp00Var) | fetVar.i(context);
                    Object objP5 = fetVar.P();
                    if (zG2 || objP5 == cl5Var) {
                        objP5 = new so00(mp00Var, context, yjeVar, b);
                        fetVar.o0(objP5);
                    }
                    m0x0.t(fetVar, str, (Function2) objP5);
                    n0qVar.getClass();
                    int iOrdinal = ip00Var.b.ordinal();
                    if (iOrdinal == 0) {
                        fetVar.e0(-709809213);
                        e9x.g(n0qVar, ip00Var, function0, fetVar, 6);
                        fetVar.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar.e0(-709803712);
                        e9x.h(n0qVar, ip00Var, function0, fetVar, 6);
                        fetVar.r(false);
                    } else if (iOrdinal == 2) {
                        fetVar.e0(-709798007);
                        e9x.f(n0qVar, ip00Var, function0, fetVar, 6);
                        fetVar.r(false);
                    } else if (iOrdinal == 3) {
                        fetVar.e0(-709791990);
                        e9x.e(n0qVar, ip00Var, function0, fetVar, 6);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 4) {
                            throw b1j.f(-709810606, fetVar, false);
                        }
                        fetVar.e0(-709785843);
                        e9x.d(n0qVar, ip00Var, function0, fetVar, 6);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    if (!(kp00Var instanceof jp00)) {
                        throw b1j.f(1426936166, fetVar, false);
                    }
                    fetVar.e0(1426963529);
                    uc9.L(n0qVar, (jp00) mp00Var, fetVar, 6);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else if (mp00Var instanceof hp00) {
                fetVar.e0(1426968153);
                n6x.a(n0qVar, (hp00) mp00Var, fetVar, 6);
                fetVar.r(false);
            } else {
                if (!(mp00Var instanceof lp00)) {
                    throw b1j.f(1426934878, fetVar, false);
                }
                fetVar.e0(1426971328);
                p7x.a(n0qVar, (lp00) mp00Var, fetVar, 6);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2) {
        wls wlsVar = (wls) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            nnw0.g(o2e.e0(o7k0.c, "MAP_ITEM_BOX"), null, false, u1c.M(148267692, new un6(wlsVar, b), fetVar), fetVar, 3078, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj, Object obj2) {
        final v330 v330Var = (v330) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        xuz xuzVar = v330.Q1;
        final byte b = 1;
        final byte b2 = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) v330Var.G0()).y(fetVar);
            k3t0 k3t0VarG0 = v330Var.G0();
            boolean zI = fetVar.i(v330Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                du20 du20Var = new du20(1, v330Var, v330.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/markets/display_settings/impl/presentation/MarketsDisplaySettingsSideEffect;)V", 0, (byte) 3);
                fetVar.o0(du20Var);
                objP = du20Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(v330Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            ugd ugdVarM = null;
            if (zI2 || objP2 == cl5Var) {
                p000 p000Var = new p000(k3t0VarG0, v330Var, pz40VarF, null, (byte) 9);
                fetVar.o0(p000Var);
                objP2 = p000Var;
            }
            m0x0.t(fetVar, v330Var, (Function2) objP2);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarY);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new x000(pz40VarY, (byte) 16);
                fetVar.o0(objP3);
            }
            final l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarY);
            Object objP4 = fetVar.P();
            byte b3 = 17;
            if (zG2 || objP4 == cl5Var) {
                objP4 = new x000(pz40VarY, b3);
                fetVar.o0(objP4);
            }
            final l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
            Object[] objArr3 = new Object[0];
            boolean zG3 = fetVar.g(pz40VarY);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == cl5Var) {
                objP5 = new x000(pz40VarY, (byte) 18);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP5, fetVar);
            Object[] objArr4 = new Object[0];
            boolean zG4 = fetVar.g(pz40VarY);
            Object objP6 = fetVar.P();
            if (zG4 || objP6 == cl5Var) {
                objP6 = new x000(pz40VarY, (byte) 12);
                fetVar.o0(objP6);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP6, fetVar);
            Object[] objArr5 = new Object[0];
            boolean zG5 = fetVar.g(pz40VarY);
            Object objP7 = fetVar.P();
            if (zG5 || objP7 == cl5Var) {
                objP7 = new x000(pz40VarY, (byte) 13);
                fetVar.o0(objP7);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP7, fetVar);
            Object[] objArr6 = new Object[0];
            boolean zG6 = fetVar.g(pz40VarY);
            Object objP8 = fetVar.P();
            if (zG6 || objP8 == cl5Var) {
                objP8 = new x000(pz40VarY, (byte) 14);
                fetVar.o0(objP8);
            }
            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP8, fetVar);
            Object[] objArr7 = new Object[0];
            boolean zG7 = fetVar.g(pz40VarY);
            Object objP9 = fetVar.P();
            if (zG7 || objP9 == cl5Var) {
                objP9 = new x000(pz40VarY, (byte) 15);
                fetVar.o0(objP9);
            }
            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP9, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE = i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), jd8.n).e(o7k0.c);
            ugd ugdVarM2 = u1c.M(1444027884, new xdr() { // from class: a.r330
                @Override // a.xdr
                public final Object F(Object obj3, Object obj4, Object obj5) {
                    byte b4 = b2;
                    cl5 cl5Var2 = ukd.f35823a;
                    v330 v330Var2 = v330Var;
                    l7m0 l7m0Var = l7m0VarY;
                    switch (b4) {
                        case 0:
                            mm40 mm40Var = (mm40) obj3;
                            fet fetVar2 = (fet) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            xuz xuzVar2 = v330.Q1;
                            mm40Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar2.g(mm40Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                imm immVar = (imm) l7m0Var.getValue();
                                boolean zI3 = fetVar2.i(v330Var2);
                                Object objP10 = fetVar2.P();
                                if (zI3 || objP10 == cl5Var2) {
                                    objP10 = new q330(v330Var2, (byte) 1);
                                    fetVar2.o0(objP10);
                                }
                                Function0 function0 = (Function0) objP10;
                                boolean zI4 = fetVar2.i(v330Var2);
                                Object objP11 = fetVar2.P();
                                if (zI4 || objP11 == cl5Var2) {
                                    objP11 = new s330(v330Var2, (byte) 1);
                                    fetVar2.o0(objP11);
                                }
                                hlm.c(mm40Var, immVar, null, function0, null, (Function1) objP11, null, null, null, null, null, null, fetVar2, iIntValue2 & 14, 0, 4052);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            mm40 mm40Var2 = (mm40) obj3;
                            fet fetVar3 = (fet) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            xuz xuzVar3 = v330.Q1;
                            mm40Var2.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar3.g(mm40Var2) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                mtl mtlVar = (mtl) l7m0Var.getValue();
                                ma80 ma80Var = ma80.b;
                                boolean zI5 = fetVar3.i(v330Var2);
                                Object objP12 = fetVar3.P();
                                if (zI5 || objP12 == cl5Var2) {
                                    objP12 = new s330(v330Var2, (byte) 0);
                                    fetVar3.o0(objP12);
                                }
                                bkb.f(mm40Var2, mtlVar, ma80Var, false, null, (Function1) objP12, fetVar3, (iIntValue3 & 14) | 384, 24);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            ugd ugdVarM3 = u1c.M(1308000587, new x2g((Object) l7m0VarY5, (Object) l7m0VarY3, (Object) l7m0VarY6, (Object) l7m0VarY7, (byte) 23), fetVar);
            pw20 pw20Var = (pw20) l7m0VarY4.getValue();
            if (pw20Var == null) {
                fetVar.e0(848913555);
                fetVar.r(false);
            } else {
                fetVar.e0(848913556);
                ugdVarM = u1c.M(-584298179, new ngz(pw20Var, v330Var, b3), fetVar);
                fetVar.r(false);
            }
            xdx.d(25008, ugdVarM2, ugdVarM3, u1c.M(1035945993, new xdr() { // from class: a.r330
                @Override // a.xdr
                public final Object F(Object obj3, Object obj4, Object obj5) {
                    byte b4 = b;
                    cl5 cl5Var2 = ukd.f35823a;
                    v330 v330Var2 = v330Var;
                    l7m0 l7m0Var = l7m0VarY2;
                    switch (b4) {
                        case 0:
                            mm40 mm40Var = (mm40) obj3;
                            fet fetVar2 = (fet) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            xuz xuzVar2 = v330.Q1;
                            mm40Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar2.g(mm40Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                imm immVar = (imm) l7m0Var.getValue();
                                boolean zI3 = fetVar2.i(v330Var2);
                                Object objP10 = fetVar2.P();
                                if (zI3 || objP10 == cl5Var2) {
                                    objP10 = new q330(v330Var2, (byte) 1);
                                    fetVar2.o0(objP10);
                                }
                                Function0 function0 = (Function0) objP10;
                                boolean zI4 = fetVar2.i(v330Var2);
                                Object objP11 = fetVar2.P();
                                if (zI4 || objP11 == cl5Var2) {
                                    objP11 = new s330(v330Var2, (byte) 1);
                                    fetVar2.o0(objP11);
                                }
                                hlm.c(mm40Var, immVar, null, function0, null, (Function1) objP11, null, null, null, null, null, null, fetVar2, iIntValue2 & 14, 0, 4052);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            mm40 mm40Var2 = (mm40) obj3;
                            fet fetVar3 = (fet) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            xuz xuzVar3 = v330.Q1;
                            mm40Var2.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar3.g(mm40Var2) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                mtl mtlVar = (mtl) l7m0Var.getValue();
                                ma80 ma80Var = ma80.b;
                                boolean zI5 = fetVar3.i(v330Var2);
                                Object objP12 = fetVar3.P();
                                if (zI5 || objP12 == cl5Var2) {
                                    objP12 = new s330(v330Var2, (byte) 0);
                                    fetVar3.o0(objP12);
                                }
                                bkb.f(mm40Var2, mtlVar, ma80Var, false, null, (Function1) objP12, fetVar3, (iIntValue3 & 14) | 384, 24);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), ugdVarM, fetVar, mm40VarE);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object z(Object obj, Object obj2) {
        boolean z;
        w430 w430Var = (w430) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        u430 u430Var = w430.Y1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            a830 a830Var = (a830) ((i3t0) w430Var.G0()).y(fetVar).getValue();
            if (a830Var == null) {
                z = false;
            } else if (a830Var instanceof x730) {
                fetVar.e0(-39820876);
                obc.d(kr00.f18743a.a(Boolean.valueOf(((x730) a830Var).c)), u1c.M(-48133122, new tx(a830Var, (byte) 27), fetVar), fetVar, 56);
                fetVar.r(false);
            } else {
                boolean z2 = a830Var instanceof y730;
                jm40 jm40Var = jm40.b;
                if (z2) {
                    fetVar.e0(-39299766);
                    zcl zclVar = qmk.f28987a;
                    float f = qmk.a(fetVar).c;
                    ndf0 ndf0Var = w430Var.L1;
                    if (ndf0Var == null) {
                        Intrinsics.h("relatedGamesFactory");
                        throw null;
                    }
                    ndf0Var.a(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), s5x0.L(o7k0.c, f, 0.0f, 2), w430Var, ((y730) a830Var).b, fetVar);
                    fetVar.r(false);
                } else if (a830Var instanceof u730) {
                    fetVar.e0(-38698552);
                    mm40 mm40VarS = knm0.s(6, fetVar, o7k0.c);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
                    String str = ((u730) a830Var).b;
                    y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
                    long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(str, jr8.f16991a.b(s5x0.K(jm40Var, qmk.a(fetVar).d, 24.0f), gqw0.e), secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, y9q0Var, fetVar, 0, 384, 126968);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    z = false;
                    if (a830Var instanceof w730) {
                        fetVar.e0(-37861304);
                        w730 w730Var = (w730) a830Var;
                        obc.d(kr00.f18743a.a(Boolean.valueOf(w730Var.d)), u1c.M(-1210841545, new mtz(androidx.compose.runtime.e.f(w730Var.c, fetVar), a830Var, w430Var, (byte) 15), fetVar), fetVar, 56);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(-1663850219, fetVar, z);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x063c  */
    /* JADX WARN: Code duplicated, block: B:199:0x063e A[PHI: r5
  0x063e: PHI (r5v44 java.lang.String) = (r5v42 java.lang.String), (r5v45 java.lang.String) binds: [B:208:0x065e, B:197:0x063a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        pfx pfxVarI;
        Window window;
        View decorView;
        boolean z;
        boolean z2;
        ch80 ch80VarF;
        boolean z3;
        ch80 ch80VarF2;
        String str;
        String strW;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj3;
        byte b = this.f34675a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.b;
        byte b2 = 2;
        byte b3 = 3;
        final byte b4 = 0;
        switch (b) {
            case 0:
                boolean z7 = false;
                a8z a8zVar = ((vx) obj4).N1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                hfk0 hfk0Var = vx.P1;
                if ((iIntValue & 3) != 2) {
                    z7 = true;
                }
                if (fetVar.U(iIntValue & 1, z7)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    mm40 mm40VarE0 = o2e.e0(o7k0.c, "ADDITIONAL_INFO_SCREEN_TAG");
                    az azVar = (az) pz40VarY.getValue();
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new t0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar.o0(objP);
                    }
                    b34.a(mm40VarE0, azVar, (Function1) ((jhy) objP), fetVar, 6);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                dm0 dm0Var = (dm0) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                pek0 pek0Var = dm0.S1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d9z d9zVarA = f9z.a(fetVar2);
                    d9z d9zVarA2 = f9z.a(fetVar2);
                    xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                    xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                    pz40 pz40VarY2 = ((i3t0) dm0Var.G0()).y(fetVar2);
                    k3t0 k3t0VarG0 = dm0Var.G0();
                    boolean zI2 = fetVar2.i(dm0Var);
                    Object objP2 = fetVar2.P();
                    Object obj5 = objP2;
                    if (zI2 || objP2 == cl5Var) {
                        t1 t1Var = new t1(dm0Var, (byte) 20);
                        fetVar2.o0(t1Var);
                        obj5 = t1Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) obj5, fetVar2);
                    boolean zI3 = fetVar2.i(k3t0VarG0) | fetVar2.i(dm0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP3 = fetVar2.P();
                    Object obj6 = objP3;
                    if (zI3 || objP3 == cl5Var) {
                        l10 l10Var = new l10(k3t0VarG0, dm0Var, pz40VarF, null, (byte) 3);
                        fetVar2.o0(l10Var);
                        obj6 = l10Var;
                    }
                    m0x0.t(fetVar2, dm0Var, (Function2) obj6);
                    n0q n0qVar = o7k0.c;
                    k3t0 k3t0VarG1 = dm0Var.G0();
                    boolean zI4 = fetVar2.i(k3t0VarG1);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        t90 t90Var = new t90(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar2.o0(t90Var);
                        objP4 = t90Var;
                    }
                    zgc.c(n0qVar, pz40VarY2, d9zVarA, d9zVarA2, xczVarA, xczVarA2, (Function1) ((jhy) objP4), fetVar2, 6);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                e11 e11Var = (e11) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                qek0 qek0Var = e11.W1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objP5 = fetVar3.P();
                    if (objP5 == cl5Var) {
                        kxq kxqVarB = e11Var.B();
                        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                            objP5 = null;
                        } else {
                            WeakHashMap weakHashMap = rgu0.f30456a;
                            objP5 = jgu0.a(decorView);
                        }
                        fetVar3.o0(objP5);
                    }
                    xiv0 xiv0Var = (xiv0) objP5;
                    Object objP6 = fetVar3.P();
                    if (objP6 == cl5Var) {
                        objP6 = Integer.valueOf((xiv0Var == null || (pfxVarI = xiv0Var.f40966a.i(1)) == null) ? 0 : pfxVarI.b);
                        fetVar3.o0(objP6);
                    }
                    int iIntValue4 = ((Number) objP6).intValue();
                    k3t0 k3t0VarG2 = e11Var.G0();
                    boolean zI5 = fetVar3.i(e11Var);
                    Object objP7 = fetVar3.P();
                    if (zI5 || objP7 == cl5Var) {
                        t90 t90Var2 = new t90(1, e11Var, e11.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/gifts/presentation/models/AggregatorGiftsSideEffect;)V", 0, (byte) 28);
                        fetVar3.o0(t90Var2);
                        objP7 = t90Var2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP7), fetVar3);
                    boolean zI6 = fetVar3.i(k3t0VarG2) | fetVar3.i(e11Var) | fetVar3.e(3) | fetVar3.g(pz40VarF2);
                    Object objP8 = fetVar3.P();
                    if (zI6 || objP8 == cl5Var) {
                        l10 l10Var2 = new l10(k3t0VarG2, e11Var, pz40VarF2, null, (byte) 7);
                        fetVar3.o0(l10Var2);
                        objP8 = l10Var2;
                    }
                    m0x0.t(fetVar3, e11Var, (Function2) objP8);
                    pz40 pz40VarY3 = ((i3t0) e11Var.G0()).y(fetVar3);
                    n0q n0qVar2 = o7k0.c;
                    lh80 lh80VarU = s5x0.u(0.0f, pkd.e(iIntValue4, fetVar3), 0.0f, 0.0f, 13);
                    k3t0 k3t0VarG3 = e11Var.G0();
                    boolean zI7 = fetVar3.i(k3t0VarG3);
                    Object objP9 = fetVar3.P();
                    if (zI7 || objP9 == cl5Var) {
                        t90 t90Var3 = new t90(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar3.o0(t90Var3);
                        objP9 = t90Var3;
                    }
                    qjj.b(n0qVar2, pz40VarY3, lh80VarU, (Function1) ((jhy) objP9), fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                je1 je1Var = (je1) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                hfk0 hfk0Var2 = je1.S1;
                if (fetVar4.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    float fT = fbc.T(fetVar4);
                    k3t0 k3t0VarG4 = je1Var.G0();
                    boolean zI8 = fetVar4.i(je1Var);
                    Object objP10 = fetVar4.P();
                    if (zI8 || objP10 == cl5Var) {
                        c21 c21Var = new c21(1, je1Var, je1.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/promo/presentation/models/AggregatorPromoSideEffect;)V", 0, (byte) 24);
                        fetVar4.o0(c21Var);
                        objP10 = c21Var;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP10), fetVar4);
                    boolean zI9 = fetVar4.i(k3t0VarG4) | fetVar4.i(je1Var) | fetVar4.e(3) | fetVar4.g(pz40VarF3);
                    Object objP11 = fetVar4.P();
                    if (zI9 || objP11 == cl5Var) {
                        l10 l10Var3 = new l10(k3t0VarG4, je1Var, pz40VarF3, null, (byte) 9);
                        fetVar4.o0(l10Var3);
                        objP11 = l10Var3;
                    }
                    m0x0.t(fetVar4, je1Var, (Function2) objP11);
                    pz40 pz40VarY4 = ((i3t0) je1Var.G0()).y(fetVar4);
                    n0q n0qVar3 = o7k0.c;
                    lh80 lh80VarU2 = s5x0.u(0.0f, fT, 0.0f, 0.0f, 13);
                    k3t0 k3t0VarG5 = je1Var.G0();
                    boolean zI10 = fetVar4.i(k3t0VarG5);
                    Object objP12 = fetVar4.P();
                    if (zI10 || objP12 == cl5Var) {
                        c21 c21Var2 = new c21(1, k3t0VarG5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar4.o0(c21Var2);
                        objP12 = c21Var2;
                    }
                    knx.c(n0qVar3, pz40VarY4, lh80VarU2, (Function1) ((jhy) objP12), fetVar4, 6);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                qj1 qj1Var = (qj1) obj4;
                kiu0 kiu0Var = qj1Var.O1;
                fet fetVar5 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                qek0 qek0Var2 = qj1.X1;
                if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    d9z d9zVarA3 = f9z.a(fetVar5);
                    Object objP13 = fetVar5.P();
                    Object obj7 = objP13;
                    if (objP13 == cl5Var) {
                        vne vneVarI = m0x0.I(kotlin.coroutines.g.f46065a, fetVar5);
                        fetVar5.o0(vneVarI);
                        obj7 = vneVarI;
                    }
                    vne vneVar = (vne) obj7;
                    bk1 bk1Var = (bk1) kiu0Var.getValue();
                    int i = bk1.D;
                    k8d0 k8d0Var = (k8d0) bk1Var.y(fetVar5).getValue();
                    bk1 bk1Var2 = (bk1) kiu0Var.getValue();
                    boolean zI11 = fetVar5.i(vneVar) | fetVar5.g(d9zVarA3) | fetVar5.i(qj1Var);
                    Object objP14 = fetVar5.P();
                    Object obj8 = objP14;
                    if (zI11 || objP14 == cl5Var) {
                        m51 m51Var = new m51(vneVar, qj1Var, d9zVarA3);
                        fetVar5.o0(m51Var);
                        obj8 = m51Var;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) obj8, fetVar5);
                    boolean zI12 = fetVar5.i(bk1Var2) | fetVar5.i(qj1Var) | fetVar5.e(3) | fetVar5.g(pz40VarF4);
                    Object objP15 = fetVar5.P();
                    if (zI12 || objP15 == cl5Var) {
                        objP15 = new l10(bk1Var2, qj1Var, pz40VarF4, null, (byte) 11);
                        fetVar5.o0(objP15);
                    }
                    m0x0.t(fetVar5, qj1Var, (Function2) objP15);
                    n0q n0qVar4 = o7k0.c;
                    boolean s1 = qj1Var.getS1();
                    bk1 bk1Var3 = (bk1) kiu0Var.getValue();
                    boolean zI13 = fetVar5.i(bk1Var3);
                    Object objP16 = fetVar5.P();
                    if (zI13 || objP16 == cl5Var) {
                        objP16 = new c21(1, bk1Var3, bk1.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/publishers/games/presentation/models/PublisherGamesAction;)V", 0, (byte) 28);
                        fetVar5.o0(objP16);
                    }
                    Function1 function1 = (Function1) ((jhy) objP16);
                    zx7 zx7Var = gqw0.e;
                    n0qVar4.getClass();
                    k8d0Var.getClass();
                    function1.getClass();
                    clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar5), fetVar5, 24576);
                    mm40 mm40VarV = cjx.V(o050.W(o2e.e0(n0qVar4, "PUBLISHER_GAMES_SCREEN")), cloVarB.e, 0);
                    mw3 mw3Var = uc9.c;
                    xx7 xx7Var = gqw0.m;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarV);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar5, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar5, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar5, numValueOf, shdVar3);
                    jpm0.n(fetVar5);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar5, mm40VarC0, shdVar4);
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar5.k(zfnVar)).getBackgroundContent();
                    ljc ljcVar = jd8.n;
                    jm40 jm40Var = jm40.b;
                    ahy.b(i120.Q(jm40Var, backgroundContent, ljcVar), cloVarB, true, u1c.M(1535313773, new mz7(k8d0Var, function1, (byte) 27), fetVar5), cwr0.f5094a, fetVar5, 28032, 0);
                    mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar5.k(zfnVar)).getBackground(), ljcVar);
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarQ);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA2, shdVar);
                    jpm0.o(fetVar5, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar5, shdVar3, fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, shdVar4);
                    rdt rdtVar = k8d0Var.b;
                    if (rdtVar instanceof mdt) {
                        x7z x7zVarF = rz4.f(fetVar5, -297980683, 1.0f, true);
                        aml amlVar = new aml(k8d0Var.c, xll.f41078a, true);
                        fetVar5.e0(1237335957);
                        zcl zclVar = qmk.f28987a;
                        lh80 lh80Var = new lh80(qmk.a(fetVar5).c, 8.0f, qmk.a(fetVar5).c, 24.0f);
                        if (s1) {
                            fetVar5.e0(-1468259314);
                            ch80VarF2 = knm0.g(lh80Var, fetVar5);
                            z3 = false;
                            fetVar5.r(false);
                        } else {
                            z3 = false;
                            fetVar5.e0(-1468166841);
                            ch80VarF2 = knm0.f(lh80Var, fetVar5);
                            fetVar5.r(false);
                        }
                        ch80 ch80Var = ch80VarF2;
                        fetVar5.r(z3);
                        ckb.f(x7zVarF, amlVar, null, ch80Var, null, null, null, null, fetVar5, 0, 244);
                        fetVar5.r(z3);
                    } else {
                        if (rdtVar instanceof adt) {
                            mm40 mm40VarH = phu0.H(rz4.f(fetVar5, -296901945, 1.0f, true), null, 1);
                            zll zllVar = ((adt) rdtVar).f696a;
                            fetVar5.e0(1237366325);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80Var2 = new lh80(qmk.a(fetVar5).c, 8.0f, qmk.a(fetVar5).c, 24.0f);
                            if (s1) {
                                fetVar5.e0(1954785925);
                                ch80VarF = knm0.g(lh80Var2, fetVar5);
                                z2 = false;
                                fetVar5.r(false);
                            } else {
                                z2 = false;
                                fetVar5.e0(1954878398);
                                ch80VarF = knm0.f(lh80Var2, fetVar5);
                                fetVar5.r(false);
                            }
                            ch80 ch80Var2 = ch80VarF;
                            fetVar5.r(z2);
                            boolean zG = fetVar5.g(function1);
                            Object objP17 = fetVar5.P();
                            Object obj9 = objP17;
                            if (zG || objP17 == cl5Var) {
                                si1 si1Var = new si1(function1, (byte) 2);
                                fetVar5.o0(si1Var);
                                obj9 = si1Var;
                            }
                            Function0 function0 = (Function0) obj9;
                            boolean zG2 = fetVar5.g(function1);
                            Object objP18 = fetVar5.P();
                            Object obj10 = objP18;
                            if (zG2 || objP18 == cl5Var) {
                                h61 h61Var = new h61(function1, (byte) 11);
                                fetVar5.o0(h61Var);
                                obj10 = h61Var;
                            }
                            Function1 function2 = (Function1) obj10;
                            boolean zG3 = fetVar5.g(function1);
                            Object objP19 = fetVar5.P();
                            Object obj11 = objP19;
                            if (zG3 || objP19 == cl5Var) {
                                h61 h61Var2 = new h61(function1, (byte) 12);
                                fetVar5.o0(h61Var2);
                                obj11 = h61Var2;
                            }
                            ckb.f(mm40VarH, zllVar, null, ch80Var2, function0, null, function2, (Function1) obj11, fetVar5, 0, 36);
                            fetVar5.r(false);
                        } else if (rdtVar instanceof cdt) {
                            fetVar5.e0(-295171990);
                            mm40 mm40VarD = o7k0.d(new x7z(1.0f, true), 1.0f);
                            tj30 tj30VarC = zq8.c(zx7Var, false);
                            int iHashCode3 = Long.hashCode(fetVar5.T);
                            bh90 bh90VarM3 = fetVar5.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarD);
                            fetVar5.i0();
                            if (fetVar5.S) {
                                fetVar5.l(pcyVar);
                            } else {
                                fetVar5.r0();
                            }
                            jpm0.o(fetVar5, tj30VarC, shdVar);
                            jpm0.o(fetVar5, bh90VarM3, shdVar2);
                            vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
                            jpm0.o(fetVar5, mm40VarC2, shdVar4);
                            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar5, s1), 7);
                            mdm mdmVar = ((cdt) rdtVar).f4178a;
                            Object objP20 = fetVar5.P();
                            Object obj12 = objP20;
                            if (objP20 == cl5Var) {
                                c51 c51Var = new c51((byte) 7);
                                fetVar5.o0(c51Var);
                                obj12 = c51Var;
                            }
                            jcb.l(mm40VarN, mdmVar, false, (Function0) obj12, fetVar5, 3072, 4);
                            fetVar5.r(true);
                            fetVar5.r(false);
                            z = true;
                        } else {
                            if (!(rdtVar instanceof gdt)) {
                                throw b1j.f(1237314078, fetVar5, false);
                            }
                            fetVar5.e0(-294579270);
                            mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                            int iHashCode4 = Long.hashCode(fetVar5.T);
                            bh90 bh90VarM4 = fetVar5.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarD2);
                            fetVar5.i0();
                            if (fetVar5.S) {
                                fetVar5.l(pcyVar);
                            } else {
                                fetVar5.r0();
                            }
                            jpm0.o(fetVar5, tj30VarC2, shdVar);
                            jpm0.o(fetVar5, bh90VarM4, shdVar2);
                            vqd.u(iHashCode4, fetVar5, shdVar3, fetVar5);
                            jpm0.o(fetVar5, mm40VarC3, shdVar4);
                            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar5, s1), 7);
                            mdm mdmVar2 = ((gdt) rdtVar).f11117a;
                            boolean zG4 = fetVar5.g(function1);
                            Object objP21 = fetVar5.P();
                            Object obj13 = objP21;
                            if (zG4 || objP21 == cl5Var) {
                                si1 si1Var2 = new si1(function1, (byte) 3);
                                fetVar5.o0(si1Var2);
                                obj13 = si1Var2;
                            }
                            jcb.l(mm40VarN2, mdmVar2, false, (Function0) obj13, fetVar5, 0, 4);
                            z = true;
                            fetVar5.r(true);
                            fetVar5.r(false);
                        }
                        fetVar5.r(z);
                        fetVar5.r(z);
                    }
                    z = true;
                    fetVar5.r(z);
                    fetVar5.r(z);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                org.xplatform.special_event.impl.alleventsgames.presentation.a aVar = (org.xplatform.special_event.impl.alleventsgames.presentation.a) obj4;
                fet fetVar6 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                hfk0 hfk0Var3 = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                if (fetVar6.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zI14 = fetVar6.i(aVar);
                    Object objP22 = fetVar6.P();
                    if (zI14 || objP22 == cl5Var) {
                        objP22 = new w22(aVar, b2);
                        fetVar6.o0(objP22);
                    }
                    Function0 function3 = (Function0) objP22;
                    boolean zI15 = fetVar6.i(aVar);
                    Object objP23 = fetVar6.P();
                    if (zI15 || objP23 == cl5Var) {
                        objP23 = new w22(aVar, b3);
                        fetVar6.o0(objP23);
                    }
                    v3c.z(function3, (Function0) objP23, null, fetVar6, 0, 4);
                    k3t0 k3t0VarH0 = aVar.H0();
                    boolean zI16 = fetVar6.i(aVar);
                    Object objP24 = fetVar6.P();
                    if (zI16 || objP24 == cl5Var) {
                        ln1 ln1Var = new ln1(1, aVar, org.xplatform.special_event.impl.alleventsgames.presentation.a.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesSideEffect;)V", 0, (byte) 8);
                        fetVar6.o0(ln1Var);
                        objP24 = ln1Var;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP24), fetVar6);
                    boolean zI17 = fetVar6.i(k3t0VarH0) | fetVar6.i(aVar) | fetVar6.e(3) | fetVar6.g(pz40VarF5);
                    Object objP25 = fetVar6.P();
                    if (zI17 || objP25 == cl5Var) {
                        l10 l10Var4 = new l10(k3t0VarH0, aVar, pz40VarF5, null, (byte) 15);
                        fetVar6.o0(l10Var4);
                        objP25 = l10Var4;
                    }
                    m0x0.t(fetVar6, aVar, (Function2) objP25);
                    pz40 pz40VarY5 = ((i3t0) aVar.H0()).y(fetVar6);
                    AllEventGamesScreenParams allEventGamesScreenParamsG0 = aVar.G0();
                    if (allEventGamesScreenParamsG0 instanceof AllEventGamesScreenParams.AllGames) {
                        fetVar6.e0(-689631376);
                        strW = rsm0.w(R.string.news_matches, 0, fetVar6);
                        fetVar6.r(false);
                    } else if (allEventGamesScreenParamsG0 instanceof AllEventGamesScreenParams.StadiumGames) {
                        fetVar6.e0(96361724);
                        fetVar6.r(false);
                        AllEventGamesScreenParams allEventGamesScreenParamsG1 = aVar.G0();
                        AllEventGamesScreenParams.StadiumGames stadiumGames = allEventGamesScreenParamsG1 instanceof AllEventGamesScreenParams.StadiumGames ? (AllEventGamesScreenParams.StadiumGames) allEventGamesScreenParamsG1 : null;
                        str = stadiumGames != null ? stadiumGames.c : null;
                        if (str == null) {
                            strW = "";
                        } else {
                            strW = str;
                        }
                    } else {
                        if (!(allEventGamesScreenParamsG0 instanceof AllEventGamesScreenParams.ParticipantGames)) {
                            throw b1j.f(-689633435, fetVar6, false);
                        }
                        fetVar6.e0(96546484);
                        fetVar6.r(false);
                        AllEventGamesScreenParams allEventGamesScreenParamsG2 = aVar.G0();
                        AllEventGamesScreenParams.ParticipantGames participantGames = allEventGamesScreenParamsG2 instanceof AllEventGamesScreenParams.ParticipantGames ? (AllEventGamesScreenParams.ParticipantGames) allEventGamesScreenParamsG2 : null;
                        str = participantGames != null ? participantGames.c : null;
                        if (str == null) {
                            strW = "";
                        } else {
                            strW = str;
                        }
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long secondary = s6t0.b().f33626a.getSecondary();
                    long backgroundContent2 = s6t0.b().f33626a.getBackgroundContent();
                    boolean zG5 = fetVar6.g(strW) | fetVar6.f(secondary) | fetVar6.f(backgroundContent2);
                    Object objP26 = fetVar6.P();
                    if (zG5 || objP26 == cl5Var) {
                        objP26 = new imm(new ilm(secondary), new plm(strW, secondary, fa50.f9191a), fmm.f9790a, backgroundContent2, true, null);
                        fetVar6.o0(objP26);
                    }
                    bsr0.a(438, u1c.M(-1461047377, new ri1((imm) objP26, aVar, (byte) 27), fetVar6), u1c.M(-534292624, new ri1(pz40VarY5, aVar, (byte) 1), fetVar6), fetVar6, o7k0.c);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                return a(obj, obj2);
            case 7:
                return b(obj, obj2);
            case 8:
                return c(obj, obj2);
            case 9:
                return g(obj, obj2);
            case 10:
                return h(obj, obj2);
            case 11:
                return i(obj, obj2);
            case 12:
                return l(obj, obj2);
            case 13:
                return m(obj, obj2);
            case 14:
                return o(obj, obj2);
            case 15:
                t9n t9nVar = (t9n) obj4;
                fet fetVar7 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Integer num = t9nVar.c;
                    fetVar7.e0(460904702);
                    j0x.b(a8k0.F(num.intValue(), 0, fetVar7), null, o2e.e0(o7k0.c, "ASYNC_IMAGE"), null, gqw0.h1, 0.0f, new m78(((ThemeColors) fetVar7.k(zaq0.b)).getBackgroundLight60(), 9), fetVar7, 25016, 40);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 16:
                s9n s9nVar = (s9n) obj4;
                fet fetVar8 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Integer numS = s9nVar.s();
                    if (numS == null) {
                        fetVar8.e0(1916303053);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(1916303054);
                        j0x.b(a8k0.F(numS.intValue(), 0, fetVar8), null, o7k0.c, null, gqw0.h1, 0.0f, null, fetVar8, 25016, 104);
                        fetVar8.r(false);
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 17:
                return p(obj, obj2);
            case 18:
                return r(obj, obj2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return s(obj, obj2);
            case 20:
                return t(obj, obj2);
            case 21:
                return u(obj, obj2);
            case 22:
                return v(obj, obj2);
            case 23:
                return w(obj, obj2);
            case 24:
                return x(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return y(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return z(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return A(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return B(obj, obj2);
            default:
                as80 as80Var = (as80) obj4;
                fet fetVar9 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                fl70 fl70Var = as80.Y1;
                if (fetVar9.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    float fT2 = fbc.T(fetVar9);
                    boolean zD = fetVar9.d(fT2);
                    Object objP27 = fetVar9.P();
                    Object obj14 = objP27;
                    if (zD || objP27 == cl5Var) {
                        lh80 lh80VarU3 = s5x0.u(0.0f, fT2, 0.0f, 0.0f, 13);
                        fetVar9.o0(lh80VarU3);
                        obj14 = lh80VarU3;
                    }
                    hh80 hh80Var = (hh80) obj14;
                    jt80 jt80VarH0 = as80Var.H0();
                    int i2 = jt80.s0;
                    final ss80 ss80Var = (ss80) jt80VarH0.y(fetVar9).getValue();
                    jt80 jt80VarH1 = as80Var.H0();
                    boolean zI18 = fetVar9.i(as80Var);
                    Object objP28 = fetVar9.P();
                    if (zI18 || objP28 == cl5Var) {
                        objP28 = new xj80(1, as80Var, as80.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/part_type_one/presentation/models/PartTypeOneSideEffect;)V", 0, (byte) 5);
                        fetVar9.o0(objP28);
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP28), fetVar9);
                    boolean zI19 = fetVar9.i(jt80VarH1) | fetVar9.i(as80Var) | fetVar9.e(3) | fetVar9.g(pz40VarF6);
                    Object objP29 = fetVar9.P();
                    boolean z8 = false;
                    if (zI19 || objP29 == cl5Var) {
                        objP29 = new p000(jt80VarH1, as80Var, pz40VarF6, null, (byte) 29);
                        fetVar9.o0(objP29);
                    }
                    m0x0.t(fetVar9, as80Var, (Function2) objP29);
                    jt80 jt80VarH2 = as80Var.H0();
                    boolean zI20 = fetVar9.i(jt80VarH2);
                    Object objP30 = fetVar9.P();
                    if (zI20 || objP30 == cl5Var) {
                        objP30 = new xj80(1, jt80VarH2, jt80.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/part_type_one/presentation/models/PartTypeOneAction;)V", 0, (byte) 6);
                        fetVar9.o0(objP30);
                    }
                    final Function1 function4 = (Function1) ((jhy) objP30);
                    zx7 zx7Var2 = gqw0.e;
                    hh80Var.getClass();
                    ss80Var.getClass();
                    function4.getClass();
                    clo cloVarB2 = lyq0.b(ob3.d(0, 7, fetVar9), fetVar9, 24576);
                    tq80 tq80Var = ss80Var.e;
                    es80 es80Var = ss80Var.f;
                    tr80 tr80Var = ss80Var.g;
                    boolean zG6 = fetVar9.g(cloVarB2);
                    Object objP31 = fetVar9.P();
                    Object obj15 = objP31;
                    if (zG6 || objP31 == cl5Var) {
                        is80 is80Var = new is80(cloVarB2, z8, b4);
                        fetVar9.o0(is80Var);
                        obj15 = is80Var;
                    }
                    m0x0.v(tq80Var, tr80Var, (Function2) obj15, fetVar9);
                    mm40 mm40VarV2 = cjx.V(lgb.K(i120.Q(s5x0.I(o2e.e0(o7k0.c, "PART_TYPE_ONE_SCREEN"), hh80Var), ((ThemeColors) fetVar9.k(zaq0.b)).getBackground(), jd8.n)), cloVarB2.e, z8);
                    mw3 mw3Var2 = uc9.c;
                    xx7 xx7Var2 = gqw0.m;
                    x5d x5dVarA3 = w5d.a(mw3Var2, xx7Var2, fetVar9, 0);
                    int iHashCode5 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM5 = fetVar9.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar9, mm40VarV2);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar9, x5dVarA3, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar9, bh90VarM5, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar9, numValueOf2, shdVar7);
                    jpm0.n(fetVar9);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar9, mm40VarC4, shdVar8);
                    jm40 jm40Var2 = jm40.b;
                    final byte b5 = 1;
                    ahy.b(o2e.e0(jm40Var2, "PART_TYPE_ONE_SCREEN_NAVBAR"), cloVarB2, ss80Var.f32714a, u1c.M(-1021073256, new Function2() { // from class: a.gs80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj16, Object obj17) {
                            jm40 jm40Var3;
                            byte b6 = b4;
                            cl5 cl5Var2 = ukd.f35823a;
                            Function1 function5 = function4;
                            ss80 ss80Var2 = ss80Var;
                            switch (b6) {
                                case 0:
                                    fet fetVar10 = (fet) obj16;
                                    int iIntValue11 = ((Integer) obj17).intValue();
                                    if (fetVar10.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                        imm immVar = ss80Var2.d;
                                        boolean zG7 = fetVar10.g(function5);
                                        Object objP32 = fetVar10.P();
                                        if (zG7 || objP32 == cl5Var2) {
                                            objP32 = new ma70(function5, (byte) 22);
                                            fetVar10.o0(objP32);
                                        }
                                        Function0 function6 = (Function0) objP32;
                                        boolean zG8 = fetVar10.g(function5);
                                        Object objP33 = fetVar10.P();
                                        if (zG8 || objP33 == cl5Var2) {
                                            objP33 = new i160(function5, (byte) 27);
                                            fetVar10.o0(objP33);
                                        }
                                        hlm.c(null, immVar, null, function6, null, (Function1) objP33, null, null, null, null, null, null, fetVar10, 0, 0, 4053);
                                    } else {
                                        fetVar10.X();
                                    }
                                    break;
                                default:
                                    fet fetVar11 = (fet) obj16;
                                    int iIntValue12 = ((Integer) obj17).intValue();
                                    if (fetVar11.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                                        x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar11, 0);
                                        int iHashCode6 = Long.hashCode(fetVar11.T);
                                        bh90 bh90VarM6 = fetVar11.m();
                                        jm40 jm40Var4 = jm40.b;
                                        mm40 mm40VarC5 = kbc.c0(fetVar11, jm40Var4);
                                        mkd.c0.getClass();
                                        fetVar11.i0();
                                        if (fetVar11.S) {
                                            fetVar11.l(e7z.u1);
                                        } else {
                                            fetVar11.r0();
                                        }
                                        jpm0.o(fetVar11, x5dVarA4, gqw0.x);
                                        jpm0.o(fetVar11, bh90VarM6, gqw0.w);
                                        jpm0.o(fetVar11, Integer.valueOf(iHashCode6), gqw0.y);
                                        jpm0.n(fetVar11);
                                        jpm0.o(fetVar11, mm40VarC5, gqw0.v);
                                        tq80 tq80Var2 = ss80Var2.e;
                                        tr80 tr80Var2 = ss80Var2.g;
                                        if (tq80Var2 instanceof rq80) {
                                            fetVar11.e0(1021215157);
                                            rq80 rq80Var = (rq80) tq80Var2;
                                            ijl ijlVarA = rq80Var.a();
                                            jjl jjlVarB = rq80Var.b();
                                            boolean zG9 = fetVar11.g(function5);
                                            Object objP34 = fetVar11.P();
                                            if (zG9 || objP34 == cl5Var2) {
                                                objP34 = new ma70(function5, (byte) 27);
                                                fetVar11.o0(objP34);
                                            }
                                            Function0 function7 = (Function0) objP34;
                                            boolean zG10 = fetVar11.g(function5);
                                            Object objP35 = fetVar11.P();
                                            if (zG10 || objP35 == cl5Var2) {
                                                objP35 = new ma70(function5, (byte) 20);
                                                fetVar11.o0(objP35);
                                            }
                                            Function0 function8 = (Function0) objP35;
                                            boolean zG11 = fetVar11.g(function5);
                                            Object objP36 = fetVar11.P();
                                            if (zG11 || objP36 == cl5Var2) {
                                                objP36 = new ma70(function5, (byte) 21);
                                                fetVar11.o0(objP36);
                                            }
                                            jm40Var3 = jm40Var4;
                                            feb.k(ijlVarA, jjlVarB, null, function7, function8, (Function0) objP36, fetVar11, 0, 4);
                                            fetVar11.r(false);
                                        } else {
                                            jm40Var3 = jm40Var4;
                                            fetVar11.e0(1021964737);
                                            fetVar11.r(false);
                                        }
                                        mbc.o(zfi0.f44303a, null, false, fetVar11, 6, 6);
                                        boolean z9 = tr80Var2 instanceof qr80;
                                        if ((!z9 || ((qr80) tr80Var2).b.isEmpty()) && !(tr80Var2 instanceof sr80)) {
                                            fetVar11.e0(1023359489);
                                            fetVar11.r(false);
                                        } else {
                                            fetVar11.e0(1022341790);
                                            zcl zclVar3 = qmk.f28987a;
                                            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var3, 0.0f, 8.0f, 0.0f, 8.0f, 5), "PART_TYPE_ONE_SCREEN_BANNERS");
                                            a4x a4xVar = z9 ? ((qr80) tr80Var2).b : lak0.c;
                                            lq5 lq5VarA = tr80Var2.a();
                                            boolean z10 = tr80Var2 instanceof sr80;
                                            boolean zG12 = fetVar11.g(function5);
                                            Object objP37 = fetVar11.P();
                                            if (zG12 || objP37 == cl5Var2) {
                                                objP37 = new x6s(function5, (byte) 29);
                                                fetVar11.o0(objP37);
                                            }
                                            etl.e(mm40VarE1, a4xVar, lq5VarA, z10, null, 0.0f, 0, null, (Function2) objP37, fetVar11, 0, 240);
                                            fetVar11 = fetVar11;
                                            fetVar11.r(false);
                                        }
                                        fetVar11.r(true);
                                    } else {
                                        fetVar11.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar9), u1c.M(-770971977, new Function2() { // from class: a.gs80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj16, Object obj17) {
                            jm40 jm40Var3;
                            byte b6 = b5;
                            cl5 cl5Var2 = ukd.f35823a;
                            Function1 function5 = function4;
                            ss80 ss80Var2 = ss80Var;
                            switch (b6) {
                                case 0:
                                    fet fetVar10 = (fet) obj16;
                                    int iIntValue11 = ((Integer) obj17).intValue();
                                    if (fetVar10.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                        imm immVar = ss80Var2.d;
                                        boolean zG7 = fetVar10.g(function5);
                                        Object objP32 = fetVar10.P();
                                        if (zG7 || objP32 == cl5Var2) {
                                            objP32 = new ma70(function5, (byte) 22);
                                            fetVar10.o0(objP32);
                                        }
                                        Function0 function6 = (Function0) objP32;
                                        boolean zG8 = fetVar10.g(function5);
                                        Object objP33 = fetVar10.P();
                                        if (zG8 || objP33 == cl5Var2) {
                                            objP33 = new i160(function5, (byte) 27);
                                            fetVar10.o0(objP33);
                                        }
                                        hlm.c(null, immVar, null, function6, null, (Function1) objP33, null, null, null, null, null, null, fetVar10, 0, 0, 4053);
                                    } else {
                                        fetVar10.X();
                                    }
                                    break;
                                default:
                                    fet fetVar11 = (fet) obj16;
                                    int iIntValue12 = ((Integer) obj17).intValue();
                                    if (fetVar11.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                                        x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar11, 0);
                                        int iHashCode6 = Long.hashCode(fetVar11.T);
                                        bh90 bh90VarM6 = fetVar11.m();
                                        jm40 jm40Var4 = jm40.b;
                                        mm40 mm40VarC5 = kbc.c0(fetVar11, jm40Var4);
                                        mkd.c0.getClass();
                                        fetVar11.i0();
                                        if (fetVar11.S) {
                                            fetVar11.l(e7z.u1);
                                        } else {
                                            fetVar11.r0();
                                        }
                                        jpm0.o(fetVar11, x5dVarA4, gqw0.x);
                                        jpm0.o(fetVar11, bh90VarM6, gqw0.w);
                                        jpm0.o(fetVar11, Integer.valueOf(iHashCode6), gqw0.y);
                                        jpm0.n(fetVar11);
                                        jpm0.o(fetVar11, mm40VarC5, gqw0.v);
                                        tq80 tq80Var2 = ss80Var2.e;
                                        tr80 tr80Var2 = ss80Var2.g;
                                        if (tq80Var2 instanceof rq80) {
                                            fetVar11.e0(1021215157);
                                            rq80 rq80Var = (rq80) tq80Var2;
                                            ijl ijlVarA = rq80Var.a();
                                            jjl jjlVarB = rq80Var.b();
                                            boolean zG9 = fetVar11.g(function5);
                                            Object objP34 = fetVar11.P();
                                            if (zG9 || objP34 == cl5Var2) {
                                                objP34 = new ma70(function5, (byte) 27);
                                                fetVar11.o0(objP34);
                                            }
                                            Function0 function7 = (Function0) objP34;
                                            boolean zG10 = fetVar11.g(function5);
                                            Object objP35 = fetVar11.P();
                                            if (zG10 || objP35 == cl5Var2) {
                                                objP35 = new ma70(function5, (byte) 20);
                                                fetVar11.o0(objP35);
                                            }
                                            Function0 function8 = (Function0) objP35;
                                            boolean zG11 = fetVar11.g(function5);
                                            Object objP36 = fetVar11.P();
                                            if (zG11 || objP36 == cl5Var2) {
                                                objP36 = new ma70(function5, (byte) 21);
                                                fetVar11.o0(objP36);
                                            }
                                            jm40Var3 = jm40Var4;
                                            feb.k(ijlVarA, jjlVarB, null, function7, function8, (Function0) objP36, fetVar11, 0, 4);
                                            fetVar11.r(false);
                                        } else {
                                            jm40Var3 = jm40Var4;
                                            fetVar11.e0(1021964737);
                                            fetVar11.r(false);
                                        }
                                        mbc.o(zfi0.f44303a, null, false, fetVar11, 6, 6);
                                        boolean z9 = tr80Var2 instanceof qr80;
                                        if ((!z9 || ((qr80) tr80Var2).b.isEmpty()) && !(tr80Var2 instanceof sr80)) {
                                            fetVar11.e0(1023359489);
                                            fetVar11.r(false);
                                        } else {
                                            fetVar11.e0(1022341790);
                                            zcl zclVar3 = qmk.f28987a;
                                            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var3, 0.0f, 8.0f, 0.0f, 8.0f, 5), "PART_TYPE_ONE_SCREEN_BANNERS");
                                            a4x a4xVar = z9 ? ((qr80) tr80Var2).b : lak0.c;
                                            lq5 lq5VarA = tr80Var2.a();
                                            boolean z10 = tr80Var2 instanceof sr80;
                                            boolean zG12 = fetVar11.g(function5);
                                            Object objP37 = fetVar11.P();
                                            if (zG12 || objP37 == cl5Var2) {
                                                objP37 = new x6s(function5, (byte) 29);
                                                fetVar11.o0(objP37);
                                            }
                                            etl.e(mm40VarE1, a4xVar, lq5VarA, z10, null, 0.0f, 0, null, (Function2) objP37, fetVar11, 0, 240);
                                            fetVar11 = fetVar11;
                                            fetVar11.r(false);
                                        }
                                        fetVar11.r(true);
                                    } else {
                                        fetVar11.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar9), fetVar9, 27654, 0);
                    x5d x5dVarA4 = w5d.a(mw3Var2, xx7Var2, fetVar9, 0);
                    int iHashCode6 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM6 = fetVar9.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar9, jm40Var2);
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, x5dVarA4, shdVar5);
                    jpm0.o(fetVar9, bh90VarM6, shdVar6);
                    vqd.u(iHashCode6, fetVar9, shdVar7, fetVar9);
                    jpm0.o(fetVar9, mm40VarC5, shdVar8);
                    mm40 mm40VarD3 = o7k0.d(o2e.e0(jm40Var2, "PART_TYPE_ONE_SCREEN_FILTERS"), 1.0f);
                    mp0 mp0Var = ss80Var.b;
                    pp0 pp0Var = ss80Var.c;
                    zcl zclVar3 = qmk.f28987a;
                    lh80 lh80Var3 = new lh80(qmk.a(fetVar9).c, 0.0f, qmk.a(fetVar9).c, 0.0f);
                    boolean zG7 = fetVar9.g(function4);
                    Object objP32 = fetVar9.P();
                    Object obj16 = objP32;
                    if (zG7 || objP32 == cl5Var) {
                        ma70 ma70Var = new ma70(function4, (byte) 23);
                        fetVar9.o0(ma70Var);
                        obj16 = ma70Var;
                    }
                    Function0 function5 = (Function0) obj16;
                    boolean zG8 = fetVar9.g(function4);
                    Object objP33 = fetVar9.P();
                    Object obj17 = objP33;
                    if (zG8 || objP33 == cl5Var) {
                        i160 i160Var = new i160(function4, (byte) 28);
                        fetVar9.o0(i160Var);
                        obj17 = i160Var;
                    }
                    bkb.e(mm40VarD3, mp0Var, pp0Var, lh80Var3, function5, (Function1) obj17, fetVar9, 6);
                    if (es80Var != null) {
                        if (es80Var instanceof bs80) {
                            x7z x7zVarF2 = rz4.f(fetVar9, -364524104, 1.0f, true);
                            bml bmlVar = ((bs80) es80Var).f3117a;
                            ch80 ch80VarF3 = h97.f(qmk.a(fetVar9).c, 8.0f, qmk.a(fetVar9).c, 24.0f, fetVar9);
                            boolean zG9 = fetVar9.g(function4);
                            Object objP34 = fetVar9.P();
                            Object obj18 = objP34;
                            if (zG9 || objP34 == cl5Var) {
                                ma70 ma70Var2 = new ma70(function4, (byte) 24);
                                fetVar9.o0(ma70Var2);
                                obj18 = ma70Var2;
                            }
                            Function0 function6 = (Function0) obj18;
                            boolean zG10 = fetVar9.g(function4);
                            Object objP35 = fetVar9.P();
                            Object obj19 = objP35;
                            if (zG10 || objP35 == cl5Var) {
                                i160 i160Var2 = new i160(function4, (byte) 29);
                                fetVar9.o0(i160Var2);
                                obj19 = i160Var2;
                            }
                            Function1 function7 = (Function1) obj19;
                            boolean zG11 = fetVar9.g(function4);
                            Object objP36 = fetVar9.P();
                            if (zG11 || objP36 == cl5Var) {
                                z6 = false;
                                hs80 hs80Var = new hs80(function4, false ? 1 : 0);
                                fetVar9.o0(hs80Var);
                                obj3 = hs80Var;
                            } else {
                                z6 = false;
                                obj3 = objP36;
                            }
                            ckb.f(x7zVarF2, bmlVar, null, ch80VarF3, function6, null, function7, (Function1) obj3, fetVar9, 0, 36);
                            fetVar9.r(z6);
                            z5 = true;
                        } else if (es80Var instanceof cs80) {
                            fetVar9.e0(-363048566);
                            mm40 mm40VarD4 = o7k0.d(new x7z(1.0f, true), 1.0f);
                            tj30 tj30VarC3 = zq8.c(zx7Var2, false);
                            int iHashCode7 = Long.hashCode(fetVar9.T);
                            bh90 bh90VarM7 = fetVar9.m();
                            mm40 mm40VarC6 = kbc.c0(fetVar9, mm40VarD4);
                            fetVar9.i0();
                            if (fetVar9.S) {
                                fetVar9.l(pcyVar);
                            } else {
                                fetVar9.r0();
                            }
                            jpm0.o(fetVar9, tj30VarC3, shdVar5);
                            jpm0.o(fetVar9, bh90VarM7, shdVar6);
                            vqd.u(iHashCode7, fetVar9, shdVar7, fetVar9);
                            jpm0.o(fetVar9, mm40VarC6, shdVar8);
                            mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar9, false), 7);
                            mdm mdmVar3 = ((cs80) es80Var).f4876a;
                            boolean zG12 = fetVar9.g(function4);
                            Object objP37 = fetVar9.P();
                            Object obj20 = objP37;
                            if (zG12 || objP37 == cl5Var) {
                                ma70 ma70Var3 = new ma70(function4, (byte) 25);
                                fetVar9.o0(ma70Var3);
                                obj20 = ma70Var3;
                            }
                            jcb.l(mm40VarN3, mdmVar3, false, (Function0) obj20, fetVar9, 0, 4);
                            z5 = true;
                            fetVar9.r(true);
                            fetVar9.r(false);
                        } else {
                            z4 = false;
                            if (es80Var instanceof ds80) {
                                fetVar9.e0(-362328374);
                                mm40 mm40VarD5 = o7k0.d(new x7z(1.0f, true), 1.0f);
                                tj30 tj30VarC4 = zq8.c(zx7Var2, false);
                                int iHashCode8 = Long.hashCode(fetVar9.T);
                                bh90 bh90VarM8 = fetVar9.m();
                                mm40 mm40VarC7 = kbc.c0(fetVar9, mm40VarD5);
                                fetVar9.i0();
                                if (fetVar9.S) {
                                    fetVar9.l(pcyVar);
                                } else {
                                    fetVar9.r0();
                                }
                                jpm0.o(fetVar9, tj30VarC4, shdVar5);
                                jpm0.o(fetVar9, bh90VarM8, shdVar6);
                                vqd.u(iHashCode8, fetVar9, shdVar7, fetVar9);
                                jpm0.o(fetVar9, mm40VarC7, shdVar8);
                                mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar9, false), 7);
                                mdm mdmVar4 = ((ds80) es80Var).f6601a;
                                boolean zG13 = fetVar9.g(function4);
                                Object objP38 = fetVar9.P();
                                Object obj21 = objP38;
                                if (zG13 || objP38 == cl5Var) {
                                    ma70 ma70Var4 = new ma70(function4, (byte) 26);
                                    fetVar9.o0(ma70Var4);
                                    obj21 = ma70Var4;
                                }
                                jcb.l(mm40VarN4, mdmVar4, false, (Function0) obj21, fetVar9, 0, 4);
                                z5 = true;
                                fetVar9.r(true);
                                fetVar9.r(false);
                            }
                        }
                        fetVar9.r(z5);
                        fetVar9.r(z5);
                    } else {
                        z4 = false;
                    }
                    throw b1j.f(126787011, fetVar9, z4);
                }
                fetVar9.X();
                return Unit.f46060a;
        }
    }
}
