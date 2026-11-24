package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/x0l0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x0l0 extends yx5 {
    public ii K1;
    public final a8z L1;
    public final a8z M1;

    public x0l0() {
        super(R.layout.compose_fragment);
        final byte b = 0;
        this.L1 = maz.a(wez.b, new Function0(this) { // from class: a.w0l0
            public final /* synthetic */ x0l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                x0l0 x0l0Var = this.b;
                switch (b2) {
                    case 0:
                        ComponentCallbacks2 application = x0l0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(z0d.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof z0d)) {
                                ze3Var = null;
                            }
                            z0d z0dVar = (z0d) ze3Var;
                            if (z0dVar != null) {
                                i1w0 i1w0VarF = a4n0.f(x0l0Var);
                                i1w0VarF.getClass();
                                cad cadVar = z0dVar.f43561a;
                                ctf0 ctf0Var = z0dVar.b;
                                duj dujVar = z0dVar.c;
                                gle0 gle0Var = z0dVar.i;
                                c5k c5kVar = z0dVar.d;
                                btt0 btt0Var = z0dVar.e;
                                g2v g2vVar = z0dVar.g;
                                m1e m1eVar = z0dVar.h;
                                ii iiVar = z0dVar.f;
                                ouu ouuVar = z0dVar.j;
                                ctf0Var.getClass();
                                iiVar.getClass();
                                btt0Var.getClass();
                                m1eVar.getClass();
                                return new sci(cadVar, ctf0Var, iiVar, dujVar, gle0Var, c5kVar, g2vVar, m1eVar, ouuVar, i1w0VarF);
                            }
                        }
                        jf4.n(b1j.i(z0d.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((rci) ((sci) x0l0Var.L1.getValue()).k.get());
                }
            }
        });
        final byte b2 = 1;
        this.M1 = xbc.a0(this, sre0.f32672a.b(m1l0.class), null, new Function0(this) { // from class: a.w0l0
            public final /* synthetic */ x0l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                x0l0 x0l0Var = this.b;
                switch (b3) {
                    case 0:
                        ComponentCallbacks2 application = x0l0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(z0d.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof z0d)) {
                                ze3Var = null;
                            }
                            z0d z0dVar = (z0d) ze3Var;
                            if (z0dVar != null) {
                                i1w0 i1w0VarF = a4n0.f(x0l0Var);
                                i1w0VarF.getClass();
                                cad cadVar = z0dVar.f43561a;
                                ctf0 ctf0Var = z0dVar.b;
                                duj dujVar = z0dVar.c;
                                gle0 gle0Var = z0dVar.i;
                                c5k c5kVar = z0dVar.d;
                                btt0 btt0Var = z0dVar.e;
                                g2v g2vVar = z0dVar.g;
                                m1e m1eVar = z0dVar.h;
                                ii iiVar = z0dVar.f;
                                ouu ouuVar = z0dVar.j;
                                ctf0Var.getClass();
                                iiVar.getClass();
                                btt0Var.getClass();
                                m1eVar.getClass();
                                return new sci(cadVar, ctf0Var, iiVar, dujVar, gle0Var, c5kVar, g2vVar, m1eVar, ouuVar, i1w0VarF);
                            }
                        }
                        jf4.n(b1j.i(z0d.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((rci) ((sci) x0l0Var.L1.getValue()).k.get());
                }
            }
        }, 14);
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = ((sci) this.L1.getValue()).f31987a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.i(composeView, null, new ugd(1965513491, true, new edk0(this, (byte) 6)));
        return composeView;
    }
}
