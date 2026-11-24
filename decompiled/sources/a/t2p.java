package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/t2p;", "La/yx5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t2p extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public final a8z M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(t2p.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final ddk O1 = new ddk();

    public t2p() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, s2p.f31512a);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.r2p
            public final /* synthetic */ t2p b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                t2p t2pVar = this.b;
                switch (b2) {
                    case 0:
                        ddk ddkVar = t2p.O1;
                        ComponentCallbacks2 application = t2pVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(t5p.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof t5p)) {
                                ze3Var = null;
                            }
                            t5p t5pVar = (t5p) ze3Var;
                            if (t5pVar != null) {
                                return t5pVar.a(a4n0.f(t2pVar));
                            }
                        }
                        jf4.n(b1j.i(t5p.class, "Cannot create dependency "));
                        return null;
                    default:
                        ddk ddkVar2 = t2p.O1;
                        return new q0h0((ggi) ((igi) t2pVar.L1.getValue()).q.get());
                }
            }
        };
        wez wezVar = wez.b;
        this.L1 = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.M1 = xbc.a0(this, sre0.f32672a.b(i3p.class), null, new Function0(this) { // from class: a.r2p
            public final /* synthetic */ t2p b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                t2p t2pVar = this.b;
                switch (b3) {
                    case 0:
                        ddk ddkVar = t2p.O1;
                        ComponentCallbacks2 application = t2pVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(t5p.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof t5p)) {
                                ze3Var = null;
                            }
                            t5p t5pVar = (t5p) ze3Var;
                            if (t5pVar != null) {
                                return t5pVar.a(a4n0.f(t2pVar));
                            }
                        }
                        jf4.n(b1j.i(t5p.class, "Cannot create dependency "));
                        return null;
                    default:
                        ddk ddkVar2 = t2p.O1;
                        return new q0h0((ggi) ((igi) t2pVar.L1.getValue()).q.get());
                }
            }
        }, 14);
        this.N1 = maz.a(wezVar, new ago((byte) 29));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(P1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-705936157, true, new f5o(this, (byte) 11)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getL1() {
        return true;
    }
}
