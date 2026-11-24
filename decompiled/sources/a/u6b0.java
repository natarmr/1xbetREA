package a;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.popular_classic.impl.presentation.popular_classic_screen.adapters.special_events.SpecialEventLinearLayoutManager;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit_sport.sport_collection.SportsCollectionMain;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/u6b0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u6b0 extends yx5 {
    public final hnm0 K1;
    public poq0 L1;
    public lme0 M1;
    public r46 N1;
    public ddk O1;
    public nh70 P1;
    public jdk0 Q1;
    public kud R1;
    public ii S1;
    public wdk0 U1;
    public final boolean V1;
    public final n0o0 W1;
    public final kiu0 X1;
    public final s0r Y1;
    public final a8z Z1;
    public final a8z a2;
    public final d930 b2;
    public final a8z c2;
    public final a8z d2;
    public static final /* synthetic */ iiy[] f2 = {new j0d0(u6b0.class, "viewBinding", "getViewBinding()Lorg/xplatform/popular_classic/impl/databinding/PopularClassicScreenFragmentBinding;", 0)};
    public static final xi70 e2 = new xi70();
    public static final String g2 = u6b0.class.getSimpleName();

    public u6b0() {
        super(R.layout.popular_classic_screen_fragment);
        this.K1 = hnm0.f13359a;
        this.V1 = true;
        this.W1 = maz.b(new k6b0(this, (byte) 9));
        k6b0 k6b0Var = new k6b0(this, (byte) 10);
        r6b0 r6b0Var = new r6b0(this, (byte) 1);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new wz80(r6b0Var, (byte) 27));
        this.X1 = agc.G(this, sre0.f32672a.b(sbb0.class), new a190(a8zVarA, (byte) 28), new a190(a8zVarA, (byte) 29), k6b0Var);
        this.Y1 = ltt0.o(this, t6b0.f33410a);
        this.Z1 = maz.a(wezVar, new k6b0(this, (byte) 11));
        this.a2 = maz.a(wezVar, new k6b0(this, (byte) 12));
        this.b2 = new d930((byte) 1);
        this.c2 = maz.a(wezVar, new k6b0(this, (byte) 1));
        this.d2 = maz.a(wezVar, new k6b0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        cpi cpiVar = (cpi) this.W1.getValue();
        this.L1 = cpiVar.f4748a;
        this.M1 = new lme0((byte) 7);
        ru ruVar = (ru) cpiVar.c.f23980a;
        r9u r9uVar = (r9u) ((z8i) ruVar.f31100a).I;
        x1x.y(r9uVar);
        this.N1 = new r46(r9uVar, (byte) 2);
        ddk ddkVarB = cpiVar.d.b();
        x1x.x(ddkVarB);
        this.O1 = ddkVarB;
        x1x.y((wdk0) ((z8i) ruVar.f31100a).s);
        this.P1 = new nh70();
        this.Q1 = new jdk0();
        this.R1 = cpiVar.e.n();
        this.S1 = cpiVar.f;
        this.U1 = cpiVar.g;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        sbb0 sbb0VarJ0 = J0();
        yje yjeVar = null;
        byte b = 0;
        dnq dnqVar = new dnq(new fnq(new m430(sbb0VarJ0.B0, sbb0VarJ0, (byte) 24), new xab0(sbb0VarJ0, yjeVar, b)), new gbv(sbb0VarJ0, yjeVar, (byte) 24), (byte) 0);
        int i = 4;
        Class<u6b0> cls = u6b0.class;
        p6b0 p6b0Var = new p6b0(2, this, cls, "handlePopularUiState", "handlePopularUiState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/PopularClassicUiModel;)V", i, (byte) 7);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fra0(dnqVar, clzVarW, p6b0Var, (yje) null), 3);
        alv alvVar = J0().s;
        i89 i89Var = new i89(new fnq(alvVar.p, new u5u((Object) alvVar, yjeVar, (byte) 10)), (byte) 22);
        lkz lkzVar2 = lkz.f20223a;
        p6b0 p6b0Var2 = new p6b0(2, this, cls, "handleHandShakeEnable", "handleHandShakeEnable(Z)V", i, (byte) 8);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fra0(i89Var, clzVarW2, p6b0Var2, (yje) null), 3);
        eu4 eu4Var = new eu4(new wk30(J0().C0, (byte) 21), (byte) 26);
        p6b0 p6b0Var3 = new p6b0(2, this, cls, "handlePopularMainInfoStateModel", "handlePopularMainInfoStateModel(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/PopularClassicMainInfoUiModel;)V", i, (byte) 9);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fra0(eu4Var, clzVarW3, p6b0Var3, (yje) null), 3);
        p7m0 p7m0Var = ((bad) ((cad) J0().D.f40284a).b).f2252a;
        p6b0 p6b0Var4 = new p6b0(2, this, cls, "handleInnerTabsError", "handleInnerTabsError(Z)V", i, (byte) 10);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new fra0((gmq) p7m0Var, clzVarW4, p6b0Var4, (yje) null, (short) 0), 3);
        p7m0 p7m0Var2 = J0().s.q;
        int i2 = 4;
        p6b0 p6b0Var5 = new p6b0(2, this, cls, "handleHandShakeEvent", "handleHandShakeEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/hand_shake/HandShakeEvent;)V", i2, (byte) 11);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new fra0(p7m0Var2, clzVarW5, p6b0Var5, (yje) null), 3);
        p7m0 p7m0Var3 = J0().G0;
        p6b0 p6b0Var6 = new p6b0(2, this, cls, "handlePopularEvent", "handlePopularEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicEvent;)V", i2, (byte) 12);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new fra0((gmq) p7m0Var3, clzVarW6, p6b0Var6, (yje) null, (byte) 0, false), 3);
        p7m0 p7m0Var4 = J0().H0;
        q6b0 q6b0Var = new q6b0(this, yjeVar, (byte) 1);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new fra0((gmq) p7m0Var4, clzVarW7, q6b0Var, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var5 = J0().J0;
        int i3 = 4;
        p6b0 p6b0Var7 = new p6b0(2, this, cls, "handlePopularEditCouponHistoryEvent", "handlePopularEditCouponHistoryEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicEditCouponHistoryEvent;)V", i3, (byte) 13);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new fra0((gmq) p7m0Var5, clzVarW8, p6b0Var7, (yje) null), 3);
        ol60 ol60Var = J0().E0;
        p6b0 p6b0Var8 = new p6b0(2, this, cls, "handleEvent", "handleEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/PopularClassicViewModel$PopularClassicUiAction;)V", i3, (byte) 14);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new fra0((gmq) ol60Var, clzVarW9, p6b0Var8, (yje) null, (byte) 0, (byte) 0), 3);
        xae0 xae0VarN = vtb.N(J0().K0);
        int i4 = 4;
        hi70 hi70Var = new hi70(2, this, cls, "handleMinAgeAlertState", "handleMinAgeAlertState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicMinAgeAlertEvent;)V", i4, (byte) 29);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new fra0(xae0VarN, clzVarW10, hi70Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(J0().I0);
        p6b0 p6b0Var9 = new p6b0(2, this, cls, "handleScrollState", "handleScrollState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicScrollEvent;)V", i4, (byte) 0);
        clz clzVarW11 = aac.W(this);
        qjj.W(x0x.Q(clzVarW11.x()), null, null, new fra0(xae0VarN2, clzVarW11, p6b0Var9, (yje) null), 3);
        gmq gmqVarW = i120.W(new wk30(J0().D0, (byte) 23));
        p6b0 p6b0Var10 = new p6b0(2, this, cls, "handleSportFilterCommonState", "handleSportFilterCommonState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/SportFilterState;)V", i4, (byte) 1);
        clz clzVarW12 = aac.W(this);
        qjj.W(x0x.Q(clzVarW12.x()), null, null, new fra0(gmqVarW, clzVarW12, p6b0Var10, (yje) null, (byte) 0, (char) 0), 3);
        gmq gmqVarW2 = i120.W(new wk30(J0().D0, (byte) 19));
        p6b0 p6b0Var11 = new p6b0(2, this, cls, "handleBannersState", "handleBannersState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/BannerItemState;)V", 4, (byte) 2);
        clz clzVarW13 = aac.W(this);
        qjj.W(x0x.Q(clzVarW13.x()), null, null, new fra0(gmqVarW2, clzVarW13, p6b0Var11, (yje) null, (byte) 0, 0), 3);
        gmq gmqVarW3 = i120.W(new wk30(J0().D0, (byte) 20));
        p6b0 p6b0Var12 = new p6b0(2, this, cls, "handleOneXGamesState", "handleOneXGamesState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/OneXGamesPopularClassicState;)V", 4, (byte) 3);
        clz clzVarW14 = aac.W(this);
        qjj.W(x0x.Q(clzVarW14.x()), null, null, new fra0(gmqVarW3, clzVarW14, p6b0Var12, (yje) null, (char) 0), 3);
        gmq gmqVarW4 = i120.W(new wk30(J0().D0, (byte) 22));
        p6b0 p6b0Var13 = new p6b0(2, this, cls, "handleSpecialEventsState", "handleSpecialEventsState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/ListItemState;)V", 4, (byte) 4);
        clz clzVarW15 = aac.W(this);
        qjj.W(x0x.Q(clzVarW15.x()), null, null, new fra0(gmqVarW4, clzVarW15, p6b0Var13, (yje) null, 0), 3);
        omi0 omi0VarE = J0().R.e();
        p6b0 p6b0Var14 = new p6b0(2, this, cls, "handleSessionTimer", "handleSessionTimer(Ljava/lang/String;)V", 4, (byte) 5);
        clz clzVarW16 = aac.W(this);
        qjj.W(x0x.Q(clzVarW16.x()), null, null, new fra0(omi0VarE, clzVarW16, p6b0Var14, (yje) null), 3);
        ol60 ol60Var2 = J0().y0;
        q6b0 q6b0Var2 = new q6b0(this, yjeVar, b);
        clz clzVarW17 = aac.W(this);
        qjj.W(x0x.Q(clzVarW17.x()), null, null, new fra0(ol60Var2, clzVarW17, q6b0Var2, (yje) null), 3);
        p7m0 p7m0Var6 = J0().z0;
        p6b0 p6b0Var15 = new p6b0(2, this, cls, "handlePopularAlert2FaState", "handlePopularAlert2FaState(Z)V", 4, (byte) 6);
        clz clzVarW18 = aac.W(this);
        qjj.W(x0x.Q(clzVarW18.x()), null, null, new fra0((gmq) p7m0Var6, clzVarW18, p6b0Var15, (yje) null, (byte) 0), 3);
    }

    public final r46 G0() {
        r46 r46Var = this.N1;
        if (r46Var != null) {
            return r46Var;
        }
        Intrinsics.h("feedsPopularFragmentFactory");
        throw null;
    }

    public final wdk0 H0() {
        wdk0 wdk0Var = this.U1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final m9b0 I0() {
        Object objN = this.Y1.n(f2[0], this);
        objN.getClass();
        return (m9b0) objN;
    }

    public final sbb0 J0() {
        return (sbb0) this.X1.getValue();
    }

    public final void K0(bab0 bab0Var, yx5 yx5Var) {
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        String name = bab0Var.getClass().getName();
        List listP = eVarC.c.p();
        ArrayList<Fragment> arrayListU = twn.u(listP);
        for (Object obj : listP) {
            Fragment fragment = (Fragment) obj;
            if (!fragment.O() && !Intrinsics.d(fragment.B, name)) {
                arrayListU.add(obj);
            }
        }
        Fragment fragmentJ = eVarC.J(name);
        if (arrayListU.isEmpty() && fragmentJ != null && fragmentJ.S()) {
            return;
        }
        zb5 zb5Var = new zb5(eVarC);
        zb5Var.p(0, 0, 0, 0);
        if (fragmentJ == null) {
            zb5Var.k(R.id.fragmentContainer, yx5Var, name, 1);
        } else if (!fragmentJ.S() || fragmentJ.O()) {
            zb5Var.q(fragmentJ, lkz.e);
            zb5Var.r(fragmentJ);
        }
        for (Fragment fragment2 : arrayListU) {
            zb5Var.q(fragment2, lkz.d);
            zb5Var.m(fragment2);
        }
        zb5Var.h();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new k6b0(this, (byte) 6));
        F().u0("RESET_HASH_SECRET_KEY", this, new ex60(this, (byte) 12));
        sbb0 sbb0VarJ0 = J0();
        boolean zL = sj3.L(o0());
        if (sbb0VarJ0.E.H() < 33 || zL) {
            sbb0VarJ0.I();
            return;
        }
        p7m0 p7m0Var = sbb0VarJ0.H0;
        i9b0 i9b0Var = new i9b0();
        p7m0Var.getClass();
        p7m0Var.o(null, i9b0Var);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        I0().b.f((ub3) this.c2.getValue());
        RecyclerView recyclerView = I0().j.getRecyclerView();
        if (recyclerView != null) {
            this.b2.c("SPORTS_FILTER_KEY_STATE", recyclerView);
        }
        super.Z();
        o2t.a(F());
        vcc.C(this, "FROM_EDIT_COUPON");
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        SensorManager sensorManager = (SensorManager) this.a2.getValue();
        if (sensorManager != null) {
            sensorManager.unregisterListener((gkv) this.Z1.getValue());
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        Object value;
        super.e0();
        sbb0 sbb0VarJ0 = J0();
        byte b = 0;
        yje yjeVar = null;
        if (sbb0VarJ0.y.a()) {
            q7d0 q7d0Var = (q7d0) ((nw20) sbb0VarJ0.w.f8596a.b).f24215a;
            q7d0Var.getClass();
            if (!q7d0Var.a().contains("PUSH_TRACKING")) {
                sbb0VarJ0.x.a(true);
                sac.V(jiu0.a(sbb0VarJ0), null, null, sbb0VarJ0.q.f22085a, new mab0(sbb0VarJ0, yjeVar, b), 11);
            }
        }
        androidx.fragment.app.e eVarC = C();
        if (this.M1 == null) {
            Intrinsics.h("responsibleGameDialogFactory");
            throw null;
        }
        zuf0.e2.getClass();
        Fragment fragmentJ = eVarC.J(zuf0.g2);
        Fragment fragmentJ2 = C().J("AUTH_OFFER_DIALOG_TAG");
        Fragment fragmentJ3 = C().J("GREETING_KZ_DIALOG_TAG");
        androidx.fragment.app.e eVarC2 = C();
        if (this.L1 == null) {
            Intrinsics.h("tipsDialogFeature");
            throw null;
        }
        Fragment fragmentJ4 = eVarC2.J("TipsDialogTag");
        sbb0 sbb0VarJ1 = J0();
        boolean z = fragmentJ == null && fragmentJ2 == null && fragmentJ3 == null && fragmentJ4 == null;
        p7m0 p7m0Var = sbb0VarJ1.C0;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, jdb0.a((jdb0) value, false, false, false, false, z, 15)));
        Intent intent = n0().getIntent();
        Bundle extras = intent.getExtras();
        boolean z2 = extras != null && (extras.containsKey("REQUEST_SECTION_FROM_WIDGET") || extras.containsKey("af_consumed") || extras.containsKey("REQUEST_WIDGET_SETTINGS"));
        Iterator it = csj0.h.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(intent.getAction(), ((csj0) it.next()).a())) {
                b = 1;
                break;
            }
        }
        boolean zHasCategory = intent.hasCategory("PUSH_INTENT");
        if (intent.hasCategory("CUSTOM_INTENT") || z2 || b != 0 || zHasCategory || intent.getData() != null) {
            return;
        }
        sbb0 sbb0VarJ2 = J0();
        vzg0 vzg0Var = sbb0VarJ2.c;
        sff0 sff0Var = sbb0VarJ2.m0;
        if (sff0Var.f32117a.m) {
            Object objA = vzg0Var.a("MIN_AGE_DIALOG_SHOWED");
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.d(objA, bool)) {
                return;
            }
            p7m0 p7m0Var2 = sbb0VarJ2.K0;
            a8b0 a8b0Var = new a8b0(sff0Var.N.n, sff0Var.b.b);
            p7m0Var2.getClass();
            p7m0Var2.o(null, a8b0Var);
            vzg0Var.e("MIN_AGE_DIALOG_SHOWED", bool);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        sbb0 sbb0VarJ0 = J0();
        yje yjeVar = null;
        if (sbb0VarJ0.m0.Z0 && ((r9b0) sbb0VarJ0.B0.getValue()).j) {
            slb.U(new fnq(sbb0VarJ0.k.a(), new ebb0(sbb0VarJ0, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(sbb0VarJ0), sbb0VarJ0.q.b));
        }
        sbb0 sbb0VarJ1 = J0();
        sac.T(new fnq(sbb0VarJ1.k.a(), new ebb0(sbb0VarJ1, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(sbb0VarJ1), sbb0VarJ1.q.b), new ebb0(sbb0VarJ1, yjeVar, (byte) 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        vcc.C(this, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY");
        H0();
        vcc.C(this, "request_key_notification_updated");
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        o2t.e(F(), this, new wma0(1, J0(), sbb0.class, "onOneXGamesGameUMResultReceive", "onOneXGamesGameUMResultReceive$impl(J)V", 0, (byte) 24), new cz60(0, J0(), sbb0.class, "onOneXGamesUMResultReceive", "onOneXGamesUMResultReceive$impl()V", 0, (byte) 25), null, 18);
        vcc.g0(this, "FROM_EDIT_COUPON", new lma0(this, (byte) 9));
        nh70 nh70Var = this.P1;
        yje yjeVar = null;
        if (nh70Var == null) {
            Intrinsics.h("popularSportTabFragmentDelegate");
            throw null;
        }
        ol60 ol60Var = (ol60) J0().N.i;
        byte b = 0;
        qkb0 qkb0Var = new qkb0(nh70Var, this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new f8b0(ol60Var, clzVarW, qkb0Var, (yje) null), 3);
        SportsCollectionMain sportsCollectionMain = I0().j;
        sportsCollectionMain.setOnButtonClickTypeListener(new kx2(3, this, u6b0.class, "onSportFilterClick", "onSportFilterClick(Lorg/xplatform/uikit_sport/sport_collection/ButtonClickType;Ljava/lang/Long;Ljava/lang/String;)V", 0, (byte) 5));
        sportsCollectionMain.setType(uql0.c);
        RecyclerView recyclerView = I0().h;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new SpecialEventLinearLayoutManager(o0()));
        recyclerView.setAdapter((rwk0) this.d2.getValue());
        recyclerView.m(new qmk0(recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.space_8), recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.medium_horizontal_margin_dynamic), recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.space_8), recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.medium_horizontal_margin_dynamic), recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.space_8), 0, null, null, 448));
        I0().m.setOnSearchIconClickListener(new k6b0(this, b));
        I0().m.setOnAmountClickListener(new k6b0(this, (byte) 5));
        I0().d.setOnItemClickListener(new m6b0(this));
        DsButton authorizationButton = I0().c.getAuthorizationButton();
        ymx ymxVar = ymx.INTERVAL_500;
        dyb.b0(authorizationButton, ymxVar, new l6b0(this, (byte) 2));
        dyb.b0(I0().c.getRegistrationButton(), ymxVar, new l6b0(this, (byte) 3));
        I0().l.setBackgroundBubbleIndicatorColor(R.attr.uikitBackgroundContent);
        I0().l.v = new l6b0(this, (byte) 4);
        wdk0.l(H0(), this, this.V1);
        byte b2 = 8;
        ccq0.T(this, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY", new k6b0(this, b2));
        ccq0.V(this, "KEY_2FA_ALERT", new k6b0(this, (byte) 7));
        I0().b.a((ub3) this.c2.getValue());
        sbb0 sbb0VarJ0 = J0();
        if (sbb0VarJ0.f0.f15225a.a()) {
            sac.V(jiu0.a(sbb0VarJ0), new gab0(sbb0VarJ0, (byte) 6), null, sbb0VarJ0.q.b, new mab0(sbb0VarJ0, yjeVar, b2), 10);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getV1() {
        return this.V1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
