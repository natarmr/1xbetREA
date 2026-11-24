package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/noq0;", "La/nw5;", "La/qjk;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class noq0 extends nw5<qjk> {
    public final nae0 e2 = ltt0.p(this, loq0.f20405a);
    public final zz2 f2 = new zz2("CURRENT_PAGE", 0);
    public final cgx0 g2 = new cgx0("BUNDLE_FROM_ONBOARD_SECTION", false);
    public final zz2 h2 = new zz2("BUNDLE_ONBOARD_SECTION_ID", -1);
    public final phf0 i2 = new phf0("BUNDLE_OPENED_SCREEN_NAME");
    public fiu0 j2;
    public final n0o0 k2;
    public final kiu0 l2;
    public static final /* synthetic */ iiy[] n2 = {new j0d0(noq0.class, "binding", "getBinding()Lorg/xplatform/onboarding/impl/databinding/DialogTipsBinding;", 0), new ez40(noq0.class, "currentPage", "getCurrentPage()I", 0), new ez40(noq0.class, "fromOnboardScreen", "getFromOnboardScreen()Z", 0), new ez40(noq0.class, "onboardSectionId", "getOnboardSectionId()I", 0), new ez40(noq0.class, "openedScreenName", "getOpenedScreenName()Ljava/lang/String;", 0)};
    public static final y2m0 m2 = new y2m0((byte) 21);

    public noq0() {
        byte b = 0;
        this.k2 = maz.b(new joq0(b));
        h3q0 h3q0Var = new h3q0((Object) this, (byte) 16);
        a8z a8zVarA = maz.a(wez.b, new moq0(new mfo0(this, (byte) 29), b));
        this.l2 = agc.G(this, sre0.f32672a.b(xoq0.class), new r5p0(a8zVarA, (byte) 22), new r5p0(a8zVarA, (byte) 23), h3q0Var);
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qoq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qoq0 qoq0Var = (qoq0) (ze3Var instanceof qoq0 ? ze3Var : null);
            if (qoq0Var != null) {
                this.j2 = new fiu0(Collections.singletonMap(xoq0.class, qoq0Var.a(X0(), a4n0.f(this), this.g2.n(this, n2[2]).booleanValue()).t));
                return;
            }
        }
        jf4.n(b1j.i(qoq0.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.root;
    }

    public final ioq0 T0() {
        return (ioq0) this.k2.getValue();
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final qjk L0() {
        Object objN = this.e2.n(n2[0], this);
        objN.getClass();
        return (qjk) objN;
    }

    public final int V0() {
        return this.f2.n(this, n2[1]).intValue();
    }

    public final boolean W0() {
        return V0() == ((ArrayList) T0().f).size() - 1;
    }

    public final int X0() {
        return this.h2.n(this, n2[3]).intValue();
    }

    public final xoq0 Y0() {
        return (xoq0) this.l2.getValue();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        View decorView;
        view.getClass();
        super.i0(view, bundle);
        Window window = D0().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setVisibility(8);
        }
        qjk qjkVarL0 = L0();
        ViewPager2 viewPager2 = qjkVarL0.h;
        viewPager2.setAdapter(T0());
        final byte b = 0;
        View childAt = viewPager2.getChildAt(0);
        if (childAt != null) {
            childAt.setOverScrollMode(2);
        }
        viewPager2.e(V0(), false);
        viewPager2.c(new xp6(this, (byte) 13));
        new hhk(qjkVarL0.f, viewPager2, new v4i0((byte) 15)).a();
        qjk qjkVarL1 = L0();
        dyb.O(qjkVarL1.d, new Function1(this) { // from class: a.koq0
            public final /* synthetic */ noq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                noq0 noq0Var = this.b;
                switch (b2) {
                    case 0:
                        y2m0 y2m0Var = noq0.m2;
                        ((View) obj).getClass();
                        xoq0 xoq0VarY0 = noq0Var.Y0();
                        int iX0 = noq0Var.X0();
                        int iV0 = noq0Var.V0() + 1;
                        int size = ((ArrayList) noq0Var.T0().f).size();
                        String strN = noq0Var.i2.n(noq0Var, noq0.n2[4]);
                        strN.getClass();
                        xoq0VarY0.w(iX0, iV0, size, strN, jf3.MISS);
                        if (!xoq0VarY0.K.m()) {
                            if (!xoq0VarY0.L.f()) {
                                fk60 fk60Var = xoq0VarY0.j0;
                                switch (fk60Var != null ? voq0.f37779a[fk60Var.ordinal()] : -1) {
                                    case 1:
                                        ((lrs) xoq0VarY0.r.b).f20548a.e(2, "TIPS_GAMES_SHOWED_v3");
                                        break;
                                    case 2:
                                        ((rdj0) xoq0VarY0.q.b).f30295a.e(2, "SETTINGS_TIPS_SHOWED");
                                        break;
                                    case 3:
                                        xoq0VarY0.s.f12430a.f14143a.e(2, "COUPON_TIPS_SHOWED");
                                        break;
                                    case 4:
                                        xoq0VarY0.t.f37988a.f39724a.e(2, "BET_CONSTRUCTOR_TIPS_SHOWED");
                                        break;
                                    case 5:
                                        ((g0h) xoq0VarY0.u.b).f10459a.e(2, "TIPS_CYBER_GAMES_SHOWED");
                                        break;
                                    case 6:
                                        xoq0VarY0.B.j();
                                        break;
                                    case 7:
                                        xoq0VarY0.C.f8644a.f40279a.e(2, "TIPS_TEAM_BET_SHOWED");
                                        break;
                                    case 8:
                                        xoq0VarY0.D.f35122a.f36857a.e(1, "TIPS_MY_AGGREGATOR_SHOWED");
                                        break;
                                    case 9:
                                        xoq0VarY0.E.f20418a.f22155a.e(1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                                        break;
                                    case 10:
                                        xoq0VarY0.G.f28713a.f30464a.e(1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                                        break;
                                    case 11:
                                        xoq0VarY0.H.f39046a.f40769a.e(1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                                        break;
                                    case 12:
                                        ((iz1) xoq0VarY0.F.b).f15613a.e(1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                                        break;
                                    case 13:
                                        ((khb0) xoq0VarY0.f0.b).f18283a.e(2, "TIPS_POPULAR_PERSONALIZATION");
                                        break;
                                    case 14:
                                        xoq0VarY0.v.f44673a.f1199a.e(2, "TIPS_CYBER_EVENT_SHOWED");
                                        break;
                                    case 15:
                                        ((pnh) xoq0VarY0.w.b).f27286a.e(2, "TIPS_CYBER_TOURNAMENT_SHOWED");
                                        break;
                                    case 16:
                                        ((qhh) xoq0VarY0.x.b).f28738a.e(2, "TIPS_CYBER_TEAM_SHOWED");
                                        break;
                                    case 17:
                                        ((uah) xoq0VarY0.y.b).f35328a.e(2, "TIPS_CYBER_PROMO_SHOWED");
                                        break;
                                    case 18:
                                        xoq0VarY0.z.f21455a.f23189a.e(2, "TIPS_CYBER_CALENDAR_SHOWED");
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        ((bah) xoq0VarY0.A.b).f2256a.e(2, "TIPS_CYBER_PARTNERS_SHOWED");
                                        break;
                                    case 20:
                                        xoq0VarY0.h0.l();
                                        break;
                                }
                            } else {
                                xoq0VarY0.x();
                            }
                        } else {
                            xoq0VarY0.y();
                        }
                        noq0Var.y0();
                        break;
                    default:
                        y2m0 y2m0Var2 = noq0.m2;
                        ((View) obj).getClass();
                        xoq0 xoq0VarY1 = noq0Var.Y0();
                        int iX1 = noq0Var.X0();
                        int iV1 = noq0Var.V0() + 1;
                        int size2 = ((ArrayList) noq0Var.T0().f).size();
                        String strN2 = noq0Var.i2.n(noq0Var, noq0.n2[4]);
                        strN2.getClass();
                        xoq0VarY1.w(iX1, iV1, size2, strN2, jf3.NEXT);
                        if (!xoq0VarY1.K.m()) {
                            if (!xoq0VarY1.L.f()) {
                                fk60 fk60Var2 = xoq0VarY1.j0;
                                switch (fk60Var2 != null ? voq0.f37779a[fk60Var2.ordinal()] : -1) {
                                    case 1:
                                        ((lrs) xoq0VarY1.r.b).f20548a.e(2, "TIPS_GAMES_SHOWED_v3");
                                        break;
                                    case 2:
                                        ((rdj0) xoq0VarY1.q.b).f30295a.e(2, "SETTINGS_TIPS_SHOWED");
                                        break;
                                    case 3:
                                        xoq0VarY1.s.f12430a.f14143a.e(2, "COUPON_TIPS_SHOWED");
                                        break;
                                    case 4:
                                        xoq0VarY1.t.f37988a.f39724a.e(2, "BET_CONSTRUCTOR_TIPS_SHOWED");
                                        break;
                                    case 5:
                                        ((g0h) xoq0VarY1.u.b).f10459a.e(2, "TIPS_CYBER_GAMES_SHOWED");
                                        break;
                                    case 6:
                                        xoq0VarY1.B.j();
                                        break;
                                    case 7:
                                        xoq0VarY1.C.f8644a.f40279a.e(2, "TIPS_TEAM_BET_SHOWED");
                                        break;
                                    case 8:
                                        xoq0VarY1.D.f35122a.f36857a.e(1, "TIPS_MY_AGGREGATOR_SHOWED");
                                        break;
                                    case 9:
                                        xoq0VarY1.E.f20418a.f22155a.e(1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                                        break;
                                    case 10:
                                        xoq0VarY1.G.f28713a.f30464a.e(1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                                        break;
                                    case 11:
                                        xoq0VarY1.H.f39046a.f40769a.e(1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                                        break;
                                    case 12:
                                        ((iz1) xoq0VarY1.F.b).f15613a.e(1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                                        break;
                                    case 13:
                                        ((khb0) xoq0VarY1.f0.b).f18283a.e(2, "TIPS_POPULAR_PERSONALIZATION");
                                        break;
                                    case 14:
                                        xoq0VarY1.v.f44673a.f1199a.e(2, "TIPS_CYBER_EVENT_SHOWED");
                                        break;
                                    case 15:
                                        ((pnh) xoq0VarY1.w.b).f27286a.e(2, "TIPS_CYBER_TOURNAMENT_SHOWED");
                                        break;
                                    case 16:
                                        ((qhh) xoq0VarY1.x.b).f28738a.e(2, "TIPS_CYBER_TEAM_SHOWED");
                                        break;
                                    case 17:
                                        ((uah) xoq0VarY1.y.b).f35328a.e(2, "TIPS_CYBER_PROMO_SHOWED");
                                        break;
                                    case 18:
                                        xoq0VarY1.z.f21455a.f23189a.e(2, "TIPS_CYBER_CALENDAR_SHOWED");
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        ((bah) xoq0VarY1.A.b).f2256a.e(2, "TIPS_CYBER_PARTNERS_SHOWED");
                                        break;
                                    case 20:
                                        xoq0VarY1.h0.l();
                                        break;
                                    case 21:
                                        xoq0VarY1.b.f(xoq0VarY1.g.a());
                                        break;
                                    case 22:
                                        ((uur0) xoq0VarY1.c0.f1155a).b.e(2, "TOTO_TIPS_SHOWED");
                                        break;
                                }
                            } else {
                                xoq0VarY1.x();
                            }
                        } else {
                            xoq0VarY1.y();
                        }
                        noq0Var.y0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(qjkVarL1.c, new b8q0((Object) qjkVarL1, (Object) this, (byte) 9));
        final byte b2 = 1;
        dyb.O(qjkVarL1.b, new Function1(this) { // from class: a.koq0
            public final /* synthetic */ noq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                noq0 noq0Var = this.b;
                switch (b3) {
                    case 0:
                        y2m0 y2m0Var = noq0.m2;
                        ((View) obj).getClass();
                        xoq0 xoq0VarY0 = noq0Var.Y0();
                        int iX0 = noq0Var.X0();
                        int iV0 = noq0Var.V0() + 1;
                        int size = ((ArrayList) noq0Var.T0().f).size();
                        String strN = noq0Var.i2.n(noq0Var, noq0.n2[4]);
                        strN.getClass();
                        xoq0VarY0.w(iX0, iV0, size, strN, jf3.MISS);
                        if (!xoq0VarY0.K.m()) {
                            if (!xoq0VarY0.L.f()) {
                                fk60 fk60Var = xoq0VarY0.j0;
                                switch (fk60Var != null ? voq0.f37779a[fk60Var.ordinal()] : -1) {
                                    case 1:
                                        ((lrs) xoq0VarY0.r.b).f20548a.e(2, "TIPS_GAMES_SHOWED_v3");
                                        break;
                                    case 2:
                                        ((rdj0) xoq0VarY0.q.b).f30295a.e(2, "SETTINGS_TIPS_SHOWED");
                                        break;
                                    case 3:
                                        xoq0VarY0.s.f12430a.f14143a.e(2, "COUPON_TIPS_SHOWED");
                                        break;
                                    case 4:
                                        xoq0VarY0.t.f37988a.f39724a.e(2, "BET_CONSTRUCTOR_TIPS_SHOWED");
                                        break;
                                    case 5:
                                        ((g0h) xoq0VarY0.u.b).f10459a.e(2, "TIPS_CYBER_GAMES_SHOWED");
                                        break;
                                    case 6:
                                        xoq0VarY0.B.j();
                                        break;
                                    case 7:
                                        xoq0VarY0.C.f8644a.f40279a.e(2, "TIPS_TEAM_BET_SHOWED");
                                        break;
                                    case 8:
                                        xoq0VarY0.D.f35122a.f36857a.e(1, "TIPS_MY_AGGREGATOR_SHOWED");
                                        break;
                                    case 9:
                                        xoq0VarY0.E.f20418a.f22155a.e(1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                                        break;
                                    case 10:
                                        xoq0VarY0.G.f28713a.f30464a.e(1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                                        break;
                                    case 11:
                                        xoq0VarY0.H.f39046a.f40769a.e(1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                                        break;
                                    case 12:
                                        ((iz1) xoq0VarY0.F.b).f15613a.e(1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                                        break;
                                    case 13:
                                        ((khb0) xoq0VarY0.f0.b).f18283a.e(2, "TIPS_POPULAR_PERSONALIZATION");
                                        break;
                                    case 14:
                                        xoq0VarY0.v.f44673a.f1199a.e(2, "TIPS_CYBER_EVENT_SHOWED");
                                        break;
                                    case 15:
                                        ((pnh) xoq0VarY0.w.b).f27286a.e(2, "TIPS_CYBER_TOURNAMENT_SHOWED");
                                        break;
                                    case 16:
                                        ((qhh) xoq0VarY0.x.b).f28738a.e(2, "TIPS_CYBER_TEAM_SHOWED");
                                        break;
                                    case 17:
                                        ((uah) xoq0VarY0.y.b).f35328a.e(2, "TIPS_CYBER_PROMO_SHOWED");
                                        break;
                                    case 18:
                                        xoq0VarY0.z.f21455a.f23189a.e(2, "TIPS_CYBER_CALENDAR_SHOWED");
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        ((bah) xoq0VarY0.A.b).f2256a.e(2, "TIPS_CYBER_PARTNERS_SHOWED");
                                        break;
                                    case 20:
                                        xoq0VarY0.h0.l();
                                        break;
                                }
                            } else {
                                xoq0VarY0.x();
                            }
                        } else {
                            xoq0VarY0.y();
                        }
                        noq0Var.y0();
                        break;
                    default:
                        y2m0 y2m0Var2 = noq0.m2;
                        ((View) obj).getClass();
                        xoq0 xoq0VarY1 = noq0Var.Y0();
                        int iX1 = noq0Var.X0();
                        int iV1 = noq0Var.V0() + 1;
                        int size2 = ((ArrayList) noq0Var.T0().f).size();
                        String strN2 = noq0Var.i2.n(noq0Var, noq0.n2[4]);
                        strN2.getClass();
                        xoq0VarY1.w(iX1, iV1, size2, strN2, jf3.NEXT);
                        if (!xoq0VarY1.K.m()) {
                            if (!xoq0VarY1.L.f()) {
                                fk60 fk60Var2 = xoq0VarY1.j0;
                                switch (fk60Var2 != null ? voq0.f37779a[fk60Var2.ordinal()] : -1) {
                                    case 1:
                                        ((lrs) xoq0VarY1.r.b).f20548a.e(2, "TIPS_GAMES_SHOWED_v3");
                                        break;
                                    case 2:
                                        ((rdj0) xoq0VarY1.q.b).f30295a.e(2, "SETTINGS_TIPS_SHOWED");
                                        break;
                                    case 3:
                                        xoq0VarY1.s.f12430a.f14143a.e(2, "COUPON_TIPS_SHOWED");
                                        break;
                                    case 4:
                                        xoq0VarY1.t.f37988a.f39724a.e(2, "BET_CONSTRUCTOR_TIPS_SHOWED");
                                        break;
                                    case 5:
                                        ((g0h) xoq0VarY1.u.b).f10459a.e(2, "TIPS_CYBER_GAMES_SHOWED");
                                        break;
                                    case 6:
                                        xoq0VarY1.B.j();
                                        break;
                                    case 7:
                                        xoq0VarY1.C.f8644a.f40279a.e(2, "TIPS_TEAM_BET_SHOWED");
                                        break;
                                    case 8:
                                        xoq0VarY1.D.f35122a.f36857a.e(1, "TIPS_MY_AGGREGATOR_SHOWED");
                                        break;
                                    case 9:
                                        xoq0VarY1.E.f20418a.f22155a.e(1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                                        break;
                                    case 10:
                                        xoq0VarY1.G.f28713a.f30464a.e(1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                                        break;
                                    case 11:
                                        xoq0VarY1.H.f39046a.f40769a.e(1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                                        break;
                                    case 12:
                                        ((iz1) xoq0VarY1.F.b).f15613a.e(1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                                        break;
                                    case 13:
                                        ((khb0) xoq0VarY1.f0.b).f18283a.e(2, "TIPS_POPULAR_PERSONALIZATION");
                                        break;
                                    case 14:
                                        xoq0VarY1.v.f44673a.f1199a.e(2, "TIPS_CYBER_EVENT_SHOWED");
                                        break;
                                    case 15:
                                        ((pnh) xoq0VarY1.w.b).f27286a.e(2, "TIPS_CYBER_TOURNAMENT_SHOWED");
                                        break;
                                    case 16:
                                        ((qhh) xoq0VarY1.x.b).f28738a.e(2, "TIPS_CYBER_TEAM_SHOWED");
                                        break;
                                    case 17:
                                        ((uah) xoq0VarY1.y.b).f35328a.e(2, "TIPS_CYBER_PROMO_SHOWED");
                                        break;
                                    case 18:
                                        xoq0VarY1.z.f21455a.f23189a.e(2, "TIPS_CYBER_CALENDAR_SHOWED");
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        ((bah) xoq0VarY1.A.b).f2256a.e(2, "TIPS_CYBER_PARTNERS_SHOWED");
                                        break;
                                    case 20:
                                        xoq0VarY1.h0.l();
                                        break;
                                    case 21:
                                        xoq0VarY1.b.f(xoq0VarY1.g.a());
                                        break;
                                    case 22:
                                        ((uur0) xoq0VarY1.c0.f1155a).b.e(2, "TOTO_TIPS_SHOWED");
                                        break;
                                }
                            } else {
                                xoq0VarY1.x();
                            }
                        } else {
                            xoq0VarY1.y();
                        }
                        noq0Var.y0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        p7m0 p7m0Var = Y0().i0;
        ssl0 ssl0Var = new ssl0((Object) this, (yje) null, (byte) 27);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hlq0(p7m0Var, clzVarW, ssl0Var, (yje) null), 3);
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        xoq0 xoq0VarY0 = Y0();
        if (xoq0VarY0.K.m()) {
            xoq0VarY0.y();
        } else if (xoq0VarY0.L.f()) {
            xoq0VarY0.x();
        }
    }
}
