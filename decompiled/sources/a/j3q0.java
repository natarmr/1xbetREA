package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/j3q0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j3q0 extends yx5 {
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final boolean N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(j3q0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final m6m0 P1 = new m6m0((byte) 18);

    public j3q0() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, i3q0.f14109a);
        this.N1 = true;
        this.O1 = xbc.b0(this, sre0.f32672a.b(d4q0.class), new h3q0(this, (byte) 0));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        String string;
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tgm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            tgm0 tgm0Var = (tgm0) (ze3Var instanceof tgm0 ? ze3Var : null);
            if (tgm0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Bundle bundle = this.g;
                if (bundle == null || (string = bundle.getString("KEY_GAME_ID")) == null) {
                    string = "";
                }
                String str = string;
                Bundle bundle2 = this.g;
                long j = bundle2 != null ? bundle2.getLong("KEY_SPORT_ID") : 0L;
                i1w0VarF.getClass();
                cad cadVar = tgm0Var.f33920a;
                gii0 gii0Var = tgm0Var.b;
                OnexDatabase onexDatabase = tgm0Var.c;
                r9u r9uVar = tgm0Var.f;
                ctf0 ctf0Var = tgm0Var.i;
                pru pruVar = tgm0Var.g;
                m1e m1eVar = tgm0Var.d;
                uyu uyuVar = tgm0Var.e;
                wyu wyuVar = tgm0Var.h;
                knf0 knf0Var = tgm0Var.j;
                pmi0 pmi0Var = tgm0Var.k;
                long j2 = j;
                ugm0 ugm0Var = tgm0Var.l;
                ocl oclVar = tgm0Var.m;
                wyuVar.getClass();
                r9uVar.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                onexDatabase.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                ugm0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(d4q0.class, (rti) new h6i(cadVar, pmi0Var, i1w0VarF, wyuVar, r9uVar, gii0Var, pruVar, ctf0Var, str, m1eVar, uyuVar, Long.valueOf(j2), knf0Var, ugm0Var, oclVar).c));
                return;
            }
        }
        jf4.n(b1j.i(tgm0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.O1.getValue()).x(f3q0.f8877a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.O1.getValue()).x(e3q0.f7150a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(-1208733087, true, new l7p0(this, (byte) 16)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
