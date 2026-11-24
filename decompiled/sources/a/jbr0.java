package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jbr0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jbr0 extends yx5 {
    public final s0r K1;
    public final boolean L1;
    public fiu0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(jbr0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final g9m0 O1 = new g9m0();

    public jbr0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, ibr0.f14505a);
        this.L1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(scr0.class), new h3q0(this, (byte) 27));
    }

    @Override // a.yx5
    public final void C0() {
        String string;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hbr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hbr0 hbr0Var = (hbr0) (ze3Var instanceof hbr0 ? ze3Var : null);
            if (hbr0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Bundle bundle = this.g;
                if (bundle == null || (string = bundle.getString("KEY_GAME_ID")) == null) {
                    string = "";
                }
                String str = string;
                Bundle bundle2 = this.g;
                long j = bundle2 != null ? bundle2.getLong("KEY_SPORT_ID") : 0L;
                i1w0VarF.getClass();
                cad cadVar = hbr0Var.f12784a;
                gii0 gii0Var = hbr0Var.b;
                duj dujVar = hbr0Var.c;
                ctf0 ctf0Var = hbr0Var.h;
                sjl0 sjl0Var = hbr0Var.d;
                r9u r9uVar = hbr0Var.g;
                OnexDatabase onexDatabase = hbr0Var.e;
                m1e m1eVar = hbr0Var.f;
                uyu uyuVar = hbr0Var.i;
                knf0 knf0Var = hbr0Var.j;
                pmi0 pmi0Var = hbr0Var.k;
                long j2 = j;
                ocl oclVar = hbr0Var.l;
                qzt qztVar = hbr0Var.m;
                wyu wyuVar = hbr0Var.n;
                gii0Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                sjl0Var.getClass();
                onexDatabase.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(scr0.class, (xvi) new h6i(cadVar, pmi0Var, i1w0VarF, gii0Var, ctf0Var, r9uVar, dujVar, str, m1eVar, uyuVar, Long.valueOf(j2), knf0Var, oclVar, qztVar, wyuVar).c));
                return;
            }
        }
        jf4.n(b1j.i(hbr0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.K1.n(P1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(111319189, true, new p6r0(this, (byte) 2)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.L1;
    }
}
