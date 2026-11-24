package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/igt0;", "La/yx5;", "<init>", "()V", "a/bzs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class igt0 extends yx5 {
    public final s0r K1;
    public final phf0 L1;
    public final r34 M1;
    public fiu0 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(igt0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(igt0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(igt0.class, "sportId", "getSportId()J", 0)};
    public static final bzs0 Q1 = new bzs0((byte) 2);

    public igt0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, hgt0.f13030a);
        this.L1 = new phf0("GAME_ID_BUNDLE_KEY");
        this.M1 = new r34("SPORT_ID_BUNDLE_KEY");
        this.O1 = xbc.b0(this, sre0.f32672a.b(xgt0.class), new rbt0(this, (byte) 1));
        this.P1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fgt0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fgt0 fgt0Var = (fgt0) (ze3Var instanceof fgt0 ? ze3Var : null);
            if (fgt0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.L1.n(this, iiyVarArr[1]);
                Long lN = this.M1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = fgt0Var.f9509a;
                gii0 gii0Var = fgt0Var.b;
                duj dujVar = fgt0Var.c;
                m1e m1eVar = fgt0Var.d;
                wyu wyuVar = fgt0Var.e;
                ocl oclVar = fgt0Var.f;
                knf0 knf0Var = fgt0Var.g;
                kki kkiVarA = ((daf) fgt0Var.h.f30839a).j().a(i1w0VarF);
                vjp vjpVar = fgt0Var.i;
                r9u r9uVar = fgt0Var.j;
                ctf0 ctf0Var = fgt0Var.k;
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                knf0Var.getClass();
                r9uVar.getClass();
                ctf0Var.getClass();
                this.N1 = new fiu0(Collections.singletonMap(xgt0.class, (yxi) new nc0(cadVar, kkiVarA, strN, i1w0VarF, gii0Var, dujVar, m1eVar, lN, oclVar, knf0Var, vjpVar, r9uVar, ctf0Var).n));
                return;
            }
        }
        jf4.n(b1j.i(fgt0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1241804957, true, new ggt0(this, (byte) 0)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
