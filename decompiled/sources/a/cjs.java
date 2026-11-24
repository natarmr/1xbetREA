package a;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/cjs;", "La/yx5;", "La/ers;", "La/ocl0;", "La/odf0;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cjs extends yx5 implements ers, ocl0, odf0 {
    public final e9o0 K1;
    public thi L1;
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
    public static final /* synthetic */ iiy[] b2 = {new j0d0(cjs.class, "viewBinding", "getViewBinding()Lorg/xplatform/sportgame/lite/impl/databinding/FragmentGameLiteBinding;", 0), new ez40(cjs.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;", 0), new ez40(cjs.class, "storedComponentKey", "getStoredComponentKey()Ljava/lang/String;", 0)};
    public static final nek a2 = new nek();

    public cjs() {
        super(R.layout.fragment_game_lite);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.V1 = true;
        this.W1 = xbc.a0(this, sre0.f32672a.b(yks.class), null, new xis(this, (byte) 2), 14);
        this.X1 = ltt0.o(this, bjs.f2720a);
        this.Y1 = new khf0("GAME_LITE_SCREEN_PARAMS_KEY");
        this.Z1 = new phf0("GAME_LITE_SCREEN_COMPONENT_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new xis(this, (byte) 0));
        Object objN = this.X1.n(b2[0], this);
        objN.getClass();
        pkd.h(((d0r) objN).b, new owp0(K()), null, new ugd(-1019920317, true, new tx(this, (byte) 21)));
    }

    @Override // a.yx5
    public final void C0() {
        if (H0().length() == 0) {
            LinkedHashMap linkedHashMap = pdl0.f26813a;
            long j = G0().c;
            cb50 cb50VarV = efx.v(this);
            cb50VarV.getClass();
            String strO = dw9.o(j, cb50VarV.f4046a);
            this.Z1.x(this, b2[2], strO);
        }
        LinkedHashMap linkedHashMap2 = pdl0.f26813a;
        uhi uhiVarA = pdl0.a(G0(), new xis(this, (byte) 1), this, H0());
        this.L1 = (thi) uhiVarA.A.get();
        this.M1 = uhiVarA.w;
        this.N1 = uhiVarA.g.f();
        this.O1 = uhiVarA.x;
        this.P1 = uhiVarA.y;
        this.Q1 = uhiVarA.z;
        this.R1 = new nek();
        this.S1 = new xak((byte) 26);
        this.U1 = uhiVarA.l;
    }

    public final SportGameLiteScreenParams G0() {
        return (SportGameLiteScreenParams) this.Y1.n(this, b2[1]);
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
            LinkedHashMap linkedHashMap = pdl0.f26813a;
            String strH0 = H0();
            strH0.getClass();
            pdl0.f26813a.remove(strH0);
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
        I0().x(mis.e);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
        I0().x(mis.d);
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
            LinkedHashMap linkedHashMap = pdl0.f26813a;
            long j = G0().c;
            cb50 cb50VarV = efx.v(this);
            cb50VarV.getClass();
            String strO = dw9.o(j, cb50VarV.f4046a);
            this.Z1.x(this, b2[2], strO);
        }
        LinkedHashMap linkedHashMap2 = pdl0.f26813a;
        return pdl0.a(G0(), function0, this, H0()).f35680a;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getV1() {
        return this.V1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
