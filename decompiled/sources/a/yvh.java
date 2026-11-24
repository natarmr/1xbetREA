package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yvh;", "La/yx5;", "<init>", "()V", "a/qud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yvh extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public afi M1;
    public final phf0 N1;
    public final s0r O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(yvh.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new j0d0(yvh.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final qud Q1 = new qud();

    public yvh() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = true;
        this.N1 = new phf0("SPORT_ID");
        this.O1 = ltt0.o(this, xvh.f41559a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(lwh.class), null, new e8g(this, (byte) 19), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(R1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-508613159, true, new yfg(this, (byte) 12)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wvh.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wvh wvhVar = (wvh) (ze3Var instanceof wvh ? ze3Var : null);
            if (wvhVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.N1.n(this, R1[0]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = wvhVar.f39836a;
                gii0 gii0Var = wvhVar.b;
                duj dujVar = wvhVar.f;
                m1e m1eVar = wvhVar.c;
                ocl oclVar = wvhVar.d;
                ctf0 ctf0Var = wvhVar.g;
                wyu wyuVar = wvhVar.e;
                knf0 knf0Var = wvhVar.h;
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.M1 = (afi) ((n5d0) new o3c(cadVar, gii0Var, dujVar, oclVar, m1eVar, i1w0VarF, wyuVar, ctf0Var, strN, knf0Var).k).get();
                return;
            }
        }
        jf4.n(b1j.i(wvh.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
