package a;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.api.navigation.SportGameClassicScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/j2s;", "La/yx5;", "La/ers;", "La/ocl0;", "La/odf0;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j2s extends yx5 implements ers, ocl0, odf0 {
    public final e9o0 K1;
    public nui L1;
    public ndf0 M1;
    public uuz N1;
    public gfk0 O1;
    public nek P1;
    public xak Q1;
    public zx10 R1;
    public xi70 S1;
    public wdk0 U1;
    public poq0 V1;
    public final boolean W1;
    public final a8z X1;
    public final s0r Y1;
    public final khf0 Z1;
    public final phf0 a2;
    public static final /* synthetic */ iiy[] c2 = {new j0d0(j2s.class, "viewBinding", "getViewBinding()Lorg/xplatform/sportgame/classic/impl/databinding/FragmentSportGameClassicBinding;", 0), new ez40(j2s.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;", 0), new ez40(j2s.class, "storedComponentKey", "getStoredComponentKey()Ljava/lang/String;", 0)};
    public static final xak b2 = new xak((byte) 23);

    public j2s() {
        super(R.layout.fragment_sport_game_classic);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 8);
        this.W1 = true;
        this.X1 = xbc.a0(this, sre0.f32672a.b(k4s.class), null, new y1s(this, (byte) 2), 14);
        this.Y1 = ltt0.o(this, i2s.f14066a);
        this.Z1 = new khf0("params_key");
        this.a2 = new phf0("GAME_SCREEN_COMPONENT_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new y1s(this, (byte) 1));
        Object objN = this.Y1.n(c2[0], this);
        objN.getClass();
        pkd.h(((y4r) objN).b, qek0.h, null, new ugd(449511013, true, new f2s(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        if (I0().length() == 0) {
            LinkedHashMap linkedHashMap = sal0.f31894a;
            String strB = sal0.b(H0().c, efx.v(this));
            this.a2.x(this, c2[2], strB);
        }
        oui ouiVarG0 = G0(new y1s(this, (byte) 0));
        this.L1 = (nui) ouiVarG0.L.get();
        this.M1 = ouiVarG0.I;
        this.N1 = ouiVarG0.J;
        this.O1 = ouiVarG0.D;
        this.P1 = new nek();
        this.Q1 = new xak((byte) 26);
        this.R1 = ouiVarG0.k;
        this.S1 = ouiVarG0.q.f();
        this.U1 = ouiVarG0.E;
        this.V1 = ouiVarG0.H;
    }

    public final oui G0(Function0 function0) {
        LinkedHashMap linkedHashMap = sal0.f31894a;
        frs frsVar = new frs(I0(), H0().f46991a, H0().b, H0().c, H0().d, H0().e, H0().f, H0().g);
        xrs xrsVar = new xrs(H0().c, H0().b, H0().f46991a);
        long j = H0().c;
        return sal0.a(frsVar, xrsVar, new npn(H0().b, I0(), j, H0().f46991a), function0, this, I0());
    }

    public final SportGameClassicScreenParams H0() {
        return (SportGameClassicScreenParams) this.Z1.n(this, c2[1]);
    }

    public final String I0() {
        return this.a2.n(this, c2[2]);
    }

    public final k3t0 J0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        kxq kxqVarB;
        if ((F().J(this.B) == null || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) && I0().length() > 0) {
            LinkedHashMap linkedHashMap = sal0.f31894a;
            String strI0 = I0();
            strI0.getClass();
            sal0.f31894a.remove(strI0);
        }
        this.j1 = true;
    }

    @Override // a.ers
    public final long a() {
        return H0().c;
    }

    @Override // a.odf0
    public final pdf0 b() {
        zx10 zx10Var = this.R1;
        if (zx10Var != null) {
            return zx10Var;
        }
        Intrinsics.h("relatedGamesFeature");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        J0().x(t1s.f33182a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
        J0().x(r1s.f29697a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        if (this.U1 == null) {
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
        wdk0 wdk0Var = this.U1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.W1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.ocl0
    public final pcl0 u(Function0 function0) {
        if (I0().length() == 0) {
            LinkedHashMap linkedHashMap = sal0.f31894a;
            String strB = sal0.b(H0().c, efx.v(this));
            this.a2.x(this, c2[2], strB);
        }
        return G0(function0).f25878a;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getW1() {
        return this.W1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
