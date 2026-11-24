package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yed;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yed extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(yed.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(yed.class, "gameId", "getGameId()Ljava/lang/String;", 0)};
    public static final bj5 P1 = new bj5();

    public yed() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, xed.f40740a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(gfd.class), new h8a(this, (byte) 26));
        this.N1 = new phf0("GAME_ID");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(zed.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            zed zedVar = (zed) (ze3Var instanceof zed ? ze3Var : null);
            if (zedVar != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = zedVar.f44244a;
                duj dujVar = zedVar.b;
                gii0 gii0Var = zedVar.c;
                m1e m1eVar = zedVar.d;
                ctf0 ctf0Var = zedVar.f;
                boolean zH = ctf0Var.h();
                ocl oclVar = zedVar.e;
                knf0 knf0Var = zedVar.g;
                roi0 roi0Var = zedVar.h;
                vjp vjpVar = zedVar.i;
                r9u r9uVar = zedVar.j;
                kki kkiVarA = ((daf) roi0Var.f30839a).j().a(i1w0VarF);
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                r9uVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(gfd.class, (pai) new nc0(cadVar, kkiVarA, dujVar, gii0Var, strN, m1eVar, ctf0Var, i1w0VarF, Boolean.valueOf(zH), oclVar, knf0Var, vjpVar, r9uVar).n));
                return;
            }
        }
        jf4.n(b1j.i(zed.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1441608642, true, new cnc(this, (byte) 7)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
