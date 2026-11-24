package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eyn implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8634a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eyn(Object obj, Object obj2, Object obj3, byte b) {
        this.f8634a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        llm0 llm0Var = (llm0) this.b;
        lqw lqwVar = (lqw) this.c;
        k3t0 k3t0Var = (k3t0) this.d;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            int iOrdinal = llm0Var.ordinal();
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (iOrdinal == 0) {
                fetVar.e0(586402932);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                boolean zI = fetVar.i(k3t0Var);
                Object objP = fetVar.P();
                if (zI || objP == cl5Var) {
                    objP = new n5w(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                    fetVar.o0(objP);
                }
                bdx.s(ir8Var, mm40VarD, lqwVar, (Function1) ((jhy) objP), fetVar, (iIntValue & 14) | 48);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(586411318);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                boolean zI2 = fetVar.i(k3t0Var);
                Object objP2 = fetVar.P();
                if (zI2 || objP2 == cl5Var) {
                    objP2 = new n5w(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                    fetVar.o0(objP2);
                }
                ofm0.c(ir8Var, mm40VarD2, lqwVar, (Function1) ((jhy) objP2), fetVar, (iIntValue & 14) | 48);
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(586400755, fetVar, false);
                }
                fetVar.e0(586420182);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                boolean zI3 = fetVar.i(k3t0Var);
                Object objP3 = fetVar.P();
                if (zI3 || objP3 == cl5Var) {
                    objP3 = new n5w(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                    fetVar.o0(objP3);
                }
                azw.f(ir8Var, mm40VarD3, lqwVar, (Function1) ((jhy) objP3), fetVar, (iIntValue & 14) | 48);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        xcz xczVar = (xcz) this.b;
        ohz ohzVar = (ohz) this.c;
        Function1 function1 = (Function1) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gst gstVar = qhz.l2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarV = cjx.V(knx.Q(jm40.b, new thd((byte) 3)), a8k0.G(xczVar, fetVar), null);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
            boolean zI = fetVar.i(ohzVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new okw(ohzVar, function1, (byte) 25);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        bb00 bb00Var = (bb00) this.b;
        kwj kwjVar = (kwj) this.c;
        Function1 function1 = (Function1) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, qmk.a(fetVar).f, 12.0f, qmk.a(fetVar).f, 0.0f, 8);
            a4x a4xVar = bb00Var.d;
            boolean z = bb00Var.g;
            boolean zG = fetVar.g(kwjVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new w48(kwjVar, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new i1y(function1, (byte) 27);
                fetVar.o0(objP2);
            }
            ibc.o(mm40VarN, a4xVar, gxh0.f12078a, z, function0, (Function1) objP2, fetVar, 384, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        boolean z;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        gh00 gh00Var = (gh00) this.b;
        Function1 function1 = (Function1) this.c;
        cgk0 cgk0Var = (cgk0) this.d;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        zx7 zx7Var = gqw0.f11754a;
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            yw00 yw00Var = gh00Var.g;
            float f = gh00Var.h;
            jm40 jm40Var = jm40.b;
            pcy pcyVar = e7z.u1;
            cl5 cl5Var = ukd.f35823a;
            if (yw00Var != null) {
                fetVar.e0(934002052);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new nw6(cgk0Var, (byte) 28);
                    fetVar.o0(objP);
                }
                mm40 mm40VarD0 = ro4.d0(jm40Var, (Function1) objP);
                tj30 tj30VarC = zq8.c(zx7Var, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD0);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                x1x.f(gh00Var.g, function1, fetVar, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(934461193);
                mm40 mm40VarH = k7n0.H(jm40Var, f < 0.5f ? 1.0f : 0.0f);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new nw6(cgk0Var, (byte) 29);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarD1 = ro4.d0(mm40VarH, (Function1) objP2);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD1);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                x1x.b(null, gh00Var, function1, fetVar, 0);
                fetVar.r(true);
                x1x.g(epv0.N(jm40Var, f), gh00Var, function1, fetVar, 0);
                if (f < 0.5f) {
                    fetVar.e0(935226676);
                    mm40 mm40VarA = ir8Var.a(jm40Var);
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objP3;
                    Object objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = new x800((byte) 2);
                        fetVar.o0(objP4);
                    }
                    z = false;
                    zq8.a(0, fetVar, y860.W(mm40VarA, gy40Var, null, false, null, (Function0) objP4, 28));
                    fetVar.r(false);
                } else {
                    z = false;
                    fetVar.e0(935626452);
                    fetVar.r(false);
                }
                fetVar.r(z);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        xk80 xk80Var = (xk80) this.c;
        l7m0 l7m0Var2 = (l7m0) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "LOYALTY_PROGRAM_LAZY_COLUMN_PAGER");
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            float f = ((ycl) l7m0Var.getValue()).f42389a;
            zcl zclVar = qmk.f28987a;
            q5x.e(xk80Var, mm40VarD, new lh80(f, 16.0f, f, 16.0f), null, 0, 20.0f, null, null, false, null, null, gfk0.b, null, u1c.M(1656395536, new d2s(l7m0Var2, xk80Var, (byte) 8), fetVar), fetVar, 48, 24960, 12248);
            if (((mh10) l7m0Var2.getValue()).d.size() > 1) {
                fetVar.e0(-468879439);
                mm40 mm40VarN = s5x0.N(new wkw(xx7Var), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                smm smmVar = smm.b;
                pz40 pz40Var = s6t0.f31722a;
                n1i.a(mm40VarN, xk80Var, smmVar, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), fetVar, 384, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-468356655);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        kf9 kf9Var = (kf9) this.b;
        Function0 function0 = (Function0) this.c;
        Function0 function1 = (Function0) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            ju70.i(s5x0.L(jm40.b, 12.0f, 0.0f, 2), kf9Var, function0, function1, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        ry6 ry6Var = (ry6) this.b;
        Function0 function0 = (Function0) this.c;
        Function0 function1 = (Function0) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            bsr0.i(null, ry6Var.d, function0, function1, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        ygx ygxVar = (ygx) this.b;
        mm40 mm40Var = (mm40) this.c;
        y9q0 y9q0Var = (y9q0) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u63) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            v8q0.a(ygxVar.d, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 1, false, 0, 0, null, y9q0Var, fetVar, 0, 384, 126968);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        lm6 lm6Var = (lm6) this.b;
        Function1 function1 = (Function1) this.c;
        pz40 pz40Var = (pz40) this.d;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = lm6Var.f20281a;
            boolean z = lm6Var.b;
            tf6 tf6Var = tf6.f33852a;
            boolean z2 = lm6Var.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new lj00(function1, (byte) 17);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new rip(pz40Var, (byte) 12);
                fetVar.o0(objP2);
            }
            rf6.a(mm40Var, str, z, z2, function2, (Function0) objP2, fetVar, (iIntValue & 14) | 1572864);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        a4x<tso0> a4xVar = (a4x) this.b;
        tvw tvwVar = (tvw) this.c;
        String str = (String) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (tvwVar.equals(qvw.f29409a)) {
                fetVar.e0(1197351521);
                j0x.b(a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), null, o7k0.n(jm40Var, 20.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            } else if (tvwVar instanceof rvw) {
                fetVar.e0(1197708362);
                lgb.s(o7k0.n(jm40Var, 20.0f), ((rvw) tvwVar).f31190a, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar);
                fetVar.r(false);
            } else {
                if (!(tvwVar instanceof svw)) {
                    throw b1j.f(-1623945203, fetVar, false);
                }
                fetVar.e0(1198055345);
                j0x.b(a8k0.F(((svw) tvwVar).f32891a, 0, fetVar), null, o7k0.n(jm40Var, 20.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            }
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar), fetVar, 0, 24960, 110590);
            fet fetVar2 = fetVar;
            fetVar2.r(true);
            for (tso0 tso0Var : a4xVar) {
                fetVar2.b0(526122232, tso0Var.f34470a);
                fet fetVar3 = fetVar2;
                j6n.h(tso0Var.b, tso0Var.c, null, 0, 0, fetVar3, 0, 28);
                fetVar2 = fetVar3;
                fetVar2.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        ia40 ia40Var = (ia40) this.b;
        d39 d39Var = (d39) this.c;
        Function1 function1 = (Function1) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u63) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            g1x.e(ia40Var, d39Var, function1, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        pz40 pz40Var = (pz40) this.b;
        xk80 xk80Var = (xk80) this.c;
        ki60 ki60Var = (ki60) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        htz htzVar = ki60.q2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zz2 zz2Var = ki60Var.n2;
            iiy[] iiyVarArr = ki60.r2;
            int iIntValue2 = zz2Var.n(ki60Var, iiyVarArr[1]).intValue();
            String strN = ki60Var.o2.n(ki60Var, iiyVarArr[2]);
            k3t0 k3t0VarP0 = ki60Var.P0();
            boolean zI = fetVar.i(k3t0VarP0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                jw50 jw50Var = new jw50(1, k3t0VarP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                fetVar.o0(jw50Var);
                objP = jw50Var;
            }
            wdx.d(pz40Var, xk80Var, iIntValue2, strN, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) this.b;
        ugd ugdVar = (ugd) this.c;
        ugd ugdVar2 = (ugd) this.d;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.h(zBooleanValue) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            if (zBooleanValue) {
                fetVar.e0(-320394727);
                ugdVar.invoke(fetVar, 0);
            } else {
                fetVar.e0(-320394119);
                ugdVar2.invoke(fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        ty6 ty6Var = (ty6) this.b;
        Function0 function0 = (Function0) this.c;
        Function0 function1 = (Function0) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            eo8 eo8Var = ty6Var.c;
            fetVar.e0(-358513862);
            bsr0.i(null, eo8Var, function0, function1, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f8634a;
        byte b2 = 12;
        cl5 cl5Var = ukd.f35823a;
        yje yjeVar = null;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                jyn jynVar = (jyn) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    float f = xfn.a(fetVar2).d;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarD, f, 12.0f);
                    x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    if (jynVar.f17367a) {
                        fetVar2.e0(1646423167);
                        qzb.n(o7k0.d(jm40Var, 1.0f), jynVar.c, function0, fetVar2, 6, 0);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar2;
                        fetVar.e0(1646684404);
                        fetVar.r(false);
                    }
                    qzb.n(o7k0.d(jm40Var, 1.0f), jynVar.b, function1, fetVar, 6, 0);
                    fetVar.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                l7m0 l7m0Var = (l7m0) obj6;
                p3o p3oVar = (p3o) obj5;
                Function1 function2 = (Function1) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d9z d9zVarA = f9z.a(fetVar3);
                    d9z d9zVarA2 = f9z.a(fetVar3);
                    pkk0 pkk0Var = (pkk0) fetVar3.k(bmd.q);
                    boolean zG = fetVar3.g(d9zVarA) | fetVar3.g(pkk0Var);
                    Object objP = fetVar3.P();
                    Object obj7 = objP;
                    if (zG || objP == cl5Var) {
                        s3o s3oVar = new s3o(d9zVarA, pkk0Var, yjeVar, false ? (byte) 1 : (byte) 0);
                        fetVar3.o0(s3oVar);
                        obj7 = s3oVar;
                    }
                    m0x0.t(fetVar3, d9zVarA, (Function2) obj7);
                    boolean zG2 = fetVar3.g(d9zVarA2) | fetVar3.g(pkk0Var);
                    Object objP2 = fetVar3.P();
                    Object obj8 = objP2;
                    if (zG2 || objP2 == cl5Var) {
                        s3o s3oVar2 = new s3o(d9zVarA2, pkk0Var, yjeVar, (byte) 1);
                        fetVar3.o0(s3oVar2);
                        obj8 = s3oVar2;
                    }
                    m0x0.t(fetVar3, d9zVarA2, (Function2) obj8);
                    a4x a4xVar = ((z3o) l7m0Var.getValue()).c.b;
                    n3o n3oVar = (n3o) p3oVar;
                    boolean z = n3oVar.b;
                    boolean z2 = n3oVar.c;
                    CyberGamesPage cyberGamesPage = n3oVar.d;
                    d9z d9zVar = n3oVar.f22859a ? d9zVarA : d9zVarA2;
                    boolean zG3 = fetVar3.g(function2);
                    Object objP3 = fetVar3.P();
                    Object obj9 = objP3;
                    if (zG3 || objP3 == cl5Var) {
                        btm btmVar = new btm(function2, b2);
                        fetVar3.o0(btmVar);
                        obj9 = btmVar;
                    }
                    t3o.c(null, a4xVar, d9zVar, cyberGamesPage, z, z2, (Function1) obj9, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                l7m0 l7m0Var2 = (l7m0) obj5;
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                pu90 pu90VarS = pj30Var.S(p4e.b(((p4e) obj3).f26347a, 0, 0, 0, ((Number) l7m0Var2.getValue()).intValue() + ((cgk0) obj6).l(), 7));
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new f8m((Object) pu90VarS, obj4, (Object) l7m0Var2, (byte) 17));
            case 3:
                k3p k3pVar = (k3p) obj6;
                xcz xczVar = (xcz) obj5;
                Function2 function3 = (Function2) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zEquals = k3pVar.equals(m2a.m);
                    jm40 jm40Var2 = jm40.b;
                    if (zEquals) {
                        fetVar4.e0(-1393467969);
                        zcl zclVar2 = qmk.f28987a;
                        v8q0.a(rsm0.w(R.string.empty_event, 0, fetVar4), o7k0.d(s5x0.N(jm40Var2, 0.0f, 24.0f, 0.0f, 34.0f, 5), 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar4), fetVar4, 0, 0, 130044);
                        fetVar4.r(false);
                    } else if (k3pVar.equals(lwf.l)) {
                        fetVar4.e0(-1393018004);
                        zcl zclVar3 = qmk.f28987a;
                        q0x.y(0, fetVar4, tdc.V(s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), xczVar, fetVar4));
                        fetVar4.r(false);
                    } else {
                        if (!(k3pVar instanceof j3p)) {
                            throw b1j.f(-1430425720, fetVar4, false);
                        }
                        fetVar4.e0(-1392590700);
                        zcl zclVar4 = qmk.f28987a;
                        vcc.m(tdc.V(s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), xczVar, fetVar4), ((j3p) k3pVar).f15847a, xczVar, function3, fetVar4, 0);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                gf6 gf6Var = (gf6) obj6;
                Function1 function4 = (Function1) obj5;
                bwj0 bwj0Var = (bwj0) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                    rcb.c(gf6Var, function4, fetVar5, 0);
                    vtb.t(null, qqm.b, null, 0L, fetVar5, 48, 13);
                    zcl zclVar5 = qmk.f28987a;
                    wvb.o(null, 12.0f, 0L, fetVar5, 0, 5);
                    aw6 aw6Var = bwj0Var.f3328a;
                    sx6 sx6Var = aw6Var.f1558a;
                    rln0 rln0Var = aw6Var.b;
                    nke nkeVar = aw6Var.c;
                    lx6 lx6Var = aw6Var.d;
                    prm prmVar = aw6Var.e;
                    String str = aw6Var.f;
                    boolean zG4 = fetVar5.g(function4);
                    Object objP4 = fetVar5.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new z9q(function4, (byte) 27);
                        fetVar5.o0(objP4);
                    }
                    Function0 function5 = (Function0) objP4;
                    boolean zG5 = fetVar5.g(function4);
                    Object objP5 = fetVar5.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new z9q(function4, (byte) 28);
                        fetVar5.o0(objP5);
                    }
                    Function0 function6 = (Function0) objP5;
                    boolean zG6 = fetVar5.g(function4);
                    Object objP6 = fetVar5.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new z9q(function4, (byte) 29);
                        fetVar5.o0(objP6);
                    }
                    Function0 function7 = (Function0) objP6;
                    boolean zG7 = fetVar5.g(function4);
                    Object objP7 = fetVar5.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new baq(function4, (byte) 7);
                        fetVar5.o0(objP7);
                    }
                    Function1 function8 = (Function1) objP7;
                    boolean zG8 = fetVar5.g(function4);
                    Object objP8 = fetVar5.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new baq(function4, (byte) 8);
                        fetVar5.o0(objP8);
                    }
                    sw6.a(null, sx6Var, rln0Var, nkeVar, lx6Var, prmVar, str, function5, function6, function7, function8, (Function1) objP8, fetVar5, 0);
                    wvb.o(null, 12.0f, 0L, fetVar5, 0, 5);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                gf6 gf6Var2 = (gf6) obj6;
                Function1 function9 = (Function1) obj5;
                b7c0 b7c0Var = (b7c0) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                    int iHashCode3 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM3 = fetVar6.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar6, jm40Var);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC2, gqw0.v);
                    rcb.c(gf6Var2, function9, fetVar6, 0);
                    vtb.t(null, qqm.b, null, 0L, fetVar6, 48, 13);
                    zcl zclVar6 = qmk.f28987a;
                    wvb.o(null, 12.0f, 0L, fetVar6, 0, 5);
                    bzc0 bzc0Var = b7c0Var.f2101a;
                    xyc0 xyc0Var = b7c0Var.b;
                    boolean zG9 = fetVar6.g(function9);
                    Object objP9 = fetVar6.P();
                    if (zG9 || objP9 == cl5Var) {
                        objP9 = new baq(function9, (byte) 2);
                        fetVar6.o0(objP9);
                    }
                    k7x.m(null, bzc0Var, xyc0Var, (Function1) objP9, fetVar6, 0);
                    wvb.o(null, 12.0f, 0L, fetVar6, 0, 5);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                gf6 gf6Var3 = (gf6) obj6;
                Function1 function10 = (Function1) obj5;
                rx4 rx4Var = (rx4) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar7, 0);
                    int iHashCode4 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM4 = fetVar7.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar7, jm40Var);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, x5dVarA4, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC3, gqw0.v);
                    rcb.c(gf6Var3, function10, fetVar7, 0);
                    vtb.t(null, qqm.b, null, 0L, fetVar7, 48, 13);
                    zcl zclVar7 = qmk.f28987a;
                    wvb.o(null, 12.0f, 0L, fetVar7, 0, 5);
                    aw6 aw6Var2 = rx4Var.f31246a;
                    sx6 sx6Var2 = aw6Var2.f1558a;
                    rln0 rln0Var2 = aw6Var2.b;
                    nke nkeVar2 = aw6Var2.c;
                    lx6 lx6Var2 = aw6Var2.d;
                    String str2 = aw6Var2.f;
                    boolean zG10 = fetVar7.g(function10);
                    Object objP10 = fetVar7.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new z9q(function10, (byte) 22);
                        fetVar7.o0(objP10);
                    }
                    Function0 function11 = (Function0) objP10;
                    boolean zG11 = fetVar7.g(function10);
                    Object objP11 = fetVar7.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new z9q(function10, (byte) 23);
                        fetVar7.o0(objP11);
                    }
                    Function0 function12 = (Function0) objP11;
                    boolean zG12 = fetVar7.g(function10);
                    Object objP12 = fetVar7.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new baq(function10, (byte) 3);
                        fetVar7.o0(objP12);
                    }
                    Function1 function13 = (Function1) objP12;
                    boolean zG13 = fetVar7.g(function10);
                    Object objP13 = fetVar7.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new baq(function10, (byte) 4);
                        fetVar7.o0(objP13);
                    }
                    sw6.a(null, sx6Var2, rln0Var2, nkeVar2, lx6Var2, null, str2, null, function11, function12, function13, (Function1) objP13, fetVar7, 12779520);
                    wvb.o(null, 28.0f, 0L, fetVar7, 0, 5);
                    aw6 aw6Var3 = rx4Var.b;
                    sx6 sx6Var3 = aw6Var3.f1558a;
                    rln0 rln0Var3 = aw6Var3.b;
                    nke nkeVar3 = aw6Var3.c;
                    lx6 lx6Var3 = aw6Var3.d;
                    prm prmVar2 = aw6Var3.e;
                    String str3 = aw6Var3.f;
                    boolean zG14 = fetVar7.g(function10);
                    Object objP14 = fetVar7.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new z9q(function10, (byte) 24);
                        fetVar7.o0(objP14);
                    }
                    Function0 function14 = (Function0) objP14;
                    boolean zG15 = fetVar7.g(function10);
                    Object objP15 = fetVar7.P();
                    if (zG15 || objP15 == cl5Var) {
                        objP15 = new z9q(function10, (byte) 25);
                        fetVar7.o0(objP15);
                    }
                    Function0 function15 = (Function0) objP15;
                    boolean zG16 = fetVar7.g(function10);
                    Object objP16 = fetVar7.P();
                    if (zG16 || objP16 == cl5Var) {
                        objP16 = new z9q(function10, (byte) 26);
                        fetVar7.o0(objP16);
                    }
                    Function0 function16 = (Function0) objP16;
                    boolean zG17 = fetVar7.g(function10);
                    Object objP17 = fetVar7.P();
                    if (zG17 || objP17 == cl5Var) {
                        objP17 = new baq(function10, (byte) 5);
                        fetVar7.o0(objP17);
                    }
                    Function1 function17 = (Function1) objP17;
                    boolean zG18 = fetVar7.g(function10);
                    Object objP18 = fetVar7.P();
                    if (zG18 || objP18 == cl5Var) {
                        objP18 = new baq(function10, (byte) 6);
                        fetVar7.o0(objP18);
                    }
                    sw6.a(null, sx6Var3, rln0Var3, nkeVar3, lx6Var3, prmVar2, str3, function14, function15, function16, function17, (Function1) objP18, fetVar7, 0);
                    wvb.o(null, 12.0f, 0L, fetVar7, 0, 5);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                dnr dnrVar = (dnr) obj6;
                mm40 mm40Var = (mm40) obj5;
                mm40 mm40Var2 = (mm40) obj4;
                RelatedParams relatedParams = (RelatedParams) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ddk ddkVar = dnr.c2;
                relatedParams.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar8.g(relatedParams) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    zcl zclVar8 = qmk.f28987a;
                    float f2 = qmk.a(fetVar8).d;
                    ndf0 ndf0Var = dnrVar.P1;
                    if (ndf0Var == null) {
                        Intrinsics.h("relatedGamesFactory");
                        throw null;
                    }
                    ndf0Var.a(i120.Q(mm40Var, ((ThemeColors) fetVar8.k(zaq0.b)).getBackground(), jd8.n), s5x0.L(mm40Var2, f2, 0.0f, 2), dnrVar, relatedParams, fetVar8);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                l7m0 l7m0Var3 = (l7m0) obj6;
                l7m0 l7m0Var4 = (l7m0) obj5;
                dnr dnrVar2 = (dnr) obj4;
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ddk ddkVar2 = dnr.c2;
                mm40Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar9.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    obc.d(kr00.f18743a.a(l7m0Var3.getValue()), u1c.M(-1829201451, new ann(mm40Var3, l7m0Var4, dnrVar2, (byte) 28), fetVar9), fetVar9, 56);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                xrr xrrVar = (xrr) obj6;
                pz40 pz40Var = (pz40) obj5;
                Function2 function18 = (Function2) obj4;
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                mm40Var4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar10.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    wdp0 wdp0Var = xrrVar.b;
                    wdp0 wdp0Var2 = xrrVar.c;
                    zcl zclVar9 = qmk.f28987a;
                    x5d x5dVarA5 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar10, 0);
                    int iHashCode5 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM5 = fetVar10.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar10, mm40Var4);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, x5dVarA5, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC4, gqw0.v);
                    obc.e(new l5d0[]{fap.b.a(w6n.i), ggp0.b.a(gqw0.d), dw9.k(5, ggp0.c), fap.f9220a.a(fetVar10.k(bmd.n)), jcp0.f16288a.a(null), yfp.f42551a.a(new ycl(28.0f))}, u1c.M(510670724, new stl0((Object) wdp0Var, pz40Var, function18, (Object) wdp0Var2, (byte) 0), fetVar10), fetVar10, 48);
                    fetVar10.r(true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                yrr yrrVar = (yrr) obj6;
                pz40 pz40Var2 = (pz40) obj5;
                Function2 function19 = (Function2) obj4;
                mm40 mm40Var5 = (mm40) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                mm40Var5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar11.g(mm40Var5) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    vdp0 vdp0Var = yrrVar.b;
                    vdp0 vdp0Var2 = yrrVar.c;
                    zcl zclVar10 = qmk.f28987a;
                    x5d x5dVarA6 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar11, 0);
                    int iHashCode6 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM6 = fetVar11.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar11, mm40Var5);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, x5dVarA6, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC5, gqw0.v);
                    obc.e(new l5d0[]{eap.b.a(w6n.i), fgp0.f9504a.a(gqw0.d), dw9.k(5, fgp0.b), eap.f7478a.a(fetVar11.k(bmd.n)), icp0.f14546a.a(null), xfp.f40801a.a(new ycl(28.0f))}, u1c.M(-762685114, new stl0((Object) vdp0Var, pz40Var2, function19, (Object) vdp0Var2, (byte) 1), fetVar11), fetVar11, 48);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                i7s i7sVar = (i7s) obj6;
                l7m0 l7m0Var5 = (l7m0) obj5;
                cgk0 cgk0Var = (cgk0) obj4;
                mm40 mm40Var6 = (mm40) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                nek nekVar = i7s.a2;
                mm40Var6.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar12.g(mm40Var6) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    xak xakVar = i7sVar.S1;
                    if (xakVar == null) {
                        Intrinsics.h("gameZoneFactory");
                        throw null;
                    }
                    nek nekVar2 = i7sVar.R1;
                    if (nekVar2 == null) {
                        Intrinsics.h("gameVideoFactory");
                        throw null;
                    }
                    k3t0 k3t0VarI0 = i7sVar.I0();
                    boolean zI = fetVar12.i(k3t0VarI0);
                    Object objP19 = fetVar12.P();
                    if (zI || objP19 == cl5Var) {
                        objP19 = new h2s(1, k3t0VarI0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                        fetVar12.o0(objP19);
                    }
                    Function1 function20 = (Function1) ((jhy) objP19);
                    boolean zG19 = fetVar12.g(cgk0Var);
                    Object objP20 = fetVar12.P();
                    if (zG19 || objP20 == cl5Var) {
                        objP20 = new nw6(cgk0Var, (byte) 18);
                        fetVar12.o0(objP20);
                    }
                    wwb.p(mm40Var6, xakVar, nekVar2, l7m0Var5, function20, (Function1) objP20, fetVar12, iIntValue11 & 14);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                zhs zhsVar = (zhs) obj6;
                mm40 mm40Var7 = (mm40) obj5;
                Function1 function21 = (Function1) obj4;
                fet fetVar13 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar13.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    vhs vhsVar = (vhs) zhsVar;
                    ccq0.u(mm40Var7, vhsVar.f37446a, vhsVar.b, vhsVar.c, function21, fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                ugd ugdVar = (ugd) obj6;
                fpw fpwVar = (fpw) obj5;
                Function1 function22 = (Function1) obj4;
                fet fetVar14 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar14.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x5d x5dVarA7 = w5d.a(uc9.c, gqw0.m, fetVar14, 0);
                    int iHashCode7 = Long.hashCode(fetVar14.T);
                    bh90 bh90VarM7 = fetVar14.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar14, jm40Var);
                    mkd.c0.getClass();
                    fetVar14.i0();
                    if (fetVar14.S) {
                        fetVar14.l(pcyVar);
                    } else {
                        fetVar14.r0();
                    }
                    jpm0.o(fetVar14, x5dVarA7, gqw0.x);
                    jpm0.o(fetVar14, bh90VarM7, gqw0.w);
                    jpm0.o(fetVar14, Integer.valueOf(iHashCode7), gqw0.y);
                    jpm0.n(fetVar14);
                    jpm0.o(fetVar14, mm40VarC6, gqw0.v);
                    zcl zclVar11 = qmk.f28987a;
                    jcb.v(o7k0.d(jm40Var, 1.0f), 1.0f, ((ThemeColors) fetVar14.k(zaq0.b)).getSeparator(), fetVar14, 6, 0);
                    ugdVar.F(y5d.f42040a, fetVar14, 6);
                    obc.z(s5x0.J(jm40Var, 8.0f), fpwVar.f9947a, function22, fetVar14, 0);
                    fetVar14.r(true);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                return b(obj, obj2, obj3);
            case 16:
                return c(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                kj00 kj00Var = (kj00) obj6;
                mm40 mm40Var8 = (mm40) obj5;
                Function1 function23 = (Function1) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar15.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    gj00 gj00Var = (gj00) kj00Var;
                    jar0.s(0, fetVar15, gj00Var.f11374a, mm40Var8, function23, gj00Var.b);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return h(obj, obj2, obj3);
            case 20:
                return i(obj, obj2, obj3);
            case 21:
                return l(obj, obj2, obj3);
            case 22:
                return m(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return p(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return r(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return s(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return t(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return u(obj, obj2, obj3);
            default:
                w2d w2dVar = (w2d) obj6;
                x2d x2dVar = w2dVar.f38442a;
                l7m0 l7m0Var6 = (l7m0) obj5;
                Function1 function24 = (Function1) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar16 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar16.g(hh80Var) ? 4 : 2;
                }
                if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    mm40 mm40VarI = s5x0.I(jm40Var, hh80Var);
                    pz40 pz40Var3 = s6t0.f31722a;
                    long background = s6t0.b().f33626a.getBackground();
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(i120.Q(mm40VarI, background, vgg0.c((1.0f - x2dVar.a()) * 24.0f, (1.0f - x2dVar.a()) * 24.0f, 0.0f, 0.0f, 12)), xfn.a(fetVar16).c, 0.0f, 2);
                    jrc0 jrc0Var = (jrc0) l7m0Var6.getValue();
                    if (jrc0Var != null) {
                        if (jrc0Var instanceof hrc0) {
                            fetVar16.e0(-1183792722);
                            hew0.i(null, ((hrc0) jrc0Var).b, function24, fetVar16, 0);
                            fetVar16.r(false);
                        } else if (jrc0Var instanceof irc0) {
                            fetVar16.e0(-1183573118);
                            hew0.A(mm40VarL, ((irc0) jrc0Var).b, fetVar16, 0);
                            fetVar16.r(false);
                        } else if (jrc0Var instanceof grc0) {
                            fetVar16.e0(-1183302891);
                            grc0 grc0Var = (grc0) jrc0Var;
                            hew0.h(mm40VarL, grc0Var.c, w2dVar, grc0Var.b, function24, function24, function24, fetVar16, 512);
                            fetVar16.r(false);
                        }
                    }
                    throw b1j.f(-2116398699, fetVar16, false);
                }
                fetVar16.X();
                return Unit.f46060a;
        }
    }
}
