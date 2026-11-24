package a;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cnc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4646a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cnc(Object obj, byte b) {
        this.f4646a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        h8g h8gVar = (h8g) this.b;
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        int iIntValue = num.intValue();
        kud kudVar = h8g.l2;
        k8g k8gVar = (k8g) h8gVar.j2.getValue();
        k8gVar.b.e("selected_month_key", num);
        p7m0 p7m0Var = k8gVar.i;
        Object value = p7m0Var.getValue();
        ll9 ll9Var = value instanceof ll9 ? (ll9) value : null;
        if (ll9Var != null) {
            jl9 jl9Var = ll9Var.f20236a;
            p7m0Var.o(null, new ll9(new jl9(iIntValue, jl9Var.b, jl9Var.c)));
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        g9g g9gVar = (g9g) this.b;
        ((Throwable) obj).getClass();
        ((String) obj2).getClass();
        pb10 pb10VarJ = g9gVar.c ? pb10.r : ozb.J(-1L, pb10.v);
        p7m0 p7m0Var = g9gVar.k;
        x8g x8gVar = new x8g(g2v.d(g9gVar.g, pb10VarJ, null, null, R.string.data_retrieval_error, 0, null, 478));
        p7m0Var.getClass();
        p7m0Var.o(null, x8gVar);
        return Unit.f46060a;
    }

    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.ltc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object ua7Var;
        ?? r5;
        Object value;
        Object value2;
        byte b = this.f4646a;
        byte b2 = 6;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 3;
        byte b4 = 2;
        final byte b5 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gnc gncVar = (gnc) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kl5 kl5Var = gnc.Z1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Unit unit = Unit.f46060a;
                    boolean zI = fetVar.i(gncVar);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new bnc(gncVar, b4);
                        fetVar.o0(objP);
                    }
                    m0x0.o(unit, (Function1) objP, fetVar);
                    k3t0 k3t0VarM0 = gncVar.M0();
                    boolean zI2 = fetVar.i(gncVar);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new enc(1, gncVar, gnc.class, "handleClassicFavoritesContainerSideEffect", "handleClassicFavoritesContainerSideEffect(Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoritesContainerSideEffect;)V", 0, (byte) 6);
                        fetVar.o0(objP2);
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar);
                    boolean zI3 = fetVar.i(k3t0VarM0) | fetVar.i(gncVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        r5 = 0;
                        ua7Var = new ua7(k3t0VarM0, gncVar, pz40VarF, null, (byte) 18);
                        fetVar.o0(ua7Var);
                    } else {
                        ua7Var = objP3;
                        r5 = 0;
                    }
                    m0x0.t(fetVar, gncVar, (Function2) ua7Var);
                    mm40 mm40VarH = phu0.H(yyw.X(jm40Var, r5, fetVar, 1), r5, 1);
                    pnc pncVar = (pnc) ((i3t0) gncVar.M0()).y(fetVar).getValue();
                    k3t0 k3t0VarM1 = gncVar.M0();
                    boolean zI4 = fetVar.i(k3t0VarM1);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new enc(1, k3t0VarM1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar.o0(objP4);
                    }
                    o050.j(mm40VarH, pncVar, (Function1) ((jhy) objP4), u1c.M(-1225149386, new awh(gncVar, (byte) 18), fetVar), fetVar, 3072);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                iwc iwcVar = (iwc) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (iwcVar.c) {
                    i1w0 i1w0Var = iwcVar.e;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                p7m0 p7m0Var = iwcVar.o;
                ewc ewcVar = new ewc(iwcVar.n);
                p7m0Var.getClass();
                p7m0Var.o(null, ewcVar);
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((qxc) obj3).y();
                return Unit.f46060a;
            case 3:
                ogs0 ogs0Var = (ogs0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarL = twn.l(gqw0.k, yyw.U(jm40Var, 0.3f));
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(ogs0Var.e, o2e.e0(s5x0.N(mm40VarL, 12.0f, 0.0f, 12.0f, 0.0f, 10), "CompactTransactionCellComponentAmountTextTestTag"), fbc.d(ogs0Var.c), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, 0, 0, 131064);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 4:
                add addVar = (add) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 28.0f), "COMPARE_TEAMS_HEADER_TEST_TAG");
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_empty, 0, fetVar3);
                    StaticColors staticColors = StaticColors.INSTANCE;
                    long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
                    zcl zclVar3 = qmk.d;
                    ugg0 ugg0Var = vgg0.f37379a;
                    k7x.b(addVar.f673a, null, o2e.e0(o7k0.n(s5x0.K(i120.Q(jm40Var2, jM73getBlack400d7_KjU, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 6.0f, 2.0f), 24.0f), "COMPARE_TEAMS_HEADER_FIRST_TEAM_IMAGE_TEST_TAG"), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                    v8q0.a(addVar.c, o2e.e0(o7k0.w(i120.Q(o7k0.c(s5x0.N(jm40Var2, 4.0f, 0.0f, 4.0f, 0.0f, 10).e(new x7z(1.0f, true)), 1.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), gqw0.k, false, 2), "COMPARE_TEAMS_HEADER_TEAM_TITLE_TEST_TAG"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar3, 0, 0, 130040);
                    k7x.b(addVar.b, null, o2e.e0(o7k0.n(s5x0.K(i120.Q(jm40Var2, staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 6.0f, 2.0f), 24.0f), "COMPARE_TEAMS_HEADER_SECOND_TEAM_IMAGE_TEST_TAG"), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                bdd bddVar = (bdd) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarE1 = o2e.e0(o7k0.e(o7k0.d(s5x0.N(jm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), 28.0f), "COMPARE_TEAMS_ITEM_TEST_TAG");
                    thg0 thg0VarA2 = shg0.a(uc9.g, gqw0.j, fetVar4, 6);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarE1);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    wvb.f(bddVar.c, bddVar.d, fetVar4, 0);
                    mm40 mm40VarC = o7k0.c(s5x0.N(jm40Var3, 4.0f, 0.0f, 4.0f, 0.0f, 10).e(new x7z(1.0f, true)), 1.0f);
                    StaticColors staticColors2 = StaticColors.INSTANCE;
                    long jM73getBlack400d7_KjU2 = staticColors2.m73getBlack400d7_KjU();
                    zcl zclVar5 = qmk.d;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    v8q0.a(bddVar.b, o2e.e0(o7k0.w(i120.Q(mm40VarC, jM73getBlack400d7_KjU2, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5)), gqw0.k, false, 2), "COMPARE_TEAMS_ITEM_TITLE_TEST_TAG"), staticColors2.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar4, 0, 0, 130040);
                    wvb.f(bddVar.e, bddVar.f, fetVar4, 0);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 6:
                a8z a8zVar = ((hed) obj3).M1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                gl5 gl5Var = hed.Q1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar5);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI5 = fetVar5.i(k3t0Var);
                    Object objP5 = fetVar5.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new enc(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar5.o0(objP5);
                    }
                    fre0.s(pz40VarY, (Function1) ((jhy) objP5), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 7:
                a8z a8zVar2 = ((yed) obj3).M1;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                bj5 bj5Var = yed.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar6);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI6 = fetVar6.i(k3t0Var2);
                    Object objP6 = fetVar6.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new enc(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                        fetVar6.o0(objP6);
                    }
                    unh0.o(pz40VarY2, (Function1) ((jhy) objP6), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                gfd gfdVar = (gfd) obj3;
                oyg0 oyg0Var = gfdVar.f;
                ocj ocjVar = gfdVar.i;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof ff5) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, cfd.a((cfd) value2, 0L, false, false, true, null, 17)));
                } else {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, cfd.a((cfd) value, 0L, false, true, false, null, 17)));
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                int i = ComposeView.l;
                ((ComposeView) obj3).a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                fet fetVar7 = (fet) obj3;
                mm40 mm40Var = (mm40) obj;
                mm40 mm40VarB0 = (km40) obj2;
                if (mm40VarB0 instanceof tkd) {
                    xdr xdrVar = ((tkd) mm40VarB0).b;
                    zys0.e(3, xdrVar);
                    mm40VarB0 = kbc.b0(fetVar7, (mm40) xdrVar.F(jm40Var, fetVar7, 0));
                }
                return mm40Var.e(mm40VarB0);
            case 11:
                pwi pwiVar = (pwi) obj3;
                ((Integer) obj).getClass();
                if (obj2 instanceof zjd) {
                    zjd zjdVar = (zjd) obj2;
                    iz40 iz40Var = (iz40) pwiVar.f27712a;
                    if (iz40Var == null) {
                        iz40 iz40Var2 = v1h0.f36630a;
                        iz40Var = new iz40();
                        pwiVar.f27712a = iz40Var;
                    }
                    iz40Var.k(zjdVar);
                    ((xz40) pwiVar.i).b(zjdVar);
                }
                if (obj2 instanceof jet) {
                    pwiVar.g((jet) obj2);
                }
                if (obj2 instanceof yfe0) {
                    ((yfe0) obj2).c();
                }
                return Unit.f46060a;
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((svd) obj3).z.f(wud.f39787a);
                return Unit.f46060a;
            case 13:
                mwd mwdVar = (mwd) obj3;
                a8z a8zVar3 = mwdVar.j2;
                fet fetVar8 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                kwd kwdVar = mwd.k2;
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar8);
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    boolean zI7 = fetVar8.i(mwdVar);
                    Object objP7 = fetVar8.P();
                    Object obj4 = objP7;
                    if (zI7 || objP7 == cl5Var) {
                        ejd ejdVar = new ejd(mwdVar, (byte) 5);
                        fetVar8.o0(ejdVar);
                        obj4 = ejdVar;
                    }
                    clz clzVar = (clz) fetVar8.k(or00.f25714a);
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) obj4, fetVar8);
                    boolean zI8 = fetVar8.i(k3t0Var3) | fetVar8.i(clzVar) | fetVar8.e(3) | fetVar8.g(pz40VarF2);
                    Object objP8 = fetVar8.P();
                    if (zI8 || objP8 == cl5Var) {
                        objP8 = new pc(k3t0Var3, clzVar, pz40VarF2, null, (byte) 11);
                        fetVar8.o0(objP8);
                    }
                    m0x0.t(fetVar8, clzVar, (Function2) objP8);
                    k3t0 k3t0Var4 = (k3t0) a8zVar3.getValue();
                    boolean zI9 = fetVar8.i(k3t0Var4);
                    Object objP9 = fetVar8.P();
                    if (zI9 || objP9 == cl5Var) {
                        objP9 = new enc(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar8.o0(objP9);
                    }
                    acb.j(pz40VarY3, (Function1) ((jhy) objP9), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 14:
                vae vaeVar = (vae) obj3;
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                str.getClass();
                jSONObject.getClass();
                sac.V(vaeVar.q, qae.f28391a, null, null, new cxd((Object) vaeVar, (Object) str, (Object) jSONObject, (yje) null, (byte) 24), 14);
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                dyb.J((k7q0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                szv szvVar = (szv) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    v8q0.a(szvVar.f33087a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar9), fetVar9, 48, 24960, 110588);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                kud kudVar = axe.e2;
                ehe0 itemAnimator = ((RecyclerView) obj3).getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.e();
                }
                return Unit.f46060a;
            case 18:
                int iIntValue9 = ((Integer) obj).intValue();
                int iIntValue10 = ((Integer) obj2).intValue();
                kud kudVar2 = axe.e2;
                r7f r7fVarM0 = ((axe) obj3).M0();
                sac.e0(jiu0.a(r7fVarM0), 500L, TimeUnit.MILLISECONDS, r7fVarM0.Y0.b, s6f.f31698a, new t6f(iIntValue9, iIntValue10, r7fVarM0, null), new s4f(r7fVarM0, b2));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                acb.g((nxe) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((wze) obj3).G.f(hze.f13903a);
                return Unit.f46060a;
            case 21:
                a3f a3fVar = (a3f) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                bby bbyVar = a3fVar.G;
                if (bbyVar != null) {
                    v3c.N(bbyVar);
                }
                a3fVar.x(new q1f(a3fVar.F.b.a(R.string.wrong_coupon_number, Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 22:
                lbf lbfVar = (lbf) obj3;
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                th2.getClass();
                str2.getClass();
                lbfVar.r.f(new uaf(rek0.b, str2));
                lbfVar.g.a(th2);
                return Unit.f46060a;
            case 23:
                alf alfVar = (alf) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                kud kudVar3 = alf.a2;
                if (fetVar10.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    knf knfVar = (knf) ((i3t0) alfVar.H0()).y(fetVar10).getValue();
                    sek sekVar = alfVar.N1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar = alfVar.O1;
                    if (bekVar == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(alfVar.G0().f46511a, alfVar.G0().c, alfVar.G0().e, alfVar.G0().d, alfVar.G0().b);
                    xex xexVar = alfVar.S1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(alfVar.G0().f46511a, alfVar.G0().c, alfVar.G0().b, alfVar.G0().e, 46L, alfVar.G0().h, new lq2(), grs.b, alf.class.getSimpleName());
                    k3t0 k3t0VarH0 = alfVar.H0();
                    boolean zI10 = fetVar10.i(k3t0VarH0);
                    Object objP10 = fetVar10.P();
                    if (zI10 || objP10 == cl5Var) {
                        objP10 = new x6f(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar10.o0(objP10);
                    }
                    kbc.d(knfVar, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, (Function1) ((jhy) objP10), fetVar10, 0);
                    k3t0 k3t0VarH1 = alfVar.H0();
                    boolean zI11 = fetVar10.i(alfVar);
                    Object objP11 = fetVar10.P();
                    Object obj5 = objP11;
                    if (zI11 || objP11 == cl5Var) {
                        ykf ykfVar = new ykf(alfVar, (byte) 0);
                        fetVar10.o0(ykfVar);
                        obj5 = ykfVar;
                    }
                    clz clzVar2 = (clz) fetVar10.k(or00.f25714a);
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) obj5, fetVar10);
                    boolean zI12 = fetVar10.i(k3t0VarH1) | fetVar10.i(clzVar2) | fetVar10.e(3) | fetVar10.g(pz40VarF3);
                    Object objP12 = fetVar10.P();
                    if (zI12 || objP12 == cl5Var) {
                        pc pcVar = new pc(k3t0VarH1, clzVar2, pz40VarF3, null, (byte) 12);
                        fetVar10.o0(pcVar);
                        objP12 = pcVar;
                    }
                    m0x0.t(fetVar10, clzVar2, (Function2) objP12);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                kkb.h((buf) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fuf fufVar = (fuf) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.j, fetVar11, 0);
                    int iHashCode3 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM3 = fetVar11.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar11, jm40Var);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC2, gqw0.v);
                    hkb.d(null, fufVar.b, gqw0.f11754a, fetVar11, 384);
                    x7z x7zVar = new x7z(1.0f, true);
                    zcl zclVar6 = qmk.f28987a;
                    xkb.h(s5x0.N(x7zVar, 0.0f, 12.0f, 0.0f, 0.0f, 13), fufVar, fetVar11, 0);
                    hkb.d(null, fufVar.c, gqw0.c, fetVar11, 384);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                final w1g w1gVar = (w1g) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (fetVar12.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    thg0 thg0VarA4 = shg0.a(uc9.f35418a, gqw0.j, fetVar12, 0);
                    int iHashCode4 = Long.hashCode(fetVar12.T);
                    bh90 bh90VarM4 = fetVar12.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar12, mm40VarD2);
                    mkd.c0.getClass();
                    fetVar12.i0();
                    if (fetVar12.S) {
                        fetVar12.l(pcyVar);
                    } else {
                        fetVar12.r0();
                    }
                    jpm0.o(fetVar12, thg0VarA4, gqw0.x);
                    jpm0.o(fetVar12, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar12, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar12);
                    jpm0.o(fetVar12, mm40VarC3, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    mm40 mm40VarE2 = o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "CYBER_PLAYER");
                    boolean zG = fetVar12.g(w1gVar);
                    Object objP13 = fetVar12.P();
                    if (zG || objP13 == cl5Var) {
                        final boolean z = false ? 1 : 0;
                        objP13 = new Function1() { // from class: a.u1g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b6 = z;
                                w1g w1gVar2 = w1gVar;
                                abi0 abi0Var = (abi0) obj6;
                                switch (b6) {
                                    case 0:
                                        abi0Var.getClass();
                                        cbi0.a(abi0Var, w1gVar2.c.c);
                                        break;
                                    default:
                                        abi0Var.getClass();
                                        cbi0.a(abi0Var, w1gVar2.d.c);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar12.o0(objP13);
                    }
                    o2e.I(pai0.a(mm40VarE2, false, (Function1) objP13), w1gVar.c, fetVar12, 0);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    mm40 mm40VarE3 = o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "CYBER_BANKER");
                    boolean zG2 = fetVar12.g(w1gVar);
                    Object objP14 = fetVar12.P();
                    if (zG2 || objP14 == cl5Var) {
                        objP14 = new Function1() { // from class: a.u1g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b6 = b5;
                                w1g w1gVar2 = w1gVar;
                                abi0 abi0Var = (abi0) obj6;
                                switch (b6) {
                                    case 0:
                                        abi0Var.getClass();
                                        cbi0.a(abi0Var, w1gVar2.c.c);
                                        break;
                                    default:
                                        abi0Var.getClass();
                                        cbi0.a(abi0Var, w1gVar2.d.c);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar12.o0(objP14);
                    }
                    o2e.I(pai0.a(mm40VarE3, false, (Function1) objP14), w1gVar.d, fetVar12, 0);
                    fetVar12.r(true);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return a(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return b(obj, obj2);
            default:
                afg afgVar = (afg) obj3;
                fet fetVar13 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                std stdVar = afg.S1;
                if (fetVar13.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean zI13 = fetVar13.i(afgVar);
                    Object objP15 = fetVar13.P();
                    Object obj6 = objP15;
                    if (zI13 || objP15 == cl5Var) {
                        zeg zegVar = new zeg(afgVar, b4);
                        fetVar13.o0(zegVar);
                        obj6 = zegVar;
                    }
                    Function0 function0 = (Function0) obj6;
                    boolean zI14 = fetVar13.i(afgVar);
                    Object objP16 = fetVar13.P();
                    Object obj7 = objP16;
                    if (zI14 || objP16 == cl5Var) {
                        zeg zegVar2 = new zeg(afgVar, b3);
                        fetVar13.o0(zegVar2);
                        obj7 = zegVar2;
                    }
                    v3c.z(function0, (Function0) obj7, null, fetVar13, 0, 4);
                    pz40 pz40VarY4 = ((i3t0) afgVar.G0()).y(fetVar13);
                    k3t0 k3t0VarG0 = afgVar.G0();
                    boolean zI15 = fetVar13.i(afgVar);
                    Object objP17 = fetVar13.P();
                    if (zI15 || objP17 == cl5Var) {
                        x6f x6fVar = new x6f(1, afgVar, afg.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/regular/presentation/events/model/CyberChampionshipEventsSideEffect;)V", 0, (byte) 13);
                        fetVar13.o0(x6fVar);
                        objP17 = x6fVar;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP17), fetVar13);
                    boolean zI16 = fetVar13.i(k3t0VarG0) | fetVar13.i(afgVar) | fetVar13.e(3) | fetVar13.g(pz40VarF4);
                    Object objP18 = fetVar13.P();
                    if (zI16 || objP18 == cl5Var) {
                        ua7 ua7Var2 = new ua7(k3t0VarG0, afgVar, pz40VarF4, null, (byte) 19);
                        fetVar13.o0(ua7Var2);
                        objP18 = ua7Var2;
                    }
                    m0x0.t(fetVar13, afgVar, (Function2) objP18);
                    qdz qdzVar = afgVar.R1;
                    boolean zI17 = fetVar13.i(afgVar);
                    Object objP19 = fetVar13.P();
                    Object obj8 = objP19;
                    if (zI17 || objP19 == cl5Var) {
                        yeg yegVar = new yeg(afgVar, b5);
                        fetVar13.o0(yegVar);
                        obj8 = yegVar;
                    }
                    Function1 function1 = (Function1) obj8;
                    boolean zI18 = fetVar13.i(afgVar);
                    Object objP20 = fetVar13.P();
                    Object obj9 = objP20;
                    if (zI18 || objP20 == cl5Var) {
                        yeg yegVar2 = new yeg(afgVar, b4);
                        fetVar13.o0(yegVar2);
                        obj9 = yegVar2;
                    }
                    x8f.v(pz40VarY4, qdzVar, function1, (Function1) obj9, fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cnc(Object obj, int i, byte b) {
        this.f4646a = b;
        this.b = obj;
    }
}
