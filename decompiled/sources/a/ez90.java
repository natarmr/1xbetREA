package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ez90;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ez90 extends yx5 {
    public aoi K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ez90.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ez90.class, "playerId", "getPlayerId()Ljava/lang/String;", 0)};
    public static final mi70 P1 = new mi70();

    public ez90() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, dz90.f6932a);
        this.M1 = xbc.a0(this, sre0.f32672a.b(nz90.class), null, new pl70(this, (byte) 23), 14);
        this.N1 = new phf0("player_id");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fz90.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fz90 fz90Var = (fz90) (ze3Var instanceof fz90 ? ze3Var : null);
            if (fz90Var != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = fz90Var.f10397a;
                ocl oclVar = fz90Var.b;
                gii0 gii0Var = fz90Var.c;
                m1e m1eVar = fz90Var.d;
                knf0 knf0Var = fz90Var.e;
                kuy kuyVar = fz90Var.f;
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                kuyVar.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = gii0Var;
                ruVar.b = knf0Var;
                ruVar.c = kuyVar;
                ruVar.d = cadVar;
                ruVar.h = m1eVar;
                ruVar.e = strN;
                ruVar.f = i1w0VarF;
                ruVar.g = oclVar;
                ruVar.i = mbl.b(new gji(ruVar, 1, (byte) 16));
                ruVar.j = n0k0.a(new gji(ruVar, 0, (byte) 16));
                this.K1 = (aoi) ((n5d0) ruVar.j).get();
                return;
            }
        }
        jf4.n(b1j.i(fz90.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1746108106, true, new cz90(this, (byte) 0)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
