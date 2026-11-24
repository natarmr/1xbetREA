package a;

import android.text.format.DateFormat;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class un6 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35945a;
    public final /* synthetic */ Object b;

    public /* synthetic */ un6(gc6 gc6Var) {
        this.f35945a = (byte) 25;
        this.b = gc6Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        pz40 pz40Var = s6t0.f31722a;
        final w74 w74Var = (w74) this.b;
        cgx0 cgx0Var = w74Var.m2;
        r34 r34Var = w74Var.n2;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rek0 rek0Var = w74.r2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strW = rsm0.w(R.string.cancel, 0, fetVar);
            String strW2 = rsm0.w(R.string.security_exit_sessions_confirm_button_title, 0, fetVar);
            String strW3 = rsm0.w(R.string.current_session, 0, fetVar);
            String strW4 = rsm0.w(R.string.authenticator_connected, 0, fetVar);
            iiy[] iiyVarArr = w74.s2;
            boolean zF = fetVar.f(r34Var.n(w74Var, iiyVarArr[3]).longValue()) | fetVar.h(w74Var.P0());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                if (!w74Var.P0()) {
                    rdj rdjVar = rdj.f30294a;
                    boolean zIs24HourFormat = DateFormat.is24HourFormat(w74Var.o0());
                    strW3 = rdj.g(new znq0(r34Var.n(w74Var, iiyVarArr[3]).longValue()), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56);
                }
                fetVar.o0(strW3);
                objP = strW3;
            }
            String strQ = (String) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(jm40.b, 16.0f, 24.0f, 16.0f, 8.0f);
            String strN = w74Var.l2.n(w74Var, iiyVarArr[1]);
            if (cgx0Var.n(w74Var, iiyVarArr[2]).booleanValue()) {
                strQ = w6x.q(strQ, " \n", strW4);
            }
            String str = strQ;
            Integer numValueOf = cgx0Var.n(w74Var, iiyVarArr[2]).booleanValue() ? Integer.valueOf(R.drawable.ic_status_green_check_circle) : null;
            zfn zfnVar = zaq0.b;
            final byte b = 0;
            obc.q(mm40VarM, new rqm((vui0) new uui0(strN, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), numValueOf, 32), (pui0) new nui0(null, null, new m0x(w74Var.o2.n(w74Var, iiyVarArr[4]).intValue(), null, 6), new y3d(w74Var.P0() ? StaticColors.INSTANCE.m123getWhite0d7_KjU() : s6t0.b().f33626a.getPrimary()), null, new pc5(new y3d(w74Var.P0() ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getBackgroundContent())), 0.0f, 211), (pvi0) null, d4d.BACKGROUND, (tvi0) null, (wui0) null, false, (e900) null, 492), false, null, null, null, null, null, fetVar, 384, 248);
            vul vulVar = vul.f38053a;
            boolean zG = fetVar.g(strW);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new wul(nul.e, oe9.f25112a, new ue9(strW), true, false, false);
                fetVar.o0(objP2);
            }
            wul wulVar = (wul) objP2;
            boolean zG2 = fetVar.g(strW2);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new wul(lul.e, oe9.f25112a, new ue9(strW2), true, false, false);
                fetVar.o0(objP3);
            }
            wul wulVar2 = (wul) objP3;
            boolean zI = fetVar.i(w74Var);
            Object objP4 = fetVar.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new Function0() { // from class: a.v74
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        w74 w74Var2 = w74Var;
                        switch (b2) {
                            case 0:
                                rek0 rek0Var2 = w74.r2;
                                w74Var2.x0();
                                break;
                            default:
                                rek0 rek0Var3 = w74.r2;
                                phf0 phf0Var = w74Var2.k2;
                                iiy[] iiyVarArr2 = w74.s2;
                                vcc.f0(i120.V(new Pair(phf0Var.n(w74Var2, iiyVarArr2[0]), w74Var2.p2.n(w74Var2, iiyVarArr2[5]))), w74Var2, phf0Var.n(w74Var2, iiyVarArr2[0]));
                                w74Var2.x0();
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean zI2 = fetVar.i(w74Var);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == cl5Var) {
                final byte b2 = 1;
                objP5 = new Function0() { // from class: a.v74
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        w74 w74Var2 = w74Var;
                        switch (b3) {
                            case 0:
                                rek0 rek0Var2 = w74.r2;
                                w74Var2.x0();
                                break;
                            default:
                                rek0 rek0Var3 = w74.r2;
                                phf0 phf0Var = w74Var2.k2;
                                iiy[] iiyVarArr2 = w74.s2;
                                vcc.f0(i120.V(new Pair(phf0Var.n(w74Var2, iiyVarArr2[0]), w74Var2.p2.n(w74Var2, iiyVarArr2[5]))), w74Var2, phf0Var.n(w74Var2, iiyVarArr2[0]));
                                w74Var2.x0();
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP5);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP5, fetVar, 48, 17);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        vp4 vp4Var = (vp4) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        jdk0 jdk0Var = vp4.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.N(jm40.b, 0.0f, 24.0f, 0.0f, 0.0f, 13), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
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
            pz40 pz40VarQ = gkb.Q(vp4Var.P0().e, null, fetVar, 0, 7);
            cq4 cq4VarP0 = vp4Var.P0();
            boolean zI = fetVar.i(cq4VarP0);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                j94 j94Var = new j94(1, cq4VarP0, cq4.class, "onTypeChipSelected", "onTypeChipSelected(Lorg/xplatform/authenticator/impl/util/NotificationType;)V", 0, (byte) 11);
                fetVar.o0(j94Var);
                objP = j94Var;
            }
            jhy jhyVar = (jhy) objP;
            cq4 cq4VarP1 = vp4Var.P0();
            boolean zI2 = fetVar.i(cq4VarP1);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                j94 j94Var2 = new j94(1, cq4VarP1, cq4.class, "onPeriodChipSelected", "onPeriodChipSelected(Lorg/xplatform/authenticator/impl/util/NotificationPeriod;)V", 0, (byte) 12);
                fetVar.o0(j94Var2);
                objP2 = j94Var2;
            }
            jhy jhyVar2 = (jhy) objP2;
            cq4 cq4VarP2 = vp4Var.P0();
            boolean zI3 = fetVar.i(cq4VarP2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                f8 f8Var = new f8(0, cq4VarP2, cq4.class, "clearSettings", "clearSettings()V", 0, (byte) 18);
                fetVar.o0(f8Var);
                objP3 = f8Var;
            }
            jhy jhyVar3 = (jhy) objP3;
            cq4 cq4VarP3 = vp4Var.P0();
            boolean zI4 = fetVar.i(cq4VarP3);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                f8 f8Var2 = new f8(0, cq4VarP3, cq4.class, "saveSettings", "saveSettings()V", 0, (byte) 19);
                fetVar.o0(f8Var2);
                objP4 = f8Var2;
            }
            jar0.e(pz40VarQ, (Function1) jhyVar, (Function1) jhyVar2, (Function0) ((jhy) objP4), (Function0) jhyVar3, fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        ua5 ua5Var = (ua5) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u63) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            mrv.n(ua5Var, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        gc6 gc6Var = (gc6) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u63) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            jd8.l(gc6Var, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        ik7 ik7Var;
        boolean z;
        boolean z2;
        ik7 ik7Var2 = (ik7) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        boolean z3 = true;
        boolean z4 = false;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (uoo0 uoo0Var : ik7Var2.c) {
                fetVar.b0(-1826312731, uoo0Var.a());
                if (uoo0Var instanceof too0) {
                    fetVar.e0(-780983659);
                    fet fetVar2 = fetVar;
                    ik7Var = ik7Var2;
                    z = z4;
                    v8q0.a(ik7Var2.f14911a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar), fetVar2, 0, 24960, 110590);
                    fetVar = fetVar2;
                    fetVar.r(z);
                    z2 = true;
                } else {
                    ik7Var = ik7Var2;
                    z = z4;
                    if (uoo0Var instanceof ioo0) {
                        fetVar.e0(-1826295310);
                        z2 = true;
                        rq8.d(1, fetVar, null);
                        fetVar.r(z);
                    } else {
                        z2 = true;
                        if (uoo0Var instanceof soo0) {
                            fetVar.e0(-780508863);
                            soo0 soo0Var = (soo0) uoo0Var;
                            j6n.h(soo0Var.f32554a, soo0Var.b, null, 0, 0, fetVar, 0, 28);
                            fetVar.r(z);
                        } else {
                            fetVar.e0(-780226857);
                            fetVar.r(z);
                        }
                    }
                }
                fetVar.r(z);
                z4 = z;
                z3 = z2;
                ik7Var2 = ik7Var;
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        dn7 dn7Var = (dn7) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            v8q0.a(dn7Var.f6354a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, 0, 24960, 110590);
            v8q0.a(dn7Var.c, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, 0, 24960, 110590);
            v8q0.a(" · ", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(ibm0.n(g1t0.d(), fetVar), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 6, 24960, 110590);
            v8q0.a(dn7Var.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(ibm0.n(g1t0.d(), fetVar), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110590);
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
        Object value;
        ArrayList arrayList;
        byte b = this.f35945a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        float fC = 1.0f;
        jm40 jm40Var = jm40.b;
        final byte b2 = 1;
        boolean z = false;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                wn6 wn6Var = (wn6) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                bj5 bj5Var = wn6.V1;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else {
                    if (wn6Var.N1 == null) {
                        Intrinsics.h("relatedGamesListFactory");
                        throw null;
                    }
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    xuz xuzVar = pb10.c;
                    cge0.b(mm40VarE, wn6Var, new RelatedParams(false, -1L, -1L, -1L, -1L, tef0.c), fetVar);
                }
                return Unit.f46060a;
            case 1:
                wls wlsVar = (wls) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(lr8Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    float fD = (lr8Var.d() - ep20.f8165a) / 2.0f;
                    n0q n0qVar = o7k0.c;
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    ep20.b(0, fetVar2, o2e.e0(o7k0.s(o7k0.c(jm40Var, 1.0f), fD), "MAP_ITEM_MAP_INFO"), wlsVar.c, wlsVar.e, wlsVar.f);
                    ep20.d(n0qVar, wlsVar.f39372a, wlsVar.b, fetVar2, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                li40 li40Var = (li40) obj4;
                lr8 lr8Var2 = (lr8) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                lr8Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(lr8Var2) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    float fD2 = lr8Var2.d();
                    n0q n0qVar2 = o7k0.c;
                    mm40 mm40VarB = lr8Var2.b(jm40Var, gqw0.e);
                    zcl zclVar = qmk.f28987a;
                    lgb.w(n0qVar2, o7k0.n(mm40VarB, 40.0f), li40Var.b(), new m0x(R.drawable.ic_glyph_mobile_legends, null, 6), ((StaticColors) fetVar3.k(m8m0.f21378a)).m126getWhite200d7_KjU(), null, null, gqw0.A, fetVar3, 12582918, 96);
                    if (li40Var instanceof ji40) {
                        fetVar3.e0(-1815586270);
                        x9x.k((ji40) li40Var, fD2, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-1815524766);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                b110 b110Var = (b110) obj4;
                lr8 lr8Var3 = (lr8) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                lr8Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(lr8Var3) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    float fD3 = lr8Var3.d();
                    long j = lr8Var3.b;
                    boolean zD = fetVar4.d(fD3) | fetVar4.d(lr8Var3.c()) | fetVar4.h(p4e.d(j));
                    Object objP = fetVar4.P();
                    if (zD || objP == cl5Var) {
                        float fD4 = lr8Var3.d();
                        float fC2 = lr8Var3.c();
                        if (p4e.d(j)) {
                            float fC3 = lr8Var3.c();
                            zcl zclVar2 = qmk.f28987a;
                            if (ycl.a(fC3, 0.0f) > 0) {
                                fC = lr8Var3.c() / r3m0.f29797a;
                            }
                        }
                        objP = new dp20(fD4, fC2, fC);
                        fetVar4.o0(objP);
                    }
                    dp20 dp20Var = (dp20) objP;
                    r3m0.f(o7k0.c, b110Var.d, fetVar4, 6);
                    r3m0.d(b110Var.f, dp20Var, fetVar4, 0);
                    r3m0.a(b110Var.e, dp20Var, fetVar4, 0);
                    r3m0.c(b110Var.f1786a, dp20Var, fetVar4, 0);
                    a4x a4xVar = b110Var.c.c;
                    zfn zfnVar = jjg.f16616a;
                    ((ijg) fetVar4.k(zfnVar)).getClass();
                    r3m0.i(a4xVar, ijg.h0, dp20Var, fetVar4, 0);
                    a4x a4xVar2 = b110Var.b.c;
                    ((ijg) fetVar4.k(zfnVar)).getClass();
                    r3m0.i(a4xVar2, ijg.H0, dp20Var, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                rx rxVar = (rx) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 54);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarD);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar5, thg0VarA2, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar5, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar5, numValueOf, shdVar3);
                    jpm0.n(fetVar5);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar5, mm40VarC1, shdVar4);
                    StaticColors staticColors = StaticColors.INSTANCE;
                    long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
                    zcl zclVar3 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarN = o7k0.n(s5x0.J(i120.Q(jm40Var2, jM126getWhite200d7_KjU, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 6.0f), 18.0f);
                    int i = rxVar.f31238a;
                    j0x.b(a8k0.F(rxVar.f31238a, 0, fetVar5), null, o2e.e0(mm40VarN, i == R.drawable.ic_glyph_select_all_active ? "ADDITIONAL_INFO_BUTTON_ICON_ACTIVE" : i == R.drawable.ic_glyph_select_all_inactive ? "ADDITIONAL_INFO_BUTTON_ICON_INACTIVE" : ""), null, null, 0.0f, null, fetVar5, 56, 120);
                    mm40 mm40VarN2 = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar5, 6);
                    int iHashCode3 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM3 = fetVar5.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarN2);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, shdVar);
                    jpm0.o(fetVar5, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
                    jpm0.o(fetVar5, mm40VarC2, shdVar4);
                    v8q0.a(rxVar.b, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar5, 0, 0, 131066);
                    if (rxVar.c.length() > 0) {
                        fetVar5.e0(1769823843);
                        v8q0.a(rxVar.c, null, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar5, 0, 0, 131066);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(1770021406);
                        fetVar5.r(false);
                    }
                    fetVar5.r(true);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                int iIntValue8 = ((Integer) obj3).intValue();
                jdk0 jdk0Var = mz.V1;
                g00 g00VarH0 = ((mz) obj4).H0();
                Date time = new GregorianCalendar(iIntValue6, iIntValue7, iIntValue8).getTime();
                rdj rdjVar = rdj.f30294a;
                sdj sdjVar = sdj.UNIVERSAL;
                Locale locale = Locale.ENGLISH;
                locale.getClass();
                String strC = rdj.c(rdjVar, sdjVar, time, locale, 28);
                p7m0 p7m0Var = g00VarH0.A;
                do {
                    value = p7m0Var.getValue();
                    List<Object> list = (List) value;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (Object objC : list) {
                        if (objC instanceof itc) {
                            itc itcVar = (itc) objC;
                            if (itcVar.c == vqp.h) {
                                objC = itc.c(itcVar, 0, strC, 55);
                            }
                        }
                        arrayList.add(objC);
                    }
                } while (!p7m0Var.m(value, arrayList));
                return Unit.f46060a;
            case 6:
                ra0 ra0Var = (ra0) obj4;
                lr8 lr8Var4 = (lr8) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                lr8Var4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar6.g(lr8Var4) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    mm40 mm40VarE2 = o7k0.e(jm40Var, (lr8Var4.d() / 1.6666666f) + 68.0f);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(lr8Var4.b(s5x0.J(mm40VarE2, 8.0f), gqw0.e), "BOX_WITH_CONSTRAINTS_BUTTON");
                    x5d x5dVarA2 = w5d.a(new qw3(12.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar6, 48);
                    int iHashCode4 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM4 = fetVar6.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar6, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC3, gqw0.v);
                    ra0Var.getClass();
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar6);
                    zfn zfnVar2 = zaq0.b;
                    dww.c(pm80VarF, null, null, ((ThemeColors) fetVar6.k(zfnVar2)).getPrimary(), fetVar6, 56, 4);
                    v8q0.a(ra0Var.f30110a, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar6.k(zfnVar2)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 48, 24960, 109560);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 7:
                dw0 dw0Var = new dw0((String) obj, (String) obj2, (String) obj3);
                int i2 = tw0.x;
                ((tw0) obj4).G(dw0Var);
                return Unit.f46060a;
            case 8:
                u11 u11Var = (u11) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarE3 = o7k0.e(mm40VarD2, 246.0f);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode5 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM5 = fetVar7.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar7, mm40VarE3);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC4, gqw0.v);
                    jcb.l(null, u11Var.e, false, null, fetVar7, 0, 13);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 9:
                r11 r11Var = (r11) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar6 = qmk.f28987a;
                    slb.k(s5x0.N(mm40VarD3, 0.0f, 0.0f, 0.0f, 4.0f, 7), r11Var.f29655a, null, null, null, null, null, null, null, fetVar8, 0, 508);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 10:
                b41 b41Var = (b41) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                jdk0 jdk0Var2 = z31.n2;
                ((y5d) obj).getClass();
                if (fetVar9.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    n0x n0xVar = b41Var.f;
                    y3d y3dVar = new y3d(((ThemeColors) fetVar9.k(zaq0.b)).getBackgroundLight60());
                    zcl zclVar7 = qmk.f28987a;
                    lc00VarB.add(new pr5(n0xVar, y3dVar, new ds5(210.0f), Integer.valueOf(R.drawable.onboarding_placeholder)));
                    zjb.h(null, dyb.o0(kotlin.collections.a.a(lc00VarB)), false, 0L, 0L, null, fetVar9, 0, 61);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 11:
                t71 t71Var = new t71((String) obj, (String) obj2, (String) obj3);
                int i3 = n91.f0;
                ((n91) obj4).G(t71Var);
                return Unit.f46060a;
            case 12:
                tw1 tw1Var = (tw1) obj4;
                fet fetVar10 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar10.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarD4, 12.0f, 0.0f, 12.0f, 12.0f, 2);
                    tj30 tj30VarC2 = zq8.c(gqw0.d, false);
                    int iHashCode6 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM6 = fetVar10.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar10, mm40VarN3);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC5, gqw0.v);
                    String str = tw1Var.b;
                    ((g1t0) fetVar10.k(j1t0.e)).getClass();
                    v8q0.a(str, o2e.e0(jm40Var, "AGGREGATOR_TOURNAMENT_RULES_CELL_CONTENT_TEXT"), ((ThemeColors) fetVar10.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar10, 48, 0, 131064);
                    fetVar10.r(true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 13:
                y82 y82Var = (y82) obj4;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                qek0 qek0Var = y82.V1;
                str2.getClass();
                str3.getClass();
                str4.getClass();
                kxq kxqVarB = y82Var.B();
                if (kxqVarB != null) {
                    wdk0 wdk0Var = y82Var.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    n6x.F(kxqVarB, wdk0Var, str2, str3, str4);
                }
                return Unit.f46060a;
            case 14:
                vce vceVar = (vce) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    jcb.l(null, vceVar.f37183a.f40787a, true, null, fetVar11, 384, 9);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 15:
                uce uceVar = (uce) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    jcb.l(null, uceVar.f35425a.f12885a, true, null, fetVar12, 384, 9);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 16:
                fie fieVar = (fie) obj4;
                fet fetVar13 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar13.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    jcb.l(null, ((xge) fieVar).f40834a, true, null, fetVar13, 384, 9);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 17:
                d54 d54Var = (d54) obj4;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                gfk0 gfk0Var = d54.R1;
                mm40Var2.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= fetVar14.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    int i4 = iIntValue17;
                    cge0 cge0Var = d54Var.N1;
                    if (cge0Var == null) {
                        Intrinsics.h("registrationTypeChoiceDefaultFactory");
                        throw null;
                    }
                    boolean zI = fetVar14.i(d54Var);
                    Object objP2 = fetVar14.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new b54(d54Var, (byte) 1);
                        fetVar14.o0(objP2);
                    }
                    cge0Var.a(mm40Var2, d54Var, (Function0) objP2, fetVar14, i4 & 14);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 18:
                f94 f94Var = (f94) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    nkb.h(null, ((e94) f94Var).f7402a, kjm.b, null, null, null, fetVar15, 384, 57);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                final u74 u74Var = (u74) obj4;
                fet fetVar16 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                qek0 qek0Var2 = u74.l2;
                ((y5d) obj).getClass();
                if (fetVar16.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    String strW = rsm0.w(R.string.cancel, 0, fetVar16);
                    String strW2 = rsm0.w(R.string.security_exit_sessions_confirm_button_title, 0, fetVar16);
                    zcl zclVar9 = qmk.f28987a;
                    kkb.m(s5x0.L(jm40Var, 0.0f, 16.0f, 1), rsm0.w(R.string.security_exit_all_sessions_message, 0, fetVar16), null, 0, 0L, 0L, fetVar16, 0, 60);
                    vul vulVar = vul.f38053a;
                    boolean zG = fetVar16.g(strW);
                    Object objP3 = fetVar16.P();
                    if (zG || objP3 == cl5Var) {
                        wul wulVar = new wul(nul.e, oe9.f25112a, new ue9(strW), true, false, false);
                        fetVar16.o0(wulVar);
                        objP3 = wulVar;
                    }
                    wul wulVar2 = (wul) objP3;
                    boolean zG2 = fetVar16.g(strW2);
                    Object objP4 = fetVar16.P();
                    if (zG2 || objP4 == cl5Var) {
                        wul wulVar3 = new wul(lul.e, oe9.f25112a, new ue9(strW2), true, false, false);
                        fetVar16.o0(wulVar3);
                        objP4 = wulVar3;
                    }
                    wul wulVar4 = (wul) objP4;
                    boolean zI2 = fetVar16.i(u74Var);
                    Object objP5 = fetVar16.P();
                    Object obj5 = objP5;
                    if (zI2 || objP5 == cl5Var) {
                        final byte b3 = z ? (byte) 1 : (byte) 0;
                        Function0 function0 = new Function0() { // from class: a.t74
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b3;
                                u74 u74Var2 = u74Var;
                                switch (b4) {
                                    case 0:
                                        qek0 qek0Var3 = u74.l2;
                                        u74Var2.x0();
                                        break;
                                    default:
                                        qek0 qek0Var4 = u74.l2;
                                        phf0 phf0Var = u74Var2.k2;
                                        iiy[] iiyVarArr = u74.m2;
                                        vcc.f0(i120.V(new Pair(phf0Var.n(u74Var2, iiyVarArr[0]), Boolean.TRUE)), u74Var2, phf0Var.n(u74Var2, iiyVarArr[0]));
                                        u74Var2.x0();
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar16.o0(function0);
                        obj5 = function0;
                    }
                    Function0 function1 = (Function0) obj5;
                    boolean zI3 = fetVar16.i(u74Var);
                    Object objP6 = fetVar16.P();
                    Object obj6 = objP6;
                    if (zI3 || objP6 == cl5Var) {
                        Function0 function2 = new Function0() { // from class: a.t74
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b2;
                                u74 u74Var2 = u74Var;
                                switch (b4) {
                                    case 0:
                                        qek0 qek0Var3 = u74.l2;
                                        u74Var2.x0();
                                        break;
                                    default:
                                        qek0 qek0Var4 = u74.l2;
                                        phf0 phf0Var = u74Var2.k2;
                                        iiy[] iiyVarArr = u74.m2;
                                        vcc.f0(i120.V(new Pair(phf0Var.n(u74Var2, iiyVarArr[0]), Boolean.TRUE)), u74Var2, phf0Var.n(u74Var2, iiyVarArr[0]));
                                        u74Var2.x0();
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar16.o0(function2);
                        obj6 = function2;
                    }
                    gkb.i(null, vulVar, wulVar2, wulVar4, 0L, function1, (Function0) obj6, fetVar16, 48, 17);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 20:
                return a(obj, obj2, obj3);
            case 21:
                ze4 ze4Var = (ze4) obj4;
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar17 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                qek0 qek0Var3 = ze4.g2;
                mm40Var3.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= fetVar17.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar17.U(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    zcl zclVar10 = qmk.f28987a;
                    mm40 mm40VarN4 = o7k0.n(mm40Var3, 20.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(mm40VarN4, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), jd8.n);
                    Object objP7 = fetVar17.P();
                    if (objP7 == cl5Var) {
                        objP7 = dw9.j(fetVar17);
                    }
                    gy40 gy40Var = (gy40) objP7;
                    boolean zI4 = fetVar17.i(ze4Var);
                    Object objP8 = fetVar17.P();
                    if (zI4 || objP8 == cl5Var) {
                        objP8 = new pe4(ze4Var, (byte) 7);
                        fetVar17.o0(objP8);
                    }
                    zq8.a(0, fetVar17, y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP8, 28));
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 22:
                if4 if4Var = (if4) obj4;
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar18 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                qek0 qek0Var4 = ze4.g2;
                mm40Var4.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= fetVar18.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar18.U(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    zcl zclVar11 = qmk.f28987a;
                    mm40 mm40VarU = o7k0.u(mm40Var4, 0.0f, 160.0f, 1);
                    String str5 = if4Var.f14668a;
                    pz40 pz40Var2 = s6t0.f31722a;
                    v8q0.a(str5, mm40VarU, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar18, 0, 24960, 109560);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 23:
                return b(obj, obj2, obj3);
            case 24:
                return c(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return g(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dt6 dt6Var = (dt6) obj4;
                List list2 = (List) obj;
                String str6 = (String) obj2;
                hxu hxuVar = (hxu) obj3;
                bby bbyVar = dt6Var.d0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                dt6Var.H(new iop(dt6Var, list2, hxuVar, str6, (byte) 26));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return i(obj, obj2, obj3);
            default:
                id8 id8Var = (id8) obj4;
                fet fetVar19 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar19.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar12 = qmk.f28987a;
                    hkb.k(0, 0, fetVar19, s5x0.N(mm40VarD5, 0.0f, 0.0f, 0.0f, 32.0f, 7), id8Var.f);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ un6(Object obj, byte b) {
        this.f35945a = b;
        this.b = obj;
    }
}
