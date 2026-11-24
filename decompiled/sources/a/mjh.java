package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.tournament_bracket.CyberTournamentBracketParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mjh;", "La/yx5;", "<init>", "()V", "a/std", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mjh extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public final a8z M1;
    public final s0r N1;
    public final a8z O1;
    public final khf0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(mjh.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(mjh.class, "params", "getParams()Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;", 0)};
    public static final std Q1 = new std();

    public mjh() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        final byte b = 0;
        this.M1 = xbc.b0(this, sre0.f32672a.b(lmh.class), new Function0(this) { // from class: a.kjh
            public final /* synthetic */ mjh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                mjh mjhVar = this.b;
                switch (b2) {
                    case 0:
                        std stdVar = mjh.Q1;
                        fiu0 fiu0Var = mjhVar.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        std stdVar2 = mjh.Q1;
                        ComponentCallbacks2 application = mjhVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(njh.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof njh)) {
                                ze3Var = null;
                            }
                            njh njhVar = (njh) ze3Var;
                            if (njhVar != null) {
                                CyberTournamentBracketParams cyberTournamentBracketParams = (CyberTournamentBracketParams) mjhVar.P1.n(mjhVar, mjh.R1[1]);
                                oeg0 oeg0Var = njhVar.f23636a;
                                g2v g2vVar = njhVar.b;
                                cad cadVar = njhVar.c;
                                m1e m1eVar = njhVar.d;
                                pyg pygVar = njhVar.h;
                                iip iipVar = njhVar.e;
                                xri xriVar = njhVar.g;
                                ctf0 ctf0Var = njhVar.i;
                                gii0 gii0Var = njhVar.j;
                                clc clcVar = njhVar.f;
                                vby vbyVar = njhVar.k;
                                xriVar.getClass();
                                pygVar.getClass();
                                iipVar.getClass();
                                oeg0Var.getClass();
                                vbyVar.getClass();
                                m1eVar.getClass();
                                gii0Var.getClass();
                                ctf0Var.getClass();
                                return new xei(cadVar, clcVar, pygVar, oeg0Var, g2vVar, m1eVar, cyberTournamentBracketParams, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(njh.class, "Cannot create dependency "));
                        return null;
                }
            }
        });
        this.N1 = ltt0.o(this, ljh.f20151a);
        final byte b2 = 1;
        this.O1 = maz.a(wez.b, new Function0(this) { // from class: a.kjh
            public final /* synthetic */ mjh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                mjh mjhVar = this.b;
                switch (b3) {
                    case 0:
                        std stdVar = mjh.Q1;
                        fiu0 fiu0Var = mjhVar.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        std stdVar2 = mjh.Q1;
                        ComponentCallbacks2 application = mjhVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(njh.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof njh)) {
                                ze3Var = null;
                            }
                            njh njhVar = (njh) ze3Var;
                            if (njhVar != null) {
                                CyberTournamentBracketParams cyberTournamentBracketParams = (CyberTournamentBracketParams) mjhVar.P1.n(mjhVar, mjh.R1[1]);
                                oeg0 oeg0Var = njhVar.f23636a;
                                g2v g2vVar = njhVar.b;
                                cad cadVar = njhVar.c;
                                m1e m1eVar = njhVar.d;
                                pyg pygVar = njhVar.h;
                                iip iipVar = njhVar.e;
                                xri xriVar = njhVar.g;
                                ctf0 ctf0Var = njhVar.i;
                                gii0 gii0Var = njhVar.j;
                                clc clcVar = njhVar.f;
                                vby vbyVar = njhVar.k;
                                xriVar.getClass();
                                pygVar.getClass();
                                iipVar.getClass();
                                oeg0Var.getClass();
                                vbyVar.getClass();
                                m1eVar.getClass();
                                gii0Var.getClass();
                                ctf0Var.getClass();
                                return new xei(cadVar, clcVar, pygVar, oeg0Var, g2vVar, m1eVar, cyberTournamentBracketParams, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(njh.class, "Cannot create dependency "));
                        return null;
                }
            }
        });
        this.P1 = new khf0("TOURNAMENT_BRACKET_FEED_ID");
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = new fiu0(Collections.singletonMap(lmh.class, ((xei) this.O1.getValue()).i));
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1034756392, true, new yfg(this, (byte) 4)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getS1() {
        return false;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
