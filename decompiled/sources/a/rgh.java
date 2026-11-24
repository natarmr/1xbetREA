package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rgh implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30435a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rgh(h7h h7hVar, k7h k7hVar) {
        this.f30435a = (byte) 1;
        this.c = h7hVar;
        this.b = k7hVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        jxb0 jxb0Var = (jxb0) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((yhg0) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zb zbVar = jxb0Var.b;
            boolean z = jxb0Var.f17298a;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new hcr(function1, (byte) 3);
                fetVar.o0(objP);
            }
            acb.n(zbVar, z, (Function0) objP, null, fetVar, 0, 8);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        yaa yaaVar = (yaa) this.b;
        nrq nrqVar = (nrq) this.c;
        long jLongValue = ((Long) obj).longValue();
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.f(jLongValue) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 72.0f);
            String str = yaaVar.j;
            long jW0 = ibc.w0(jLongValue, bfn.SECONDS);
            uen uenVar = wen.b;
            unh0.f0(mm40VarS, str, kng0.l(String.format(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Long.valueOf(wen.l(jW0, bfn.MINUTES))}, 1)), Separators.COLON, String.format(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue % 60)}, 1))), nrqVar, "CARD_BASKETBALL_STATUS_TEXT", "CARD_BASKETBALL_TIMER_TEXT", fetVar, 224256);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        y5d y5dVar = (y5d) this.b;
        urr urrVar = (urr) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mm40) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            n4c.l(y5dVar.a(s5x0.N(s5x0.L(jm40.b, 4.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13), gqw0.m), urrVar.d, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        y5d y5dVar = (y5d) this.b;
        trr trrVar = (trr) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mm40) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            n4c.l(y5dVar.a(s5x0.J(jm40.b, 8.0f), gqw0.m), trrVar.d, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        i7s i7sVar = (i7s) this.c;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nek nekVar = i7s.a2;
        mm40Var.getClass();
        byte b = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            k3t0 k3t0VarI0 = i7sVar.I0();
            boolean zI = fetVar.i(k3t0VarI0);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                h2s h2sVar = new h2s(1, k3t0VarI0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                fetVar.o0(h2sVar);
                objP = h2sVar;
            }
            Function1 function1 = (Function1) ((jhy) objP);
            l7m0Var.getClass();
            function1.getClass();
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            pz40 pz40VarF = androidx.compose.runtime.e.f(((s7s) l7m0Var.getValue()).e, fetVar);
            boolean zG = fetVar.g(pkk0Var) | fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new e54(pkk0Var, function1, b);
                fetVar.o0(objP2);
            }
            dyb.y(mm40Var, pz40VarF, (Function0) objP2, u1c.M(-999346845, new itz(l7m0Var, function1, (byte) 7), fetVar), u1c.M(-1392345790, new itz(l7m0Var, function1, (byte) 11), fetVar), fetVar, (iIntValue & 14) | 27648);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        cjs cjsVar = (cjs) this.c;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nek nekVar = cjs.a2;
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            k3t0 k3t0VarI0 = cjsVar.I0();
            boolean zI = fetVar.i(k3t0VarI0);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                h2s h2sVar = new h2s(1, k3t0VarI0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                fetVar.o0(h2sVar);
                objP = h2sVar;
            }
            Function1 function1 = (Function1) ((jhy) objP);
            l7m0Var.getClass();
            function1.getClass();
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            boolean zG = fetVar.g(pkk0Var) | fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new e54(pkk0Var, function1, (byte) 3);
                fetVar.o0(objP2);
            }
            vcc.n(mm40Var, (Function0) objP2, u1c.M(-92503480, new itz(l7m0Var, function1, (byte) 8), fetVar), u1c.M(1593396455, new itz(l7m0Var, function1, (byte) 12), fetVar), u1c.M(1046827566, new dqz(l7m0Var, function1, (byte) 19), fetVar), fetVar, (iIntValue & 14) | 28032);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        wft wftVar = (wft) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        bek bekVar = wft.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0Var = (k3t0) wftVar.l2.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                vft vftVar = new vft(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                fetVar.o0(vftVar);
                objP = vftVar;
            }
            vbc.F(l7m0Var, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) this.b;
        axv axvVar = (axv) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        art artVar = axv.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarT = s5x0.t(0.0f, 8.0f, 1);
            boolean zI = fetVar.i(arrayList) | fetVar.i(axvVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new f3s(arrayList, axvVar, (byte) 22);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        vzv vzvVar = (vzv) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        sqt sqtVar = vzv.p2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            g0w g0wVar = (g0w) l7m0Var.getValue();
            if (Intrinsics.d(g0wVar, e0w.f7009a)) {
                fetVar.e0(873406486);
                fetVar.r(false);
            } else {
                if (!(g0wVar instanceof f0w)) {
                    throw b1j.f(873410685, fetVar, false);
                }
                fetVar.e0(1306089312);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null);
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 0.0f, 13);
                boolean zG = fetVar.g(g0wVar) | fetVar.i(vzvVar);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new f3s((f0w) g0wVar, vzvVar, (byte) 24);
                    fetVar.o0(objP);
                }
                b8k0.e(mm40VarV, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        r7w r7wVar = (r7w) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        bst bstVar = r7w.q2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            c8w c8wVar = (c8w) l7m0Var.getValue();
            k3t0 k3t0Var = (k3t0) r7wVar.p2.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                n5w n5wVar = new n5w(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                fetVar.o0(n5wVar);
                objP = n5wVar;
            }
            f7k.o(c8wVar, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        wjw wjwVar = (wjw) this.b;
        Function2 function2 = (Function2) this.c;
        lr8 lr8Var = (lr8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        lr8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fD = lr8Var.d();
            ngv ngvVar = new ngv(3);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 200.0f);
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zG = fetVar.g(wjwVar) | fetVar.d(fD) | fetVar.g(function2);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ny2((Object) wjwVar, fD, (Object) function2, (byte) 6);
                fetVar.o0(objP);
            }
            g8x.h(ngvVar, mm40VarE, null, lh80VarT, qw3Var, qw3Var2, null, false, null, (Function1) objP, fetVar, 0, 0, 916);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        Object obj4;
        pz40 pz40Var = (pz40) this.b;
        rx6 rx6Var = (rx6) this.c;
        Function2 function2 = (Function2) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        function2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.i(function2) ? 4 : 2;
        }
        int i = iIntValue;
        if (fetVar.U(i & 1, (i & 19) != 18)) {
            if (((a8q0) pz40Var.getValue()).f440a.b.length() == 0) {
                fetVar.e0(-1636661902);
                String str = rx6Var.f31248a.b;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.k(), fetVar, 0, 24960, 110586);
                fet fetVar2 = fetVar;
                fetVar2.r(false);
                obj4 = fetVar2;
            } else {
                fet fetVar3 = fetVar;
                fetVar3.e0(-1636289313);
                fetVar3.r(false);
                obj4 = fetVar3;
            }
            function2.invoke(obj4, Integer.valueOf(i & 14));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        m1z m1zVar = (m1z) this.b;
        Function1 function1 = (Function1) this.c;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        byte b = 18;
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = m1zVar instanceof j1z;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(-454309023);
                mm40 mm40VarB = ir8Var.b(jm40.b, gqw0.e);
                mdm mdmVar = ((j1z) m1zVar).d;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new xwy(function1, (byte) 11);
                    fetVar.o0(objP);
                }
                jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, 0, 4);
                fetVar.r(false);
            } else if (m1zVar instanceof k1z) {
                fetVar.e0(-454301028);
                ntr.Q(0, fetVar);
                fetVar.r(false);
            } else {
                if (!(m1zVar instanceof l1z)) {
                    throw b1j.f(-454310410, fetVar, false);
                }
                fetVar.e0(-1198361840);
                l1z l1zVar = (l1z) m1zVar;
                boolean zG2 = fetVar.g(function1);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new i1y(function1, b);
                    fetVar.o0(objP2);
                }
                Function1 function2 = (Function1) objP2;
                boolean zG3 = fetVar.g(function1);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == cl5Var) {
                    objP3 = new i1y(function1, (byte) 19);
                    fetVar.o0(objP3);
                }
                Function1 function3 = (Function1) objP3;
                boolean zG4 = fetVar.g(function1);
                Object objP4 = fetVar.P();
                if (zG4 || objP4 == cl5Var) {
                    objP4 = new xwy(function1, (byte) 12);
                    fetVar.o0(objP4);
                }
                ntr.F(l1zVar, function2, function3, (Function0) objP4, fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f30435a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        byte b2 = 18;
        byte b3 = 4;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        byte b4 = 1;
        switch (b) {
            case 0:
                k7h k7hVar = (k7h) obj5;
                Function0 function0 = (Function0) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (k7hVar.g) {
                    fetVar.e0(-1042079004);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(s5x0.N(mm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f);
                    boolean zG = fetVar.g(function0);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new pk9(function0, b2);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) objP, 28);
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
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_list, 0, fetVar);
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 16.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    dww.c(pm80VarF, null, mm40VarN2, s6t0.b().f33626a.getSecondary(), fetVar, 56, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1042376387);
                    zcl zclVar2 = qmk.f28987a;
                    zq8.a(0, fetVar, o7k0.s(mm40Var, 12.0f));
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                h7h h7hVar = (h7h) obj4;
                k7h k7hVar2 = (k7h) obj5;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
                    String str = h7hVar.b;
                    boolean z = h7hVar.f12573a == k7hVar2.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    mbc.g(yhg0Var, mm40VarL, str, z, s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), g1t0.d(), g1t0.g(), fetVar2, iIntValue2 & 14);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                kkh kkhVar = (kkh) obj5;
                k3t0 k3t0Var = (k3t0) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((qwv0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams = kkhVar.f18439a;
                    long j = cyberTournamentBracketMatchParams.j;
                    String str2 = cyberTournamentBracketMatchParams.k;
                    boolean zI = fetVar3.i(k3t0Var);
                    Object objP2 = fetVar3.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new dbh(k3t0Var, b3);
                        fetVar3.o0(objP2);
                    }
                    lgb.f(0, j, fetVar3, str2, (Function0) objP2);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                a1j a1jVar = (a1j) obj5;
                v0j v0jVar = (v0j) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                nwd nwdVar = v0j.p2;
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar4), null), wha0.T(fetVar4), false, 14);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarA0);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    zcl zclVar4 = qmk.f28987a;
                    wvb.o(null, 24.0f, 0L, fetVar4, 0, 5);
                    wwb.i(o7k0.d(jm40Var, 1.0f), a1jVar.f72a, 0L, 0, 0L, fetVar4, 6, 28);
                    wvb.o(null, 16.0f, 0L, fetVar4, 0, 5);
                    kkb.m(o7k0.d(jm40Var, 1.0f), a1jVar.b, null, 5, 0L, 0L, fetVar4, 6, 52);
                    wvb.o(null, 16.0f, 0L, fetVar4, 0, 5);
                    vul vulVar = vul.f38053a;
                    wul wulVar = a1jVar.c;
                    wul wulVar2 = a1jVar.d;
                    boolean zI2 = fetVar4.i(v0jVar);
                    Object objP3 = fetVar4.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new u0j(v0jVar, b4);
                        fetVar4.o0(objP3);
                    }
                    Function0 function1 = (Function0) objP3;
                    boolean zI3 = fetVar4.i(v0jVar);
                    Object objP4 = fetVar4.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new u0j(v0jVar, (byte) 2);
                        fetVar4.o0(objP4);
                    }
                    gkb.i(null, vulVar, wulVar, wulVar2, 0L, function1, (Function0) objP4, fetVar4, 48, 17);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                dej dejVar = (dej) obj5;
                String str3 = (String) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kwd kwdVar = dej.l2;
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    wvb.o(null, 28.0f, 0L, fetVar5, 0, 5);
                    wwb.i(null, dejVar.P0().f47183a, 0L, 0, 0L, fetVar5, 0, 29);
                    wvb.o(null, 4.0f, 0L, fetVar5, 0, 5);
                    kkb.m(null, str3, ro8.f30824a, 0, 0L, 0L, fetVar5, 384, 57);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                dej dejVar2 = (dej) obj5;
                utl utlVar = (utl) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kwd kwdVar2 = dej.l2;
                ((y5d) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    y860.w(cjx.V(jm40Var, a8k0.G(ddz.a(0, 0, fetVar6, 0, 3), fetVar6), null), utlVar, null, null, dejVar2.P0().b, dejVar2.P0().c, null, fetVar6, 972);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                pb50 pb50Var = (pb50) obj5;
                ob50 ob50Var = (ob50) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    pb50Var.b.F(ob50Var, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                l7m0 l7m0Var = (l7m0) obj5;
                gxk gxkVar = (gxk) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                xak xakVar = gxk.n2;
                ((y5d) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    txk txkVar = (txk) gxkVar.l2.getValue();
                    boolean zI4 = fetVar8.i(txkVar);
                    Object objP5 = fetVar8.P();
                    if (zI4 || objP5 == cl5Var) {
                        y6h y6hVar = new y6h(1, txkVar, txk.class, "onItemClicked", "onItemClicked(Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;)V", 0, (byte) 26);
                        fetVar8.o0(y6hVar);
                        objP5 = y6hVar;
                    }
                    vdb.s(l7m0Var, (Function1) ((jhy) objP5), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                Function1 function2 = (Function1) obj5;
                amw amwVar = (amw) obj4;
                p6t0 p6t0Var = (p6t0) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                p6t0Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(p6t0Var) ? 4 : 2;
                }
                if (!fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    fetVar9.X();
                } else if (p6t0Var instanceof psv) {
                    fetVar9.e0(-548446253);
                    ozb.z((psv) p6t0Var, null, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof gc6) {
                    fetVar9.e0(-548353780);
                    gc6 gc6Var = (gc6) p6t0Var;
                    int i = iIntValue9 & 14;
                    int i2 = (fetVar9.g(function2) ? 1 : 0) | (i != 4 ? (byte) 0 : (byte) 1);
                    Object objP6 = fetVar9.P();
                    Object obj6 = objP6;
                    if (i2 != 0 || objP6 == cl5Var) {
                        vwj vwjVar = new vwj(function2, p6t0Var, (byte) 2);
                        fetVar9.o0(vwjVar);
                        obj6 = vwjVar;
                    }
                    jd8.j(gc6Var, null, (Function0) obj6, fetVar9, i);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof b9l) {
                    fetVar9.e0(-548134982);
                    qzb.l((b9l) p6t0Var, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof e8l) {
                    fetVar9.e0(-548046508);
                    uzb.o((e8l) p6t0Var, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof lal) {
                    fetVar9.e0(-547957817);
                    fxb.h((lal) p6t0Var, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof d4l) {
                    fetVar9.e0(-547848015);
                    jd8.t((d4l) p6t0Var, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof k4l) {
                    fetVar9.e0(-547751388);
                    sj3.j((k4l) p6t0Var, amwVar, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof u4l) {
                    fetVar9.e0(-547610493);
                    dyb.n((u4l) p6t0Var, amwVar, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof zlp0) {
                    fetVar9.e0(-547471055);
                    ibc.k((zlp0) p6t0Var, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof v2l) {
                    fetVar9.e0(-547377714);
                    ahb.f((v2l) p6t0Var, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof hvb0) {
                    fetVar9.e0(-547276623);
                    hvb0 hvb0Var = (hvb0) p6t0Var;
                    boolean zG2 = fetVar9.g(function2);
                    Object objP7 = fetVar9.P();
                    Object obj7 = objP7;
                    if (zG2 || objP7 == cl5Var) {
                        ynk ynkVar = new ynk(function2, (byte) 11);
                        fetVar9.o0(ynkVar);
                        obj7 = ynkVar;
                    }
                    b5x.n(null, hvb0Var, (Function1) obj7, fetVar9, (iIntValue9 << 3) & 112, 1);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof ifa0) {
                    fetVar9.e0(-547042883);
                    ifa0 ifa0Var = (ifa0) p6t0Var;
                    boolean zG3 = fetVar9.g(function2);
                    Object objP8 = fetVar9.P();
                    Object obj8 = objP8;
                    if (zG3 || objP8 == cl5Var) {
                        nmf nmfVar = new nmf(function2, (byte) 1);
                        fetVar9.o0(nmfVar);
                        obj8 = nmfVar;
                    }
                    cww.i(null, ifa0Var, (x0a0) obj8, false, fetVar9, (iIntValue9 << 3) & 112);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof boo0) {
                    fetVar9.e0(-546626274);
                    boo0 boo0Var = (boo0) p6t0Var;
                    boolean zG4 = fetVar9.g(function2);
                    Object objP9 = fetVar9.P();
                    Object obj9 = objP9;
                    if (zG4 || objP9 == cl5Var) {
                        ynk ynkVar2 = new ynk(function2, (byte) 12);
                        fetVar9.o0(ynkVar2);
                        obj9 = ynkVar2;
                    }
                    cem0.g(null, boo0Var, (Function1) obj9, fetVar9, (iIntValue9 << 3) & 112, 1);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof m2z) {
                    fetVar9.e0(-546414854);
                    m2z m2zVar = (m2z) p6t0Var;
                    boolean zG5 = fetVar9.g(function2);
                    Object objP10 = fetVar9.P();
                    Object obj10 = objP10;
                    if (zG5 || objP10 == cl5Var) {
                        ynk ynkVar3 = new ynk(function2, (byte) 13);
                        fetVar9.o0(ynkVar3);
                        obj10 = ynkVar3;
                    }
                    Function1 function3 = (Function1) obj10;
                    boolean zG6 = fetVar9.g(function2);
                    Object objP11 = fetVar9.P();
                    Object obj11 = objP11;
                    if (zG6 || objP11 == cl5Var) {
                        p3l p3lVar = new p3l(function2, (byte) 1);
                        fetVar9.o0(p3lVar);
                        obj11 = p3lVar;
                    }
                    c3x.c(m2zVar, function3, (Function0) obj11, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof c4l) {
                    fetVar9.e0(-546070847);
                    kkb.k((c4l) p6t0Var, fetVar9, iIntValue9 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var instanceof wy) {
                    fetVar9.e0(-545943127);
                    rhv0 rhv0Var = (rhv0) fetVar9.k(bmd.u);
                    a4x a4xVar = ((wy) p6t0Var).b;
                    boolean zG7 = fetVar9.g(rhv0Var) | fetVar9.g(function2);
                    Object objP12 = fetVar9.P();
                    Object obj12 = objP12;
                    if (zG7 || objP12 == cl5Var) {
                        pmf pmfVar = new pmf(rhv0Var, function2, (byte) 1);
                        fetVar9.o0(pmfVar);
                        obj12 = pmfVar;
                    }
                    ay3.c(a4xVar, (Function1) obj12, fetVar9, 8);
                    fetVar9.r(false);
                } else {
                    fetVar9.e0(-545379671);
                    fetVar9.r(false);
                }
                return Unit.f46060a;
            case 9:
                Function1 function4 = (Function1) obj5;
                Function1 function5 = (Function1) obj4;
                pe0 pe0Var = (pe0) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                pe0Var.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= (iIntValue10 & 8) == 0 ? fetVar10.g(pe0Var) : fetVar10.i(pe0Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode3 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM3 = fetVar10.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar10, mm40VarE);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC2, gqw0.v);
                    tke.d(null, pe0Var, 272.0f, null, function4, function5, fetVar10, (iIntValue10 << 3) & 112, 9);
                    fetVar10.r(true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                ugd ugdVar = (ugd) obj5;
                u2z u2zVar = (u2z) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ugdVar.F(u2zVar.f34970a, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                a4x a4xVar2 = (a4x) obj5;
                pz40 pz40Var3 = (pz40) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar12, 0);
                    int iHashCode4 = Long.hashCode(fetVar12.T);
                    bh90 bh90VarM4 = fetVar12.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar12, mm40VarN3);
                    mkd.c0.getClass();
                    fetVar12.i0();
                    if (fetVar12.S) {
                        fetVar12.l(pcyVar);
                    } else {
                        fetVar12.r0();
                    }
                    jpm0.o(fetVar12, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar12, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar12, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar12);
                    jpm0.o(fetVar12, mm40VarC3, gqw0.v);
                    fetVar12.e0(586748446);
                    Iterator it = CollectionsKt.D0(CollectionsKt.O(a4xVar2, 1), 5).iterator();
                    while (it.hasNext()) {
                        xkb.C(null, (j8n) it.next(), fetVar12, 0);
                    }
                    fetVar12.r(false);
                    wkw wkwVar = new wkw(gqw0.n);
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(wkwVar, 20.0f);
                    ac acVar = new ac(new y3d(StaticColors.INSTANCE.m125getWhite100d7_KjU()), new y3d(y3d.c), 4);
                    Object objP13 = fetVar12.P();
                    if (objP13 == cl5Var) {
                        objP13 = new cml(pz40Var3, (byte) 21);
                        fetVar12.o0(objP13);
                    }
                    acb.n(acVar, true, (Function0) objP13, mm40VarE2, fetVar12, 432, 0);
                    fetVar12.r(true);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                wm7 wm7Var = (wm7) obj5;
                a4x<tso0> a4xVar3 = (a4x) obj4;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    kbc.J(wm7Var, fetVar13, 0);
                    for (tso0 tso0Var : a4xVar3) {
                        fetVar13.b0(-1134998723, tso0Var.f34470a);
                        j6n.h(tso0Var.b, tso0Var.c, null, 0, 0, fetVar13, 0, 28);
                        fetVar13.r(false);
                    }
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                hup hupVar = (hup) obj5;
                Function1 function6 = (Function1) obj4;
                ir8 ir8Var = (ir8) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                zx7 zx7Var = gqw0.e;
                ir8Var.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(ir8Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    utp utpVar = hupVar.c;
                    if (utpVar instanceof qtp) {
                        fetVar14.e0(-35373935);
                        mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                        mdm mdmVar = ((qtp) utpVar).f29308a;
                        boolean zG8 = fetVar14.g(function6);
                        Object objP14 = fetVar14.P();
                        if (zG8 || objP14 == cl5Var) {
                            objP14 = new mfp(function6, (byte) 20);
                            fetVar14.o0(objP14);
                        }
                        jcb.l(mm40VarB, mdmVar, false, (Function0) objP14, fetVar14, 0, 4);
                        fetVar14.r(false);
                    } else if (utpVar instanceof ptp) {
                        fetVar14.e0(-35361416);
                        jcb.l(ir8Var.b(jm40Var, zx7Var), ((ptp) utpVar).f27576a, false, null, fetVar14, 0, 12);
                        fetVar14.r(false);
                    } else if (utpVar.equals(stp.f32782a)) {
                        fetVar14.e0(-35357228);
                        wvb.C(0, fetVar14, null);
                        fetVar14.r(false);
                    } else if (utpVar instanceof ttp) {
                        fetVar14.e0(-35354891);
                        wvb.G(0, fetVar14, ((ttp) utpVar).f34519a, null, hupVar.d);
                        fetVar14.r(false);
                    } else {
                        if (!utpVar.equals(rtp.f31088a)) {
                            throw b1j.f(-35377613, fetVar14, false);
                        }
                        fetVar14.e0(-1095782790);
                        fetVar14.r(false);
                    }
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                l7m0 l7m0Var2 = (l7m0) obj5;
                q9q q9qVar = (q9q) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i3 = q9q.m2;
                ((y5d) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    k3t0 k3t0Var2 = (k3t0) q9qVar.l2.getValue();
                    boolean zI5 = fetVar15.i(k3t0Var2);
                    Object objP15 = fetVar15.P();
                    if (zI5 || objP15 == cl5Var) {
                        pop popVar = new pop(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar15.o0(popVar);
                        objP15 = popVar;
                    }
                    agc.w(l7m0Var2, (Function1) ((jhy) objP15), fetVar15, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                u820 u820Var = (u820) obj5;
                Function1 function7 = (Function1) obj4;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    yy6 yy6Var = ((r820) u820Var).f30005a;
                    boolean zG9 = fetVar16.g(function7);
                    Object objP16 = fetVar16.P();
                    if (zG9 || objP16 == cl5Var) {
                        objP16 = new z9q(function7, (byte) 17);
                        fetVar16.o0(objP16);
                    }
                    Function0 function8 = (Function0) objP16;
                    boolean zG10 = fetVar16.g(function7);
                    Object objP17 = fetVar16.P();
                    if (zG10 || objP17 == cl5Var) {
                        objP17 = new z9q(function7, (byte) 18);
                        fetVar16.o0(objP17);
                    }
                    Function0 function9 = (Function0) objP17;
                    boolean zG11 = fetVar16.g(function7);
                    Object objP18 = fetVar16.P();
                    if (zG11 || objP18 == cl5Var) {
                        objP18 = new z9q(function7, (byte) 19);
                        fetVar16.o0(objP18);
                    }
                    Function0 function10 = (Function0) objP18;
                    boolean zG12 = fetVar16.g(function7);
                    Object objP19 = fetVar16.P();
                    if (zG12 || objP19 == cl5Var) {
                        objP19 = new z9q(function7, (byte) 20);
                        fetVar16.o0(objP19);
                    }
                    m0x0.f(null, yy6Var, function8, function9, function10, (Function0) objP19, fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                return a(obj, obj2, obj3);
            case 17:
                return b(obj, obj2, obj3);
            case 18:
                return g(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return c(obj, obj2, obj3);
            case 20:
                return h(obj, obj2, obj3);
            case 21:
                return i(obj, obj2, obj3);
            case 22:
                return l(obj, obj2, obj3);
            case 23:
                return m(obj, obj2, obj3);
            case 24:
                return o(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return p(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return r(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return s(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return t(obj, obj2, obj3);
            default:
                egz egzVar = (egz) obj5;
                cgz cgzVar = (cgz) obj4;
                y5d y5dVar = (y5d) obj;
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                sqt sqtVar = cgz.m2;
                y5dVar.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= fetVar17.g(y5dVar) ? (byte) 4 : (byte) 2;
                }
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var2, 1.0f), gqw0.n);
                    zcl zclVar9 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.discipline, 0, fetVar17), 0L, 0, 0L, fetVar17, 0, 28);
                    String strW = rsm0.w(R.string.search, 0, fetVar17);
                    mm40 mm40VarK = s5x0.K(jm40Var2, 16.0f, 8.0f);
                    boolean zI6 = fetVar17.i(egzVar);
                    Object objP20 = fetVar17.P();
                    if (zI6 || objP20 == cl5Var) {
                        objP20 = new ebz(egzVar, (byte) 10);
                        fetVar17.o0(objP20);
                    }
                    Function1 function11 = (Function1) objP20;
                    boolean zI7 = fetVar17.i(cgzVar);
                    Object objP21 = fetVar17.P();
                    if (zI7 || objP21 == cl5Var) {
                        objP21 = new zfz(cgzVar, b4);
                        fetVar17.o0(objP21);
                    }
                    aac.n(mm40VarK, false, null, null, strW, null, function11, null, (Function0) objP21, fetVar17, 0, 174);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar17, 6, 4);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ rgh(Object obj, Object obj2, byte b) {
        this.f30435a = b;
        this.b = obj;
        this.c = obj2;
    }
}
