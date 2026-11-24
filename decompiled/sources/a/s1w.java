package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/s1w;", "La/yx5;", "La/ygt0;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s1w extends yx5 implements ygt0 {
    public final s0r K1;
    public qii L1;
    public ii M1;
    public wdk0 N1;
    public ynb O1;
    public final kiu0 P1;
    public c4m0 Q1;
    public final r34 R1;
    public final r34 S1;
    public final yzn0 U1;
    public final yzn0 V1;
    public final phf0 W1;
    public final phf0 X1;
    public final a8z Y1;
    public final ywq Z1;
    public final n0o0 a2;
    public final a8z b2;
    public final boolean c2;
    public static final /* synthetic */ iiy[] e2 = {new j0d0(s1w.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/HistoryFragmentBinding;", 0), new ez40(s1w.class, "bundleBetId", "getBundleBetId()J", 0), new ez40(s1w.class, "bundleBalanceId", "getBundleBalanceId()J", 0), new ez40(s1w.class, "bundleType", "getBundleType()Lorg/xplatform/bethistory/domain/model/BetHistoryTypeModel;", 0), new ez40(s1w.class, "typeHistoryScreen", "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;", 0), new ez40(s1w.class, "globalChampId", "getGlobalChampId()Ljava/lang/String;", 0), new ez40(s1w.class, "globalChampTitle", "getGlobalChampTitle()Ljava/lang/String;", 0)};
    public static final bst d2 = new bst();
    public static final String f2 = s1w.class.getSimpleName();

    public s1w() {
        super(R.layout.history_fragment);
        this.K1 = ltt0.o(this, p1w.f26224a);
        n1w n1wVar = new n1w(this, (byte) 0);
        t7t t7tVar = new t7t(this, (byte) 24);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new t7t(t7tVar, (byte) 25));
        this.P1 = agc.G(this, sre0.f32672a.b(naw.class), new qwv(a8zVarA, (byte) 8), new qwv(a8zVarA, (byte) 9), n1wVar);
        this.R1 = new r34("BUNDLE_BET_ID");
        this.S1 = new r34("BUNDLE_BALANCE_ID");
        this.U1 = new yzn0("BUNDLE_TYPE");
        this.V1 = new yzn0("TYPE_HISTORY_SCREEN");
        this.W1 = new phf0("BUNDLE_CHAMP_ID");
        this.X1 = new phf0("BUNDLE_CHAMP_TITLE");
        this.Y1 = maz.a(wezVar, new ldv((byte) 24));
        this.Z1 = m0(new yl3(this, (byte) 10), new xn((byte) 7));
        this.a2 = maz.b(new n1w(this, (byte) 8));
        this.b2 = maz.a(wezVar, new n1w(this, (byte) 9));
        this.c2 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        String string;
        naw nawVarM0 = M0();
        final byte b = 3;
        byte b2 = 4;
        sac.T(new fnq(nawVarM0.X.f29856a.f11847a.c, new r8w(nawVarM0, null, b), (byte) 4), d5c.S(jiu0.a(nawVarM0), nawVarM0.L.f22085a), new pfl(2, nawVarM0, naw.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 24));
        nawVarM0.w();
        final byte b3 = 1;
        if (!this.h1) {
            this.h1 = true;
            if (N() && !O()) {
                this.w.e.invalidateOptionsMenu();
            }
        }
        DsNavigationBar dsNavigationBar = I0().j;
        Context context = dsNavigationBar.getContext();
        context.getClass();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context));
        colorStateListValueOf.getClass();
        dsNavigationBar.setBackIconColor(colorStateListValueOf);
        Context context2 = dsNavigationBar.getContext();
        context2.getClass();
        dsNavigationBar.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
        mc50.a(dsNavigationBar, new n1w(this, (byte) 11));
        final byte b4 = 0;
        I0().j.setTitleIconVisible(false);
        int iOrdinal = L0().ordinal();
        final byte b5 = 2;
        if (iOrdinal != 0) {
            string = iOrdinal != 2 ? "" : dsNavigationBar.getResources().getString(R.string.special_events_my_bets);
        } else {
            string = dsNavigationBar.getResources().getString(R.string.bet_history);
        }
        string.getClass();
        dsNavigationBar.setTitle(string);
        ybg0 ybg0Var = ybg0.f42342a;
        dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("MENU_FILTER_BUTTON", ybg0Var, R.drawable.ic_filter_inactive_new, new n1w(this, (byte) 12), 2032), new hc50("MENU_COMPACT_BUTTON", ybg0Var, R.drawable.ic_history_full_new, new n1w(this, (byte) 13), 2032)));
        dyb.b0(I0().f, ymx.INTERVAL_1000, new m1w(this, (byte) 2));
        DsButton authorizationButton = I0().c.getAuthorizationButton();
        ymx ymxVar = ymx.INTERVAL_500;
        dyb.b0(authorizationButton, ymxVar, new m1w(this, (byte) 3));
        dyb.b0(I0().c.getRegistrationButton(), ymxVar, new m1w(this, (byte) 4));
        dyb.c0(I0().k, new m1w(this, (byte) 5));
        dyb.c0(I0().m, new m1w(this, (byte) 6));
        dyb.b0(I0().l, ymx.INTERVAL_2000, new m1w(this, (byte) 7));
        SwipeRefreshLayout swipeRefreshLayout = I0().p;
        TypedValue typedValue = j5d.f15927a;
        swipeRefreshLayout.setColorSchemeColors(j5d.a(o0(), R.attr.uikitSecondary, false));
        I0().p.setOnRefreshListener(new l1w(this, (byte) 1));
        SwipeRefreshLayout swipeRefreshLayout2 = I0().p;
        DisplayMetrics displayMetrics = swipeRefreshLayout2.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int i = (int) (64.0f * displayMetrics.density);
        swipeRefreshLayout2.w = -i;
        swipeRefreshLayout2.x = i / 2;
        swipeRefreshLayout2.j1 = true;
        swipeRefreshLayout2.l();
        swipeRefreshLayout2.c = false;
        J0().z(new m1w(this, (byte) 11));
        RecyclerView recyclerView = I0().o;
        recyclerView.setAdapter((oqd) this.b2.getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(o0(), 1, false));
        recyclerView.m(new qmk0(recyclerView.getResources().getDimensionPixelSize(R.dimen.space_0), recyclerView.getResources().getDimensionPixelSize(R.dimen.space_0), recyclerView.getResources().getDimensionPixelSize(R.dimen.space_8), recyclerView.getResources().getDimensionPixelSize(R.dimen.space_0), 0, 1, null, null, 464));
        C().u0("REQUEST_HIDE_BET_HISTORY_ITEM_KEY", this, new l1w(this, (byte) 2));
        sj3.r0(this, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", new m1w(this, (byte) 9));
        sj3.r0(this, "REQUEST_HIDE_HISTORY_DIALOG_KEY", new m1w(this, (byte) 8));
        ccq0.V(this, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY", new n1w(this, b5));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new n1w(this, (byte) 6));
        vcc.g0(this, "REQUEST_SELECT_DATE_FILTER_DIALOG_KEY", new Function2(this) { // from class: a.o1w
            public final /* synthetic */ s1w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value;
                byte b6 = b3;
                s1w s1wVar = this.b;
                switch (b6) {
                    case 0:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        bst bstVar = s1w.d2;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        n3w n3wVar = (n3w) obj3;
                        naw nawVarM1 = s1wVar.M0();
                        double d = n3wVar.m;
                        q37 q37Var = nawVarM1.l0;
                        b4j b4jVar = q37Var.b;
                        a1w a1wVar = a1w.l;
                        r6w r6wVar = r6w.k;
                        b4j.h(b4jVar, a1wVar, r6wVar);
                        q37Var.c.j(r6wVar.a());
                        p7m0 p7m0Var = nawVarM1.W0;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, true, false, null, false, false, false, false, false, null, null, false, false, 32765)));
                        sac.i0(jiu0.a(nawVarM1), naw.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, kotlin.collections.a.c(oqt0.class), null, new z8t(nawVarM1, n3wVar, d, null, (byte) 2), null, nawVarM1.L.b, new p8w(nawVarM1, n3wVar), null, 596);
                        break;
                    case 1:
                        String str2 = (String) obj;
                        Bundle bundle3 = (Bundle) obj2;
                        bst bstVar2 = s1w.d2;
                        str2.getClass();
                        bundle3.getClass();
                        naw nawVarM2 = s1wVar.M0();
                        Object obj4 = bundle3.get(str2);
                        obj4.getClass();
                        nawVarM2.D((pdj) obj4);
                        break;
                    case 2:
                        Bundle bundle4 = (Bundle) obj2;
                        bst bstVar3 = s1w.d2;
                        if (h97.B(bundle4, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            naw nawVarM3 = s1wVar.M0();
                            if (nawVarM3.e.f25751a.a()) {
                                nawVarM3.G(true);
                            }
                        }
                        break;
                    default:
                        String str3 = (String) obj;
                        Bundle bundle5 = (Bundle) obj2;
                        bst bstVar4 = s1w.d2;
                        str3.getClass();
                        bundle5.getClass();
                        naw nawVarM4 = s1wVar.M0();
                        Object obj5 = bundle5.get(str3);
                        obj5.getClass();
                        d4w d4wVar = (d4w) obj5;
                        z4w z4wVar = nawVarM4.R;
                        ql5 ql5Var = nawVarM4.C0;
                        z4wVar.z(d4wVar, ql5Var != null ? ql5Var.f28916a : 0L);
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", new n1w(this, b));
        vcc.g0(this, "REQUEST_BET_INFO_DIALOG", new Function2(this) { // from class: a.o1w
            public final /* synthetic */ s1w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value;
                byte b6 = b;
                s1w s1wVar = this.b;
                switch (b6) {
                    case 0:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        bst bstVar = s1w.d2;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        n3w n3wVar = (n3w) obj3;
                        naw nawVarM1 = s1wVar.M0();
                        double d = n3wVar.m;
                        q37 q37Var = nawVarM1.l0;
                        b4j b4jVar = q37Var.b;
                        a1w a1wVar = a1w.l;
                        r6w r6wVar = r6w.k;
                        b4j.h(b4jVar, a1wVar, r6wVar);
                        q37Var.c.j(r6wVar.a());
                        p7m0 p7m0Var = nawVarM1.W0;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, true, false, null, false, false, false, false, false, null, null, false, false, 32765)));
                        sac.i0(jiu0.a(nawVarM1), naw.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, kotlin.collections.a.c(oqt0.class), null, new z8t(nawVarM1, n3wVar, d, null, (byte) 2), null, nawVarM1.L.b, new p8w(nawVarM1, n3wVar), null, 596);
                        break;
                    case 1:
                        String str2 = (String) obj;
                        Bundle bundle3 = (Bundle) obj2;
                        bst bstVar2 = s1w.d2;
                        str2.getClass();
                        bundle3.getClass();
                        naw nawVarM2 = s1wVar.M0();
                        Object obj4 = bundle3.get(str2);
                        obj4.getClass();
                        nawVarM2.D((pdj) obj4);
                        break;
                    case 2:
                        Bundle bundle4 = (Bundle) obj2;
                        bst bstVar3 = s1w.d2;
                        if (h97.B(bundle4, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            naw nawVarM3 = s1wVar.M0();
                            if (nawVarM3.e.f25751a.a()) {
                                nawVarM3.G(true);
                            }
                        }
                        break;
                    default:
                        String str3 = (String) obj;
                        Bundle bundle5 = (Bundle) obj2;
                        bst bstVar4 = s1w.d2;
                        str3.getClass();
                        bundle5.getClass();
                        naw nawVarM4 = s1wVar.M0();
                        Object obj5 = bundle5.get(str3);
                        obj5.getClass();
                        d4w d4wVar = (d4w) obj5;
                        z4w z4wVar = nawVarM4.R;
                        ql5 ql5Var = nawVarM4.C0;
                        z4wVar.z(d4wVar, ql5Var != null ? ql5Var.f28916a : 0L);
                        break;
                }
                return Unit.f46060a;
            }
        });
        vcc.g0(this, "REQUEST_EDIT_COUPON_DIALOG", new Function2(this) { // from class: a.o1w
            public final /* synthetic */ s1w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value;
                byte b6 = b5;
                s1w s1wVar = this.b;
                switch (b6) {
                    case 0:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        bst bstVar = s1w.d2;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        n3w n3wVar = (n3w) obj3;
                        naw nawVarM1 = s1wVar.M0();
                        double d = n3wVar.m;
                        q37 q37Var = nawVarM1.l0;
                        b4j b4jVar = q37Var.b;
                        a1w a1wVar = a1w.l;
                        r6w r6wVar = r6w.k;
                        b4j.h(b4jVar, a1wVar, r6wVar);
                        q37Var.c.j(r6wVar.a());
                        p7m0 p7m0Var = nawVarM1.W0;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, true, false, null, false, false, false, false, false, null, null, false, false, 32765)));
                        sac.i0(jiu0.a(nawVarM1), naw.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, kotlin.collections.a.c(oqt0.class), null, new z8t(nawVarM1, n3wVar, d, null, (byte) 2), null, nawVarM1.L.b, new p8w(nawVarM1, n3wVar), null, 596);
                        break;
                    case 1:
                        String str2 = (String) obj;
                        Bundle bundle3 = (Bundle) obj2;
                        bst bstVar2 = s1w.d2;
                        str2.getClass();
                        bundle3.getClass();
                        naw nawVarM2 = s1wVar.M0();
                        Object obj4 = bundle3.get(str2);
                        obj4.getClass();
                        nawVarM2.D((pdj) obj4);
                        break;
                    case 2:
                        Bundle bundle4 = (Bundle) obj2;
                        bst bstVar3 = s1w.d2;
                        if (h97.B(bundle4, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            naw nawVarM3 = s1wVar.M0();
                            if (nawVarM3.e.f25751a.a()) {
                                nawVarM3.G(true);
                            }
                        }
                        break;
                    default:
                        String str3 = (String) obj;
                        Bundle bundle5 = (Bundle) obj2;
                        bst bstVar4 = s1w.d2;
                        str3.getClass();
                        bundle5.getClass();
                        naw nawVarM4 = s1wVar.M0();
                        Object obj5 = bundle5.get(str3);
                        obj5.getClass();
                        d4w d4wVar = (d4w) obj5;
                        z4w z4wVar = nawVarM4.R;
                        ql5 ql5Var = nawVarM4.C0;
                        z4wVar.z(d4wVar, ql5Var != null ? ql5Var.f28916a : 0L);
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", new n1w(this, b3));
        ccq0.V(this, "REQUEST_COUPON_DIALOG_KEY", new n1w(this, (byte) 7));
        sj3.r0(this, "REQUEST_DATA_HISTORY_DIALOG_KEY", new m1w(this, (byte) 10));
        sj3.r0(this, "REQUEST_SEND_MAIL_DIALOG_KEY", new m1w(this, (byte) 12));
        vcc.g0(this, "REQUEST_CONFIRM_SALE_DIALOG_KEY", new Function2(this) { // from class: a.o1w
            public final /* synthetic */ s1w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value;
                byte b6 = b4;
                s1w s1wVar = this.b;
                switch (b6) {
                    case 0:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        bst bstVar = s1w.d2;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        n3w n3wVar = (n3w) obj3;
                        naw nawVarM1 = s1wVar.M0();
                        double d = n3wVar.m;
                        q37 q37Var = nawVarM1.l0;
                        b4j b4jVar = q37Var.b;
                        a1w a1wVar = a1w.l;
                        r6w r6wVar = r6w.k;
                        b4j.h(b4jVar, a1wVar, r6wVar);
                        q37Var.c.j(r6wVar.a());
                        p7m0 p7m0Var = nawVarM1.W0;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, true, false, null, false, false, false, false, false, null, null, false, false, 32765)));
                        sac.i0(jiu0.a(nawVarM1), naw.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, kotlin.collections.a.c(oqt0.class), null, new z8t(nawVarM1, n3wVar, d, null, (byte) 2), null, nawVarM1.L.b, new p8w(nawVarM1, n3wVar), null, 596);
                        break;
                    case 1:
                        String str2 = (String) obj;
                        Bundle bundle3 = (Bundle) obj2;
                        bst bstVar2 = s1w.d2;
                        str2.getClass();
                        bundle3.getClass();
                        naw nawVarM2 = s1wVar.M0();
                        Object obj4 = bundle3.get(str2);
                        obj4.getClass();
                        nawVarM2.D((pdj) obj4);
                        break;
                    case 2:
                        Bundle bundle4 = (Bundle) obj2;
                        bst bstVar3 = s1w.d2;
                        if (h97.B(bundle4, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            naw nawVarM3 = s1wVar.M0();
                            if (nawVarM3.e.f25751a.a()) {
                                nawVarM3.G(true);
                            }
                        }
                        break;
                    default:
                        String str3 = (String) obj;
                        Bundle bundle5 = (Bundle) obj2;
                        bst bstVar4 = s1w.d2;
                        str3.getClass();
                        bundle5.getClass();
                        naw nawVarM4 = s1wVar.M0();
                        Object obj5 = bundle5.get(str3);
                        obj5.getClass();
                        d4w d4wVar = (d4w) obj5;
                        z4w z4wVar = nawVarM4.R;
                        ql5 ql5Var = nawVarM4.C0;
                        z4wVar.z(d4wVar, ql5Var != null ? ql5Var.f28916a : 0L);
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_BIND_EMAIL_DIALOG_KEY", new n1w(this, b2));
        ccq0.T(this, "REQUEST_BIND_EMAIL_DIALOG_KEY", new n1w(this, (byte) 5));
        n0().r().u0("BET_INFO_FRAGMENT_REQUEST_KEY", this, new l1w(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qzv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qzv qzvVar = (qzv) (ze3Var instanceof qzv ? ze3Var : null);
            if (qzvVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = e2;
                Long lN = this.R1.n(this, iiyVarArr[1]);
                Long lN2 = this.S1.n(this, iiyVarArr[2]);
                s77 s77Var = (s77) this.U1.n(this, iiyVarArr[3]);
                f2.getClass();
                sys0 sys0VarL0 = L0();
                String strN = this.W1.n(this, iiyVarArr[5]);
                String strN2 = this.X1.n(this, iiyVarArr[6]);
                i1w0VarF.getClass();
                strN.getClass();
                strN2.getClass();
                y3v y3vVar = qzvVar.e0;
                cad cadVar = qzvVar.f29596a;
                duj dujVar = qzvVar.b;
                gii0 gii0Var = qzvVar.c;
                m1e m1eVar = qzvVar.d;
                wsf0 wsf0Var = qzvVar.L;
                onv onvVar = qzvVar.H;
                sa10 sa10Var = qzvVar.f;
                btt0 btt0Var = qzvVar.e;
                ii iiVar = qzvVar.Q;
                tgk tgkVar = qzvVar.g;
                us3 us3Var = qzvVar.h;
                knf0 knf0Var = qzvVar.i;
                gst0 gst0Var = qzvVar.j;
                fsd fsdVar = qzvVar.k;
                kt2 kt2Var = qzvVar.l;
                iw20 iw20Var = qzvVar.m;
                v6j0 v6j0Var = qzvVar.n;
                v88 v88Var = qzvVar.o;
                b3c0 b3c0Var = qzvVar.p;
                j1q0 j1q0Var = qzvVar.q;
                r9u r9uVar = qzvVar.r;
                q7d0 q7d0Var = qzvVar.s;
                qe50 qe50Var = qzvVar.t;
                hr00 hr00Var = qzvVar.u;
                nv20 nv20Var = qzvVar.v;
                zfo zfoVar = qzvVar.w;
                edo edoVar = qzvVar.x;
                tnm0 tnm0Var = qzvVar.y;
                odj odjVar = qzvVar.z;
                m0w m0wVar = qzvVar.A;
                fvt0 fvt0Var = qzvVar.B;
                s2m0 s2m0Var = qzvVar.C;
                peg0 peg0Var = qzvVar.D;
                ctf0 ctf0Var = qzvVar.E;
                s64 s64Var = qzvVar.F;
                cmt cmtVar = qzvVar.G;
                drm0 drm0Var = qzvVar.I;
                au0 au0Var = qzvVar.J;
                l7k l7kVar = qzvVar.K;
                ix0 ix0Var = qzvVar.X;
                gg5 gg5Var = qzvVar.Y;
                wdd0 wdd0Var = qzvVar.M;
                sue sueVar = qzvVar.N;
                vqc vqcVar = qzvVar.O;
                iip iipVar = qzvVar.P;
                wsf0 wsf0Var2 = qzvVar.R;
                ugf0 ugf0Var = qzvVar.S;
                wdk0 wdk0Var = qzvVar.T;
                drb0 drb0Var = qzvVar.U;
                wgu wguVar = qzvVar.V;
                s64 s64Var2 = qzvVar.W;
                rjo rjoVar = qzvVar.Z;
                ony onyVar = qzvVar.a0;
                fvt0 fvt0Var2 = qzvVar.b0;
                onv onvVar2 = qzvVar.c0;
                nr00 nr00Var = qzvVar.d0;
                wdd0Var.getClass();
                sueVar.getClass();
                iipVar.getClass();
                iiVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                tgkVar.getClass();
                us3Var.getClass();
                knf0Var.getClass();
                gst0Var.getClass();
                fsdVar.getClass();
                kt2Var.getClass();
                v6j0Var.getClass();
                b3c0Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                q7d0Var.getClass();
                qe50Var.getClass();
                hr00Var.getClass();
                zfoVar.getClass();
                edoVar.getClass();
                tnm0Var.getClass();
                odjVar.getClass();
                m0wVar.getClass();
                ctf0Var.getClass();
                drb0Var.getClass();
                wdk0Var.getClass();
                wguVar.getClass();
                onyVar.getClass();
                this.L1 = (qii) new sii(cadVar, iw20Var, fvt0Var, drm0Var, wdd0Var, sueVar, wsf0Var2, wsf0Var, onvVar, peg0Var, ugf0Var, vqcVar, iipVar, fvt0Var2, onvVar2, nr00Var, y3vVar, sys0VarL0, iiVar, strN, strN2, dujVar, gii0Var, m1eVar, i1w0VarF, lN, lN2, s77Var, sa10Var, btt0Var, tgkVar, us3Var, knf0Var, gst0Var, fsdVar, kt2Var, v6j0Var, v88Var, b3c0Var, j1q0Var, r9uVar, q7d0Var, qe50Var, hr00Var, nv20Var, zfoVar, edoVar, tnm0Var, odjVar, m0wVar, s2m0Var, s64Var, cmtVar, ctf0Var, au0Var, l7kVar, s64Var2, ix0Var, wdk0Var, wguVar, rjoVar, gg5Var).i0.get();
                this.M1 = iiVar;
                this.N1 = wdk0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.O1 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(qzv.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(M0().W0);
        yje yjeVar = null;
        q1w q1wVar = new q1w(this, yjeVar, (byte) 6);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w(xae0VarN, clzVarW, q1wVar, (yje) null), 3);
        naw nawVarM0 = M0();
        vae0 vae0VarM = ffb0.M(new dnq(new ewt(aoq.c(new a1t(nawVarM0.X0, (byte) 22), new sot(yjeVar, (Object) nawVarM0, (byte) 20)), nawVarM0, (byte) 18), new baw(nawVarM0, null, (byte) 0), (byte) 1), jiu0.a(nawVarM0));
        u5u u5uVar = new u5u((Object) this, yjeVar, (byte) 14);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hgv(vae0VarM, clzVarW2, u5uVar, (yje) null), 3);
        gmq gmqVar = J0().f;
        q1w q1wVar2 = new q1w(this, yjeVar, (byte) 2);
        glz glzVarX = aac.W(this).x();
        qjj.W(x0x.Q(glzVarX), null, null, new wmq(gmqVar, glzVarX, q1wVar2, (yje) null), 3);
        p7m0 p7m0Var = M0().c1;
        q1w q1wVar3 = new q1w(this, yjeVar, (byte) 3);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new hgv(p7m0Var, clzVarW3, q1wVar3, (yje) null), 3);
        ol60 ol60Var = M0().a1;
        pfl pflVar = new pfl(2, this, s1w.class, "handleHistoryAction", "handleHistoryAction(Lorg/xplatform/bethistory/history/presentation/HistoryViewModel$Action;)V", 4, (byte) 23);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new hgv(ol60Var, clzVarW4, pflVar, (yje) null, (byte) 0), 3);
        ol60 ol60Var2 = M0().Z0;
        q1w q1wVar4 = new q1w(this, yjeVar, (byte) 4);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new hgv(ol60Var2, clzVarW5, q1wVar4, (yje) null, (byte) 0), 3);
        xae0 xae0VarN2 = vtb.N(M0().Y0);
        q1w q1wVar5 = new q1w(this, yjeVar, (byte) 5);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new hgv(xae0VarN2, clzVarW6, q1wVar5, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(M0().R.t);
        q1w q1wVar6 = new q1w(this, yjeVar, (byte) 1);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new hgv(xae0VarN3, clzVarW7, q1wVar6, (yje) null), 3);
        naw nawVarM1 = M0();
        fnq fnqVar = new fnq(nawVarM1.R.u, new caw(nawVarM1, null, (byte) 0), (byte) 4);
        q1w q1wVar7 = new q1w(this, yjeVar, (byte) 0);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new hgv(fnqVar, clzVarW8, q1wVar7, (yje) null), 3);
    }

    public final void G0(String str, boolean z) {
        e1i e1iVarB = I0().j.b(str);
        if (e1iVarB != null) {
            e1iVarB.setNavigationBarButtonEnable(z);
        }
    }

    public final ii H0() {
        ii iiVar = this.M1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final t1w I0() {
        Object objN = this.K1.n(e2[0], this);
        objN.getClass();
        return (t1w) objN;
    }

    public final r5w J0() {
        return (r5w) this.a2.getValue();
    }

    public final wdk0 K0() {
        wdk0 wdk0Var = this.N1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final sys0 L0() {
        return (sys0) this.V1.n(this, e2[4]);
    }

    public final naw M0() {
        return (naw) this.P1.getValue();
    }

    public final void N0(String str, boolean z) {
        e1i e1iVarB = I0().j.b(str);
        if (e1iVarB != null) {
            e1iVarB.setNavigationBarButtonAlpha(z);
        }
    }

    public final void O0(String str, boolean z) {
        if (z) {
            I0().j.g(str);
        } else {
            I0().j.c(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        this.Z1.b();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        naw nawVarM0 = M0();
        sac.V(jiu0.a(nawVarM0), law.f19726a, null, nawVarM0.L.c, new v9w(nawVarM0, null, (byte) 4), 10);
        c4m0 c4m0Var = this.Q1;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        I0().o.setAdapter(null);
        super.Z();
    }

    @Override // a.ygt0
    public final void e() {
        naw nawVarM0 = M0();
        if (nawVarM0.e.f25751a.a()) {
            nawVarM0.G(true);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        if (J0().d() == 0) {
            SwipeRefreshLayout swipeRefreshLayout = I0().p;
            MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0);
            motionEventObtain.getClass();
            swipeRefreshLayout.dispatchTouchEvent(motionEventObtain);
            MotionEvent motionEventObtain2 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0);
            motionEventObtain2.getClass();
            swipeRefreshLayout.dispatchTouchEvent(motionEventObtain2);
        }
        if (((s77) this.U1.n(this, e2[3])) == s77.SALE || L0() != sys0.f33037a) {
            return;
        }
        I0().j.b.setVisibility(8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        naw nawVarM0 = M0();
        qjj.W(jiu0.a(nawVarM0), nawVarM0.b1, null, new u5u((Object) nawVarM0, (yje) null, (byte) 16), 2);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getC2() {
        return this.c2;
    }
}
