package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/npn0;", "La/nw5;", "La/lj60;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class npn0 extends nw5<lj60> {
    public final nae0 e2 = ltt0.p(this, kpn0.f18684a);
    public final n0o0 f2;
    public final bg5 g2;
    public final kiu0 h2;
    public final v62 i2;
    public static final /* synthetic */ iiy[] k2 = {new j0d0(npn0.class, "binding", "getBinding()Lorg/xplatform/swipex/impl/databinding/OnboardingDialogBinding;", 0)};
    public static final g9m0 j2 = new g9m0();

    public npn0() {
        final byte b = 0;
        this.f2 = maz.b(new Function0(this) { // from class: a.jpn0
            public final /* synthetic */ npn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                npn0 npn0Var = this.b;
                switch (b2) {
                    case 0:
                        g9m0 g9m0Var = npn0.j2;
                        ComponentCallbacks2 application = npn0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ppn0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ppn0)) {
                                ze3Var = null;
                            }
                            ppn0 ppn0Var = (ppn0) ze3Var;
                            if (ppn0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(npn0Var);
                                i1w0VarF.getClass();
                                mne mneVar = ppn0Var.f27381a;
                                wyu wyuVar = ppn0Var.b;
                                zx10 zx10Var = ppn0Var.c;
                                knf0 knf0Var = ppn0Var.d;
                                yvn0 yvn0Var = ppn0Var.e;
                                gii0 gii0Var = ppn0Var.f;
                                j1q0 j1q0Var = ppn0Var.g;
                                s31 s31Var = ppn0Var.h;
                                e41 e41Var = ppn0Var.i;
                                wgu wguVar = ppn0Var.j;
                                ctf0 ctf0Var = ppn0Var.k;
                                wyuVar.getClass();
                                knf0Var.getClass();
                                yvn0Var.getClass();
                                gii0Var.getClass();
                                j1q0Var.getClass();
                                wguVar.getClass();
                                ctf0Var.getClass();
                                return new svi(i1w0VarF, mneVar, wyuVar, zx10Var, knf0Var, yvn0Var, gii0Var, s31Var, e41Var, wguVar, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(ppn0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((pvi) ((svi) npn0Var.f2.getValue()).l.get());
                }
            }
        });
        bg5 bg5Var = new bg5();
        bg5Var.d.b(new gbn(new rj50((byte) 27), new tvx(3, (byte) 29), new wk60((byte) 0), xk60.b));
        this.g2 = bg5Var;
        final byte b2 = 1;
        Function0 function0 = new Function0(this) { // from class: a.jpn0
            public final /* synthetic */ npn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                npn0 npn0Var = this.b;
                switch (b3) {
                    case 0:
                        g9m0 g9m0Var = npn0.j2;
                        ComponentCallbacks2 application = npn0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ppn0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ppn0)) {
                                ze3Var = null;
                            }
                            ppn0 ppn0Var = (ppn0) ze3Var;
                            if (ppn0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(npn0Var);
                                i1w0VarF.getClass();
                                mne mneVar = ppn0Var.f27381a;
                                wyu wyuVar = ppn0Var.b;
                                zx10 zx10Var = ppn0Var.c;
                                knf0 knf0Var = ppn0Var.d;
                                yvn0 yvn0Var = ppn0Var.e;
                                gii0 gii0Var = ppn0Var.f;
                                j1q0 j1q0Var = ppn0Var.g;
                                s31 s31Var = ppn0Var.h;
                                e41 e41Var = ppn0Var.i;
                                wgu wguVar = ppn0Var.j;
                                ctf0 ctf0Var = ppn0Var.k;
                                wyuVar.getClass();
                                knf0Var.getClass();
                                yvn0Var.getClass();
                                gii0Var.getClass();
                                j1q0Var.getClass();
                                wguVar.getClass();
                                ctf0Var.getClass();
                                return new svi(i1w0VarF, mneVar, wyuVar, zx10Var, knf0Var, yvn0Var, gii0Var, s31Var, e41Var, wguVar, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(ppn0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((pvi) ((svi) npn0Var.f2.getValue()).l.get());
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new fyk0(new fyk0(this, (byte) 23), (byte) 24));
        this.h2 = agc.G(this, sre0.f32672a.b(tpn0.class), new cdl0(a8zVarA, (byte) 18), new cdl0(a8zVarA, (byte) 19), function0);
        this.i2 = new v62(this, (byte) 22);
    }

    @Override // a.nw5, a.yo8, a.sd3, a.sik
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        dialogC0.setCancelable(false);
        dialogC0.setCanceledOnTouchOutside(false);
        dialogC0.setOnShowListener(new yae((hw5) dialogC0, (byte) 2));
        return dialogC0;
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitStaticTransparent;
    }

    @Override // a.nw5
    public final void O0() throws Exception {
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        final byte b = 0;
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.L(false);
        }
        N0().c.setBackground(epv0.U(R.drawable.bg_make_bet_top_view, N0().c.getContext()));
        lj60 lj60VarL0 = L0();
        ViewPager2 viewPager2 = lj60VarL0.e;
        viewPager2.setAdapter(this.g2);
        View childAt = viewPager2.getChildAt(0);
        if (childAt != null) {
            childAt.setOverScrollMode(2);
        }
        viewPager2.c(new xp6(this, (byte) 12));
        new hhk(L0().d, L0().e, new v4i0((byte) 8)).a();
        dyb.O(lj60VarL0.b, new Function1(this) { // from class: a.ipn0
            public final /* synthetic */ npn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                npn0 npn0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        g9m0 g9m0Var = npn0.j2;
                        view.getClass();
                        tpn0 tpn0VarU0 = npn0Var.U0();
                        e41 e41Var = tpn0VarU0.i;
                        p7m0 p7m0Var = tpn0VarU0.n;
                        int i = ((rpn0) p7m0Var.getValue()).d;
                        s31 s31Var = tpn0VarU0.g;
                        if (i == 2) {
                            s31Var.f31532a.a("swipex_onboard_action", xp20.f(new Pair("option", "onboard3"), new Pair("action", "ok")));
                            e41Var.f7161a.a(tx3.l0(new k1p[]{new j1p("onboard3", (byte) 0), new j1p("ok", (byte) 1)}), 3124L);
                        } else {
                            s31Var.f31532a.a("swipex_onboard_action", xp20.f(new Pair("option", twn.m(((rpn0) p7m0Var.getValue()).d + 1, "onboard")), new Pair("action", "next")));
                            e41Var.f7161a.a(tx3.l0(new k1p[]{new j1p(twn.m(((rpn0) p7m0Var.getValue()).d + 1, "onboard"), (byte) 0), new j1p("next", (byte) 1)}), 3124L);
                        }
                        tpn0VarU0.w(((rpn0) p7m0Var.getValue()).d + 1);
                        break;
                    default:
                        g9m0 g9m0Var2 = npn0.j2;
                        view.getClass();
                        tpn0 tpn0VarU1 = npn0Var.U0();
                        sac.V(jiu0.a(tpn0VarU1), new rgn0((byte) 6), null, tpn0VarU1.c.f22085a, new spn0(tpn0VarU1, null, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(lj60VarL0.c, new Function1(this) { // from class: a.ipn0
            public final /* synthetic */ npn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                npn0 npn0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        g9m0 g9m0Var = npn0.j2;
                        view.getClass();
                        tpn0 tpn0VarU0 = npn0Var.U0();
                        e41 e41Var = tpn0VarU0.i;
                        p7m0 p7m0Var = tpn0VarU0.n;
                        int i = ((rpn0) p7m0Var.getValue()).d;
                        s31 s31Var = tpn0VarU0.g;
                        if (i == 2) {
                            s31Var.f31532a.a("swipex_onboard_action", xp20.f(new Pair("option", "onboard3"), new Pair("action", "ok")));
                            e41Var.f7161a.a(tx3.l0(new k1p[]{new j1p("onboard3", (byte) 0), new j1p("ok", (byte) 1)}), 3124L);
                        } else {
                            s31Var.f31532a.a("swipex_onboard_action", xp20.f(new Pair("option", twn.m(((rpn0) p7m0Var.getValue()).d + 1, "onboard")), new Pair("action", "next")));
                            e41Var.f7161a.a(tx3.l0(new k1p[]{new j1p(twn.m(((rpn0) p7m0Var.getValue()).d + 1, "onboard"), (byte) 0), new j1p("next", (byte) 1)}), 3124L);
                        }
                        tpn0VarU0.w(((rpn0) p7m0Var.getValue()).d + 1);
                        break;
                    default:
                        g9m0 g9m0Var2 = npn0.j2;
                        view.getClass();
                        tpn0 tpn0VarU1 = npn0Var.U0();
                        sac.V(jiu0.a(tpn0VarU1), new rgn0((byte) 6), null, tpn0VarU1.c.f22085a, new spn0(tpn0VarU1, null, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        tpn0 tpn0VarU0 = U0();
        s6n0 s6n0Var = new s6n0(vtb.N(tpn0VarU0.n), new tmg0(tpn0VarU0, null, (byte) 26));
        mpn0 mpn0Var = new mpn0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(s6n0Var, clzVarW, mpn0Var, (yje) null), 3);
        ol60 ol60Var = U0().o;
        mpn0 mpn0Var2 = new mpn0(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0(ol60Var, clzVarW2, mpn0Var2, (yje) null), 3);
        Dialog dialog = this.S1;
        dialog.getClass();
        ((wo8) dialog).k().a(K(), this.i2);
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.clBaseBottomSheetRootContainer;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final lj60 L0() {
        Object objN = this.e2.n(k2[0], this);
        objN.getClass();
        return (lj60) objN;
    }

    public final tpn0 U0() {
        return (tpn0) this.h2.getValue();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Dialog dialog = this.S1;
        if (dialog != null) {
            View viewFindViewById = dialog.findViewById(R.id.clBaseBottomSheetRootContainer);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(0);
            }
            View viewFindViewById2 = dialog.findViewById(R.id.header);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            View viewFindViewById3 = dialog.findViewById(R.id.top_view);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(8);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R.id.container);
            if (frameLayout != null) {
                sj3.L0(frameLayout, 0, 0, 0, 0, 13);
            }
        }
    }
}
