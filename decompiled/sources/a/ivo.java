package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ivo;", "La/yx5;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ivo extends yx5 {
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ivo.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xak P1 = new xak((byte) 13);

    public ivo() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, hvo.f13735a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(cwo.class), new ntl(this, (byte) 20));
        this.O1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        String string;
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ovo.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ovo ovoVar = (ovo) (ze3Var instanceof ovo ? ze3Var : null);
            if (ovoVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Bundle bundle = this.g;
                if (bundle == null || (string = bundle.getString("KEY_GAME_ID")) == null) {
                    string = "";
                }
                String str = string;
                Bundle bundle2 = this.g;
                long j = bundle2 != null ? bundle2.getLong("KEY_SPORT_ID") : 0L;
                i1w0VarF.getClass();
                cad cadVar = ovoVar.f25933a;
                gii0 gii0Var = ovoVar.b;
                pru pruVar = ovoVar.d;
                ctf0 ctf0Var = ovoVar.f;
                r9u r9uVar = ovoVar.e;
                m1e m1eVar = ovoVar.c;
                uyu uyuVar = ovoVar.g;
                knf0 knf0Var = ovoVar.h;
                pmi0 pmi0Var = ovoVar.i;
                ocl oclVar = ovoVar.j;
                wyu wyuVar = ovoVar.k;
                r9uVar.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(cwo.class, (yei) new v7i(cadVar, pmi0Var, r9uVar, i1w0VarF, pruVar, gii0Var, ctf0Var, str, m1eVar, uyuVar, Long.valueOf(j), knf0Var, oclVar, wyuVar).o));
                return;
            }
        }
        jf4.n(b1j.i(ovo.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.N1.getValue()).x(fvo.f10224a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.N1.getValue()).x(evo.f8480a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-214561647, true, new f5o(this, (byte) 7)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
