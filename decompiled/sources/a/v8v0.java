package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/v8v0;", "La/yx5;", "<init>", "()V", "a/bzs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v8v0 extends yx5 {
    public final s0r K1;
    public final boolean L1;
    public ii M1;
    public fiu0 N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(v8v0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bzs0 P1 = new bzs0((byte) 13);

    public v8v0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, u8v0.f35251a);
        this.L1 = true;
        this.O1 = xbc.b0(this, sre0.f32672a.b(j9v0.class), new t8v0(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-457176800, true, new ggt0(this, (byte) 16)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(w8v0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            w8v0 w8v0Var = (w8v0) (ze3Var instanceof w8v0 ? ze3Var : null);
            if (w8v0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                btt0 btt0Var = w8v0Var.f38745a;
                knf0 knf0Var = w8v0Var.b;
                gii0 gii0Var = w8v0Var.c;
                rou rouVar = w8v0Var.d;
                ytt yttVar = w8v0Var.e;
                ii iiVar = w8v0Var.g;
                gsb gsbVar = w8v0Var.f;
                duj dujVar = w8v0Var.h;
                mne mneVar = w8v0Var.i;
                ctf0 ctf0Var = w8v0Var.j;
                btt0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                iiVar.getClass();
                ctf0Var.getClass();
                nc0 nc0Var = new nc0(new svs0((byte) 14), mneVar, btt0Var, knf0Var, gii0Var, rouVar, yttVar, gsbVar, i1w0VarF, iiVar, dujVar, ctf0Var);
                this.M1 = iiVar;
                this.N1 = new fiu0(Collections.singletonMap(j9v0.class, (nyi) nc0Var.n));
                return;
            }
        }
        jf4.n(b1j.i(w8v0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.L1;
    }
}
