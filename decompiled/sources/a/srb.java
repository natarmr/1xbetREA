package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/srb;", "La/yx5;", "<init>", "()V", "a/kj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class srb extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(srb.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kj5 N1 = new kj5();

    public srb() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, rrb.f30974a);
        final byte b = 0;
        this.L1 = maz.a(wez.b, new Function0(this) { // from class: a.qrb
            public final /* synthetic */ srb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                srb srbVar = this.b;
                switch (b2) {
                    case 0:
                        kj5 kj5Var = srb.N1;
                        ComponentCallbacks2 application = srbVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(cu90.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof cu90)) {
                                ze3Var = null;
                            }
                            cu90 cu90Var = (cu90) ze3Var;
                            if (cu90Var != null) {
                                return cu90Var.a(a4n0.f(srbVar), srb.class.getSimpleName());
                            }
                        }
                        jf4.n(b1j.i(cu90.class, "Cannot create dependency "));
                        return null;
                    default:
                        kj5 kj5Var2 = srb.N1;
                        return new q0h0((xni) ((zni) srbVar.L1.getValue()).n.get());
                }
            }
        });
        final byte b2 = 1;
        this.M1 = xbc.a0(this, sre0.f32672a.b(xrb.class), null, new Function0(this) { // from class: a.qrb
            public final /* synthetic */ srb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                srb srbVar = this.b;
                switch (b3) {
                    case 0:
                        kj5 kj5Var = srb.N1;
                        ComponentCallbacks2 application = srbVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(cu90.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof cu90)) {
                                ze3Var = null;
                            }
                            cu90 cu90Var = (cu90) ze3Var;
                            if (cu90Var != null) {
                                return cu90Var.a(a4n0.f(srbVar), srb.class.getSimpleName());
                            }
                        }
                        jf4.n(b1j.i(cu90.class, "Cannot create dependency "));
                        return null;
                    default:
                        kj5 kj5Var2 = srb.N1;
                        return new q0h0((xni) ((zni) srbVar.L1.getValue()).n.get());
                }
            }
        }, 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(124766577, true, new bna(this, (byte) 21)));
    }
}
