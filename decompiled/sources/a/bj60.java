package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/bj60;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bj60 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(bj60.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public fiu0 K1;
    public roq0 L1;
    public final a8z M1;
    public final s0r N1;

    public bj60() {
        super(R.layout.compose_fragment);
        this.M1 = xbc.b0(this, sre0.f32672a.b(jj60.class), new pu50(this, (byte) 13));
        this.N1 = ltt0.o(this, aj60.f959a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(433959008, true, new pi40(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(cj60.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            cj60 cj60Var = (cj60) (ze3Var instanceof cj60 ? ze3Var : null);
            if (cj60Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                d1p d1pVar = cj60Var.f4445a;
                zg zgVar = cj60Var.b;
                czt cztVar = cj60Var.c;
                lbu lbuVar = cj60Var.d;
                mne mneVar = cj60Var.e;
                ctf0 ctf0Var = cj60Var.f;
                pru pruVar = cj60Var.g;
                poq0 poq0Var = cj60Var.h;
                gst0 gst0Var = cj60Var.i;
                epi0 epi0Var = cj60Var.j;
                d1pVar.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(jj60.class, (rki) new daf(d1pVar, poq0Var, epi0Var, zgVar, cztVar, lbuVar, mneVar, ctf0Var, pruVar, i1w0VarF, gst0Var).m));
                this.L1 = new roq0();
                return;
            }
        }
        jf4.n(b1j.i(cj60.class, "Cannot create dependency "));
    }
}
