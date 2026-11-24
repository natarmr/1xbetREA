package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/w4b0;", "La/yx5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w4b0 extends yx5 {
    public final a8z K1;
    public final s0r L1;
    public final kiu0 M1;
    public final kiu0 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(w4b0.class, "viewBinding", "getViewBinding()Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicDayExpressBinding;", 0)};
    public static final nh70 Q1 = new nh70();

    public w4b0() {
        super(R.layout.fragment_popular_classic_day_express);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.t4b0
            public final /* synthetic */ w4b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                w4b0 w4b0Var = this.b;
                switch (b2) {
                    case 0:
                        nh70 nh70Var = w4b0.Q1;
                        ComponentCallbacks2 application = w4b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(x4b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof x4b0)) {
                                ze3Var = null;
                            }
                            x4b0 x4b0Var = (x4b0) ze3Var;
                            if (x4b0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(w4b0Var);
                                i1w0VarF.getClass();
                                mne mneVar = x4b0Var.f40257a;
                                yqc yqcVar = x4b0Var.c;
                                jw20 jw20Var = x4b0Var.b;
                                ctf0 ctf0Var = x4b0Var.d;
                                lbu lbuVar = x4b0Var.g;
                                pru pruVar = x4b0Var.h;
                                g2v g2vVar = x4b0Var.e;
                                m1e m1eVar = x4b0Var.f;
                                ieu ieuVar = x4b0Var.i;
                                j1q0 j1q0Var = x4b0Var.j;
                                gst0 gst0Var = x4b0Var.k;
                                b3c0 b3c0Var = x4b0Var.l;
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                j1q0Var.getClass();
                                gst0Var.getClass();
                                b3c0Var.getClass();
                                return new voi(yqcVar, jw20Var, mneVar, i1w0VarF, m1eVar, g2vVar, ctf0Var, lbuVar, pruVar, ieuVar, j1q0Var, gst0Var, b3c0Var);
                            }
                        }
                        jf4.n(b1j.i(x4b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        nh70 nh70Var2 = w4b0.Q1;
                        return new q0h0((uoi) ((voi) w4b0Var.K1.getValue()).n.get());
                    default:
                        nh70 nh70Var3 = w4b0.Q1;
                        yqc yqcVar2 = ((voi) w4b0Var.K1.getValue()).f;
                        kiu0 kiu0Var = w4b0Var.M1;
                        wma0 wma0Var = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onClickAllDayExpress", "onClickAllDayExpress(Lorg/xplatform/feed/popularclassic/dayexpress/models/DayExpressHeaderUiItem;)V", 0, (byte) 20);
                        wma0 wma0Var2 = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onAddExpressEventsToCouponClick", "onAddExpressEventsToCouponClick(J)V", 0, (byte) 21);
                        wma0 wma0Var3 = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onOpenBottomSheetDayExpressCardClick", "onOpenBottomSheetDayExpressCardClick(J)V", 0, (byte) 22);
                        s4b0 s4b0Var = new s4b0();
                        gbn gbnVar = new gbn(new x6o((byte) 12), new e9k(3, (byte) 19), new qzn(wma0Var3, wma0Var2, (byte) 24), gzn.m);
                        dp dpVar = s4b0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new j3b0((byte) 1), new iv60(3, (byte) 19), new yr80(wma0Var, (byte) 22), xk60.v));
                        return s4b0Var;
                }
            }
        };
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, function0);
        this.L1 = ltt0.o(this, v4b0.f36768a);
        final byte b2 = 1;
        Function0 function1 = new Function0(this) { // from class: a.t4b0
            public final /* synthetic */ w4b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                w4b0 w4b0Var = this.b;
                switch (b3) {
                    case 0:
                        nh70 nh70Var = w4b0.Q1;
                        ComponentCallbacks2 application = w4b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(x4b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof x4b0)) {
                                ze3Var = null;
                            }
                            x4b0 x4b0Var = (x4b0) ze3Var;
                            if (x4b0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(w4b0Var);
                                i1w0VarF.getClass();
                                mne mneVar = x4b0Var.f40257a;
                                yqc yqcVar = x4b0Var.c;
                                jw20 jw20Var = x4b0Var.b;
                                ctf0 ctf0Var = x4b0Var.d;
                                lbu lbuVar = x4b0Var.g;
                                pru pruVar = x4b0Var.h;
                                g2v g2vVar = x4b0Var.e;
                                m1e m1eVar = x4b0Var.f;
                                ieu ieuVar = x4b0Var.i;
                                j1q0 j1q0Var = x4b0Var.j;
                                gst0 gst0Var = x4b0Var.k;
                                b3c0 b3c0Var = x4b0Var.l;
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                j1q0Var.getClass();
                                gst0Var.getClass();
                                b3c0Var.getClass();
                                return new voi(yqcVar, jw20Var, mneVar, i1w0VarF, m1eVar, g2vVar, ctf0Var, lbuVar, pruVar, ieuVar, j1q0Var, gst0Var, b3c0Var);
                            }
                        }
                        jf4.n(b1j.i(x4b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        nh70 nh70Var2 = w4b0.Q1;
                        return new q0h0((uoi) ((voi) w4b0Var.K1.getValue()).n.get());
                    default:
                        nh70 nh70Var3 = w4b0.Q1;
                        yqc yqcVar2 = ((voi) w4b0Var.K1.getValue()).f;
                        kiu0 kiu0Var = w4b0Var.M1;
                        wma0 wma0Var = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onClickAllDayExpress", "onClickAllDayExpress(Lorg/xplatform/feed/popularclassic/dayexpress/models/DayExpressHeaderUiItem;)V", 0, (byte) 20);
                        wma0 wma0Var2 = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onAddExpressEventsToCouponClick", "onAddExpressEventsToCouponClick(J)V", 0, (byte) 21);
                        wma0 wma0Var3 = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onOpenBottomSheetDayExpressCardClick", "onOpenBottomSheetDayExpressCardClick(J)V", 0, (byte) 22);
                        s4b0 s4b0Var = new s4b0();
                        gbn gbnVar = new gbn(new x6o((byte) 12), new e9k(3, (byte) 19), new qzn(wma0Var3, wma0Var2, (byte) 24), gzn.m);
                        dp dpVar = s4b0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new j3b0((byte) 1), new iv60(3, (byte) 19), new yr80(wma0Var, (byte) 22), xk60.v));
                        return s4b0Var;
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new wz80(new u4b0(this, (byte) 0), (byte) 25));
        tre0 tre0Var = sre0.f32672a;
        this.M1 = agc.G(this, tre0Var.b(j5b0.class), new a190(a8zVarA, (byte) 24), new a190(a8zVarA, (byte) 25), function1);
        a8z a8zVarA2 = maz.a(wezVar, new wz80(new u4b0(this, (byte) 1), (byte) 26));
        this.N1 = agc.G(this, tre0Var.b(pgj.class), new a190(a8zVarA2, (byte) 26), new a190(a8zVarA2, (byte) 27), new ha30(this, a8zVarA2, (byte) 23));
        final byte b3 = 2;
        this.O1 = maz.a(wezVar, new Function0(this) { // from class: a.t4b0
            public final /* synthetic */ w4b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                w4b0 w4b0Var = this.b;
                switch (b4) {
                    case 0:
                        nh70 nh70Var = w4b0.Q1;
                        ComponentCallbacks2 application = w4b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(x4b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof x4b0)) {
                                ze3Var = null;
                            }
                            x4b0 x4b0Var = (x4b0) ze3Var;
                            if (x4b0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(w4b0Var);
                                i1w0VarF.getClass();
                                mne mneVar = x4b0Var.f40257a;
                                yqc yqcVar = x4b0Var.c;
                                jw20 jw20Var = x4b0Var.b;
                                ctf0 ctf0Var = x4b0Var.d;
                                lbu lbuVar = x4b0Var.g;
                                pru pruVar = x4b0Var.h;
                                g2v g2vVar = x4b0Var.e;
                                m1e m1eVar = x4b0Var.f;
                                ieu ieuVar = x4b0Var.i;
                                j1q0 j1q0Var = x4b0Var.j;
                                gst0 gst0Var = x4b0Var.k;
                                b3c0 b3c0Var = x4b0Var.l;
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                j1q0Var.getClass();
                                gst0Var.getClass();
                                b3c0Var.getClass();
                                return new voi(yqcVar, jw20Var, mneVar, i1w0VarF, m1eVar, g2vVar, ctf0Var, lbuVar, pruVar, ieuVar, j1q0Var, gst0Var, b3c0Var);
                            }
                        }
                        jf4.n(b1j.i(x4b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        nh70 nh70Var2 = w4b0.Q1;
                        return new q0h0((uoi) ((voi) w4b0Var.K1.getValue()).n.get());
                    default:
                        nh70 nh70Var3 = w4b0.Q1;
                        yqc yqcVar2 = ((voi) w4b0Var.K1.getValue()).f;
                        kiu0 kiu0Var = w4b0Var.M1;
                        wma0 wma0Var = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onClickAllDayExpress", "onClickAllDayExpress(Lorg/xplatform/feed/popularclassic/dayexpress/models/DayExpressHeaderUiItem;)V", 0, (byte) 20);
                        wma0 wma0Var2 = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onAddExpressEventsToCouponClick", "onAddExpressEventsToCouponClick(J)V", 0, (byte) 21);
                        wma0 wma0Var3 = new wma0(1, (j5b0) kiu0Var.getValue(), j5b0.class, "onOpenBottomSheetDayExpressCardClick", "onOpenBottomSheetDayExpressCardClick(J)V", 0, (byte) 22);
                        s4b0 s4b0Var = new s4b0();
                        gbn gbnVar = new gbn(new x6o((byte) 12), new e9k(3, (byte) 19), new qzn(wma0Var3, wma0Var2, (byte) 24), gzn.m);
                        dp dpVar = s4b0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new j3b0((byte) 1), new iv60(3, (byte) 19), new yr80(wma0Var, (byte) 22), xk60.v));
                        return s4b0Var;
                }
            }
        });
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        GridLayoutManager gridLayoutManager;
        I0();
        nc0 nc0Var = (nc0) ((voi) this.K1.getValue()).f.b;
        wdk0 wdk0Var = (wdk0) nc0Var.f23267a;
        ii iiVar = (ii) nc0Var.h;
        wdk0Var.getClass();
        iiVar.getClass();
        fhj fhjVar = new fhj();
        fhjVar.f9543a = wdk0Var;
        fhjVar.b = iiVar;
        j5b0 j5b0Var = (j5b0) this.M1.getValue();
        pgj pgjVar = (pgj) this.N1.getValue();
        ccq0.T(this, "REQUEST_EXPRESS_DIALOG_EXPRESS", new ehj(j5b0Var, (byte) 0));
        ccq0.V(this, "REQUEST_EXPRESS_DIALOG_EXPRESS", new ehj(j5b0Var, (byte) 1));
        p7m0 p7m0Var = (p7m0) j5b0Var.h.g;
        jv0 jv0Var = new jv0(fhjVar, this, j5b0Var, pgjVar, null, (byte) 10);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        tkz tkzVarQ = x0x.Q(clzVarW.x());
        g8g g8gVar = new g8g(p7m0Var, clzVarW, jv0Var, (yje) null);
        byte b = 3;
        qjj.W(tkzVarQ, null, null, g8gVar, 3);
        RecyclerView recyclerView = H0().c;
        recyclerView.setHasFixedSize(true);
        Context context = recyclerView.getContext();
        context.getClass();
        if (context.getResources().getBoolean(R.bool.isTablet)) {
            gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
            gridLayoutManager.m1 = new eo6(this, b);
        } else {
            gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 1);
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(G0());
        Context context2 = recyclerView.getContext();
        context2.getClass();
        if (context2.getResources().getBoolean(R.bool.isTablet)) {
            Resources resources = recyclerView.getResources();
            resources.getClass();
            recyclerView.m(new cab0(resources));
        } else {
            Resources resources2 = recyclerView.getResources();
            resources2.getClass();
            recyclerView.m(new yrh(resources2));
        }
        vvw.o(recyclerView, true, 1);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        j5b0 j5b0Var = (j5b0) this.M1.getValue();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(new fnq(new m430(j5b0Var.m, j5b0Var, (byte) 23), new g5b0(j5b0Var, yjeVar, (byte) 0), (byte) 4), new d7a0(j5b0Var, yjeVar, (byte) 2)), new gbv(j5b0Var, yjeVar, (byte) 21), (byte) 0);
        lkz lkzVar = lkz.f20223a;
        hi70 hi70Var = new hi70(2, this, w4b0.class, "handleScreenUiState", "handleScreenUiState(Lorg/xplatform/feed/popularclassic/dayexpress/PopularClassicDayExpressViewModel$ScreenUiState;)V", 4, (byte) 28);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fra0(dnqVar, clzVarW, hi70Var, (yje) null, (byte) 0), 3);
    }

    public final s4b0 G0() {
        return (s4b0) this.O1.getValue();
    }

    public final w2r H0() {
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        return (w2r) objN;
    }

    public final void I0() {
        ConstraintLayout constraintLayout = H0().d.b;
        x0x.O(constraintLayout);
        constraintLayout.setVisibility(8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        H0().c.setAdapter(null);
        super.Z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.P1;
    }
}
