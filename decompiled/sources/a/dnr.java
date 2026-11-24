package a;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/dnr;", "La/yx5;", "La/ers;", "La/ocl0;", "La/odf0;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dnr extends yx5 implements ers, ocl0, odf0 {
    public final e9o0 K1;
    public mhi L1;
    public gfk0 M1;
    public xi70 N1;
    public wdk0 O1;
    public ndf0 P1;
    public nek Q1;
    public xak R1;
    public zx10 S1;
    public uuz U1;
    public poq0 V1;
    public final boolean W1;
    public final a8z X1;
    public final s0r Y1;
    public final khf0 Z1;
    public ComposeView a2;
    public final phf0 b2;
    public static final /* synthetic */ iiy[] d2 = {new j0d0(dnr.class, "viewBinding", "getViewBinding()Lorg/xplatform/sportgame/advanced/impl/databinding/FragmentGameAdvancedBinding;", 0), new ez40(dnr.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;", 0), new ez40(dnr.class, "storedComponentKey", "getStoredComponentKey()Ljava/lang/String;", 0)};
    public static final ddk c2 = new ddk();

    public dnr() {
        super(R.layout.fragment_game_advanced);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.W1 = true;
        this.X1 = xbc.a0(this, sre0.f32672a.b(spr.class), null, new ymr(this, (byte) 3), 14);
        this.Y1 = ltt0.o(this, cnr.f4669a);
        this.Z1 = new khf0("GAME_ADVANCED_SCREEN_PARAMS_KEY");
        this.b2 = new phf0("GAME_ADVANCED_SCREEN_COMPONENT_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0q n0qVar = o7k0.c;
        qcc.X(this, new ymr(this, (byte) 0));
        iiy[] iiyVarArr = d2;
        iiy iiyVar = iiyVarArr[0];
        s0r s0rVar = this.Y1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        this.a2 = ((b0r) objN).b;
        Object objN2 = s0rVar.n(iiyVarArr[0], this);
        objN2.getClass();
        pkd.h(((b0r) objN2).b, qek0.h, null, new ugd(-673544881, true, new gup((Object) this, (mm40) n0qVar, (byte) 16)));
        I0().x(lmr.f20311a);
    }

    @Override // a.yx5
    public final void C0() {
        byte b = 2;
        if (H0().length() == 0) {
            LinkedHashMap linkedHashMap = j9l0.f16146a;
            long j = G0().c;
            cb50 cb50VarV = efx.v(this);
            cb50VarV.getClass();
            String strO = dw9.o(j, cb50VarV.f4046a);
            this.b2.x(this, d2[2], strO);
        }
        LinkedHashMap linkedHashMap2 = j9l0.f16146a;
        nhi nhiVarA = j9l0.a(G0(), new ymr(this, b), this, H0());
        this.L1 = (mhi) nhiVarA.F.get();
        this.M1 = nhiVarA.B;
        this.N1 = nhiVarA.h.f();
        this.O1 = nhiVarA.C;
        this.P1 = nhiVarA.D;
        this.Q1 = new nek();
        this.R1 = new xak((byte) 26);
        this.S1 = nhiVarA.o;
        this.U1 = nhiVarA.E;
        this.V1 = nhiVarA.r;
    }

    public final SportGameAdvancedScreenParams G0() {
        return (SportGameAdvancedScreenParams) this.Z1.n(this, d2[1]);
    }

    public final String H0() {
        return this.b2.n(this, d2[2]);
    }

    public final k3t0 I0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        kxq kxqVarB;
        if ((F().J(this.B) == null || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) && H0().length() > 0) {
            LinkedHashMap linkedHashMap = j9l0.f16146a;
            String strH0 = H0();
            strH0.getClass();
            j9l0.f16146a.remove(strH0);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        this.a2 = null;
        super.Z();
    }

    @Override // a.ers
    public final long a() {
        return G0().c;
    }

    @Override // a.odf0
    public final pdf0 b() {
        zx10 zx10Var = this.S1;
        if (zx10Var != null) {
            return zx10Var;
        }
        Intrinsics.h("relatedGamesFeature");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        I0().x(lmr.f);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
        I0().x(lmr.e);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        ComposeView composeView;
        this.j1 = true;
        if (!this.m || (composeView = this.a2) == null) {
            return;
        }
        composeView.e();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        wdk0 wdk0Var = this.O1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.W1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.ocl0
    public final pcl0 u(Function0 function0) {
        if (H0().length() == 0) {
            LinkedHashMap linkedHashMap = j9l0.f16146a;
            long j = G0().c;
            cb50 cb50VarV = efx.v(this);
            cb50VarV.getClass();
            String strO = dw9.o(j, cb50VarV.f4046a);
            this.b2.x(this, d2[2], strO);
        }
        LinkedHashMap linkedHashMap2 = j9l0.f16146a;
        return j9l0.a(G0(), function0, this, H0()).f23534a;
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
