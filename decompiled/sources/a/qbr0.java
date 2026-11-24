package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qbr0;", "La/yx5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qbr0 extends yx5 {
    public final s0r K1;
    public final boolean L1;
    public fiu0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(qbr0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final s9m0 O1 = new s9m0();

    public qbr0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, pbr0.f26722a);
        this.L1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(ecr0.class), new h3q0(this, (byte) 28));
    }

    @Override // a.yx5
    public final void C0() {
        String string;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(obr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            obr0 obr0Var = (obr0) (ze3Var instanceof obr0 ? ze3Var : null);
            if (obr0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Bundle bundle = this.g;
                if (bundle == null || (string = bundle.getString("KEY_GAME_ID")) == null) {
                    string = "";
                }
                String str = string;
                Bundle bundle2 = this.g;
                long j = bundle2 != null ? bundle2.getLong("KEY_SPORT_ID") : 0L;
                i1w0VarF.getClass();
                cad cadVar = obr0Var.f24997a;
                gii0 gii0Var = obr0Var.b;
                duj dujVar = obr0Var.c;
                sjl0 sjl0Var = obr0Var.d;
                pmi0 pmi0Var = obr0Var.e;
                pru pruVar = obr0Var.g;
                r9u r9uVar = obr0Var.k;
                OnexDatabase onexDatabase = obr0Var.f;
                ctf0 ctf0Var = obr0Var.j;
                m1e m1eVar = obr0Var.h;
                ocl oclVar = obr0Var.i;
                long j2 = j;
                uyu uyuVar = obr0Var.l;
                knf0 knf0Var = obr0Var.m;
                wyu wyuVar = obr0Var.n;
                r9uVar.getClass();
                gii0Var.getClass();
                sjl0Var.getClass();
                ctf0Var.getClass();
                onexDatabase.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(ecr0.class, (xvi) new h6i(cadVar, pmi0Var, i1w0VarF, r9uVar, pruVar, gii0Var, dujVar, ctf0Var, str, m1eVar, oclVar, uyuVar, Long.valueOf(j2), knf0Var, wyuVar).c));
                return;
            }
        }
        jf4.n(b1j.i(obr0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.K1.n(P1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-1947968776, true, new p6r0(this, (byte) 3)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.L1;
    }
}
