package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/rlj0;", "La/yx5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rlj0 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public final a8z M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(rlj0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final eke0 O1 = new eke0();

    public rlj0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitBackground, R.attr.uikitBackgroundContent, 12);
        this.L1 = ltt0.o(this, qlj0.f28937a);
        final byte b = 0;
        this.M1 = maz.a(wez.b, new Function0(this) { // from class: a.plj0
            public final /* synthetic */ rlj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                rlj0 rlj0Var = this.b;
                switch (b2) {
                    case 0:
                        eke0 eke0Var = rlj0.O1;
                        ComponentCallbacks2 application = rlj0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(cmj0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof cmj0)) {
                                ze3Var = null;
                            }
                            cmj0 cmj0Var = (cmj0) ze3Var;
                            if (cmj0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(rlj0Var);
                                i1w0VarF.getClass();
                                dpi0 dpi0Var = cmj0Var.f4607a;
                                cad cadVar = cmj0Var.b;
                                iw20 iw20Var = cmj0Var.c;
                                kl5 kl5Var = cmj0Var.d;
                                peg0 peg0Var = cmj0Var.e;
                                qu quVar = cmj0Var.f;
                                ocl oclVar = cmj0Var.g;
                                wyu wyuVar = cmj0Var.h;
                                m1e m1eVar = cmj0Var.i;
                                s64 s64Var = cmj0Var.j;
                                ctf0 ctf0Var = cmj0Var.k;
                                wyuVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new yti(iw20Var, dpi0Var, cadVar, kl5Var, peg0Var, quVar, oclVar, wyuVar, m1eVar, s64Var, ctf0Var, i1w0VarF);
                            }
                        }
                        jf4.n(b1j.i(cmj0.class, "Cannot create dependency "));
                        return null;
                    default:
                        eke0 eke0Var2 = rlj0.O1;
                        return new q0h0((xti) ((yti) rlj0Var.M1.getValue()).m.get());
                }
            }
        });
        final byte b2 = 1;
        this.N1 = xbc.a0(this, sre0.f32672a.b(bmj0.class), null, new Function0(this) { // from class: a.plj0
            public final /* synthetic */ rlj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                rlj0 rlj0Var = this.b;
                switch (b3) {
                    case 0:
                        eke0 eke0Var = rlj0.O1;
                        ComponentCallbacks2 application = rlj0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(cmj0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof cmj0)) {
                                ze3Var = null;
                            }
                            cmj0 cmj0Var = (cmj0) ze3Var;
                            if (cmj0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(rlj0Var);
                                i1w0VarF.getClass();
                                dpi0 dpi0Var = cmj0Var.f4607a;
                                cad cadVar = cmj0Var.b;
                                iw20 iw20Var = cmj0Var.c;
                                kl5 kl5Var = cmj0Var.d;
                                peg0 peg0Var = cmj0Var.e;
                                qu quVar = cmj0Var.f;
                                ocl oclVar = cmj0Var.g;
                                wyu wyuVar = cmj0Var.h;
                                m1e m1eVar = cmj0Var.i;
                                s64 s64Var = cmj0Var.j;
                                ctf0 ctf0Var = cmj0Var.k;
                                wyuVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new yti(iw20Var, dpi0Var, cadVar, kl5Var, peg0Var, quVar, oclVar, wyuVar, m1eVar, s64Var, ctf0Var, i1w0VarF);
                            }
                        }
                        jf4.n(b1j.i(cmj0.class, "Cannot create dependency "));
                        return null;
                    default:
                        eke0 eke0Var2 = rlj0.O1;
                        return new q0h0((xti) ((yti) rlj0Var.M1.getValue()).m.get());
                }
            }
        }, 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new ogj0((byte) 5), new ugd(1828059053, true, new uph0(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        ((yti) this.M1.getValue()).getClass();
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
