package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tv8;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tv8 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(tv8.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final yk5 N1 = new yk5();

    public tv8() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, sv8.f32854a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(pw8.class), new vb8(this, (byte) 8));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("BRAND_GAMES_SELECT_SORT_OPTION_REQUEST_KEY", K(), new gne(this, (byte) 18));
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-535029503, true, new m87(this, (byte) 17)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(nv8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            nv8 nv8Var = (nv8) (ze3Var instanceof nv8 ? ze3Var : null);
            if (nv8Var != null) {
                cad cadVar = nv8Var.f24179a;
                ehf0 ehf0Var = nv8Var.b;
                ctf0 ctf0Var = nv8Var.c;
                oeg0 oeg0Var = nv8Var.d;
                duj dujVar = nv8Var.e;
                bzt bztVar = nv8Var.f;
                gw8 gw8Var = nv8Var.g;
                ctf0Var.getClass();
                oeg0Var.getClass();
                gw8Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(pw8.class, (n8i) new rrd(cadVar, ehf0Var, ctf0Var, oeg0Var, dujVar, bztVar, gw8Var).i));
                return;
            }
        }
        jf4.n(b1j.i(nv8.class, "Cannot create dependency "));
    }
}
