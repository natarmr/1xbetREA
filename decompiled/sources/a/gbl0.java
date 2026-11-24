package a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.api.navigation.SportGameClassicScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"La/gbl0;", "La/yx5;", "La/ers;", "La/ocl0;", "La/odf0;", "", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gbl0 extends yx5 implements ers, ocl0, odf0 {
    public final e9o0 K1;
    public mui L1;
    public cge0 M1;
    public s9m0 N1;
    public gfk0 O1;
    public ivn P1;
    public zx10 Q1;
    public xi70 R1;
    public wdk0 S1;
    public final boolean U1;
    public final kiu0 V1;
    public final s0r W1;
    public final khf0 X1;
    public final phf0 Y1;
    public final n0o0 Z1;
    public final n0o0 a2;
    public final roi0 b2;
    public static final /* synthetic */ iiy[] d2 = {new j0d0(gbl0.class, "viewBinding", "getViewBinding()Lorg/xplatform/sportgame/classic/impl/databinding/FragmentSportGameClassicLegacyBinding;", 0), new ez40(gbl0.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;", 0), new ez40(gbl0.class, "storedComponentKey", "getStoredComponentKey()Ljava/lang/String;", 0)};
    public static final lme0 c2 = new lme0((byte) 26);

    public gbl0() {
        super(R.layout.fragment_sport_game_classic_legacy);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.U1 = true;
        byte b = 2;
        dbl0 dbl0Var = new dbl0(this, b);
        a8z a8zVarA = maz.a(wez.b, new fyk0(new fyk0(this, (byte) 1), b));
        this.V1 = agc.G(this, sre0.f32672a.b(ncl0.class), new s9i0(a8zVarA, (byte) 28), new s9i0(a8zVarA, (byte) 29), dbl0Var);
        this.W1 = ltt0.o(this, fbl0.f9265a);
        this.X1 = new khf0("params_key");
        this.Y1 = new phf0("GAME_SCREEN_COMPONENT_KEY");
        this.Z1 = maz.b(new dbl0(this, (byte) 3));
        this.a2 = maz.b(new fzk0((byte) 5));
        this.b2 = new roi0(this);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        TypedValue typedValue = ysf0.f43165a;
        Context contextO0 = o0();
        Resources.Theme theme = contextO0.getTheme();
        TypedValue typedValue2 = ysf0.f43165a;
        theme.resolveAttribute(R.attr.actionBarSize, typedValue2, true);
        int iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue2.data, contextO0.getResources().getDisplayMetrics());
        CoordinatorLayout coordinatorLayout = I0().f43784a;
        y78 y78Var = new y78(this, iComplexToDimensionPixelSize, (byte) 18);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(coordinatorLayout, y78Var);
        I0().e.u(J0());
        I0().c.F((qfs) this.Z1.getValue(), (lnd) this.a2.getValue(), J0(), J0(), this.b2, J0(), this);
        qcc.X(this, new dbl0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        if (H0().length() == 0) {
            LinkedHashMap linkedHashMap = sal0.f31894a;
            String strB = sal0.b(G0().c, efx.v(this));
            this.Y1.x(this, d2[2], strB);
        }
        String strH0 = H0();
        LinkedHashMap linkedHashMap2 = sal0.f31894a;
        oui ouiVarA = sal0.a(new frs(strH0, G0().f46991a, G0().b, G0().c, G0().d, G0().e, G0().f, G0().g), new xrs(G0().c, G0().b, G0().f46991a), new npn(G0().b, strH0, G0().c, G0().f46991a), new dbl0(this, (byte) 0), this, strH0);
        this.L1 = (mui) ouiVarA.K.get();
        zx10 zx10Var = ouiVarA.k;
        this.M1 = new cge0((byte) 6);
        this.N1 = ouiVarA.C;
        this.O1 = ouiVarA.D;
        this.P1 = ouiVarA.m;
        this.Q1 = zx10Var;
        this.R1 = ouiVarA.q.f();
        this.S1 = ouiVarA.E;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        qaf0 qaf0Var = new qaf0(J0().S, (byte) 7);
        Class<gbl0> cls = gbl0.class;
        jbh0 jbh0Var = new jbh0(2, this, cls, "handleBackground", "handleBackground(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameHeaderBackgroundUiModel;)V", 4, (byte) 20);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        yje yjeVar = null;
        qjj.W(x0x.Q(clzVarW.x()), null, null, new myj0(qaf0Var, clzVarW, jbh0Var, (yje) null, (char) 0), 3);
        qz40 qz40Var = (qz40) J0().T.getValue();
        int i = 4;
        jbh0 jbh0Var2 = new jbh0(2, this, cls, "updateProgress", "updateProgress(Z)V", i, (byte) 21);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new myj0((gmq) qz40Var, clzVarW2, jbh0Var2, (yje) null, (byte) 0), 3);
        qaf0 qaf0Var2 = new qaf0(J0().N, (byte) 8);
        lkz lkzVar2 = lkz.f20223a;
        jbh0 jbh0Var3 = new jbh0(2, this, cls, "handleCardTabUiModel", "handleCardTabUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameTabUiModel;)V", i, (byte) 22);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new myj0(qaf0Var2, clzVarW3, jbh0Var3, (yje) null, (byte) 0), 3);
        ncl0 ncl0VarJ0 = J0();
        gmq gmqVarL = ulb.L(new i89(new p6d(ncl0VarJ0.O, ncl0VarJ0.U, new p4b0(ncl0VarJ0, yjeVar, (byte) 8), (byte) 1), (byte) 22), ncl0VarJ0.o.f22085a);
        jbh0 jbh0Var4 = new jbh0(2, this, cls, "handleScreenUiModel", "handleScreenUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameScreenUiModel;)V", i, (byte) 23);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new myj0(gmqVarL, clzVarW4, jbh0Var4, (yje) null, (char) 0), 3);
        ncl0 ncl0VarJ1 = J0();
        omi0 omi0Var = new omi0(new i89(ncl0VarJ1.Q, (byte) 22), ncl0VarJ1, (byte) 5);
        int i2 = 2;
        jbh0 jbh0Var5 = new jbh0(i2, this, cls, "handleGameVideoUiModel", "handleGameVideoUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameBroadcastUiModel;)V", i, (byte) 24);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new myj0(omi0Var, clzVarW5, jbh0Var5, (yje) null), 3);
        ncl0 ncl0VarJ2 = J0();
        s6n0 s6n0Var = new s6n0(ncl0VarJ2.R, new kbh0(ncl0VarJ2, yjeVar, (byte) 29));
        jbh0 jbh0Var6 = new jbh0(i2, this, cls, "handleSingleEvents", "handleSingleEvents(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/SportGameClassicEvent;)V", i, (byte) 25);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new myj0(s6n0Var, clzVarW6, jbh0Var6, (yje) null), 3);
        ncl0 ncl0VarJ3 = J0();
        omi0 omi0Var2 = new omi0(ncl0VarJ3.w(), ncl0VarJ3, (byte) 4);
        jbh0 jbh0Var7 = new jbh0(i2, this, cls, "handleGameContentModel", "handleGameContentModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/GameScreenContentUiModel;)V", i, (byte) 26);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new myj0(omi0Var2, clzVarW7, jbh0Var7, (yje) null, (byte) 0), 3);
        h2c h2cVar = new h2c((p7m0) J0().t.q, (byte) 9);
        int i3 = 2;
        jbh0 jbh0Var8 = new jbh0(i3, this, cls, "handleToolbarUiModel", "handleToolbarUiModel(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/toolbar/GameToolbarUiModel;)V", i, (byte) 27);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new myj0(h2cVar, clzVarW8, jbh0Var8, (yje) null), 3);
        p7m0 p7m0Var = (p7m0) J0().t.r;
        jbh0 jbh0Var9 = new jbh0(i3, this, cls, "handleMenuClickEvent", "handleMenuClickEvent(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/toolbar/MenuClickEvent;)V", i, (byte) 28);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new myj0(p7m0Var, clzVarW9, jbh0Var9, (yje) null), 3);
    }

    public final SportGameClassicScreenParams G0() {
        return (SportGameClassicScreenParams) this.X1.n(this, d2[1]);
    }

    public final String H0() {
        return this.Y1.n(this, d2[2]);
    }

    public final z4r I0() {
        Object objN = this.W1.n(d2[0], this);
        objN.getClass();
        return (z4r) objN;
    }

    public final ncl0 J0() {
        return (ncl0) this.V1.getValue();
    }

    public final void K0(ucs ucsVar, ImageView imageView, int i) {
        String str = (String) CollectionsKt.W(i, ucsVar.f35445a);
        if (str == null) {
            return;
        }
        if (i != q3d.i(ucsVar.f35445a)) {
            List list = u0d.f34849a;
            u0d.s(o0(), str, null, null, null, new ebl0(imageView, this, ucsVar, i), new ebl0(this, ucsVar, imageView, i), 14);
        } else {
            List list2 = u0d.f34849a;
            u0d.d(imageView, str, ucsVar.c, ucsVar.b, 50);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        vcc.g0(this, "KEY_LANDSCAPE_ZONE_REQUEST", new bbl0(this, (byte) 3));
        vcc.g0(this, "KEY_LANDSCAPE_VIDEO_REQUEST", new bbl0(this, (byte) 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        kxq kxqVarB;
        if ((F().J(this.B) == null || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) && H0().length() > 0) {
            LinkedHashMap linkedHashMap = sal0.f31894a;
            String strH0 = H0();
            strH0.getClass();
            sal0.f31894a.remove(strH0);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        I0().c.E();
        super.Z();
    }

    @Override // a.ers
    public final long a() {
        return G0().c;
    }

    @Override // a.odf0
    public final pdf0 b() {
        zx10 zx10Var = this.Q1;
        if (zx10Var != null) {
            return zx10Var;
        }
        Intrinsics.h("relatedGamesFeature");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        c4m0 c4m0Var = J0().V;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        ncl0 ncl0VarJ0 = J0();
        Pair pair = ncl0VarJ0.X;
        e3c.n(pair != null ? (bby) pair.b : null);
        e3c.n(ncl0VarJ0.W);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        ncl0 ncl0VarJ0 = J0();
        c4m0 c4m0Var = ncl0VarJ0.V;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            ncl0VarJ0.V = slb.U(new fnq(ncl0VarJ0.p.b(), new bcl0(ncl0VarJ0, null, (byte) 4), (byte) 4), d5c.S(jiu0.a(ncl0VarJ0), ncl0VarJ0.o.b));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        if (this.S1 == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        vcc.C(this, "request_key_notification_updated");
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        wdk0 wdk0Var = this.S1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.U1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.ocl0
    public final pcl0 u(Function0 function0) {
        if (H0().length() == 0) {
            LinkedHashMap linkedHashMap = sal0.f31894a;
            String strB = sal0.b(G0().c, efx.v(this));
            this.Y1.x(this, d2[2], strB);
        }
        String strH0 = H0();
        LinkedHashMap linkedHashMap2 = sal0.f31894a;
        return sal0.a(new frs(strH0, G0().f46991a, G0().b, G0().c, G0().d, G0().e, G0().f, G0().g), new xrs(G0().c, G0().b, G0().f46991a), new npn(G0().b, strH0, G0().c, G0().f46991a), function0, this, strH0).f25878a;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.U1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
