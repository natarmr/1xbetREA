package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La/t0m0;", "La/yx5;", "", "<init>", "()V", "a/q0m0", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t0m0 extends yx5 {
    public final khf0 K1;
    public final r34 L1;
    public final r34 M1;
    public final r34 N1;
    public final yzn0 O1;
    public int P1;
    public boolean Q1;
    public final s0r R1;
    public fiu0 S1;
    public final a8z U1;
    public final a8z V1;
    public final boolean W1;
    public final v62 X1;
    public final tvj Y1;
    public static final /* synthetic */ iiy[] a2 = {new ez40(t0m0.class, "stageId", "getStageId()Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", 0), new ez40(t0m0.class, "sportId", "getSportId()J", 0), new ez40(t0m0.class, "subSportId", "getSubSportId()J", 0), new ez40(t0m0.class, "globalChampId", "getGlobalChampId()J", 0), new ez40(t0m0.class, "lastStatusBarStyle", "getLastStatusBarStyle()Lorg/xplatform/statistic/stage/impl/stage_net/presentation/fragments/StageNetFragment$ColorStyle;", 0), new j0d0(t0m0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gne0 Z1 = new gne0((byte) 29);

    public t0m0() {
        super(R.layout.compose_fragment);
        this.K1 = new khf0("KEY_STAGE_ID");
        this.L1 = new r34("KEY_SPORT_ID");
        this.M1 = new r34("KEY_SUB_SPORT_ID");
        this.N1 = new r34("KEY_GLOBAL_CHAMP_ID");
        this.O1 = new yzn0("LAST_STYLE_CODE");
        this.R1 = ltt0.o(this, s0m0.f31416a);
        final byte b = 0;
        this.U1 = maz.a(wez.b, new Function0(this) { // from class: a.o0m0
            public final /* synthetic */ t0m0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                t0m0 t0m0Var = this.b;
                switch (b2) {
                    case 0:
                        gne0 gne0Var = t0m0.Z1;
                        ComponentCallbacks2 application = t0m0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(hgp0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof hgp0)) {
                                ze3Var = null;
                            }
                            hgp0 hgp0Var = (hgp0) ze3Var;
                            if (hgp0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(t0m0Var);
                                khf0 khf0Var = t0m0Var.K1;
                                iiy[] iiyVarArr = t0m0.a2;
                                return hgp0Var.a(i1w0VarF, (TypeStageId) khf0Var.n(t0m0Var, iiyVarArr[0]), t0m0Var.L1.n(t0m0Var, iiyVarArr[1]).longValue(), t0m0Var.M1.n(t0m0Var, iiyVarArr[2]).longValue(), t0m0Var.N1.n(t0m0Var, iiyVarArr[3]).longValue());
                            }
                        }
                        jf4.n(b1j.i(hgp0.class, "Cannot create dependency "));
                        return null;
                    default:
                        gne0 gne0Var2 = t0m0.Z1;
                        fiu0 fiu0Var = t0m0Var.S1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.V1 = xbc.b0(this, sre0.f32672a.b(w3m0.class), new Function0(this) { // from class: a.o0m0
            public final /* synthetic */ t0m0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                t0m0 t0m0Var = this.b;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = t0m0.Z1;
                        ComponentCallbacks2 application = t0m0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(hgp0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof hgp0)) {
                                ze3Var = null;
                            }
                            hgp0 hgp0Var = (hgp0) ze3Var;
                            if (hgp0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(t0m0Var);
                                khf0 khf0Var = t0m0Var.K1;
                                iiy[] iiyVarArr = t0m0.a2;
                                return hgp0Var.a(i1w0VarF, (TypeStageId) khf0Var.n(t0m0Var, iiyVarArr[0]), t0m0Var.L1.n(t0m0Var, iiyVarArr[1]).longValue(), t0m0Var.M1.n(t0m0Var, iiyVarArr[2]).longValue(), t0m0Var.N1.n(t0m0Var, iiyVarArr[3]).longValue());
                            }
                        }
                        jf4.n(b1j.i(hgp0.class, "Cannot create dependency "));
                        return null;
                    default:
                        gne0 gne0Var2 = t0m0.Z1;
                        fiu0 fiu0Var = t0m0Var.S1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        this.W1 = true;
        this.X1 = new v62(this, (byte) 21);
        this.Y1 = new tvj(new p0m0(this, b), new p0m0(this, b2), null, 51);
    }

    @Override // a.yx5
    public final void C0() {
        this.S1 = ((mwi) this.U1.getValue()).a();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarW = G0().w();
        lkz lkzVar = lkz.f20223a;
        ssl0 ssl0Var = new ssl0((Object) this, (yje) null, (byte) 4);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0(gmqVarW, clzVarW, ssl0Var, (yje) null, (byte) 0), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.V1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hgp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hgp0 hgp0Var = (hgp0) (ze3Var instanceof hgp0 ? ze3Var : null);
            if (hgp0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = a2;
                this.S1 = hgp0Var.a(i1w0VarF, (TypeStageId) this.K1.n(this, iiyVarArr[0]), this.L1.n(this, iiyVarArr[1]).longValue(), this.M1.n(this, iiyVarArr[2]).longValue(), this.N1.n(this, iiyVarArr[3]).longValue()).a();
                return;
            }
        }
        jf4.n(b1j.i(hgp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().x(new vzl0(false));
        n6r n6rVarK = K();
        n6rVarK.b();
        n6rVarK.c.f(this.Y1);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        Window window = n0().getWindow();
        this.P1 = window.getAttributes().softInputMode;
        if (Build.VERSION.SDK_INT > 29) {
            window.setSoftInputMode(48);
        } else {
            window.setSoftInputMode(16);
        }
        G0().x(uzl0.f36541a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        n0().getWindow().setSoftInputMode(this.P1);
        G0().x(tzl0.f34810a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.R1.n(a2[5], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1581764681, true, new p0m0(this, (byte) 2)));
        n6r n6rVarK = K();
        n6rVarK.b();
        n6rVarK.c.a(this.Y1);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.W1;
    }
}
