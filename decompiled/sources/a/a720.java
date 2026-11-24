package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.Window;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/a720;", "La/stl;", "La/s720;", "La/i620;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a720 extends stl<s720> implements i620 {
    public xki g2;
    public fiu0 h2;
    public vq i2;
    public wdk0 j2;
    public ii k2;
    public final kiu0 l2;
    public final kiu0 m2;
    public final nae0 n2;
    public final yzn0 o2;
    public ndk0 p2;
    public qn20 q2;
    public final sbx0 r2;
    public final yzn0 s2;
    public uii t2;
    public ViewPager2 u2;
    public wjk v2;
    public final xp6 w2;
    public static final /* synthetic */ iiy[] y2 = {new j0d0(a720.class, "binding", "getBinding()Lorg/xplatform/make_bet/impl/databinding/MakeBetBottomsheetFragmentBinding;", 0), new ez40(a720.class, "simpleBetGame", "getSimpleBetGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;", 0), new ez40(a720.class, "entryPointType", "getEntryPointType()Lorg/xplatform/analytics/domain/AnalyticsEventModel$EntryPointType;", 0)};
    public static final xuz x2 = new xuz();

    public a720() {
        pv10 pv10Var = new pv10(new q620(this, (byte) 1), (byte) 6);
        x620 x620Var = new x620(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new pv10(x620Var, (byte) 7));
        tre0 tre0Var = sre0.f32672a;
        this.l2 = agc.G(this, tre0Var.b(mn20.class), new j210(a8zVarA, (byte) 26), new j210(a8zVarA, (byte) 27), pv10Var);
        q620 q620Var = new q620(this, (byte) 2);
        byte b = 9;
        a8z a8zVarA2 = maz.a(wezVar, new pv10(new x620(this, (byte) 1), b));
        this.m2 = agc.G(this, tre0Var.b(ya20.class), new j210(a8zVarA2, (byte) 28), new y620(a8zVarA2, (byte) 0), q620Var);
        this.n2 = ltt0.p(this, r620.f29915a);
        this.o2 = new yzn0("simple_bet_game");
        this.r2 = new sbx0((byte) 13);
        this.s2 = new yzn0("analytics_entry_point_type");
        this.w2 = new xp6(this, b);
    }

    @Override // a.stl
    public final void S0() {
        Window window;
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        byte b = 3;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
        Dialog dialog = this.S1;
        byte b2 = 2;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
        }
        dyb.O(Q0().e, new l620(this, b2));
        dyb.c0(Q0().c, new l620(this, b));
        dyb.c0(Q0().d, new l620(this, (byte) 4));
        byte b3 = 5;
        dyb.O(Q0().p, new l620(this, b3));
        ViewPager2 viewPager2 = Q0().y;
        this.u2 = viewPager2;
        byte b4 = 0;
        viewPager2.setUserInputEnabled(false);
        ViewPager2 viewPager3 = this.u2;
        if (viewPager3 != null) {
            viewPager3.c(this.w2);
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        n6r n6rVarK = K();
        n6rVarK.b();
        this.q2 = new qn20(eVarC, n6rVarK.c, W0(), X0());
        vq vqVar = this.i2;
        if (vqVar == null) {
            Intrinsics.h("addEventToCouponDelegate");
            throw null;
        }
        vqVar.e(this, W0(), new p0z(this, b3));
        vq vqVar2 = this.i2;
        if (vqVar2 != null) {
            vqVar2.f(this, W0(), new q620(this, b4));
        } else {
            Intrinsics.h("addEventToCouponDelegate");
            throw null;
        }
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u720.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u720 u720Var = (u720) (ze3Var instanceof u720 ? ze3Var : null);
            if (u720Var != null) {
                m0k0 m0k0VarX0 = X0();
                i1w0 i1w0VarF = a4n0.f(this);
                ms2 ms2VarW0 = W0();
                i1w0VarF.getClass();
                cad cadVar = u720Var.f35164a;
                o2j0 o2j0Var = u720Var.b;
                ctf0 ctf0Var = u720Var.c;
                sue sueVar = u720Var.d;
                bzu bzuVar = u720Var.q;
                clc clcVar = u720Var.e;
                wdk0 wdk0Var = u720Var.g;
                iw20 iw20Var = u720Var.f;
                nb7 nb7Var = u720Var.h;
                h0f h0fVar = u720Var.i;
                wsf0 wsf0Var = u720Var.j;
                m1e m1eVar = u720Var.k;
                gst0 gst0Var = u720Var.l;
                mii0 mii0Var = u720Var.m;
                d1p d1pVar = u720Var.n;
                vqc vqcVar = u720Var.o;
                h3c h3cVar = u720Var.p;
                zfo zfoVar = u720Var.r;
                ii iiVar = u720Var.s;
                o2j0Var.getClass();
                d1pVar.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                sueVar.getClass();
                nb7Var.getClass();
                h0fVar.getClass();
                m1eVar.getClass();
                gst0Var.getClass();
                zfoVar.getClass();
                iiVar.getClass();
                yhi yhiVar = new yhi(cadVar, o2j0Var, sueVar, clcVar, wsf0Var, iw20Var, d1pVar, bzuVar, m0k0VarX0, i1w0VarF, ctf0Var, ms2VarW0, wdk0Var, nb7Var, h0fVar, m1eVar, gst0Var, mii0Var, vqcVar, h3cVar, zfoVar, iiVar);
                this.g2 = (xki) ((n5d0) yhiVar.c).get();
                this.h2 = new fiu0(Collections.singletonMap(ya20.class, (gji) yhiVar.v));
                vq vqVarW = sueVar.w();
                x1x.x(vqVarW);
                this.i2 = vqVarW;
                this.j2 = wdk0Var;
                this.k2 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(u720.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        DsSegmentedGroup dsSegmentedGroup = Q0().s;
        xae0 xae0VarN = vtb.N(Y0().V);
        yje yjeVar = null;
        khx khxVar = new khx((Object) this, (Object) dsSegmentedGroup, yjeVar, (byte) 12);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        tkz tkzVarQ = x0x.Q(clzVarW.x());
        v620 v620Var = new v620(xae0VarN, clzVarW, khxVar, (yje) null);
        byte b = 3;
        qjj.W(tkzVarQ, null, null, v620Var, 3);
        xae0 xae0VarN2 = vtb.N(Y0().W);
        byte b2 = 2;
        t620 t620Var = new t620(this, yjeVar, b2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cm10(xae0VarN2, clzVarW2, t620Var, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(Y0().M);
        t620 t620Var2 = new t620(this, yjeVar, b);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new v620(xae0VarN3, clzVarW3, t620Var2, (yje) null), 3);
        xae0 xae0VarN4 = vtb.N(Y0().L);
        t620 t620Var3 = new t620(this, yjeVar, (byte) 5);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new v620(xae0VarN4, clzVarW4, t620Var3, (yje) null, (char) 0), 3);
        xae0 xae0VarN5 = vtb.N(Y0().N);
        t620 t620Var4 = new t620(this, yjeVar, (byte) 4);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new v620(xae0VarN5, clzVarW5, t620Var4, (yje) null, (byte) 0), 3);
        xae0 xae0VarN6 = vtb.N(Y0().R);
        byte b3 = 1;
        t620 t620Var5 = new t620(this, yjeVar, b3);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new cm10(xae0VarN6, clzVarW6, t620Var5, (yje) null), 3);
        ol60 ol60Var = Y0().O;
        byte b4 = 0;
        t620 t620Var6 = new t620(this, yjeVar, b4);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new cm10(ol60Var, clzVarW7, t620Var6, (yje) null), 3);
        ol60 ol60Var2 = Y0().P;
        u620 u620Var = new u620(this, yjeVar, b3);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new v620(ol60Var2, clzVarW8, u620Var, (yje) null), 3);
        ol60 ol60Var3 = Y0().Q;
        u620 u620Var2 = new u620(this, yjeVar, b4);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new cm10(ol60Var3, clzVarW9, u620Var2, (yje) null), 3);
        xae0 xae0VarN7 = vtb.N(Y0().S);
        t620 t620Var7 = new t620(this, yjeVar, (byte) 7);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new v620(xae0VarN7, clzVarW10, t620Var7, (yje) null, 0), 3);
        ol60 ol60Var4 = Y0().T;
        t620 t620Var8 = new t620(this, yjeVar, (byte) 6);
        clz clzVarW11 = aac.W(this);
        qjj.W(x0x.Q(clzVarW11.x()), null, null, new v620(ol60Var4, clzVarW11, t620Var8, (yje) null), 3);
        xae0 xae0VarN8 = vtb.N(((ya20) this.m2.getValue()).b);
        w620 w620Var = new w620(this, yjeVar, b4);
        clz clzVarW12 = aac.W(this);
        qjj.W(x0x.Q(clzVarW12.x()), null, null, new v620(xae0VarN8, clzVarW12, w620Var, (yje) null), 3);
        ol60 ol60Var5 = Y0().U;
        t620 t620Var9 = new t620(this, yjeVar, (byte) 8);
        clz clzVarW13 = aac.W(this);
        qjj.W(x0x.Q(clzVarW13.x()), null, null, new v620(ol60Var5, clzVarW13, t620Var9, (yje) null, (byte) 0), 3);
        ol60 ol60Var6 = Y0().Y;
        u620 u620Var3 = new u620(this, yjeVar, b);
        clz clzVarW14 = aac.W(this);
        qjj.W(x0x.Q(clzVarW14.x()), null, null, new v620((gmq) ol60Var6, clzVarW14, u620Var3, (yje) null, (char) 0), 3);
        ol60 ol60Var7 = Y0().X;
        u620 u620Var4 = new u620(this, yjeVar, b2);
        clz clzVarW15 = aac.W(this);
        qjj.W(x0x.Q(clzVarW15.x()), null, null, new v620(ol60Var7, clzVarW15, u620Var4, (yje) null, (byte) 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.v2 = (wjk) context;
        }
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final s720 Q0() {
        Object objN = this.n2.n(y2[0], this);
        objN.getClass();
        return (s720) objN;
    }

    public final ms2 W0() {
        return (ms2) this.s2.n(this, y2[2]);
    }

    public final m0k0 X0() {
        return (m0k0) this.o2.n(this, y2[1]);
    }

    public final mn20 Y0() {
        return (mn20) this.l2.getValue();
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        ndk0 ndk0Var = this.p2;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        ViewPager2 viewPager2 = this.u2;
        if (viewPager2 != null) {
            viewPager2.g(this.w2);
        }
        uii uiiVar = this.t2;
        if (uiiVar != null) {
            uiiVar.f();
        }
        this.q2 = null;
        ViewPager2 viewPager3 = this.u2;
        if (viewPager3 != null) {
            viewPager3.setAdapter(null);
        }
        uii uiiVar2 = this.t2;
        if (uiiVar2 != null) {
            uiiVar2.f();
        }
        this.t2 = null;
        wjk wjkVar = this.v2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        super.Z();
    }

    public final void Z0(String str) {
        ndk0 ndk0Var = this.p2;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        wdk0 wdk0Var = this.j2;
        if (wdk0Var != null) {
            this.p2 = wdk0.k(wdk0Var, new xdk0(qek0.f28589a, str.toString(), null, null, gqw0.D1, null, 108), this, null, Q0().r, false, null, 1012);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.r2.d();
        this.j1 = true;
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
        }
        ViewPager2 viewPager2 = this.u2;
        if (viewPager2 != null) {
            this.r2.b(viewPager2);
        }
        wjk wjkVar = this.v2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        p7m0 p7m0Var = ((ya20) this.m2.getValue()).b;
        if (((Boolean) p7m0Var.getValue()).booleanValue()) {
            p7m0Var.o(null, Boolean.FALSE);
        }
    }
}
