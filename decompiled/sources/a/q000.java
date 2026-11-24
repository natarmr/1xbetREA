package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/q000;", "La/yx5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q000 extends yx5 {
    public final khf0 K1;
    public fiu0 L1;
    public final s0r M1;
    public ii N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(q000.class, "limitGroup", "getLimitGroup()Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;", 0), new j0d0(q000.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final htz P1 = new htz();

    public q000() {
        super(R.layout.compose_fragment);
        this.K1 = new khf0("LOCK_TYPE_KEY");
        this.M1 = ltt0.o(this, o000.f24397a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(v000.class), new rcz(this, (byte) 13));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(Q1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-1463018037, true, new g2z((Object) this, (byte) 10)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(r000.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            r000 r000Var = (r000) (ze3Var instanceof r000 ? ze3Var : null);
            if (r000Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                yox yoxVar = new yox((LimitNeGroupEnum) this.K1.n(this, Q1[0]));
                i1w0VarF.getClass();
                btt0 btt0Var = r000Var.f29604a;
                gii0 gii0Var = r000Var.b;
                knf0 knf0Var = r000Var.c;
                cad cadVar = r000Var.d;
                duj dujVar = r000Var.e;
                us00 us00Var = r000Var.f;
                ctf0 ctf0Var = r000Var.g;
                ii iiVar = r000Var.h;
                iiVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(v000.class, (rii) new nc0(new w000(), yoxVar, cadVar, iiVar, btt0Var, gii0Var, knf0Var, i1w0VarF, dujVar, us00Var, ctf0Var).n));
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(r000.class, "Cannot create dependency "));
    }
}
