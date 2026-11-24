package a;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"La/i7s;", "La/yx5;", "La/ers;", "La/ocl0;", "La/odf0;", "<init>", "()V", "a/nek", "", "gameBoardHeight", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i7s extends yx5 implements ers, ocl0, odf0 {
    public final e9o0 K1;
    public phi L1;
    public gfk0 M1;
    public xi70 N1;
    public wdk0 O1;
    public ndf0 P1;
    public uuz Q1;
    public nek R1;
    public xak S1;
    public zx10 U1;
    public final boolean V1;
    public final a8z W1;
    public final s0r X1;
    public final khf0 Y1;
    public final phf0 Z1;
    public static final /* synthetic */ iiy[] b2 = {new j0d0(i7s.class, "viewBinding", "getViewBinding()Lorg/xplatform/sportgame/dashboard/impl/databinding/FragmentGameDashboardBinding;", 0), new ez40(i7s.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;", 0), new ez40(i7s.class, "storedComponentKey", "getStoredComponentKey()Ljava/lang/String;", 0)};
    public static final nek a2 = new nek();

    public i7s() {
        super(R.layout.fragment_game_dashboard);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.V1 = true;
        this.W1 = xbc.a0(this, sre0.f32672a.b(g9s.class), null, new e7s(this, (byte) 3), 14);
        this.X1 = ltt0.o(this, h7s.f12590a);
        this.Y1 = new khf0("GAME_DASHBOARD_SCREEN_PARAMS_KEY");
        this.Z1 = new phf0("GAME_DASHBOARD_SCREEN_COMPONENT_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new e7s(this, (byte) 0));
        Object objN = this.X1.n(b2[0], this);
        objN.getClass();
        pkd.h(((c0r) objN).b, qek0.h, null, new ugd(-1235888409, true, new tx(this, (byte) 20)));
    }

    @Override // a.yx5
    public final void C0() {
        byte b = 2;
        if (H0().length() == 0) {
            LinkedHashMap linkedHashMap = qcl0.f28489a;
            long j = G0().c;
            cb50 cb50VarV = efx.v(this);
            cb50VarV.getClass();
            String strO = dw9.o(j, cb50VarV.f4046a);
            this.Z1.x(this, b2[2], strO);
        }
        LinkedHashMap linkedHashMap2 = qcl0.f28489a;
        qhi qhiVarA = qcl0.a(G0(), new e7s(this, b), this, H0());
        this.L1 = (phi) qhiVarA.D.get();
        this.M1 = qhiVarA.z;
        this.N1 = qhiVarA.g.f();
        this.O1 = qhiVarA.A;
        this.P1 = qhiVarA.B;
        this.Q1 = qhiVarA.C;
        this.R1 = new nek();
        this.S1 = new xak((byte) 26);
        this.U1 = qhiVarA.l;
    }

    public final SportGameDashboardScreenParams G0() {
        return (SportGameDashboardScreenParams) this.Y1.n(this, b2[1]);
    }

    public final String H0() {
        return this.Z1.n(this, b2[2]);
    }

    public final k3t0 I0() {
        return (k3t0) this.W1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        kxq kxqVarB;
        if ((F().J(this.B) == null || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) && H0().length() > 0) {
            LinkedHashMap linkedHashMap = qcl0.f28489a;
            String strH0 = H0();
            strH0.getClass();
            qcl0.f28489a.remove(strH0);
        }
        this.j1 = true;
    }

    @Override // a.ers
    public final long a() {
        return G0().c;
    }

    @Override // a.odf0
    public final pdf0 b() {
        zx10 zx10Var = this.U1;
        if (zx10Var != null) {
            return zx10Var;
        }
        Intrinsics.h("relatedGamesFeature");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        I0().x(n6s.e);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
        I0().x(n6s.d);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        wdk0 wdk0Var = this.O1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.V1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.ocl0
    public final pcl0 u(Function0 function0) {
        if (H0().length() == 0) {
            LinkedHashMap linkedHashMap = qcl0.f28489a;
            long j = G0().c;
            cb50 cb50VarV = efx.v(this);
            cb50VarV.getClass();
            String strO = dw9.o(j, cb50VarV.f4046a);
            this.Z1.x(this, b2[2], strO);
        }
        LinkedHashMap linkedHashMap2 = qcl0.f28489a;
        return qcl0.a(G0(), function0, this, H0()).f28740a;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getW1() {
        return this.V1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
