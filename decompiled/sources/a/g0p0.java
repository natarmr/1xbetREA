package a;

import a.l0n0;
import a.m1r;
import a.o2n0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.camera.impl.navigation.CameraScreens$CameraFragmentScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineDialogParams;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$AuthorizationCredsScreen;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$ClientConfigScreen;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$FeatureTogglesScreen;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$ModuleInfoScreen;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$RemoteConfigTestScreen;
import org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter.ChoseFilterScreenParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g0p0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10470a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0p0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f10470a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        byte b = 2;
        byte b2 = 26;
        byte b3 = 1;
        byte b4 = 0;
        yje yjeVar = null;
        switch (this.f10470a) {
            case 0:
                n2p0 n2p0Var = (n2p0) obj;
                n2p0Var.getClass();
                ((k3t0) this.receiver).x(n2p0Var);
                return Unit.f46060a;
            case 1:
                iyo0 iyo0Var = (iyo0) obj;
                iyo0Var.getClass();
                ((k3t0) this.receiver).x(iyo0Var);
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                i3p0 i3p0Var = (i3p0) this.receiver;
                i3p0Var.v.b(th, new abn0(i3p0Var, b2));
                return Unit.f46060a;
            case 3:
                k4p0 k4p0Var = (k4p0) obj;
                k4p0Var.getClass();
                e4p0 e4p0Var = (e4p0) this.receiver;
                m6m0 m6m0Var = e4p0.O1;
                e4p0Var.getClass();
                n0o0 n0o0Var = e4p0Var.M1;
                if (k4p0Var.equals(j4p0.f15896a)) {
                    ii iiVar = (ii) ((iwi) n0o0Var.getValue()).f15491a.f;
                    x1x.y(iiVar);
                    String strH = e4p0Var.H(R.string.clear);
                    String strH2 = e4p0Var.H(R.string.confirm_delete_all_actions);
                    String strH3 = e4p0Var.H(R.string.clear);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, e4p0Var.H(R.string.cancel), (String) null, "REMOVE_ALL_TEAM_BET_TEAMS", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = e4p0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    if (!(k4p0Var instanceof i4p0)) {
                        t9f.b();
                        return null;
                    }
                    String str2 = ((i4p0) k4p0Var).f14158a;
                    wdk0 wdk0Var = (wdk0) ((iwi) n0o0Var.getValue()).f15491a.g;
                    x1x.y(wdk0Var);
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str2, null, null, null, null, 124), e4p0Var, null, null, false, null, 1020);
                }
                e4p0Var.G0().x(o3p0.f24597a);
                return Unit.f46060a;
            case 4:
                b4p0 b4p0Var = (b4p0) obj;
                b4p0Var.getClass();
                ((k3t0) this.receiver).x(b4p0Var);
                return Unit.f46060a;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                q4p0 q4p0Var = (q4p0) this.receiver;
                q4p0Var.t.f(th2, new m4p0(q4p0Var, (byte) 0));
                return Unit.f46060a;
            case 6:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                q4p0 q4p0Var2 = (q4p0) this.receiver;
                q4p0Var2.t.f(th3, new m4p0(q4p0Var2, (byte) 0));
                return Unit.f46060a;
            case 7:
                p5p0 p5p0Var = (p5p0) obj;
                p5p0Var.getClass();
                ((o6p0) this.receiver).x(p5p0Var);
                return Unit.f46060a;
            case 8:
                lbp0 lbp0Var = (lbp0) obj;
                lbp0Var.getClass();
                h9p0 h9p0Var = (h9p0) this.receiver;
                y2m0 y2m0Var = h9p0.V1;
                h9p0Var.getClass();
                if (lbp0Var instanceof hbp0) {
                    hbp0 hbp0Var = (hbp0) lbp0Var;
                    ujd ujdVar = h9p0Var.N1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(h9p0Var, hbp0Var.f12781a);
                } else if (lbp0Var instanceof jbp0) {
                    jbp0 jbp0Var = (jbp0) lbp0Var;
                    wdk0 wdk0Var2 = h9p0Var.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, jbp0Var.f16247a, null, null, null, null, 124), h9p0Var, null, null, false, null, 1020);
                } else if (lbp0Var instanceof kbp0) {
                    if (h9p0Var.P1 == null) {
                        Intrinsics.h("tipsDialogFeature");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = h9p0Var.C();
                    eVarC2.getClass();
                    uuz uuzVar = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC2.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var = new ki60();
                        iiy[] iiyVarArr = ki60.r2;
                        ki60Var.n2.I(ki60Var, iiyVarArr[1], 23);
                        ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                        sj3.E0(ki60Var, eVarC2, "OnboardingBottomSheetContainerFragment");
                    }
                } else {
                    if (!(lbp0Var instanceof ibp0)) {
                        t9f.b();
                        return null;
                    }
                    ibp0 ibp0Var = (ibp0) lbp0Var;
                    String name = x8p0.class.getName();
                    if (h9p0Var.C().J(name) == null) {
                        s2m0 s2m0Var = x8p0.l2;
                        TeamDetailsDisciplineDialogParams teamDetailsDisciplineDialogParams = ibp0Var.f14501a;
                        s2m0Var.getClass();
                        x8p0 x8p0Var = new x8p0();
                        x8p0Var.k2.J(x8p0Var, x8p0.m2[0], teamDetailsDisciplineDialogParams);
                        x8p0Var.H0(h9p0Var.C(), name);
                    }
                }
                h9p0Var.G0().x(u7p0.f35196a);
                return Unit.f46060a;
            case 9:
                vap0 vap0Var = (vap0) obj;
                vap0Var.getClass();
                sap0 sap0Var = (sap0) this.receiver;
                j6m0 j6m0Var = sap0.R1;
                wdk0 wdk0Var3 = sap0Var.M1;
                if (wdk0Var3 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                wdk0.k(wdk0Var3, new xdk0(rek0.b, vap0Var.f37102a, null, null, null, null, 124), sap0Var, null, null, false, null, 1020);
                sap0Var.G0().x(eap0.f7479a);
                return Unit.f46060a;
            case 10:
                rgp0 rgp0Var = (rgp0) obj;
                rgp0Var.getClass();
                ((k3t0) this.receiver).x(rgp0Var);
                return Unit.f46060a;
            case 11:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                rhp0 rhp0Var = (rhp0) this.receiver;
                rhp0Var.p.b(th4, new qhp0(rhp0Var, b4));
                return Unit.f46060a;
            case 12:
                ejp0 ejp0Var = (ejp0) obj;
                ejp0Var.getClass();
                ajp0 ajp0Var = (ajp0) this.receiver;
                s9m0 s9m0Var = ajp0.r2;
                ajp0Var.getClass();
                yip0 yip0Var = new yip0(ajp0Var, ejp0Var, (byte) 0);
                if (!ajp0Var.R()) {
                    yip0Var.invoke();
                    ajp0Var.y0();
                }
                ((k3t0) ajp0Var.q2.getValue()).x(bjp0.f2718a);
                return Unit.f46060a;
            case 13:
                gkp0 gkp0Var = (gkp0) obj;
                gkp0Var.getClass();
                ((k3t0) this.receiver).x(gkp0Var);
                return Unit.f46060a;
            case 14:
                fnp0 fnp0Var = (fnp0) obj;
                fnp0Var.getClass();
                ((k3t0) this.receiver).x(fnp0Var);
                return Unit.f46060a;
            case 15:
                iop0 iop0Var = (iop0) obj;
                iop0Var.getClass();
                ((k3t0) this.receiver).x(iop0Var);
                return Unit.f46060a;
            case 16:
                di2 di2Var = (di2) obj;
                di2Var.getClass();
                jpp0 jpp0Var = (jpp0) this.receiver;
                s2m0 s2m0Var2 = jpp0.O1;
                jpp0Var.getClass();
                if (!di2Var.equals(di2.f6120a)) {
                    t9f.b();
                    return null;
                }
                ii iiVar2 = ((aci) jpp0Var.L1.getValue()).d;
                String strH4 = jpp0Var.H(R.string.clear);
                String strH5 = jpp0Var.H(R.string.confirm_delete_all_actions);
                String strH6 = jpp0Var.H(R.string.clear);
                strH6.getClass();
                DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, jpp0Var.H(R.string.cancel), (String) null, "REMOVE_ALL_TEAM_RESULT", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC3 = jpp0Var.C();
                eVarC3.getClass();
                iiVar2.d(dialogFields2, eVarC3);
                jpp0Var.G0().x(kh2.f18268a);
                return Unit.f46060a;
            case 17:
                vh2 vh2Var = (vh2) obj;
                vh2Var.getClass();
                ((k3t0) this.receiver).x(vh2Var);
                return Unit.f46060a;
            case 18:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((urp0) this.receiver).g.b(th5, new zgp0((byte) 13));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                yrp0 yrp0Var = (yrp0) obj;
                yrp0Var.getClass();
                ((k3t0) this.receiver).x(yrp0Var);
                return Unit.f46060a;
            case 20:
                ezp0 ezp0Var = (ezp0) obj;
                ezp0Var.getClass();
                kyp0 kyp0Var = (kyp0) this.receiver;
                y2m0 y2m0Var2 = kyp0.Q1;
                kyp0Var.getClass();
                if (ezp0Var instanceof czp0) {
                    czp0 czp0Var = (czp0) ezp0Var;
                    int iOrdinal = czp0Var.f5234a.ordinal();
                    if (iOrdinal == 0) {
                        str = "REQUEST_SEASONS_DIALOG_KEY";
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        str = "REQUEST_SURFACE_TYPES_DIALOG_KEY";
                    }
                    ChoseFilterScreenParams choseFilterScreenParams = new ChoseFilterScreenParams(str, czp0Var.b, czp0Var.c);
                    yk5 yk5Var = oic.l2;
                    androidx.fragment.app.e eVarC4 = kyp0Var.C();
                    eVarC4.getClass();
                    yk5Var.getClass();
                    String str3 = oic.n2;
                    if (eVarC4.J(str3) == null) {
                        oic oicVar = new oic();
                        oicVar.k2.J(oicVar, oic.m2[0], choseFilterScreenParams);
                        oicVar.H0(eVarC4, str3);
                    }
                } else {
                    if (!(ezp0Var instanceof dzp0)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar3 = kyp0Var.L1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH7 = kyp0Var.H(R.string.caution);
                    String strH8 = kyp0Var.H(R.string.reset_to_default_values);
                    String strH9 = kyp0Var.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, kyp0Var.H(R.string.cancel), (String) null, "REQUEST_RESET_FILTERS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = kyp0Var.C();
                    eVarC5.getClass();
                    iiVar3.d(dialogFields3, eVarC5);
                }
                kyp0Var.G0().x(xxp0.f41669a);
                return Unit.f46060a;
            case 21:
                gyp0 gyp0Var = (gyp0) obj;
                gyp0Var.getClass();
                ((k3t0) this.receiver).x(gyp0Var);
                return Unit.f46060a;
            case 22:
                txp0 txp0Var = (txp0) obj;
                txp0Var.getClass();
                ((k3t0) this.receiver).x(txp0Var);
                return Unit.f46060a;
            case 23:
                wzp0 wzp0Var = (wzp0) obj;
                wzp0Var.getClass();
                ((k3t0) this.receiver).x(wzp0Var);
                return Unit.f46060a;
            case 24:
                s1q0 s1q0Var = (s1q0) obj;
                s1q0Var.getClass();
                x1q0 x1q0Var = (x1q0) this.receiver;
                i1w0 i1w0Var = x1q0Var.l;
                if (s1q0Var instanceof bvq0) {
                    sac.V(jiu0.a(x1q0Var), new meo0((byte) 24), null, null, new ssl0((Object) x1q0Var, s1q0Var, yjeVar, (byte) 21), 14);
                } else if (s1q0Var instanceof ff9) {
                    ff9 ff9Var = (ff9) s1q0Var;
                    if (ff9Var instanceof ze9) {
                        sac.V(jiu0.a(x1q0Var), new meo0(b2), null, null, new t1q0(x1q0Var, yjeVar, b4), 14);
                    } else if (ff9Var instanceof af9) {
                        sac.V(jiu0.a(x1q0Var), new meo0((byte) 27), null, null, new w1q0(x1q0Var, yjeVar, b3), 14);
                    } else if (ff9Var instanceof bf9) {
                        sac.V(jiu0.a(x1q0Var), new meo0((byte) 28), null, null, new t1q0(x1q0Var, yjeVar, b3), 14);
                    } else if (ff9Var instanceof cf9) {
                        sac.V(jiu0.a(x1q0Var), new meo0((byte) 25), null, null, new w1q0(x1q0Var, yjeVar, b4), 14);
                    } else if (ff9Var instanceof df9) {
                        sac.V(jiu0.a(x1q0Var), new g0p0(1, x1q0Var.c, rjo.class, "log", "log(Ljava/lang/Throwable;)V", 0, (byte) 25), null, null, new w1q0(x1q0Var, yjeVar, b), 14);
                    } else if (ff9Var instanceof ef9) {
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI.m(drm0.e(((es) x1q0Var.f.f14992a).k()));
                        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    } else {
                        if (!(ff9Var instanceof ye9)) {
                            t9f.b();
                            return null;
                        }
                        k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                        kj5 kj5Var = x1q0Var.p;
                        kkd0 kkd0Var = kkd0.LOW;
                        kj5Var.getClass();
                        k0w0VarI2.h(new CameraScreens$CameraFragmentScreen());
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    }
                } else if (s1q0Var instanceof bsq0) {
                    k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                    x1q0Var.n.getClass();
                    k0w0VarI3.h(new TestSectionScreen$ClientConfigScreen());
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (pawVar3.hasNext()) {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else if (s1q0Var instanceof hsq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    FragmentScreen testSectionScreen$ModuleInfoScreen = new TestSectionScreen$ModuleInfoScreen();
                    if (testSectionScreen$ModuleInfoScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$ModuleInfoScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$ModuleInfoScreen)));
                    }
                    ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO4;
                        if (pawVar4.hasNext()) {
                            i1w0Var.a((oe50) pawVar4.next());
                        }
                    }
                } else if (s1q0Var instanceof ksq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    FragmentScreen testSectionScreen$RemoteConfigTestScreen = new TestSectionScreen$RemoteConfigTestScreen();
                    if (testSectionScreen$RemoteConfigTestScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$RemoteConfigTestScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$RemoteConfigTestScreen)));
                    }
                    ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar5 = (paw) listIteratorO5;
                        if (pawVar5.hasNext()) {
                            i1w0Var.a((oe50) pawVar5.next());
                        }
                    }
                } else if (s1q0Var instanceof yrq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                    FragmentScreen testSectionScreen$AuthorizationCredsScreen = new TestSectionScreen$AuthorizationCredsScreen();
                    if (testSectionScreen$AuthorizationCredsScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$AuthorizationCredsScreen)));
                    } else {
                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$AuthorizationCredsScreen)));
                    }
                    ListIterator listIteratorO6 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO6;
                        if (pawVar6.hasNext()) {
                            i1w0Var.a((oe50) pawVar6.next());
                        }
                    }
                } else if (s1q0Var instanceof dsq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                    final i2n0 i2n0Var = i2n0.f14058a;
                    FragmentScreen fragmentScreen = new FragmentScreen(i2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = i2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                    }
                    ListIterator listIteratorO7 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                    while (true) {
                        paw pawVar7 = (paw) listIteratorO7;
                        if (pawVar7.hasNext()) {
                            i1w0Var.a((oe50) pawVar7.next());
                        }
                    }
                } else if (s1q0Var instanceof msq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                    final m2n0 m2n0Var = m2n0.f21070a;
                    FragmentScreen fragmentScreen2 = new FragmentScreen(m2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = m2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen2 instanceof DialogScreen) {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen2)));
                    } else {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen2)));
                    }
                    ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                    while (true) {
                        paw pawVar8 = (paw) listIteratorO8;
                        if (pawVar8.hasNext()) {
                            i1w0Var.a((oe50) pawVar8.next());
                        }
                    }
                } else if (s1q0Var instanceof esq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ6 = b1j.q(i1w0Var);
                    FragmentScreen testSectionScreen$FeatureTogglesScreen = new TestSectionScreen$FeatureTogglesScreen();
                    if (testSectionScreen$FeatureTogglesScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$FeatureTogglesScreen)));
                    } else {
                        copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$FeatureTogglesScreen)));
                    }
                    ListIterator listIteratorO9 = b1j.o(i1w0Var, copyOnWriteArrayListQ6, 0);
                    while (true) {
                        paw pawVar9 = (paw) listIteratorO9;
                        if (pawVar9.hasNext()) {
                            i1w0Var.a((oe50) pawVar9.next());
                        }
                    }
                } else if (s1q0Var instanceof wrq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
                    final f2n0 f2n0Var = f2n0.f8820a;
                    FragmentScreen fragmentScreen3 = new FragmentScreen(f2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = f2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen3 instanceof DialogScreen) {
                        copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen3)));
                    } else {
                        copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen3)));
                    }
                    ListIterator listIteratorO10 = b1j.o(i1w0Var, copyOnWriteArrayListQ7, 0);
                    while (true) {
                        paw pawVar10 = (paw) listIteratorO10;
                        if (pawVar10.hasNext()) {
                            i1w0Var.a((oe50) pawVar10.next());
                        }
                    }
                } else if (s1q0Var instanceof gsq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ8 = b1j.q(i1w0Var);
                    final k2n0 k2n0Var = k2n0.f17583a;
                    FragmentScreen fragmentScreen4 = new FragmentScreen(k2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = k2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen4 instanceof DialogScreen) {
                        copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen4)));
                    } else {
                        copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen4)));
                    }
                    ListIterator listIteratorO11 = b1j.o(i1w0Var, copyOnWriteArrayListQ8, 0);
                    while (true) {
                        paw pawVar11 = (paw) listIteratorO11;
                        if (pawVar11.hasNext()) {
                            i1w0Var.a((oe50) pawVar11.next());
                        }
                    }
                } else if (s1q0Var instanceof isq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ9 = b1j.q(i1w0Var);
                    final l2n0 l2n0Var = l2n0.f19319a;
                    FragmentScreen fragmentScreen5 = new FragmentScreen(l2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = l2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen5 instanceof DialogScreen) {
                        copyOnWriteArrayListQ9.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen5)));
                    } else {
                        copyOnWriteArrayListQ9.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen5)));
                    }
                    ListIterator listIteratorO12 = b1j.o(i1w0Var, copyOnWriteArrayListQ9, 0);
                    while (true) {
                        paw pawVar12 = (paw) listIteratorO12;
                        if (pawVar12.hasNext()) {
                            i1w0Var.a((oe50) pawVar12.next());
                        }
                    }
                } else if (s1q0Var instanceof asq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ10 = b1j.q(i1w0Var);
                    final g2n0 g2n0Var = g2n0.f10568a;
                    FragmentScreen fragmentScreen6 = new FragmentScreen(g2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = g2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen6 instanceof DialogScreen) {
                        copyOnWriteArrayListQ10.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen6)));
                    } else {
                        copyOnWriteArrayListQ10.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen6)));
                    }
                    ListIterator listIteratorO13 = b1j.o(i1w0Var, copyOnWriteArrayListQ10, 0);
                    while (true) {
                        paw pawVar13 = (paw) listIteratorO13;
                        if (pawVar13.hasNext()) {
                            i1w0Var.a((oe50) pawVar13.next());
                        }
                    }
                } else if (s1q0Var instanceof nsq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ11 = b1j.q(i1w0Var);
                    final n2n0 n2n0Var = n2n0.f22810a;
                    FragmentScreen fragmentScreen7 = new FragmentScreen(n2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = n2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen7 instanceof DialogScreen) {
                        copyOnWriteArrayListQ11.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen7)));
                    } else {
                        copyOnWriteArrayListQ11.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen7)));
                    }
                    ListIterator listIteratorO14 = b1j.o(i1w0Var, copyOnWriteArrayListQ11, 0);
                    while (true) {
                        paw pawVar14 = (paw) listIteratorO14;
                        if (pawVar14.hasNext()) {
                            i1w0Var.a((oe50) pawVar14.next());
                        }
                    }
                } else if (s1q0Var instanceof fsq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ12 = b1j.q(i1w0Var);
                    final j2n0 j2n0Var = j2n0.f15789a;
                    FragmentScreen fragmentScreen8 = new FragmentScreen(j2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = j2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen8 instanceof DialogScreen) {
                        copyOnWriteArrayListQ12.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen8)));
                    } else {
                        copyOnWriteArrayListQ12.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen8)));
                    }
                    ListIterator listIteratorO15 = b1j.o(i1w0Var, copyOnWriteArrayListQ12, 0);
                    while (true) {
                        paw pawVar15 = (paw) listIteratorO15;
                        if (pawVar15.hasNext()) {
                            i1w0Var.a((oe50) pawVar15.next());
                        }
                    }
                } else if (s1q0Var instanceof csq0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ13 = b1j.q(i1w0Var);
                    final h2n0 h2n0Var = h2n0.f12343a;
                    FragmentScreen fragmentScreen9 = new FragmentScreen(h2n0Var) { // from class: org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$SubSectionScreen

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final o2n0 f46653a;

                        {
                            this.f46653a = h2n0Var;
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            l0n0.P1.getClass();
                            l0n0 l0n0Var = new l0n0();
                            l0n0Var.O1.u(l0n0Var, l0n0.Q1[1], this.f46653a);
                            return l0n0Var;
                        }

                        @Override // a.m7h0
                        /* JADX INFO: renamed from: b */
                        public final String getF45455a() {
                            return ufx.C(this);
                        }

                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        /* JADX INFO: renamed from: g */
                        public final /* bridge */ boolean getB() {
                            return true;
                        }
                    };
                    if (fragmentScreen9 instanceof DialogScreen) {
                        copyOnWriteArrayListQ13.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen9)));
                    } else {
                        copyOnWriteArrayListQ13.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen9)));
                    }
                    ListIterator listIteratorO16 = b1j.o(i1w0Var, copyOnWriteArrayListQ13, 0);
                    while (true) {
                        paw pawVar16 = (paw) listIteratorO16;
                        if (pawVar16.hasNext()) {
                            i1w0Var.a((oe50) pawVar16.next());
                        }
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((rjo) this.receiver).a(th6);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                g3q0 g3q0Var = (g3q0) obj;
                g3q0Var.getClass();
                ((k3t0) this.receiver).x(g3q0Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                d4q0 d4q0Var = (d4q0) this.receiver;
                d4q0Var.getClass();
                th7.printStackTrace();
                d4q0Var.H(new zgp0((byte) 20));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                long j = ((ne60) obj).f23370a;
                z4q0 z4q0Var = (z4q0) this.receiver;
                z4q0Var.getClass();
                d5q0 d5q0Var = (d5q0) mbc.R(z4q0Var, e5q0.f7246a);
                if (d5q0Var != null) {
                    qjj.W(z4q0Var.N0(), null, null, new n1(z4q0Var, j, d5q0Var, new y4q0(z4q0Var, j), (yje) null), 3);
                }
                return Unit.f46060a;
            default:
                ((s4q0) this.receiver).b.a((Function1) obj);
                return Unit.f46060a;
        }
    }
}
