package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeZoneEvent;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/z79;", "La/yx5;", "La/vbr;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z79 extends yx5 implements vbr {
    public fiu0 K1;
    public final kiu0 L1;
    public final s0r M1;
    public final khf0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(z79.class, "binding", "getBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameZoneFullscreenLayoutBinding;", 0), new ez40(z79.class, "params", "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;", 0)};
    public static final bj5 O1 = new bj5();

    public z79() {
        super(R.layout.fragment_game_zone_fullscreen_layout);
        x79 x79Var = new x79(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new h79(new h79(this, (byte) 2), (byte) 3));
        this.L1 = agc.G(this, sre0.f32672a.b(p89.class), new rt6(a8zVarA, (byte) 18), new rt6(a8zVarA, (byte) 19), x79Var);
        this.M1 = ltt0.o(this, y79.f42142a);
        this.N1 = new khf0("KEY_PARAMS");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new x79(this, (byte) 1));
        G0().b.setJavascriptInterface(H0());
        GameZoneView gameZoneView = G0().b;
        gameZoneView.getBroadcastingControlPanelView().u(H0());
        G0().b.setOnMediaFileReddyListener(new pw4(0, H0(), p89.class, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 11));
        G0().b.setOnErrorListener(new pw4(0, H0(), p89.class, "onBroadcastingError", "onBroadcastingError()V", 0, (byte) 12));
        G0().b.setOnContainerClickListener(new pw4(0, H0(), p89.class, "onVideoContainerClick", "onVideoContainerClick()V", 0, (byte) 13));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(a89.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            a89 a89Var = (a89) (ze3Var instanceof a89 ? ze3Var : null);
            if (a89Var != null) {
                v9i v9iVarA = a89Var.a((BroadcastingZoneLandscapeParams) this.N1.n(this, P1[1]));
                this.K1 = new fiu0(wcf0.g(p89.class, (r5i) v9iVarA.x, s79.class, (r5i) v9iVarA.y));
                return;
            }
        }
        jf4.n(b1j.i(a89.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        i89 i89Var = new i89(H0().l, (byte) 0);
        c48 c48Var = new c48(2, this, z79.class, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/landscape/BroadcastingZoneLandscapeUiState;)V", 4, (byte) 5);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new l19(i89Var, clzVarW, c48Var, (yje) null), 3);
        p7m0 p7m0Var = H0().m;
        c48 c48Var2 = new c48(2, this, z79.class, "handleEvent", "handleEvent(Lorg/xplatform/game_broadcasting/impl/presentation/zone/landscape/BroadcastingZoneLandscapeEvent;)V", 4, (byte) 6);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new l19(p7m0Var, clzVarW2, c48Var2, (yje) null), 3);
    }

    public final f0r G0() {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        return (f0r) objN;
    }

    public final p89 H0() {
        return (p89) this.L1.getValue();
    }

    public final void I0(boolean z) {
        GameZoneView gameZoneView = G0().b;
        if (z) {
            gameZoneView.c();
        } else {
            gameZoneView.b();
        }
    }

    public final void J0(BroadcastingLandscapeZoneEvent broadcastingLandscapeZoneEvent) {
        vcc.f0(i120.V(new Pair("KEY_LANDSCAPE_ZONE_REQUEST", broadcastingLandscapeZoneEvent)), this, "KEY_LANDSCAPE_ZONE_REQUEST");
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        kxq kxqVarN0 = n0();
        if (kxqVarN0.getRequestedOrientation() != 0) {
            kxqVarN0.setRequestedOrientation(0);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        Object next;
        G0().b.h();
        List listP = F().c.p();
        listP.getClass();
        Iterator it = listP.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d((Fragment) next, this));
        if (((Fragment) next) == null) {
            n0().setRequestedOrientation(1);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Object value;
        this.j1 = true;
        c4m0 c4m0Var = H0().n;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        p89 p89VarH0 = H0();
        p7m0 p7m0Var = p89VarH0.l;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, false, 32607)));
        p89VarH0.y();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        p89 p89VarH0 = H0();
        c4m0 c4m0Var = p89VarH0.n;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            p89VarH0.n = sac.T(new fnq(p89VarH0.c.b(), new k89(p89VarH0, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(p89VarH0), p89VarH0.d.f22085a), l89.h);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        jar0.V(n0(), true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        jar0.V(n0(), false);
    }
}
