package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/uud0;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uud0 extends yx5 implements drs, ers {
    public final e9o0 K1;
    public xqi L1;
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
    public static final /* synthetic */ iiy[] c2 = {new j0d0(uud0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(uud0.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;", 0)};
    public static final mi70 b2 = new mi70();

    public uud0() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.U1 = new usd();
        this.V1 = true;
        this.W1 = true;
        this.X1 = xbc.a0(this, sre0.f32672a.b(d1e0.class), null, new p7d0(this, (byte) 10), 14);
        this.Y1 = ltt0.o(this, tud0.f34545a);
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
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1626648244, true, new nrc0(this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = avd0.f1520a;
        long j = G0().f46520a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        RainbowGameScreenParams rainbowGameScreenParamsG0 = G0();
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f46520a, G0().e, G0().d, G0().h, G0().j, uud0.class.getSimpleName());
        real.getClass();
        LinkedHashMap linkedHashMap2 = avd0.f1520a;
        yqi yqiVar = (yqi) linkedHashMap2.get(strO);
        if (yqiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(wah.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                wah wahVar = (wah) (ze3Var instanceof wah ? ze3Var : null);
                if (wahVar != null) {
                    clc clcVar = wahVar.f38825a;
                    cad cadVar = wahVar.b;
                    ok50 ok50Var = wahVar.c;
                    xhi xhiVarR = wahVar.d.r(yprVar);
                    iip iipVar = wahVar.g;
                    oeg0 oeg0Var = wahVar.h;
                    gii0 gii0Var = wahVar.i;
                    xri xriVar = wahVar.f;
                    ivn ivnVar = wahVar.e;
                    pyg pygVar = wahVar.j;
                    pru pruVar = wahVar.k;
                    lbu lbuVar = wahVar.l;
                    a1d a1dVar = wahVar.m;
                    m1e m1eVar = wahVar.n;
                    g2v g2vVar = wahVar.o;
                    knf0 knf0Var = wahVar.p;
                    rmd0 rmd0Var = wahVar.q;
                    wdk0 wdk0Var = wahVar.r;
                    j1q0 j1q0Var = wahVar.s;
                    ctf0 ctf0Var = wahVar.t;
                    dwu dwuVar = wahVar.u;
                    ugf0 ugf0Var = wahVar.v;
                    roi0 roi0Var = wahVar.w;
                    poq0 poq0Var = wahVar.x;
                    r9u r9uVar = wahVar.y;
                    h3c h3cVar = wahVar.z;
                    qv2 qv2Var = wahVar.A;
                    sue sueVar = wahVar.B;
                    ii iiVar = wahVar.C;
                    qgh qghVar = wahVar.D;
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
                    r9uVar.getClass();
                    iiVar.getClass();
                    yqi yqiVar2 = new yqi(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, pygVar, a1dVar, iipVar, rmd0Var, ugf0Var, roi0Var, poq0Var, oeg0Var, rainbowGameScreenParamsG0, gii0Var, strO, pruVar, lbuVar, m1eVar, g2vVar, wdk0Var, ctf0Var, dwuVar, r9uVar, h3cVar, qv2Var, qghVar);
                    linkedHashMap2.put(strO, yqiVar2);
                    yqiVar = yqiVar2;
                }
            }
            jf4.n(b1j.i(wah.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (xqi) yqiVar.C.get();
        this.M1 = new sek();
        this.N1 = new bek();
        this.O1 = yqiVar.d;
        this.P1 = yqiVar.A;
        this.Q1 = yqiVar.o;
        this.R1 = yqiVar.g.f();
        this.S1 = ((kud) yqiVar.z.f25390a).a();
    }

    public final RainbowGameScreenParams G0() {
        return (RainbowGameScreenParams) this.Z1.n(this, c2[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f46520a;
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
