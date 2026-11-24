package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.api.EsportsUniversalScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/i5o;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/pek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i5o extends yx5 implements drs, ers {
    public final e9o0 K1;
    public bgi L1;
    public sek M1;
    public xhi N1;
    public wdk0 O1;
    public bek P1;
    public xi70 Q1;
    public xex R1;
    public final boolean S1;
    public final boolean U1;
    public final khf0 V1;
    public final usd W1;
    public final s0r X1;
    public final a8z Y1;
    public static final /* synthetic */ iiy[] a2 = {new ez40(i5o.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;", 0), new j0d0(i5o.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final pek Z1 = new pek();

    public i5o() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.S1 = true;
        this.U1 = true;
        this.V1 = new khf0("params_key");
        this.W1 = new usd();
        this.X1 = ltt0.o(this, h5o.f12490a);
        this.Y1 = xbc.a0(this, sre0.f32672a.b(b7o.class), null, new ntl(this, (byte) 16), 14);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getU1() {
        return this.U1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.W1.getClass();
        usd.d(this);
        wdk0 wdk0Var = this.O1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.S1);
        Object objN = this.X1.n(a2[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1630738795, true, new f5o(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = k5o.f17730a;
        long j = G0().f46523a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        EsportsUniversalScreenParams esportsUniversalScreenParamsG0 = G0();
        Object obj = G0().d == 40 ? CyberGamesPage.Real.INSTANCE : CyberGamesPage.Virtual.INSTANCE;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f46523a, G0().d, G0().e, G0().j, G0().l, i5o.class.getSimpleName());
        obj.getClass();
        LinkedHashMap linkedHashMap2 = k5o.f17730a;
        cgi cgiVar = (cgi) linkedHashMap2.get(strO);
        if (cgiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(j5o.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                j5o j5oVar = (j5o) (ze3Var instanceof j5o ? ze3Var : null);
                if (j5oVar != null) {
                    clc clcVar = j5oVar.f15941a;
                    cad cadVar = j5oVar.b;
                    ok50 ok50Var = j5oVar.c;
                    xhi xhiVarR = j5oVar.d.r(yprVar);
                    iip iipVar = j5oVar.e;
                    oeg0 oeg0Var = j5oVar.f;
                    knf0 knf0Var = j5oVar.g;
                    gii0 gii0Var = j5oVar.h;
                    ivn ivnVar = j5oVar.i;
                    pyg pygVar = j5oVar.j;
                    xri xriVar = j5oVar.k;
                    pru pruVar = j5oVar.l;
                    o2j0 o2j0Var = j5oVar.t;
                    lbu lbuVar = j5oVar.m;
                    a1d a1dVar = j5oVar.n;
                    m1e m1eVar = j5oVar.o;
                    g2v g2vVar = j5oVar.p;
                    rmd0 rmd0Var = j5oVar.q;
                    wdk0 wdk0Var = j5oVar.r;
                    ctf0 ctf0Var = j5oVar.s;
                    ugf0 ugf0Var = j5oVar.u;
                    j1q0 j1q0Var = j5oVar.v;
                    r9u r9uVar = j5oVar.w;
                    h3c h3cVar = j5oVar.x;
                    qv2 qv2Var = j5oVar.y;
                    poq0 poq0Var = j5oVar.z;
                    sjl0 sjl0Var = j5oVar.A;
                    sue sueVar = j5oVar.B;
                    ii iiVar = j5oVar.C;
                    pygVar.getClass();
                    xriVar.getClass();
                    iipVar.getClass();
                    o2j0Var.getClass();
                    rmd0Var.getClass();
                    sueVar.getClass();
                    oeg0Var.getClass();
                    knf0Var.getClass();
                    gii0Var.getClass();
                    m1eVar.getClass();
                    wdk0Var.getClass();
                    ctf0Var.getClass();
                    j1q0Var.getClass();
                    r9uVar.getClass();
                    sjl0Var.getClass();
                    iiVar.getClass();
                    cgi cgiVar2 = new cgi(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, pygVar, xriVar, a1dVar, iipVar, rmd0Var, ugf0Var, poq0Var, oeg0Var, knf0Var, esportsUniversalScreenParamsG0, gii0Var, strO, pruVar, lbuVar, m1eVar, g2vVar, wdk0Var, ctf0Var, r9uVar, h3cVar, qv2Var, sjl0Var);
                    linkedHashMap2.put(strO, cgiVar2);
                    cgiVar = cgiVar2;
                }
            }
            jf4.n(b1j.i(j5o.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (bgi) cgiVar.D.get();
        this.M1 = new sek();
        this.N1 = cgiVar.g;
        this.O1 = cgiVar.z;
        this.P1 = new bek();
        this.Q1 = cgiVar.l.f();
        this.R1 = ((kud) cgiVar.y.f25390a).a();
    }

    public final EsportsUniversalScreenParams G0() {
        return (EsportsUniversalScreenParams) this.V1.n(this, a2[0]);
    }

    public final k3t0 H0() {
        return (k3t0) this.Y1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f46523a;
    }

    @Override // a.drs
    public final xhi q() {
        xhi xhiVar = this.N1;
        if (xhiVar != null) {
            return xhiVar;
        }
        Intrinsics.h("gameScreenFeature");
        throw null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.S1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
