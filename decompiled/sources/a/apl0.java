package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;
import org.xplatform.search.impl.presentation.sport.models.SportSearchFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/apl0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class apl0 extends yx5 {
    public final n0o0 K1;
    public final s0r L1;
    public final a8z M1;
    public final khf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(apl0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(apl0.class, "settings", "getSettings()Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;", 0)};
    public static final gle0 P1 = new gle0();

    public apl0() {
        super(R.layout.compose_fragment);
        final byte b = 0;
        this.K1 = maz.b(new Function0(this) { // from class: a.wol0
            public final /* synthetic */ apl0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                apl0 apl0Var = this.b;
                switch (b2) {
                    case 0:
                        gle0 gle0Var = apl0.P1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        khf0 khf0Var = apl0Var.N1;
                        iiy[] iiyVarArr = apl0.Q1;
                        g2v g2vVarA = m8v.a(((SportSearchFragmentSettings) khf0Var.n(apl0Var, iiyVarArr[1])).f46919a);
                        ComponentCallbacks2 application = apl0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(bpl0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof bpl0)) {
                                ze3Var = null;
                            }
                            bpl0 bpl0Var = (bpl0) ze3Var;
                            if (bpl0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(apl0Var);
                                SportSearchFragmentSettings sportSearchFragmentSettings = (SportSearchFragmentSettings) khf0Var.n(apl0Var, iiyVarArr[1]);
                                i1w0VarF.getClass();
                                ljf0 ljf0Var = bpl0Var.f2991a;
                                ugf0 ugf0Var = bpl0Var.b;
                                cs00 cs00Var = bpl0Var.c;
                                itr itrVar = bpl0Var.d;
                                d1p d1pVar = bpl0Var.e;
                                iip iipVar = bpl0Var.g;
                                iw20 iw20Var = bpl0Var.f;
                                nr00 nr00Var = bpl0Var.h;
                                xri xriVar = bpl0Var.i;
                                pzu pzuVar = bpl0Var.j;
                                wdk0 wdk0Var = bpl0Var.k;
                                pmi pmiVar = bpl0Var.l;
                                gst0 gst0Var = bpl0Var.m;
                                bzt bztVar = bpl0Var.n;
                                r9u r9uVar = bpl0Var.o;
                                cs00Var.getClass();
                                itrVar.getClass();
                                d1pVar.getClass();
                                iipVar.getClass();
                                xriVar.getClass();
                                wdk0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                return new sui(pzuVar, ljf0Var, ugf0Var, itrVar, d1pVar, iipVar, iw20Var, xriVar, nr00Var, i1w0VarF, sportSearchFragmentSettings, g2vVarA, pmiVar, bztVar, r9uVar);
                            }
                        }
                        jf4.n(b1j.i(bpl0.class, "Cannot create dependency "));
                        return null;
                    default:
                        gle0 gle0Var2 = apl0.P1;
                        return new q0h0((rui) ((sui) apl0Var.K1.getValue()).p.get());
                }
            }
        });
        this.L1 = ltt0.o(this, yol0.f42993a);
        final byte b2 = 1;
        this.M1 = xbc.a0(this, sre0.f32672a.b(xpl0.class), null, new Function0(this) { // from class: a.wol0
            public final /* synthetic */ apl0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                apl0 apl0Var = this.b;
                switch (b3) {
                    case 0:
                        gle0 gle0Var = apl0.P1;
                        LinkedHashMap linkedHashMap = m8v.f21387a;
                        khf0 khf0Var = apl0Var.N1;
                        iiy[] iiyVarArr = apl0.Q1;
                        g2v g2vVarA = m8v.a(((SportSearchFragmentSettings) khf0Var.n(apl0Var, iiyVarArr[1])).f46919a);
                        ComponentCallbacks2 application = apl0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(bpl0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof bpl0)) {
                                ze3Var = null;
                            }
                            bpl0 bpl0Var = (bpl0) ze3Var;
                            if (bpl0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(apl0Var);
                                SportSearchFragmentSettings sportSearchFragmentSettings = (SportSearchFragmentSettings) khf0Var.n(apl0Var, iiyVarArr[1]);
                                i1w0VarF.getClass();
                                ljf0 ljf0Var = bpl0Var.f2991a;
                                ugf0 ugf0Var = bpl0Var.b;
                                cs00 cs00Var = bpl0Var.c;
                                itr itrVar = bpl0Var.d;
                                d1p d1pVar = bpl0Var.e;
                                iip iipVar = bpl0Var.g;
                                iw20 iw20Var = bpl0Var.f;
                                nr00 nr00Var = bpl0Var.h;
                                xri xriVar = bpl0Var.i;
                                pzu pzuVar = bpl0Var.j;
                                wdk0 wdk0Var = bpl0Var.k;
                                pmi pmiVar = bpl0Var.l;
                                gst0 gst0Var = bpl0Var.m;
                                bzt bztVar = bpl0Var.n;
                                r9u r9uVar = bpl0Var.o;
                                cs00Var.getClass();
                                itrVar.getClass();
                                d1pVar.getClass();
                                iipVar.getClass();
                                xriVar.getClass();
                                wdk0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                return new sui(pzuVar, ljf0Var, ugf0Var, itrVar, d1pVar, iipVar, iw20Var, xriVar, nr00Var, i1w0VarF, sportSearchFragmentSettings, g2vVarA, pmiVar, bztVar, r9uVar);
                            }
                        }
                        jf4.n(b1j.i(bpl0.class, "Cannot create dependency "));
                        return null;
                    default:
                        gle0 gle0Var2 = apl0.P1;
                        return new q0h0((rui) ((sui) apl0Var.K1.getValue()).p.get());
                }
            }
        }, 14);
        this.N1 = new khf0("SETTINGS_BUNDLE_KEY");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ms2 qr2Var = ((SportSearchFragmentSettings) this.N1.n(this, Q1[1])).b instanceof GlobalSearchContainerSettings.FromBetSlip ? new qr2() : new pr2();
        ujd ujdVarD = ((sui) this.K1.getValue()).m.d();
        x1x.x(ujdVarD);
        ujdVarD.c(this, qr2Var, new xol0(this, (byte) 0));
        G0().f919a.setFocusable(true);
        G0().f919a.setFocusableInTouchMode(true);
        pkd.i(G0().b, null, new ugd(1355086722, true, new edk0(this, (byte) 14)));
        H0().x(mol0.f22140a);
    }

    public final aid G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 H0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
