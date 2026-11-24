package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cbk;", "La/yx5;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cbk extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public ii M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(cbk.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xak O1 = new xak((byte) 0);

    public cbk() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, zak.f44073a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(kbk.class), new ucj(this, (byte) 11));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(486092237, true, new yfg(this, (byte) 23)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ebk.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ebk ebkVar = (ebk) (ze3Var instanceof ebk ? ze3Var : null);
            if (ebkVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                btt0 btt0Var = ebkVar.f7522a;
                gii0 gii0Var = ebkVar.b;
                knf0 knf0Var = ebkVar.c;
                cad cadVar = ebkVar.d;
                duj dujVar = ebkVar.e;
                ctf0 ctf0Var = ebkVar.f;
                ii iiVar = ebkVar.g;
                kwz kwzVar = ebkVar.h;
                njo njoVar = ebkVar.i;
                iiVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                kwzVar.getClass();
                njoVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(kbk.class, (dci) new qv2(new htz(), cadVar, iiVar, btt0Var, gii0Var, i1w0VarF, dujVar, ctf0Var, kwzVar, njoVar).n));
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(ebk.class, "Cannot create dependency "));
    }
}
