package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/t0y;", "La/yx5;", "<init>", "()V", "a/gst", "jackpot"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t0y extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public ii M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(t0y.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gst P1 = new gst();

    public t0y() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        this.N1 = ltt0.o(this, s0y.f31432a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(f8y.class), new r0y(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY", new r0y(this, (byte) 2));
        qcc.X(this, new r0y(this, (byte) 0));
        Object objN = this.N1.n(Q1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-12187749, true, new xxv(this, (byte) 20)));
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
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.JackPotDependencies");
            return;
        }
        rqt rqtVar = new rqt();
        i1w0 i1w0VarF = a4n0.f(this);
        i1w0VarF.getClass();
        this.L1 = new fiu0(Collections.singletonMap(f8y.class, (gji) new mii0(rqtVar, g8iVarC, i1w0VarF).e));
        this.M1 = g8iVarC.j();
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(szx.f33089a);
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
