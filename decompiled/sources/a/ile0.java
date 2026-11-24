package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ile0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ile0 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(ile0.class, "refereeId", "getRefereeId()Ljava/lang/String;", 0), new j0d0(ile0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gle0 P1 = new gle0();

    public ile0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("REFEREE_ID");
        this.L1 = ltt0.o(this, hle0.f13256a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(gme0.class), new tie0(this, (byte) 3));
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1653804965, true, new dke0(this, (byte) 2)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ale0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ale0 ale0Var = (ale0) (ze3Var instanceof ale0 ? ze3Var : null);
            if (ale0Var != null) {
                String strN = this.K1.n(this, Q1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = ale0Var.f1065a;
                duj dujVar = ale0Var.b;
                gii0 gii0Var = ale0Var.c;
                ocl oclVar = ale0Var.d;
                ctf0 ctf0Var = ale0Var.e;
                m1e m1eVar = ale0Var.f;
                knf0 knf0Var = ale0Var.g;
                kuy kuyVar = ale0Var.h;
                gii0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                kuyVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(gme0.class, (gji) new daf(cadVar, i1w0VarF, dujVar, gii0Var, oclVar, ctf0Var, m1eVar, knf0Var, kuyVar, strN).m));
                return;
            }
        }
        jf4.n(b1j.i(ale0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
