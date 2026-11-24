package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.search.impl.presentation.xgames.models.XGamesSearchFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tyv0;", "La/yx5;", "<init>", "()V", "a/uxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tyv0 extends yx5 {
    public final n0o0 K1;
    public final s0r L1;
    public final a8z M1;
    public final khf0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(tyv0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(tyv0.class, "settings", "getSettings()Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;", 0)};
    public static final uxs0 O1 = new uxs0((byte) 18);

    public tyv0() {
        super(R.layout.compose_fragment);
        final byte b = 0;
        this.K1 = maz.b(new Function0(this) { // from class: a.qyv0
            public final /* synthetic */ tyv0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                tyv0 tyv0Var = this.b;
                switch (b2) {
                    case 0:
                        uxs0 uxs0Var = tyv0.O1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        khf0 khf0Var = tyv0Var.N1;
                        iiy[] iiyVarArr = tyv0.P1;
                        g2v g2vVarA = m8v.a(((XGamesSearchFragmentSettings) khf0Var.n(tyv0Var, iiyVarArr[1])).f46920a);
                        ComponentCallbacks2 application = tyv0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(uyv0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof uyv0)) {
                                ze3Var = null;
                            }
                            uyv0 uyv0Var = (uyv0) ze3Var;
                            if (uyv0Var != null) {
                                XGamesSearchFragmentSettings xGamesSearchFragmentSettings = (XGamesSearchFragmentSettings) khf0Var.n(tyv0Var, iiyVarArr[1]);
                                mne mneVar = uyv0Var.f36510a;
                                bw60 bw60Var = uyv0Var.b;
                                d1p d1pVar = uyv0Var.c;
                                iw20 iw20Var = uyv0Var.d;
                                lbu lbuVar = uyv0Var.e;
                                ali aliVar = uyv0Var.f;
                                ctf0 ctf0Var = uyv0Var.g;
                                iqt iqtVar = uyv0Var.h;
                                m1e m1eVar = uyv0Var.i;
                                bzt bztVar = uyv0Var.j;
                                o3c o3cVar = uyv0Var.k;
                                yuu yuuVar = uyv0Var.l;
                                bw60Var.getClass();
                                d1pVar.getClass();
                                ctf0Var.getClass();
                                m1eVar.getClass();
                                return new vzi(mneVar, iw20Var, bw60Var, xGamesSearchFragmentSettings, g2vVarA, lbuVar, aliVar, ctf0Var, iqtVar, m1eVar, bztVar, o3cVar, yuuVar);
                            }
                        }
                        jf4.n(b1j.i(uyv0.class, "Cannot create dependency "));
                        return null;
                    default:
                        uxs0 uxs0Var2 = tyv0.O1;
                        return new q0h0((uzi) ((vzi) tyv0Var.K1.getValue()).n.get());
                }
            }
        });
        this.L1 = ltt0.o(this, syv0.f33042a);
        final byte b2 = 1;
        this.M1 = xbc.a0(this, sre0.f32672a.b(rzv0.class), null, new Function0(this) { // from class: a.qyv0
            public final /* synthetic */ tyv0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                tyv0 tyv0Var = this.b;
                switch (b3) {
                    case 0:
                        uxs0 uxs0Var = tyv0.O1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        khf0 khf0Var = tyv0Var.N1;
                        iiy[] iiyVarArr = tyv0.P1;
                        g2v g2vVarA = m8v.a(((XGamesSearchFragmentSettings) khf0Var.n(tyv0Var, iiyVarArr[1])).f46920a);
                        ComponentCallbacks2 application = tyv0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(uyv0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof uyv0)) {
                                ze3Var = null;
                            }
                            uyv0 uyv0Var = (uyv0) ze3Var;
                            if (uyv0Var != null) {
                                XGamesSearchFragmentSettings xGamesSearchFragmentSettings = (XGamesSearchFragmentSettings) khf0Var.n(tyv0Var, iiyVarArr[1]);
                                mne mneVar = uyv0Var.f36510a;
                                bw60 bw60Var = uyv0Var.b;
                                d1p d1pVar = uyv0Var.c;
                                iw20 iw20Var = uyv0Var.d;
                                lbu lbuVar = uyv0Var.e;
                                ali aliVar = uyv0Var.f;
                                ctf0 ctf0Var = uyv0Var.g;
                                iqt iqtVar = uyv0Var.h;
                                m1e m1eVar = uyv0Var.i;
                                bzt bztVar = uyv0Var.j;
                                o3c o3cVar = uyv0Var.k;
                                yuu yuuVar = uyv0Var.l;
                                bw60Var.getClass();
                                d1pVar.getClass();
                                ctf0Var.getClass();
                                m1eVar.getClass();
                                return new vzi(mneVar, iw20Var, bw60Var, xGamesSearchFragmentSettings, g2vVarA, lbuVar, aliVar, ctf0Var, iqtVar, m1eVar, bztVar, o3cVar, yuuVar);
                            }
                        }
                        jf4.n(b1j.i(uyv0.class, "Cannot create dependency "));
                        return null;
                    default:
                        uxs0 uxs0Var2 = tyv0.O1;
                        return new q0h0((uzi) ((vzi) tyv0Var.K1.getValue()).n.get());
                }
            }
        }, 14);
        this.N1 = new khf0("SETTINGS_BUNDLE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        x1x.x(((vzi) this.K1.getValue()).f38301a.b());
        afm0.s(this, new ryv0(this, (byte) 0));
        G0().f919a.setFocusable(true);
        G0().f919a.setFocusableInTouchMode(true);
        pkd.i(G0().b, null, new ugd(478962431, true, new uqv0(this, (byte) 4)));
    }

    public final aid G0() {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 H0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        H0().x(hyv0.f13879a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        H0().x(jyv0.f17378a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getS1() {
        return true;
    }
}
