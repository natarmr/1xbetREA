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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xtv;", "La/yx5;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xtv extends yx5 {
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final boolean N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(xtv.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final art P1 = new art();

    public xtv() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, wtv.f39762a);
        this.N1 = true;
        this.O1 = xbc.b0(this, sre0.f32672a.b(vuv.class), new bdv(this, (byte) 8));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        String string;
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(huv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            huv huvVar = (huv) (ze3Var instanceof huv ? ze3Var : null);
            if (huvVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Bundle bundle = this.g;
                if (bundle == null || (string = bundle.getString("KEY_GAME_ID")) == null) {
                    string = "";
                }
                String str = string;
                Bundle bundle2 = this.g;
                long j = bundle2 != null ? bundle2.getLong("KEY_SPORT_ID") : 0L;
                lgp0 lgp0Var = lgp0.f20019a;
                i1w0VarF.getClass();
                cad cadVar = huvVar.f13699a;
                gii0 gii0Var = huvVar.b;
                r9u r9uVar = huvVar.i;
                sjl0 sjl0Var = huvVar.c;
                ctf0 ctf0Var = huvVar.j;
                pru pruVar = huvVar.h;
                pmi0 pmi0Var = huvVar.m;
                OnexDatabase onexDatabase = huvVar.d;
                m1e m1eVar = huvVar.f;
                uyu uyuVar = huvVar.e;
                long j2 = j;
                knf0 knf0Var = huvVar.k;
                ocl oclVar = huvVar.g;
                wyu wyuVar = huvVar.l;
                r9uVar.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                sjl0Var.getClass();
                onexDatabase.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(vuv.class, (f7i) new h6i(cadVar, pmi0Var, r9uVar, i1w0VarF, pruVar, gii0Var, ctf0Var, str, m1eVar, uyuVar, Long.valueOf(j2), knf0Var, oclVar, wyuVar).p));
                return;
            }
        }
        jf4.n(b1j.i(huv.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.O1.getValue()).x(stv.f32792a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.O1.getValue()).x(rtv.f31094a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(895704971, true, new jar(this, (byte) 28)));
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
