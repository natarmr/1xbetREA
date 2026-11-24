package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.search.impl.presentation.aggregator_brands.models.AggregatorBrandsFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jd0;", "La/yx5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jd0 extends yx5 {
    public final khf0 K1;
    public final n0o0 L1;
    public final s0r M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(jd0.class, "settings", "getSettings()Lorg/xplatform/search/impl/presentation/aggregator_brands/models/AggregatorBrandsFragmentSettings;", 0), new j0d0(jd0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gfk0 P1 = new gfk0((byte) 13);

    public jd0() {
        super(R.layout.compose_fragment);
        this.K1 = new khf0("SETTINGS_BUNDLE_KEY");
        final byte b = 0;
        this.L1 = maz.b(new Function0(this) { // from class: a.hd0
            public final /* synthetic */ jd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                jd0 jd0Var = this.b;
                switch (b2) {
                    case 0:
                        gfk0 gfk0Var = jd0.P1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        g2v g2vVarA = m8v.a(((AggregatorBrandsFragmentSettings) jd0Var.K1.n(jd0Var, jd0.Q1[0])).f46917a);
                        ComponentCallbacks2 application = jd0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(kd0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof kd0)) {
                                ze3Var = null;
                            }
                            kd0 kd0Var = (kd0) ze3Var;
                            if (kd0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(jd0Var);
                                i1w0VarF.getClass();
                                fvt0 fvt0Var = kd0Var.f;
                                pru pruVar = kd0Var.i;
                                duj dujVar = kd0Var.f18082a;
                                ctf0 ctf0Var = kd0Var.c;
                                ouu ouuVar = kd0Var.e;
                                uyu uyuVar = kd0Var.d;
                                u58 u58Var = kd0Var.b;
                                s31 s31Var = kd0Var.h;
                                m1e m1eVar = kd0Var.j;
                                cyu cyuVar = kd0Var.k;
                                wyu wyuVar = kd0Var.l;
                                cad cadVar = kd0Var.g;
                                au0 au0Var = kd0Var.m;
                                bzt bztVar = kd0Var.n;
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                wyuVar.getClass();
                                return new e7i(cadVar, fvt0Var, pruVar, m1eVar, ouuVar, i1w0VarF, dujVar, u58Var, uyuVar, s31Var, cyuVar, wyuVar, au0Var, g2vVarA, bztVar);
                            }
                        }
                        jf4.n(b1j.i(kd0.class, "Cannot create dependency "));
                        return null;
                    default:
                        gfk0 gfk0Var2 = jd0.P1;
                        return new q0h0((d7i) ((e7i) jd0Var.L1.getValue()).p.get());
                }
            }
        });
        this.M1 = ltt0.o(this, id0.f14559a);
        final byte b2 = 1;
        this.N1 = xbc.a0(this, sre0.f32672a.b(oe0.class), null, new Function0(this) { // from class: a.hd0
            public final /* synthetic */ jd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                jd0 jd0Var = this.b;
                switch (b3) {
                    case 0:
                        gfk0 gfk0Var = jd0.P1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        g2v g2vVarA = m8v.a(((AggregatorBrandsFragmentSettings) jd0Var.K1.n(jd0Var, jd0.Q1[0])).f46917a);
                        ComponentCallbacks2 application = jd0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(kd0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof kd0)) {
                                ze3Var = null;
                            }
                            kd0 kd0Var = (kd0) ze3Var;
                            if (kd0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(jd0Var);
                                i1w0VarF.getClass();
                                fvt0 fvt0Var = kd0Var.f;
                                pru pruVar = kd0Var.i;
                                duj dujVar = kd0Var.f18082a;
                                ctf0 ctf0Var = kd0Var.c;
                                ouu ouuVar = kd0Var.e;
                                uyu uyuVar = kd0Var.d;
                                u58 u58Var = kd0Var.b;
                                s31 s31Var = kd0Var.h;
                                m1e m1eVar = kd0Var.j;
                                cyu cyuVar = kd0Var.k;
                                wyu wyuVar = kd0Var.l;
                                cad cadVar = kd0Var.g;
                                au0 au0Var = kd0Var.m;
                                bzt bztVar = kd0Var.n;
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                wyuVar.getClass();
                                return new e7i(cadVar, fvt0Var, pruVar, m1eVar, ouuVar, i1w0VarF, dujVar, u58Var, uyuVar, s31Var, cyuVar, wyuVar, au0Var, g2vVarA, bztVar);
                            }
                        }
                        jf4.n(b1j.i(kd0.class, "Cannot create dependency "));
                        return null;
                    default:
                        gfk0 gfk0Var2 = jd0.P1;
                        return new q0h0((d7i) ((e7i) jd0Var.L1.getValue()).p.get());
                }
            }
        }, 14);
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().f919a.setFocusable(true);
        G0().f919a.setFocusableInTouchMode(true);
        pkd.i(G0().b, null, new ugd(1055414206, true, new o00(this, (byte) 6)));
    }

    @Override // a.yx5
    public final void C0() {
        ((e7i) this.L1.getValue()).getClass();
    }

    public final aid G0() {
        Object objN = this.M1.n(Q1[1], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 H0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        H0().x(bd0.f2377a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        H0().x(cd0.f4136a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
