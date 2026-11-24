package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.statistic.horse_menu.domain.model.HorseInfoModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vmw;", "La/yx5;", "<init>", "()V", "a/tqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vmw extends yx5 {
    public final e9o0 K1;
    public final khf0 L1;
    public final s0r M1;
    public fiu0 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(vmw.class, "horseInfoModel", "getHorseInfoModel()Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;", 0), new j0d0(vmw.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final tqt Q1 = new tqt();

    public vmw() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = new khf0("HORSE_INFO_KEY");
        this.M1 = ltt0.o(this, umw.f35936a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(snw.class), new bdv(this, (byte) 18));
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(1506570142, true, new xxv(this, (byte) 8)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tmw.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            tmw tmwVar = (tmw) (ze3Var instanceof tmw ? ze3Var : null);
            if (tmwVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                HorseInfoModel horseInfoModel = (HorseInfoModel) this.L1.n(this, R1[0]);
                i1w0VarF.getClass();
                cad cadVar = tmwVar.b;
                gii0 gii0Var = tmwVar.f34214a;
                wyu wyuVar = tmwVar.c;
                uyu uyuVar = tmwVar.d;
                m1e m1eVar = tmwVar.e;
                ocl oclVar = tmwVar.f;
                ctf0 ctf0Var = tmwVar.g;
                knf0 knf0Var = tmwVar.h;
                gii0Var.getClass();
                wyuVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.N1 = new fiu0(Collections.singletonMap(snw.class, (tii) new o3c(cadVar, i1w0VarF, gii0Var, wyuVar, uyuVar, m1eVar, oclVar, horseInfoModel, ctf0Var, knf0Var).k));
                return;
            }
        }
        jf4.n(b1j.i(tmw.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.O1.getValue()).x(pmw.f27259a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.O1.getValue()).x(qmw.f29005a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
