package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bje0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bje0 extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(bje0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(bje0.class, "refereeId", "getRefereeId()Ljava/lang/String;", 0)};
    public static final zie0 P1 = new zie0();

    public bje0() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, aje0.f971a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(kje0.class), new tie0(this, (byte) 1));
        this.N1 = new phf0("referee_id");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(cje0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            cje0 cje0Var = (cje0) (ze3Var instanceof cje0 ? ze3Var : null);
            if (cje0Var != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = cje0Var.f4457a;
                duj dujVar = cje0Var.b;
                gii0 gii0Var = cje0Var.c;
                m1e m1eVar = cje0Var.d;
                ocl oclVar = cje0Var.e;
                knf0 knf0Var = cje0Var.f;
                r9u r9uVar = cje0Var.g;
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                r9uVar.getClass();
                ru ruVar = new ru();
                ruVar.b = dujVar;
                ruVar.f31100a = cadVar;
                ruVar.c = gii0Var;
                ruVar.d = knf0Var;
                ruVar.h = m1eVar;
                ruVar.e = i1w0VarF;
                ruVar.f = oclVar;
                ruVar.g = strN;
                ruVar.i = r9uVar;
                ruVar.j = new ppi(ruVar, (byte) 22);
                this.K1 = new fiu0(Collections.singletonMap(kje0.class, (ppi) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(cje0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1962057598, true, new nrc0(this, (byte) 27)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
