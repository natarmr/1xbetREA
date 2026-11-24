package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uz8;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uz8 extends yx5 {
    public final s0r K1;
    public sai L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(uz8.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bj5 N1 = new bj5();

    public uz8() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, tz8.f34792a);
        this.M1 = xbc.a0(this, sre0.f32672a.b(e09.class), null, new vb8(this, (byte) 13), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(321439892, true, new m87(this, (byte) 22)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sz8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sz8 sz8Var = (sz8) (ze3Var instanceof sz8 ? ze3Var : null);
            if (sz8Var != null) {
                cad cadVar = sz8Var.f33058a;
                ehf0 ehf0Var = sz8Var.b;
                ctf0 ctf0Var = sz8Var.c;
                oeg0 oeg0Var = sz8Var.d;
                gw8 gw8Var = sz8Var.e;
                ctf0Var.getClass();
                oeg0Var.getClass();
                gw8Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = oeg0Var;
                esg0Var.b = ctf0Var;
                esg0Var.c = cadVar;
                esg0Var.d = ehf0Var;
                esg0Var.e = gw8Var;
                esg0Var.f = n0k0.a(new pai(esg0Var, (byte) 1));
                this.L1 = (sai) ((n5d0) esg0Var.f).get();
                return;
            }
        }
        jf4.n(b1j.i(sz8.class, "Cannot create dependency "));
    }
}
