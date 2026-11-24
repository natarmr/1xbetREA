package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/e0j0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e0j0 extends yx5 {
    public final a8z K1;
    public final s0r L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(e0j0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cge0 N1 = new cge0((byte) 20);

    public e0j0() {
        super(R.layout.compose_fragment);
        final byte b = 0;
        this.K1 = maz.a(wez.b, new Function0(this) { // from class: a.c0j0
            public final /* synthetic */ e0j0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                e0j0 e0j0Var = this.b;
                switch (b2) {
                    case 0:
                        cge0 cge0Var = e0j0.N1;
                        ComponentCallbacks2 application = e0j0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(mzc.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof mzc)) {
                                ze3Var = null;
                            }
                            mzc mzcVar = (mzc) ze3Var;
                            if (mzcVar != null) {
                                i1w0 i1w0VarF = a4n0.f(e0j0Var);
                                i1w0VarF.getClass();
                                vqc vqcVar = mzcVar.f22647a;
                                nv20 nv20Var = mzcVar.b;
                                cad cadVar = mzcVar.c;
                                kt2 kt2Var = mzcVar.d;
                                q7d0 q7d0Var = mzcVar.e;
                                je jeVar = mzcVar.f;
                                ctf0 ctf0Var = mzcVar.g;
                                kt2Var.getClass();
                                q7d0Var.getClass();
                                ctf0Var.getClass();
                                return new sti(cadVar, nv20Var, vqcVar, i1w0VarF, kt2Var, jeVar, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(mzc.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((qti) ((sti) e0j0Var.K1.getValue()).g.get());
                }
            }
        });
        this.L1 = ltt0.o(this, d0j0.f5270a);
        final byte b2 = 1;
        this.M1 = xbc.a0(this, sre0.f32672a.b(i0j0.class), null, new Function0(this) { // from class: a.c0j0
            public final /* synthetic */ e0j0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                e0j0 e0j0Var = this.b;
                switch (b3) {
                    case 0:
                        cge0 cge0Var = e0j0.N1;
                        ComponentCallbacks2 application = e0j0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(mzc.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof mzc)) {
                                ze3Var = null;
                            }
                            mzc mzcVar = (mzc) ze3Var;
                            if (mzcVar != null) {
                                i1w0 i1w0VarF = a4n0.f(e0j0Var);
                                i1w0VarF.getClass();
                                vqc vqcVar = mzcVar.f22647a;
                                nv20 nv20Var = mzcVar.b;
                                cad cadVar = mzcVar.c;
                                kt2 kt2Var = mzcVar.d;
                                q7d0 q7d0Var = mzcVar.e;
                                je jeVar = mzcVar.f;
                                ctf0 ctf0Var = mzcVar.g;
                                kt2Var.getClass();
                                q7d0Var.getClass();
                                ctf0Var.getClass();
                                return new sti(cadVar, nv20Var, vqcVar, i1w0VarF, kt2Var, jeVar, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(mzc.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((qti) ((sti) e0j0Var.K1.getValue()).g.get());
                }
            }
        }, 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(O1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1583986469, true, new uph0(this, (byte) 18)));
    }
}
