package a;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ypn0;", "La/of80;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ypn0 extends of80 {
    public final s0r Y1;
    public final a8z Z1;
    public final a8z a2;
    public final a8z b2;
    public final kiu0 c2;
    public final OvershootInterpolator d2;
    public final lef0 e2;
    public CardStackLayoutManager f2;
    public final v62 g2;
    public static final /* synthetic */ iiy[] i2 = {new j0d0(ypn0.class, "viewBinding", "getViewBinding()Lorg/xplatform/swipex/impl/databinding/SwipexOnboardingFragmentBinding;", 0)};
    public static final s9m0 h2 = new s9m0();
    public static final String j2 = ypn0.class.getSimpleName();

    public ypn0() {
        super(R.layout.swipex_onboarding_fragment);
        this.Y1 = ltt0.o(this, xpn0.f41278a);
        a7n0 a7n0Var = new a7n0((byte) 17);
        wez wezVar = wez.b;
        this.Z1 = maz.a(wezVar, a7n0Var);
        final byte b = 0;
        this.a2 = maz.a(wezVar, new Function0(this) { // from class: a.upn0
            public final /* synthetic */ ypn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                ypn0 ypn0Var = this.b;
                switch (b2) {
                    case 0:
                        s9m0 s9m0Var = ypn0.h2;
                        return Boolean.valueOf(sj3.d0(ypn0Var.o0().getResources().getDisplayMetrics().heightPixels) < 710);
                    case 1:
                        s9m0 s9m0Var2 = ypn0.h2;
                        ComponentCallbacks2 application = ypn0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(opn0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof opn0)) {
                                ze3Var = null;
                            }
                            opn0 opn0Var = (opn0) ze3Var;
                            if (opn0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(ypn0Var);
                                String str = ypn0.j2;
                                Boolean bool = (Boolean) ypn0Var.a2.getValue();
                                bool.getClass();
                                i1w0VarF.getClass();
                                str.getClass();
                                mne mneVar = opn0Var.f25651a;
                                wyu wyuVar = opn0Var.b;
                                zx10 zx10Var = opn0Var.c;
                                knf0 knf0Var = opn0Var.d;
                                yvn0 yvn0Var = opn0Var.e;
                                gii0 gii0Var = opn0Var.f;
                                j1q0 j1q0Var = opn0Var.g;
                                s31 s31Var = opn0Var.h;
                                e41 e41Var = opn0Var.i;
                                ctf0 ctf0Var = opn0Var.j;
                                yox yoxVar = opn0Var.k;
                                vby vbyVar = opn0Var.l;
                                us00 us00Var = opn0Var.m;
                                z7u z7uVar = opn0Var.n;
                                zri zriVar = opn0Var.o;
                                iip iipVar = opn0Var.p;
                                wsf0 wsf0Var = opn0Var.q;
                                roi0 roi0Var = opn0Var.r;
                                duj dujVar = opn0Var.s;
                                pru pruVar = opn0Var.t;
                                r9u r9uVar = opn0Var.u;
                                iipVar.getClass();
                                wyuVar.getClass();
                                knf0Var.getClass();
                                yvn0Var.getClass();
                                gii0Var.getClass();
                                j1q0Var.getClass();
                                ctf0Var.getClass();
                                vbyVar.getClass();
                                r9uVar.getClass();
                                return new rvi(wsf0Var, roi0Var, bool, i1w0VarF, mneVar, wyuVar, zx10Var, knf0Var, yvn0Var, gii0Var, j1q0Var, s31Var, e41Var, ctf0Var, yoxVar, vbyVar, us00Var, z7uVar, zriVar, dujVar, pruVar, r9uVar);
                            }
                        }
                        jf4.n(b1j.i(opn0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((qvi) ((rvi) ypn0Var.b2.getValue()).w.get());
                }
            }
        });
        final byte b2 = 1;
        this.b2 = maz.a(wezVar, new Function0(this) { // from class: a.upn0
            public final /* synthetic */ ypn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ypn0 ypn0Var = this.b;
                switch (b3) {
                    case 0:
                        s9m0 s9m0Var = ypn0.h2;
                        return Boolean.valueOf(sj3.d0(ypn0Var.o0().getResources().getDisplayMetrics().heightPixels) < 710);
                    case 1:
                        s9m0 s9m0Var2 = ypn0.h2;
                        ComponentCallbacks2 application = ypn0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(opn0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof opn0)) {
                                ze3Var = null;
                            }
                            opn0 opn0Var = (opn0) ze3Var;
                            if (opn0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(ypn0Var);
                                String str = ypn0.j2;
                                Boolean bool = (Boolean) ypn0Var.a2.getValue();
                                bool.getClass();
                                i1w0VarF.getClass();
                                str.getClass();
                                mne mneVar = opn0Var.f25651a;
                                wyu wyuVar = opn0Var.b;
                                zx10 zx10Var = opn0Var.c;
                                knf0 knf0Var = opn0Var.d;
                                yvn0 yvn0Var = opn0Var.e;
                                gii0 gii0Var = opn0Var.f;
                                j1q0 j1q0Var = opn0Var.g;
                                s31 s31Var = opn0Var.h;
                                e41 e41Var = opn0Var.i;
                                ctf0 ctf0Var = opn0Var.j;
                                yox yoxVar = opn0Var.k;
                                vby vbyVar = opn0Var.l;
                                us00 us00Var = opn0Var.m;
                                z7u z7uVar = opn0Var.n;
                                zri zriVar = opn0Var.o;
                                iip iipVar = opn0Var.p;
                                wsf0 wsf0Var = opn0Var.q;
                                roi0 roi0Var = opn0Var.r;
                                duj dujVar = opn0Var.s;
                                pru pruVar = opn0Var.t;
                                r9u r9uVar = opn0Var.u;
                                iipVar.getClass();
                                wyuVar.getClass();
                                knf0Var.getClass();
                                yvn0Var.getClass();
                                gii0Var.getClass();
                                j1q0Var.getClass();
                                ctf0Var.getClass();
                                vbyVar.getClass();
                                r9uVar.getClass();
                                return new rvi(wsf0Var, roi0Var, bool, i1w0VarF, mneVar, wyuVar, zx10Var, knf0Var, yvn0Var, gii0Var, j1q0Var, s31Var, e41Var, ctf0Var, yoxVar, vbyVar, us00Var, z7uVar, zriVar, dujVar, pruVar, r9uVar);
                            }
                        }
                        jf4.n(b1j.i(opn0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((qvi) ((rvi) ypn0Var.b2.getValue()).w.get());
                }
            }
        });
        final byte b3 = 2;
        Function0 function0 = new Function0(this) { // from class: a.upn0
            public final /* synthetic */ ypn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                ypn0 ypn0Var = this.b;
                switch (b4) {
                    case 0:
                        s9m0 s9m0Var = ypn0.h2;
                        return Boolean.valueOf(sj3.d0(ypn0Var.o0().getResources().getDisplayMetrics().heightPixels) < 710);
                    case 1:
                        s9m0 s9m0Var2 = ypn0.h2;
                        ComponentCallbacks2 application = ypn0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(opn0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof opn0)) {
                                ze3Var = null;
                            }
                            opn0 opn0Var = (opn0) ze3Var;
                            if (opn0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(ypn0Var);
                                String str = ypn0.j2;
                                Boolean bool = (Boolean) ypn0Var.a2.getValue();
                                bool.getClass();
                                i1w0VarF.getClass();
                                str.getClass();
                                mne mneVar = opn0Var.f25651a;
                                wyu wyuVar = opn0Var.b;
                                zx10 zx10Var = opn0Var.c;
                                knf0 knf0Var = opn0Var.d;
                                yvn0 yvn0Var = opn0Var.e;
                                gii0 gii0Var = opn0Var.f;
                                j1q0 j1q0Var = opn0Var.g;
                                s31 s31Var = opn0Var.h;
                                e41 e41Var = opn0Var.i;
                                ctf0 ctf0Var = opn0Var.j;
                                yox yoxVar = opn0Var.k;
                                vby vbyVar = opn0Var.l;
                                us00 us00Var = opn0Var.m;
                                z7u z7uVar = opn0Var.n;
                                zri zriVar = opn0Var.o;
                                iip iipVar = opn0Var.p;
                                wsf0 wsf0Var = opn0Var.q;
                                roi0 roi0Var = opn0Var.r;
                                duj dujVar = opn0Var.s;
                                pru pruVar = opn0Var.t;
                                r9u r9uVar = opn0Var.u;
                                iipVar.getClass();
                                wyuVar.getClass();
                                knf0Var.getClass();
                                yvn0Var.getClass();
                                gii0Var.getClass();
                                j1q0Var.getClass();
                                ctf0Var.getClass();
                                vbyVar.getClass();
                                r9uVar.getClass();
                                return new rvi(wsf0Var, roi0Var, bool, i1w0VarF, mneVar, wyuVar, zx10Var, knf0Var, yvn0Var, gii0Var, j1q0Var, s31Var, e41Var, ctf0Var, yoxVar, vbyVar, us00Var, z7uVar, zriVar, dujVar, pruVar, r9uVar);
                            }
                        }
                        jf4.n(b1j.i(opn0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((qvi) ((rvi) ypn0Var.b2.getValue()).w.get());
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new fyk0(new fyk0(this, (byte) 25), (byte) 26));
        this.c2 = agc.G(this, sre0.f32672a.b(arn0.class), new cdl0(a8zVarA, (byte) 20), new cdl0(a8zVarA, (byte) 21), function0);
        this.d2 = new OvershootInterpolator(1.0f);
        this.e2 = new lef0(this);
        this.g2 = new v62(this, (byte) 23);
    }

    public static void K0(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    public static void L0(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    public static void O0(ViewGroup viewGroup) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 0.3f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    public static void P0(DsButton dsButton) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dsButton, (Property<DsButton, Float>) View.SCALE_X, 1.0f, 1.3f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(dsButton, (Property<DsButton, Float>) View.SCALE_Y, 1.0f, 1.3f, 1.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        ((hgd) dialogC0).k().a(this, this.g2);
        return dialogC0;
    }

    public final ywn0 M0() {
        Object objN = this.Y1.n(i2[0], this);
        objN.getClass();
        return (ywn0) objN;
    }

    public final arn0 N0() {
        return (arn0) this.c2.getValue();
    }

    @Override // a.of80, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F0(2, R.style.AppTheme_Overlay_Dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        Window window;
        view.getClass();
        Dialog dialog = this.S1;
        final byte b = 0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            bcm0.x(window, false);
        }
        Object parent = q0().getParent();
        yje yjeVar = null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            epi0 epi0Var = new epi0((Object) this, (byte) 14);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(view2, epi0Var);
        }
        dyb.O(M0().i, new Function1(this) { // from class: a.vpn0
            public final /* synthetic */ ypn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                ypn0 ypn0Var = this.b;
                View view3 = (View) obj;
                switch (b2) {
                    case 0:
                        s9m0 s9m0Var = ypn0.h2;
                        view3.getClass();
                        arn0 arn0VarN0 = ypn0Var.N0();
                        i1w0 i1w0Var = arn0VarN0.b;
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI.b(t0w0.f33140a);
                        k0w0VarI.h(m6m0.i(arn0VarN0.n));
                        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        s9m0 s9m0Var2 = ypn0.h2;
                        view3.getClass();
                        ypn0Var.N0().x();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(M0().d, new Function1(this) { // from class: a.vpn0
            public final /* synthetic */ ypn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                ypn0 ypn0Var = this.b;
                View view3 = (View) obj;
                switch (b3) {
                    case 0:
                        s9m0 s9m0Var = ypn0.h2;
                        view3.getClass();
                        arn0 arn0VarN0 = ypn0Var.N0();
                        i1w0 i1w0Var = arn0VarN0.b;
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI.b(t0w0.f33140a);
                        k0w0VarI.h(m6m0.i(arn0VarN0.n));
                        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        s9m0 s9m0Var2 = ypn0.h2;
                        view3.getClass();
                        ypn0Var.N0().x();
                        break;
                }
                return Unit.f46060a;
            }
        });
        xae0 xae0VarN = vtb.N(N0().t);
        wpn0 wpn0Var = new wpn0(this, yjeVar, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(xae0VarN, clzVarW, wpn0Var, (yje) null, (byte) 0), 3);
        xae0 xae0VarN2 = vtb.N(N0().u);
        wpn0 wpn0Var2 = new wpn0(this, yjeVar, b2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0(xae0VarN2, clzVarW2, wpn0Var2, (yje) null), 3);
        arn0 arn0VarN0 = N0();
        dnq dnqVar = new dnq(arn0VarN0.v, new sye0(arn0VarN0, yjeVar, (byte) 12), (byte) 0);
        wpn0 wpn0Var3 = new wpn0(this, yjeVar, b);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new agn0(dnqVar, clzVarW3, wpn0Var3, (yje) null), 3);
        this.f2 = new CardStackLayoutManager(this.e2, ((Boolean) this.a2.getValue()).booleanValue() ? rna.d : rna.c);
        M0().e.setLayoutManager(this.f2);
        M0().e.setAdapter((ssn0) this.Z1.getValue());
        M0().e.setItemAnimator(null);
        M0().e.setClickable(false);
    }
}
