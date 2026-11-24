package a;

import android.content.ComponentCallbacks2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/izv;", "La/yx5;", "<init>", "()V", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class izv extends yx5 {
    public final hnm0 K1;
    public final yzn0 L1;
    public final cgx0 M1;
    public final r34 N1;
    public final cgx0 O1;
    public final cgx0 P1;
    public final cgx0 Q1;
    public final yzn0 R1;
    public final s0r S1;
    public nii U1;
    public sa10 V1;
    public ctf0 W1;
    public ii X1;
    public wdk0 Y1;
    public final kiu0 Z1;
    public final ywq a2;
    public final n0o0 b2;
    public final boolean c2;
    public static final /* synthetic */ iiy[] e2 = {new ez40(izv.class, "historyItemModel", "getHistoryItemModel()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;", 0), new ez40(izv.class, "fromScanner", "getFromScanner()Z", 0), new ez40(izv.class, "balanceId", "getBalanceId()J", 0), new ez40(izv.class, "hideNotify", "getHideNotify()Z", 0), new ez40(izv.class, "hideEdit", "getHideEdit()Z", 0), new ez40(izv.class, "wasEdited", "getWasEdited()Z", 0), new ez40(izv.class, "typeHistoryScreen", "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;", 0), new j0d0(izv.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/FragmentHistoryBetInfoBinding;", 0)};
    public static final rqt d2 = new rqt();
    public static final String f2 = izv.class.getSimpleName();

    public izv() {
        super(R.layout.fragment_history_bet_info);
        this.K1 = hnm0.f13359a;
        this.L1 = new yzn0("BUNDLE_HISTORY_ITEM_KEY");
        this.M1 = new cgx0("BUNDLE_FROM_SCANNER");
        this.N1 = new r34("EXTRA_BALANCE_ID");
        this.O1 = new cgx0("FORCE_HIDE_NOTIFY");
        this.P1 = new cgx0("BUNDLE_HIDE_EDIT");
        this.Q1 = new cgx0("BUNDLE_WAS_EDITED");
        this.R1 = new yzn0("TYPE_HISTORY_SCREEN");
        this.S1 = ltt0.o(this, gzv.f12201a);
        czv czvVar = new czv(this, (byte) 5);
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 20), (byte) 21));
        this.Z1 = agc.G(this, sre0.f32672a.b(jzv.class), new qwv(a8zVarA, (byte) 4), new qwv(a8zVarA, (byte) 5), czvVar);
        this.a2 = m0(new yl3(this, (byte) 9), new xn((byte) 7));
        this.b2 = maz.b(new czv(this, (byte) 6));
        this.c2 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        I0().j.setAdapter((ma7) this.b2.getValue());
        final byte b = 1;
        vvw.o(I0().j, true, 1);
        LottieView lottieView = I0().g;
        sa10 sa10Var = this.V1;
        if (sa10Var == null) {
            Intrinsics.h("lottieConfigurator");
            throw null;
        }
        lottieView.v(sa10.b(sa10Var, pb10.g, R.string.data_retrieval_error, 0, null, 28));
        SwipeRefreshLayout swipeRefreshLayout = I0().l;
        s77 s77Var = J0().c;
        s77 s77Var2 = s77.AUTO;
        final byte b2 = 0;
        swipeRefreshLayout.setEnabled((s77Var == s77Var2 || J0().t) ? false : true);
        byte b3 = 8;
        I0().l.setOnRefreshListener(new viq(this, (byte) 8));
        DsNavigationBar dsNavigationBar = I0().k;
        mc50.a(dsNavigationBar, new czv(this, b));
        String string = J0().c == s77Var2 ? dsNavigationBar.getResources().getString(R.string.autobet_info) : dsNavigationBar.getResources().getString(R.string.bet_info_new);
        string.getClass();
        dsNavigationBar.setTitle(string);
        ybg0 ybg0Var = ybg0.f42342a;
        final byte b4 = 2;
        dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("MENU_NOTIFY_BUTTON", ybg0Var, R.drawable.ic_bell_off_new, new czv(this, b4), 2032), new hc50("MENU_MORE_BUTTON", ybg0Var, R.drawable.ic_action_more, new ldv((byte) 23), 2032)));
        S0("MENU_MORE_BUTTON", false);
        ccq0.V(this, "REQUEST_COUPON_DIALOG_KEY", new czv(this, (byte) 4));
        ccq0.V(this, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", new czv(this, b2));
        ccq0.V(this, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", new czv(this, (byte) 3));
        vcc.g0(this, "REQUEST_BET_INFO_DIALOG", new Function2(this) { // from class: a.dzv
            public final /* synthetic */ izv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b;
                yje yjeVar = null;
                izv izvVar = this.b;
                switch (b5) {
                    case 0:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        rqt rqtVar = izv.d2;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        n3w n3wVar = (n3w) obj3;
                        jzv jzvVarM0 = izvVar.M0();
                        double d = n3wVar.m;
                        q5w q5wVar = jzvVarM0.e;
                        q5wVar.getClass();
                        nhf0 nhf0Var = q5wVar.A;
                        a1w a1wVar = a1w.l;
                        lun lunVar = lun.f20680a;
                        lunVar.getClass();
                        b4j b4jVar = (b4j) nhf0Var.c;
                        r6w r6wVar = r6w.g;
                        b4jVar.g(a1wVar, r6wVar, lunVar);
                        ((au0) nhf0Var.f23530a).j(r6wVar.a());
                        q5wVar.F.o(null, new c5w(true, true));
                        sac.V(jiu0.a(q5wVar.s()), new t3t(q5wVar, (byte) 27), null, q5wVar.t.b, new z8t(q5wVar, n3wVar, d, null, (byte) 1), 10);
                        break;
                    case 1:
                        String str2 = (String) obj;
                        Bundle bundle3 = (Bundle) obj2;
                        rqt rqtVar2 = izv.d2;
                        str2.getClass();
                        bundle3.getClass();
                        jzv jzvVarM1 = izvVar.M0();
                        Object obj4 = bundle3.get(str2);
                        obj4.getClass();
                        long jH0 = izvVar.H0();
                        jzvVarM1.d.z((d4w) obj4, jH0);
                        break;
                    default:
                        Bundle bundle4 = (Bundle) obj2;
                        rqt rqtVar3 = izv.d2;
                        if (h97.B(bundle4, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            izvVar.M0().c.C(true);
                            q5w q5wVar2 = izvVar.M0().e;
                            sac.V(jiu0.a(q5wVar2.s()), new vft(1, q5wVar2, q5w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, q5wVar2.t.b, new m5w(q5wVar2, yjeVar, (byte) 0), 10);
                            izvVar.Q1.v(izvVar, izv.e2[5], true);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new czv(this, (byte) 7));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new czv(this, b3));
        ccq0.V(this, "REQUEST_APP_SETTINGS_PUSH_DIALOG_KEY", new czv(this, (byte) 9));
        vcc.g0(this, "REQUEST_CONFIRM_SALE_DIALOG_KEY", new Function2(this) { // from class: a.dzv
            public final /* synthetic */ izv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b2;
                yje yjeVar = null;
                izv izvVar = this.b;
                switch (b5) {
                    case 0:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        rqt rqtVar = izv.d2;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        n3w n3wVar = (n3w) obj3;
                        jzv jzvVarM0 = izvVar.M0();
                        double d = n3wVar.m;
                        q5w q5wVar = jzvVarM0.e;
                        q5wVar.getClass();
                        nhf0 nhf0Var = q5wVar.A;
                        a1w a1wVar = a1w.l;
                        lun lunVar = lun.f20680a;
                        lunVar.getClass();
                        b4j b4jVar = (b4j) nhf0Var.c;
                        r6w r6wVar = r6w.g;
                        b4jVar.g(a1wVar, r6wVar, lunVar);
                        ((au0) nhf0Var.f23530a).j(r6wVar.a());
                        q5wVar.F.o(null, new c5w(true, true));
                        sac.V(jiu0.a(q5wVar.s()), new t3t(q5wVar, (byte) 27), null, q5wVar.t.b, new z8t(q5wVar, n3wVar, d, null, (byte) 1), 10);
                        break;
                    case 1:
                        String str2 = (String) obj;
                        Bundle bundle3 = (Bundle) obj2;
                        rqt rqtVar2 = izv.d2;
                        str2.getClass();
                        bundle3.getClass();
                        jzv jzvVarM1 = izvVar.M0();
                        Object obj4 = bundle3.get(str2);
                        obj4.getClass();
                        long jH0 = izvVar.H0();
                        jzvVarM1.d.z((d4w) obj4, jH0);
                        break;
                    default:
                        Bundle bundle4 = (Bundle) obj2;
                        rqt rqtVar3 = izv.d2;
                        if (h97.B(bundle4, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            izvVar.M0().c.C(true);
                            q5w q5wVar2 = izvVar.M0().e;
                            sac.V(jiu0.a(q5wVar2.s()), new vft(1, q5wVar2, q5w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, q5wVar2.t.b, new m5w(q5wVar2, yjeVar, (byte) 0), 10);
                            izvVar.Q1.v(izvVar, izv.e2[5], true);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        vcc.g0(this, "REQUEST_EDIT_COUPON_DIALOG", new Function2(this) { // from class: a.dzv
            public final /* synthetic */ izv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b4;
                yje yjeVar = null;
                izv izvVar = this.b;
                switch (b5) {
                    case 0:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        rqt rqtVar = izv.d2;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        n3w n3wVar = (n3w) obj3;
                        jzv jzvVarM0 = izvVar.M0();
                        double d = n3wVar.m;
                        q5w q5wVar = jzvVarM0.e;
                        q5wVar.getClass();
                        nhf0 nhf0Var = q5wVar.A;
                        a1w a1wVar = a1w.l;
                        lun lunVar = lun.f20680a;
                        lunVar.getClass();
                        b4j b4jVar = (b4j) nhf0Var.c;
                        r6w r6wVar = r6w.g;
                        b4jVar.g(a1wVar, r6wVar, lunVar);
                        ((au0) nhf0Var.f23530a).j(r6wVar.a());
                        q5wVar.F.o(null, new c5w(true, true));
                        sac.V(jiu0.a(q5wVar.s()), new t3t(q5wVar, (byte) 27), null, q5wVar.t.b, new z8t(q5wVar, n3wVar, d, null, (byte) 1), 10);
                        break;
                    case 1:
                        String str2 = (String) obj;
                        Bundle bundle3 = (Bundle) obj2;
                        rqt rqtVar2 = izv.d2;
                        str2.getClass();
                        bundle3.getClass();
                        jzv jzvVarM1 = izvVar.M0();
                        Object obj4 = bundle3.get(str2);
                        obj4.getClass();
                        long jH0 = izvVar.H0();
                        jzvVarM1.d.z((d4w) obj4, jH0);
                        break;
                    default:
                        Bundle bundle4 = (Bundle) obj2;
                        rqt rqtVar3 = izv.d2;
                        if (h97.B(bundle4, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            izvVar.M0().c.C(true);
                            q5w q5wVar2 = izvVar.M0().e;
                            sac.V(jiu0.a(q5wVar2.s()), new vft(1, q5wVar2, q5w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, q5wVar2.t.b, new m5w(q5wVar2, yjeVar, (byte) 0), 10);
                            izvVar.Q1.v(izvVar, izv.e2[5], true);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        knm0.h(I0().f, true);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bzv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bzv bzvVar = (bzv) (ze3Var instanceof bzv ? ze3Var : null);
            if (bzvVar != null) {
                n3w n3wVarJ0 = J0();
                long jH0 = H0();
                iiy[] iiyVarArr = e2;
                this.O1.n(this, iiyVarArr[3]);
                this.P1.n(this, iiyVarArr[4]);
                Boolean boolN = this.M1.n(this, iiyVarArr[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                sys0 sys0Var = (sys0) this.R1.n(this, iiyVarArr[6]);
                String str = f2;
                str.getClass();
                i1w0VarF.getClass();
                cad cadVar = bzvVar.f3491a;
                iw20 iw20Var = bzvVar.b;
                fvt0 fvt0Var = bzvVar.c;
                sa10 sa10Var = bzvVar.d;
                m1e m1eVar = bzvVar.e;
                j1q0 j1q0Var = bzvVar.f;
                r9u r9uVar = bzvVar.g;
                b8u b8uVar = bzvVar.y;
                fme fmeVar = bzvVar.h;
                duj dujVar = bzvVar.i;
                sjl0 sjl0Var = bzvVar.j;
                gii0 gii0Var = bzvVar.k;
                btt0 btt0Var = bzvVar.l;
                tgk tgkVar = bzvVar.m;
                ii iiVar = bzvVar.z;
                us3 us3Var = bzvVar.n;
                knf0 knf0Var = bzvVar.o;
                gst0 gst0Var = bzvVar.p;
                fsd fsdVar = bzvVar.q;
                kt2 kt2Var = bzvVar.r;
                vqc vqcVar = bzvVar.s;
                v6j0 v6j0Var = bzvVar.u;
                b3c0 b3c0Var = bzvVar.v;
                onv onvVar = bzvVar.G;
                q7d0 q7d0Var = bzvVar.w;
                qe50 qe50Var = bzvVar.x;
                hr00 hr00Var = bzvVar.A;
                nv20 nv20Var = bzvVar.B;
                zfo zfoVar = bzvVar.C;
                edo edoVar = bzvVar.D;
                tnm0 tnm0Var = bzvVar.E;
                m0w m0wVar = bzvVar.F;
                qv2 qv2Var = bzvVar.H;
                ctf0 ctf0Var = bzvVar.I;
                h760 h760Var = bzvVar.J;
                wsf0 wsf0Var = bzvVar.t;
                gr00 gr00Var = bzvVar.K;
                wdd0 wdd0Var = bzvVar.L;
                sue sueVar = bzvVar.M;
                vqc vqcVar2 = bzvVar.N;
                iip iipVar = bzvVar.O;
                peg0 peg0Var = bzvVar.P;
                wsf0 wsf0Var2 = bzvVar.Q;
                ugf0 ugf0Var = bzvVar.R;
                wdk0 wdk0Var = bzvVar.S;
                drb0 drb0Var = bzvVar.T;
                au0 au0Var = bzvVar.U;
                s64 s64Var = bzvVar.V;
                l7k l7kVar = bzvVar.W;
                s64 s64Var2 = bzvVar.X;
                ix0 ix0Var = bzvVar.Y;
                roi0 roi0Var = bzvVar.Z;
                wyu wyuVar = bzvVar.a0;
                h3c h3cVar = bzvVar.b0;
                je jeVar = bzvVar.c0;
                wdd0Var.getClass();
                sueVar.getClass();
                iipVar.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                sjl0Var.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                tgkVar.getClass();
                us3Var.getClass();
                knf0Var.getClass();
                gst0Var.getClass();
                fsdVar.getClass();
                kt2Var.getClass();
                v6j0Var.getClass();
                b3c0Var.getClass();
                q7d0Var.getClass();
                qe50Var.getClass();
                hr00Var.getClass();
                zfoVar.getClass();
                fmeVar.getClass();
                edoVar.getClass();
                tnm0Var.getClass();
                m0wVar.getClass();
                h760Var.getClass();
                ctf0Var.getClass();
                drb0Var.getClass();
                wdk0Var.getClass();
                wyuVar.getClass();
                this.U1 = (nii) new oii(cadVar, iw20Var, fvt0Var, onvVar, wdd0Var, sueVar, wsf0Var, wsf0Var2, ugf0Var, vqcVar2, iipVar, roi0Var, iiVar, sys0Var, n3wVarJ0, Long.valueOf(jH0), sa10Var, boolN, m1eVar, j1q0Var, b8uVar, r9uVar, i1w0VarF, dujVar, sjl0Var, gii0Var, btt0Var, tgkVar, us3Var, knf0Var, gst0Var, fsdVar, kt2Var, vqcVar, b3c0Var, q7d0Var, qe50Var, hr00Var, nv20Var, zfoVar, edoVar, tnm0Var, m0wVar, qv2Var, h760Var, ctf0Var, gr00Var, peg0Var, wdk0Var, au0Var, s64Var, l7kVar, s64Var2, ix0Var, str, wyuVar, h3cVar, jeVar).d0.get();
                this.V1 = sa10Var;
                this.W1 = ctf0Var;
                this.X1 = iiVar;
                this.Y1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(bzv.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(M0().c.A);
        yje yjeVar = null;
        gkr gkrVar = new gkr(this, yjeVar, (byte) 22);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        tkz tkzVarQ = x0x.Q(clzVarW.x());
        hgv hgvVar = new hgv(xae0VarN, clzVarW, gkrVar, (yje) null);
        byte b = 3;
        qjj.W(tkzVarQ, null, null, hgvVar, 3);
        r2w r2wVar = M0().c;
        dnq dnqVar = new dnq(new ewt(r2wVar.y, r2wVar, (byte) 17), new lo3(b, yjeVar, (byte) 23), (byte) 1);
        hzv hzvVar = new hzv(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hgv(dnqVar, clzVarW2, hzvVar, (yje) null), 3);
        ol60 ol60Var = M0().d.u;
        hzv hzvVar2 = new hzv(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new hgv(ol60Var, clzVarW3, hzvVar2, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(M0().e.E);
        hzv hzvVar3 = new hzv(this, yjeVar, (byte) 4);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new hgv(xae0VarN2, clzVarW4, hzvVar3, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(M0().e.F);
        hzv hzvVar4 = new hzv(this, yjeVar, b);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new hgv(xae0VarN3, clzVarW5, hzvVar4, (yje) null), 3);
        ol60 ol60Var2 = M0().e.D;
        hzv hzvVar5 = new hzv(this, yjeVar, (byte) 2);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new hgv(ol60Var2, clzVarW6, hzvVar5, (yje) null, (byte) 0), 3);
    }

    public final ii G0() {
        ii iiVar = this.X1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final long H0() {
        return this.N1.n(this, e2[2]).longValue();
    }

    public final q0r I0() {
        Object objN = this.S1.n(e2[7], this);
        objN.getClass();
        return (q0r) objN;
    }

    public final n3w J0() {
        return (n3w) this.L1.n(this, e2[0]);
    }

    public final ctf0 K0() {
        ctf0 ctf0Var = this.W1;
        if (ctf0Var != null) {
            return ctf0Var;
        }
        Intrinsics.h("resourceManager");
        throw null;
    }

    public final wdk0 L0() {
        wdk0 wdk0Var = this.Y1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final jzv M0() {
        return (jzv) this.Z1.getValue();
    }

    public final void N0() {
        gnm0.i(C());
        I0().h.setVisibility(8);
    }

    public final void O0(boolean z) {
        I0().g.setVisibility(z ? 0 : 8);
    }

    public final void P0(boolean z, boolean z2) {
        if (z && z2) {
            gnm0.s(C());
            I0().h.setVisibility(8);
        } else if (!z || z2) {
            N0();
        } else {
            I0().h.setVisibility(0);
            gnm0.i(C());
        }
    }

    public final void Q0(boolean z) {
        I0().l.setRefreshing(z);
        I0().d.setEnabled(!z);
    }

    public final void R0(boolean z) {
        Pair pair = z ? new Pair(Integer.valueOf(R.drawable.ic_bell_on_new), Integer.valueOf(m5d.b(R.attr.uikitPrimary, o0()))) : new Pair(Integer.valueOf(R.drawable.ic_bell_off_new), Integer.valueOf(m5d.b(R.attr.uikitSecondary, o0())));
        int iIntValue = ((Number) pair.f46059a).intValue();
        int iIntValue2 = ((Number) pair.b).intValue();
        e1i e1iVarB = I0().k.b("MENU_NOTIFY_BUTTON");
        if (e1iVarB != null) {
            e1iVarB.setNavigationBarButtonImageResource(iIntValue);
        }
        if (e1iVarB != null) {
            e1iVarB.setNavigationBarButtonTint(ColorStateList.valueOf(iIntValue2));
        }
    }

    public final void S0(String str, boolean z) {
        if (z) {
            I0().k.g(str);
        } else {
            I0().k.c(str);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        if (this.Q1.n(this, e2[5]).booleanValue()) {
            vcc.f0(i120.U(), this, "REQUEST_EDIT_COUPON_DIALOG");
        }
        I0().j.setAdapter(null);
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        M0().c.C.cancel(null);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        r2w r2wVar = M0().c;
        bby bbyVar = r2wVar.D;
        boolean zIsActive = bbyVar != null ? bbyVar.isActive() : false;
        if (r2wVar.C.isCancelled() && !zIsActive) {
            r2wVar.v(r2wVar.w().J1);
        }
        q5w q5wVar = M0().e;
        sac.V(jiu0.a(q5wVar.s()), new n5w(1, q5wVar, q5w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, q5wVar.t.f22085a, new kv(q5wVar, null, (byte) 13), 10);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        r2w r2wVar = M0().c;
        ywq0 ywq0Var = r2wVar.j;
        s77 s77Var = r2wVar.w().c;
        s77Var.getClass();
        yje yjeVar = null;
        r2wVar.B = slb.U(new fnq(new dnq(new zj2(vtb.M(((m0w) ((rrd) ywq0Var.f43384a).g).f20975a), ywq0Var, s77Var, (byte) 18), new o2w(r2wVar, yjeVar, (byte) 2), (byte) 1), new j0s(r2wVar, yjeVar, (byte) 28), (byte) 4), d5c.S(jiu0.a(r2wVar.s()), r2wVar.s.b));
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        c4m0 c4m0Var = M0().c.B;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.c2;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
