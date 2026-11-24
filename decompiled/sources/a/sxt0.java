package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/sxt0;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/svs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sxt0 extends yx5 implements drs, ers {
    public final e9o0 K1;
    public pyi L1;
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
    public final khf0 Z1;
    public final qdz a2;
    public static final /* synthetic */ iiy[] c2 = {new j0d0(sxt0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(sxt0.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;", 0)};
    public static final svs0 b2 = new svs0((byte) 6);

    public sxt0() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.U1 = new usd();
        this.V1 = true;
        this.W1 = true;
        this.X1 = xbc.a0(this, sre0.f32672a.b(f2u0.class), null, new rbt0(this, (byte) 4), 14);
        this.Y1 = ltt0.o(this, qxt0.f29505a);
        this.Z1 = new khf0("params_key");
        this.a2 = new qdz();
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
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1966853127, true, new ggt0(this, (byte) 2)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = uxt0.f36459a;
        long j = G0().f46542a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        ValorantGameScreenParams valorantGameScreenParamsG0 = G0();
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f46542a, G0().e, G0().c, G0().h, G0().j, sxt0.class.getSimpleName());
        real.getClass();
        LinkedHashMap linkedHashMap2 = uxt0.f36459a;
        qyi qyiVar = (qyi) linkedHashMap2.get(strO);
        if (qyiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(txt0.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                txt0 txt0Var = (txt0) (ze3Var instanceof txt0 ? ze3Var : null);
                if (txt0Var != null) {
                    clc clcVar = txt0Var.f34719a;
                    cad cadVar = txt0Var.b;
                    ok50 ok50Var = txt0Var.c;
                    xhi xhiVarR = txt0Var.d.r(yprVar);
                    iip iipVar = txt0Var.g;
                    oeg0 oeg0Var = txt0Var.h;
                    gii0 gii0Var = txt0Var.i;
                    xri xriVar = txt0Var.f;
                    ivn ivnVar = txt0Var.e;
                    pyg pygVar = txt0Var.j;
                    pru pruVar = txt0Var.k;
                    lbu lbuVar = txt0Var.l;
                    a1d a1dVar = txt0Var.m;
                    m1e m1eVar = txt0Var.n;
                    g2v g2vVar = txt0Var.o;
                    knf0 knf0Var = txt0Var.p;
                    rmd0 rmd0Var = txt0Var.q;
                    wdk0 wdk0Var = txt0Var.r;
                    ctf0 ctf0Var = txt0Var.s;
                    dwu dwuVar = txt0Var.t;
                    ugf0 ugf0Var = txt0Var.u;
                    roi0 roi0Var = txt0Var.v;
                    poq0 poq0Var = txt0Var.w;
                    r9u r9uVar = txt0Var.x;
                    h3c h3cVar = txt0Var.y;
                    qv2 qv2Var = txt0Var.z;
                    sue sueVar = txt0Var.A;
                    ii iiVar = txt0Var.B;
                    qgh qghVar = txt0Var.C;
                    xriVar.getClass();
                    pygVar.getClass();
                    iipVar.getClass();
                    rmd0Var.getClass();
                    sueVar.getClass();
                    oeg0Var.getClass();
                    gii0Var.getClass();
                    m1eVar.getClass();
                    knf0Var.getClass();
                    wdk0Var.getClass();
                    ctf0Var.getClass();
                    r9uVar.getClass();
                    iiVar.getClass();
                    qyi qyiVar2 = new qyi(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, pygVar, a1dVar, iipVar, rmd0Var, ugf0Var, roi0Var, poq0Var, oeg0Var, valorantGameScreenParamsG0, strO, pruVar, lbuVar, m1eVar, g2vVar, wdk0Var, ctf0Var, dwuVar, r9uVar, h3cVar, qv2Var, qghVar);
                    linkedHashMap2.put(strO, qyiVar2);
                    qyiVar = qyiVar2;
                }
            }
            jf4.n(b1j.i(txt0.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (pyi) qyiVar.A.get();
        this.M1 = new sek();
        this.N1 = new bek();
        this.O1 = qyiVar.d;
        this.P1 = qyiVar.z;
        this.Q1 = qyiVar.n;
        this.R1 = qyiVar.f.f();
        this.S1 = ((kud) qyiVar.y.f25390a).a();
    }

    public final ValorantGameScreenParams G0() {
        return (ValorantGameScreenParams) this.Z1.n(this, c2[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f46542a;
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
    public final boolean getV1() {
        return this.V1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
