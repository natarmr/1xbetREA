package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.search.impl.presentation.aggregator_games.models.AggregatorGamesFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qy0;", "La/yx5;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qy0 extends yx5 {
    public final hnm0 K1;
    public ii L1;
    public final boolean M1;
    public wdk0 N1;
    public final n0o0 O1;
    public final s0r P1;
    public final a8z Q1;
    public final khf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(qy0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(qy0.class, "settings", "getSettings()Lorg/xplatform/search/impl/presentation/aggregator_games/models/AggregatorGamesFragmentSettings;", 0)};
    public static final pek0 S1 = new pek0();

    public qy0() {
        super(R.layout.compose_fragment);
        this.K1 = hnm0.f13359a;
        final byte b = 1;
        this.M1 = true;
        final byte b2 = 0;
        this.O1 = maz.b(new Function0(this) { // from class: a.oy0
            public final /* synthetic */ qy0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                qy0 qy0Var = this.b;
                switch (b3) {
                    case 0:
                        pek0 pek0Var = qy0.S1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        khf0 khf0Var = qy0Var.R1;
                        iiy[] iiyVarArr = qy0.U1;
                        g2v g2vVarA = m8v.a(((AggregatorGamesFragmentSettings) khf0Var.n(qy0Var, iiyVarArr[1])).f46918a);
                        ComponentCallbacks2 application = qy0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ky0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ky0)) {
                                ze3Var = null;
                            }
                            ky0 ky0Var = (ky0) ze3Var;
                            if (ky0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(qy0Var);
                                i1w0VarF.getClass();
                                ort ortVar = ky0Var.f19084a;
                                cad cadVar = ky0Var.b;
                                oeg0 oeg0Var = ky0Var.c;
                                uf3 uf3Var = ky0Var.d;
                                ctf0 ctf0Var = ky0Var.e;
                                ii iiVar = ky0Var.l;
                                pru pruVar = ky0Var.f;
                                ouu ouuVar = ky0Var.m;
                                cyu cyuVar = ky0Var.g;
                                duj dujVar = ky0Var.h;
                                m1e m1eVar = ky0Var.i;
                                kt2 kt2Var = ky0Var.j;
                                fvt0 fvt0Var = ky0Var.k;
                                s31 s31Var = ky0Var.n;
                                wdk0 wdk0Var = ky0Var.p;
                                iqt iqtVar = ky0Var.o;
                                r9u r9uVar = ky0Var.q;
                                bzt bztVar = ky0Var.r;
                                wsf0 wsf0Var = ky0Var.s;
                                ytt yttVar = ky0Var.t;
                                iiVar.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                m1eVar.getClass();
                                kt2Var.getClass();
                                wdk0Var.getClass();
                                r9uVar.getClass();
                                return new s7i(cadVar, fvt0Var, wsf0Var, i1w0VarF, g2vVarA, iiVar, ortVar, uf3Var, ctf0Var, ouuVar, pruVar, cyuVar, dujVar, m1eVar, kt2Var, s31Var, iqtVar, wdk0Var, bztVar, yttVar);
                            }
                        }
                        jf4.n(b1j.i(ky0.class, "Cannot create dependency "));
                        return null;
                    default:
                        pek0 pek0Var2 = qy0.S1;
                        return new q0h0((r7i) ((s7i) qy0Var.O1.getValue()).u.get());
                }
            }
        });
        this.P1 = ltt0.o(this, py0.f27782a);
        this.Q1 = xbc.a0(this, sre0.f32672a.b(a01.class), null, new Function0(this) { // from class: a.oy0
            public final /* synthetic */ qy0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                qy0 qy0Var = this.b;
                switch (b3) {
                    case 0:
                        pek0 pek0Var = qy0.S1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        khf0 khf0Var = qy0Var.R1;
                        iiy[] iiyVarArr = qy0.U1;
                        g2v g2vVarA = m8v.a(((AggregatorGamesFragmentSettings) khf0Var.n(qy0Var, iiyVarArr[1])).f46918a);
                        ComponentCallbacks2 application = qy0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ky0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ky0)) {
                                ze3Var = null;
                            }
                            ky0 ky0Var = (ky0) ze3Var;
                            if (ky0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(qy0Var);
                                i1w0VarF.getClass();
                                ort ortVar = ky0Var.f19084a;
                                cad cadVar = ky0Var.b;
                                oeg0 oeg0Var = ky0Var.c;
                                uf3 uf3Var = ky0Var.d;
                                ctf0 ctf0Var = ky0Var.e;
                                ii iiVar = ky0Var.l;
                                pru pruVar = ky0Var.f;
                                ouu ouuVar = ky0Var.m;
                                cyu cyuVar = ky0Var.g;
                                duj dujVar = ky0Var.h;
                                m1e m1eVar = ky0Var.i;
                                kt2 kt2Var = ky0Var.j;
                                fvt0 fvt0Var = ky0Var.k;
                                s31 s31Var = ky0Var.n;
                                wdk0 wdk0Var = ky0Var.p;
                                iqt iqtVar = ky0Var.o;
                                r9u r9uVar = ky0Var.q;
                                bzt bztVar = ky0Var.r;
                                wsf0 wsf0Var = ky0Var.s;
                                ytt yttVar = ky0Var.t;
                                iiVar.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                m1eVar.getClass();
                                kt2Var.getClass();
                                wdk0Var.getClass();
                                r9uVar.getClass();
                                return new s7i(cadVar, fvt0Var, wsf0Var, i1w0VarF, g2vVarA, iiVar, ortVar, uf3Var, ctf0Var, ouuVar, pruVar, cyuVar, dujVar, m1eVar, kt2Var, s31Var, iqtVar, wdk0Var, bztVar, yttVar);
                            }
                        }
                        jf4.n(b1j.i(ky0.class, "Cannot create dependency "));
                        return null;
                    default:
                        pek0 pek0Var2 = qy0.S1;
                        return new q0h0((r7i) ((s7i) qy0Var.O1.getValue()).u.get());
                }
            }
        }, 14);
        this.R1 = new khf0("SETTINGS_BUNDLE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().f919a.setFocusable(true);
        G0().f919a.setFocusableInTouchMode(true);
        pkd.i(G0().b, null, new ugd(-371262473, true, new o00(this, (byte) 11)));
    }

    @Override // a.yx5
    public final void C0() {
        s7i s7iVar = (s7i) this.O1.getValue();
        s7iVar.getClass();
        this.L1 = s7iVar.t;
        this.N1 = s7iVar.s;
    }

    public final aid G0() {
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.Q1.getValue()).x(dy0.f6870a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.M1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
