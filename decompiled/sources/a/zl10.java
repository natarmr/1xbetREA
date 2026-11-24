package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zl10;", "La/yx5;", "<init>", "()V", "a/wsz", "lucky_wheel"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zl10 extends yx5 {
    public oki K1;
    public ii L1;
    public mj8 M1;
    public sxs0 N1;
    public uxs0 O1;
    public final e9o0 P1;
    public final s0r Q1;
    public final yzn0 R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(zl10.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(zl10.class, "bonus", "getBonus()Lorg/xplatform/games_section/api/models/GameBonus;", 0)};
    public static final wsz U1 = new wsz();

    public zl10() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.b;
        this.P1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        this.Q1 = ltt0.o(this, yl10.f42819a);
        this.R1 = new yzn0("lucky_wheel_bonus");
        this.S1 = xbc.a0(this, sre0.f32672a.b(pn10.class), null, new wl10(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "LUCKY_WHEEL_REQUEST_ERROR_DIALOG_KEY", new wl10(this, (byte) 3));
        ccq0.V(this, "LUCKY_WHEEL_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY", new wl10(this, (byte) 2));
        ccq0.V(this, "LUCKY_WHEEL_NOT_ENOUGH_FUNDS_DIALOG_KEY", new wl10(this, (byte) 5));
        ccq0.T(this, "LUCKY_WHEEL_NOT_ENOUGH_FUNDS_DIALOG_KEY", new gf10((byte) 6));
        ccq0.V(this, "LUCKY_WHEEL_SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY", new wl10(this, (byte) 4));
        if (this.N1 == null) {
            Intrinsics.h("wildFreeBetResultListener");
            throw null;
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        sxs0.d(eVarC, this, new xl10(this, (byte) 0));
        qcc.X(this, new wl10(this, (byte) 0));
        Object objN = this.Q1.n(V1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-435128912, true, new g2z(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.LuckyWheelDependencies");
            return;
        }
        atz atzVar = new atz();
        i1w0 i1w0VarF = a4n0.f(this);
        i1w0VarF.getClass();
        this.K1 = (oki) new pki(atzVar, new sek(), g8iVarC, i1w0VarF).o0.get();
        this.L1 = g8iVarC.j();
        r9u r9uVar = (r9u) g8iVarC.Q1.get();
        r9uVar.getClass();
        this.M1 = new mj8(r9uVar, (byte) 0);
        this.N1 = new sxs0((byte) 15);
        this.O1 = new uxs0((byte) 15);
    }

    public final ii G0() {
        ii iiVar = this.L1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final k3t0 H0() {
        return (k3t0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().x(cl10.f4534a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.P1;
    }
}
