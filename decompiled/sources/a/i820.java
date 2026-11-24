package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.AnimatedCoefficientView;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/i820;", "La/yx5;", "La/kse;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i820 extends yx5 implements kse {
    public fiu0 K1;
    public final kiu0 L1;
    public final s0r M1;
    public final sbx0 N1;
    public e820 O1;
    public xze P1;
    public final de3 Q1;
    public int R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(i820.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/FragmentCouponBetDsBinding;", 0)};
    public static final atz U1 = new atz();

    public i820() {
        super(R.layout.fragment_coupon_bet_ds);
        rx00 rx00Var = new rx00(this, (byte) 15);
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 11), (byte) 12));
        this.L1 = agc.G(this, sre0.f32672a.b(wze.class), new y620(a8zVarA, (byte) 2), new y620(a8zVarA, (byte) 3), rx00Var);
        this.M1 = ltt0.o(this, f820.f9088a);
        this.N1 = new sbx0((byte) 13);
        this.Q1 = new de3(this, (byte) 6);
        this.S1 = true;
    }

    public static void J0(e0f e0fVar, sc7 sc7Var) {
        TextView textView = e0fVar.c;
        Group group = (Group) e0fVar.n;
        ConstraintLayout constraintLayout = (ConstraintLayout) e0fVar.g;
        long j = sc7Var.f31972a;
        l0d l0dVar = sc7Var.e;
        String str = sc7Var.d;
        String str2 = sc7Var.c;
        String str3 = sc7Var.m;
        textView.setText(String.valueOf(j));
        e0fVar.d.setVisibility(sc7Var.j ? 0 : 8);
        boolean z = str3 != null;
        boolean z2 = sc7Var.g;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) e0fVar.f;
        if (!z2) {
            constraintLayout2.setVisibility(8);
            constraintLayout.setVisibility(8);
            group.setVisibility(8);
            return;
        }
        constraintLayout2.setVisibility(!z ? 0 : 8);
        constraintLayout.setVisibility(z ? 0 : 8);
        group.setVisibility(z ? 0 : 8);
        if (sc7Var.i) {
            return;
        }
        if (!z) {
            AnimatedCoefficientView animatedCoefficientView = (AnimatedCoefficientView) e0fVar.h;
            if (str == null) {
                str = "";
            }
            animatedCoefficientView.i(str2, str, l0dVar);
            return;
        }
        AnimatedCoefficientView animatedCoefficientView2 = (AnimatedCoefficientView) e0fVar.i;
        if (str == null) {
            str = "";
        }
        animatedCoefficientView2.i(str2, str, l0dVar);
        AnimatedCoefficientView animatedCoefficientView3 = (AnimatedCoefficientView) e0fVar.j;
        String str4 = sc7Var.k;
        animatedCoefficientView3.i(str3, str4 != null ? str4 : "", sc7Var.n);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().getWindow().setSoftInputMode(16);
        FrameLayout frameLayout = G0().b;
        byte b = 1;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ic3(this, (byte) 4));
        if (o0().getResources().getBoolean(R.bool.isTablet)) {
            NestedScrollView nestedScrollView = G0().f26112a;
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.width = G().getDimensionPixelSize(R.dimen.size_640);
            nestedScrollView.setLayoutParams(layoutParams);
            FrameLayout frameLayout2 = G0().b;
            ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
            if (layoutParams2 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams2.width = G().getDimensionPixelSize(R.dimen.size_512);
                frameLayout2.setLayoutParams(layoutParams2);
            }
        }
        ozq ozqVarG0 = G0();
        byte b2 = 0;
        dyb.O(ozqVarG0.c, new e820(this, b2));
        dyb.O(ozqVarG0.d, new e820(this, b));
        dyb.O(ozqVarG0.e, new e820(this, (byte) 2));
        dyb.O(ozqVarG0.f, new e820(this, (byte) 3));
        C().u0("CHANGE_SYSTEM_REQUEST_KEY", this, new viq(this, (byte) 17));
        G0().u.setUserInputEnabled(false);
        G0().u.c(new xp6(this, (byte) 11));
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        n6r n6rVarK = K();
        n6rVarK.b();
        glz glzVar = n6rVarK.c;
        glzVar.getClass();
        this.P1 = new xze(eVarC, glzVar, iun.f15405a, b2);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sye.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sye syeVar = (sye) (ze3Var instanceof sye ? ze3Var : null);
            if (syeVar != null) {
                this.K1 = syeVar.a(a4n0.f(this), false).t();
                return;
            }
        }
        jf4.n(b1j.i(sye.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ViewPager2 viewPager2 = G0().u;
        DsSegmentedGroup dsSegmentedGroup = G0().q;
        xae0 xae0VarN = vtb.N(H0().F);
        yje yjeVar = null;
        ah0 ah0Var = new ah0(dsSegmentedGroup, this, viewPager2, yjeVar, (byte) 11);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new v620(xae0VarN, clzVarW, ah0Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().C);
        g820 g820Var = new g820(this, yjeVar, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new v620(xae0VarN2, clzVarW2, g820Var, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(H0().A);
        g820 g820Var2 = new g820(this, yjeVar, (byte) 0);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new v620(xae0VarN3, clzVarW3, g820Var2, (yje) null), 3);
        wze wzeVarH0 = H0();
        c00 c00Var = new c00(wzeVarH0.B, wzeVarH0, (byte) 26);
        byte b = 1;
        g820 g820Var3 = new g820(this, yjeVar, b);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new v620(c00Var, clzVarW4, g820Var3, (yje) null), 3);
        ol60 ol60Var = H0().G;
        g820 g820Var4 = new g820(this, yjeVar, (byte) 3);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new v620(ol60Var, clzVarW5, g820Var4, (yje) null), 3);
        ol60 ol60Var2 = H0().H;
        z210 z210Var = new z210(this, yjeVar, (byte) 6);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new v620(ol60Var2, clzVarW6, z210Var, (yje) null), 3);
        xae0 xae0VarN4 = vtb.N(H0().I);
        w620 w620Var = new w620(this, yjeVar, b);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new v620(xae0VarN4, clzVarW7, w620Var, (yje) null, (byte) 0), 3);
    }

    public final ozq G0() {
        Object objN = this.M1.n(V1[0], this);
        objN.getClass();
        return (ozq) objN;
    }

    public final wze H0() {
        return (wze) this.L1.getValue();
    }

    public final void I0(boolean z) {
        e0f e0fVar = G0().j;
        ConstraintLayout constraintLayout = (ConstraintLayout) e0fVar.e;
        if (z) {
            x0x.s(constraintLayout);
        } else {
            x0x.O(constraintLayout);
        }
        ((DsShimmerView) e0fVar.m).setVisibility(z ? 0 : 8);
        ((AnimatedCoefficientView) e0fVar.h).setVisibility(!z ? 0 : 8);
        e0f e0fVar2 = G0().i;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) e0fVar2.e;
        if (z) {
            x0x.s(constraintLayout2);
        } else {
            x0x.O(constraintLayout2);
        }
        ((DsShimmerView) e0fVar2.m).setVisibility(z ? 0 : 8);
        ((AnimatedCoefficientView) e0fVar2.h).setVisibility(!z ? 0 : 8);
        ozq ozqVarG0 = G0();
        LinearLayout linearLayout = ozqVarG0.m;
        if (z) {
            x0x.s(linearLayout);
        } else {
            x0x.O(linearLayout);
        }
        ozqVarG0.p.setVisibility(z ? 0 : 8);
        ozqVarG0.s.setVisibility(z ? 8 : 0);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        this.O1 = null;
        this.P1 = null;
        DsSegmentedGroup dsSegmentedGroup = G0().q;
        dsSegmentedGroup.k.clear();
        dsSegmentedGroup.removeAllViews();
        super.Z();
    }

    @Override // a.kse
    public final void c(float f) {
        p7m0 p7m0Var = H0().C;
        if (p7m0Var.getValue() instanceof mze) {
            p7m0Var.o(null, new mze(f));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        G0().j.b.getViewTreeObserver().removeOnGlobalLayoutListener(null);
        G0().i.b.getViewTreeObserver().removeOnGlobalLayoutListener(null);
        this.N1.d();
        p7m0 p7m0Var = H0().I;
        Boolean bool = Boolean.TRUE;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        G0().g.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q1);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        Object value;
        super.e0();
        this.N1.b(G0().u);
        wze wzeVarH0 = H0();
        p7m0 p7m0Var = wzeVarH0.I;
        yje yjeVar = null;
        if (((Boolean) p7m0Var.getValue()).booleanValue()) {
            p7m0Var.o(null, Boolean.FALSE);
        }
        p7m0 p7m0Var2 = wzeVarH0.B;
        do {
            value = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value, im7.a((im7) value, wzeVarH0.z(), false, false, null, 14)));
        sac.V(jiu0.a(wzeVarH0), null, null, wzeVarH0.o.b, new wn2(wzeVarH0, yjeVar, (byte) 13), 11);
        G0().g.getViewTreeObserver().addOnGlobalLayoutListener(this.Q1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putInt("BUNDLE_SELECTED_POSITION", this.R1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void j0(Bundle bundle) {
        this.j1 = true;
        this.R1 = bundle != null ? bundle.getInt("BUNDLE_SELECTED_POSITION") : 0;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.S1;
    }
}
