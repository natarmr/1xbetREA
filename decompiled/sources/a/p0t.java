package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/p0t;", "La/yx5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p0t extends yx5 implements osr {
    public fiu0 K1;
    public final boolean L1;
    public final kiu0 M1;
    public final s0r N1;
    public final khf0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(p0t.class, "binding", "getBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameZoneLayoutBinding;", 0), new ez40(p0t.class, "params", "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;", 0)};
    public static final ddk P1 = new ddk();

    public p0t() {
        super(R.layout.fragment_game_zone_layout);
        this.L1 = true;
        jcs jcsVar = new jcs(this, (byte) 10);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 25), (byte) 26));
        this.M1 = agc.G(this, sre0.f32672a.b(e1t.class), new r6p(a8zVarA, (byte) 12), new r6p(a8zVarA, (byte) 13), jcsVar);
        this.N1 = ltt0.o(this, n0t.f22717a);
        this.O1 = new khf0("ZONE_PARAMS");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        GameZoneView gameZoneView = G0().b;
        gameZoneView.getBroadcastingControlPanelView().u(H0());
        Class<e1t> cls = e1t.class;
        G0().b.setOnMediaFileReddyListener(new wej(0, H0(), e1t.class, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 29));
        int i = 0;
        int i2 = 0;
        G0().b.setOnErrorListener(new o0t(i2, H0(), cls, "onBroadcastingError", "onBroadcastingError()V", i, (byte) 0));
        G0().b.setOnContainerClickListener(new o0t(i2, H0(), cls, "onVideoContainerClick", "onVideoContainerClick()V", i, (byte) 1));
        G0().b.setJavascriptInterface(H0());
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(q0t.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            q0t q0tVar = (q0t) (ze3Var instanceof q0t ? ze3Var : null);
            if (q0tVar != null) {
                GameBroadcastingParams gameBroadcastingParams = (GameBroadcastingParams) this.O1.n(this, Q1[1]);
                us00 us00Var = q0tVar.f27920a;
                oeg0 oeg0Var = q0tVar.b;
                m1e m1eVar = q0tVar.c;
                cad cadVar = q0tVar.d;
                yox yoxVar = q0tVar.e;
                gst0 gst0Var = q0tVar.f;
                ntu ntuVar = q0tVar.g;
                nhv0 nhv0Var = q0tVar.h;
                ysr ysrVar = q0tVar.k;
                m49 m49Var = q0tVar.l;
                n49 n49Var = q0tVar.m;
                atr atrVar = q0tVar.i;
                rsr rsrVar = q0tVar.j;
                meu0 meu0Var = q0tVar.n;
                mi70 mi70Var = q0tVar.o;
                r9u r9uVar = q0tVar.p;
                vd1 vd1Var = q0tVar.r;
                ik4 ik4Var = q0tVar.q;
                c49 c49Var = q0tVar.s;
                viu viuVar = q0tVar.t;
                oeg0Var.getClass();
                m1eVar.getClass();
                gst0Var.getClass();
                nhv0Var.getClass();
                ysrVar.getClass();
                atrVar.getClass();
                rsrVar.getClass();
                m49Var.getClass();
                n49Var.getClass();
                meu0Var.getClass();
                r9uVar.getClass();
                c49Var.getClass();
                this.K1 = new fiu0(wcf0.h(e1t.class, (dci) new yhi(cadVar, us00Var, oeg0Var, gameBroadcastingParams, m1eVar, yoxVar, ntuVar, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, mi70Var, r9uVar, ik4Var, vd1Var, c49Var, viuVar).v));
                return;
            }
        }
        jf4.n(b1j.i(q0t.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        a1t a1tVar = new a1t(H0().n, (byte) 0);
        Class<p0t> cls = p0t.class;
        pfl pflVar = new pfl(2, this, cls, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/part_screen/GameZoneUiState;)V", 4, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fns(a1tVar, clzVarW, pflVar, (yje) null), 3);
        p7m0 p7m0Var = H0().o;
        pfl pflVar2 = new pfl(2, this, cls, "handleEvent", "handleEvent(Lorg/xplatform/game_broadcasting/impl/presentation/zone/part_screen/GameZoneEvent;)V", 4, (byte) 18);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fns((gmq) p7m0Var, clzVarW2, pflVar2, (yje) null, (char) 0), 3);
    }

    public final g0r G0() {
        Object objN = this.N1.n(Q1[0], this);
        objN.getClass();
        return (g0r) objN;
    }

    public final e1t H0() {
        return (e1t) this.M1.getValue();
    }

    public final void I0(boolean z) {
        GameZoneView gameZoneView = G0().b;
        if (z) {
            gameZoneView.c();
        } else {
            gameZoneView.b();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.h();
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void c0() {
        if (O()) {
            e1t e1tVarH0 = H0();
            if (((s0t) e1tVarH0.n.getValue()).n) {
                e1tVarH0.w();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Object value;
        this.j1 = true;
        c4m0 c4m0Var = H0().p;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        e1t e1tVarH0 = H0();
        p7m0 p7m0Var = e1tVarH0.n;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, s0t.a((s0t) value, false, false, false, false, null, false, false, 32607)));
        e1tVarH0.y();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().x();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        j9o0 j9o0VarZ0;
        Fragment fragment = this.y;
        yx5 yx5Var = fragment instanceof yx5 ? (yx5) fragment : null;
        return (yx5Var == null || (j9o0VarZ0 = yx5Var.getK1()) == null) ? i9o0.f14396a : j9o0VarZ0;
    }
}
