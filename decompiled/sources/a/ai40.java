package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/ai40;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ai40 extends yx5 implements drs, ers {
    public final e9o0 K1;
    public tli L1;
    public sek M1;
    public bek N1;
    public xhi O1;
    public wdk0 P1;
    public poq0 Q1;
    public xi70 R1;
    public xex S1;
    public final usd U1;
    public final boolean V1;
    public final boolean W1;
    public final a8z X1;
    public final s0r Y1;
    public final qdz Z1;
    public final khf0 a2;
    public static final /* synthetic */ iiy[] c2 = {new j0d0(ai40.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ai40.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;", 0)};
    public static final atz b2 = new atz();

    public ai40() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.U1 = new usd();
        this.V1 = true;
        this.W1 = true;
        this.X1 = xbc.a0(this, sre0.f32672a.b(nl40.class), null, new np30(this, (byte) 7), 14);
        this.Y1 = ltt0.o(this, zh40.f44376a);
        this.Z1 = new qdz();
        this.a2 = new khf0("params_key");
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getW1() {
        return this.W1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.U1.getClass();
        usd.d(this);
        wdk0 wdk0Var = this.P1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.V1);
        Object objN = this.Y1.n(c2[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(895253369, true, new b120(this, (byte) 29)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = bi40.f2641a;
        long j = G0().f46517a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        MlbbGameScreenParams mlbbGameScreenParamsG0 = G0();
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f46517a, G0().e, G0().d, G0().i, G0().k, ai40.class.getSimpleName());
        real.getClass();
        LinkedHashMap linkedHashMap2 = bi40.f2641a;
        uli uliVar = (uli) linkedHashMap2.get(strO);
        if (uliVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(b9h.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                b9h b9hVar = (b9h) (ze3Var instanceof b9h ? ze3Var : null);
                if (b9hVar != null) {
                    clc clcVar = b9hVar.f2208a;
                    cad cadVar = b9hVar.b;
                    ok50 ok50Var = b9hVar.c;
                    xhi xhiVarR = b9hVar.d.r(yprVar);
                    xri xriVar = b9hVar.f;
                    ivn ivnVar = b9hVar.e;
                    pyg pygVar = b9hVar.j;
                    a1d a1dVar = b9hVar.m;
                    iip iipVar = b9hVar.g;
                    rmd0 rmd0Var = b9hVar.q;
                    ugf0 ugf0Var = b9hVar.u;
                    poq0 poq0Var = b9hVar.v;
                    sue sueVar = b9hVar.A;
                    oeg0 oeg0Var = b9hVar.h;
                    gii0 gii0Var = b9hVar.i;
                    pru pruVar = b9hVar.k;
                    lbu lbuVar = b9hVar.l;
                    m1e m1eVar = b9hVar.n;
                    g2v g2vVar = b9hVar.o;
                    knf0 knf0Var = b9hVar.p;
                    j1q0 j1q0Var = b9hVar.s;
                    wdk0 wdk0Var = b9hVar.r;
                    ctf0 ctf0Var = b9hVar.t;
                    wyu wyuVar = b9hVar.w;
                    r9u r9uVar = b9hVar.x;
                    h3c h3cVar = b9hVar.y;
                    qv2 qv2Var = b9hVar.z;
                    ii iiVar = b9hVar.B;
                    dwu dwuVar = b9hVar.C;
                    xriVar.getClass();
                    pygVar.getClass();
                    iipVar.getClass();
                    rmd0Var.getClass();
                    sueVar.getClass();
                    oeg0Var.getClass();
                    gii0Var.getClass();
                    m1eVar.getClass();
                    knf0Var.getClass();
                    j1q0Var.getClass();
                    wdk0Var.getClass();
                    ctf0Var.getClass();
                    wyuVar.getClass();
                    r9uVar.getClass();
                    iiVar.getClass();
                    uli uliVar2 = new uli(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, pygVar, a1dVar, iipVar, rmd0Var, ugf0Var, poq0Var, oeg0Var, mlbbGameScreenParamsG0, strO, pruVar, lbuVar, m1eVar, g2vVar, wdk0Var, ctf0Var, wyuVar, r9uVar, h3cVar, qv2Var, dwuVar);
                    linkedHashMap2.put(strO, uliVar2);
                    uliVar = uliVar2;
                }
            }
            jf4.n(b1j.i(b9h.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (tli) uliVar.z.get();
        this.M1 = new sek();
        this.N1 = new bek();
        this.O1 = uliVar.d;
        this.P1 = uliVar.y;
        this.Q1 = uliVar.n;
        this.R1 = uliVar.f.f();
        this.S1 = ((kud) uliVar.x.f25390a).a();
    }

    public final MlbbGameScreenParams G0() {
        return (MlbbGameScreenParams) this.a2.n(this, c2[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f46517a;
    }

    @Override // a.drs
    public final xhi q() {
        xhi xhiVar = this.O1;
        if (xhiVar != null) {
            return xhiVar;
        }
        Intrinsics.h("gameScreenFeature");
        throw null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.V1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
