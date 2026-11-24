package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/du50;", "La/yx5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class du50 extends yx5 {
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(du50.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final htz P1 = new htz();

    public du50() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, cu50.f4972a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(gx50.class), new np30(this, (byte) 29));
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qw50.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qw50 qw50Var = (qw50) (ze3Var instanceof qw50 ? ze3Var : null);
            if (qw50Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Bundle bundle = this.g;
                if (bundle == null || (string = bundle.getString("KEY_GAME_ID")) == null) {
                    string = "";
                }
                String str = string;
                Bundle bundle2 = this.g;
                long j = bundle2 != null ? bundle2.getLong("KEY_SPORT_ID") : 0L;
                i1w0VarF.getClass();
                cad cadVar = qw50Var.f29419a;
                gii0 gii0Var = qw50Var.b;
                pmi0 pmi0Var = qw50Var.c;
                ctf0 ctf0Var = qw50Var.g;
                pru pruVar = qw50Var.f;
                m1e m1eVar = qw50Var.d;
                r9u r9uVar = qw50Var.e;
                uyu uyuVar = qw50Var.h;
                knf0 knf0Var = qw50Var.i;
                ocl oclVar = qw50Var.j;
                wyu wyuVar = qw50Var.k;
                wyuVar.getClass();
                r9uVar.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(gx50.class, (rki) new v7i(cadVar, pmi0Var, i1w0VarF, wyuVar, r9uVar, gii0Var, ctf0Var, str, pruVar, m1eVar, uyuVar, Long.valueOf(j), knf0Var, oclVar).o));
                return;
            }
        }
        jf4.n(b1j.i(qw50.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.N1.getValue()).x(nn50.f23804a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.N1.getValue()).x(mn50.f22073a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(1215734734, true, new pi40(this, (byte) 17)));
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
