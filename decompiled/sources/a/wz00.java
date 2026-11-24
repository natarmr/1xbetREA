package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.lol.api.LolScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/wz00;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wz00 extends yx5 implements drs, ers {
    public final e9o0 K1;
    public lei L1;
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
    public static final /* synthetic */ iiy[] c2 = {new j0d0(wz00.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(wz00.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/lol/api/LolScreenParams;", 0)};
    public static final wsz b2 = new wsz();

    public wz00() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.U1 = new usd();
        this.V1 = true;
        this.W1 = true;
        this.X1 = xbc.a0(this, sre0.f32672a.b(u610.class), null, new rx00(this, (byte) 1), 14);
        this.Y1 = ltt0.o(this, vz00.f38276a);
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
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(2079575285, true, new g2z(this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = g3h.f10611a;
        long j = G0().f46516a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        LolScreenParams lolScreenParamsG0 = G0();
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f46516a, G0().e, G0().d, G0().h, G0().j, wz00.class.getSimpleName());
        real.getClass();
        LinkedHashMap linkedHashMap2 = g3h.f10611a;
        mei meiVar = (mei) linkedHashMap2.get(strO);
        if (meiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(f3h.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                f3h f3hVar = (f3h) (ze3Var instanceof f3h ? ze3Var : null);
                if (f3hVar != null) {
                    clc clcVar = f3hVar.f8863a;
                    cad cadVar = f3hVar.b;
                    ok50 ok50Var = f3hVar.c;
                    xhi xhiVarR = f3hVar.d.r(yprVar);
                    iip iipVar = f3hVar.g;
                    oeg0 oeg0Var = f3hVar.h;
                    gii0 gii0Var = f3hVar.i;
                    ivn ivnVar = f3hVar.e;
                    xri xriVar = f3hVar.f;
                    pyg pygVar = f3hVar.j;
                    pru pruVar = f3hVar.k;
                    lbu lbuVar = f3hVar.l;
                    a1d a1dVar = f3hVar.m;
                    m1e m1eVar = f3hVar.n;
                    g2v g2vVar = f3hVar.o;
                    knf0 knf0Var = f3hVar.p;
                    rmd0 rmd0Var = f3hVar.q;
                    wdk0 wdk0Var = f3hVar.r;
                    dwu dwuVar = f3hVar.s;
                    ctf0 ctf0Var = f3hVar.t;
                    ugf0 ugf0Var = f3hVar.u;
                    roi0 roi0Var = f3hVar.v;
                    poq0 poq0Var = f3hVar.w;
                    r9u r9uVar = f3hVar.x;
                    h3c h3cVar = f3hVar.y;
                    qv2 qv2Var = f3hVar.z;
                    sue sueVar = f3hVar.A;
                    ii iiVar = f3hVar.B;
                    qgh qghVar = f3hVar.C;
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
                    mei meiVar2 = new mei(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, pygVar, a1dVar, iipVar, rmd0Var, ugf0Var, roi0Var, poq0Var, oeg0Var, lolScreenParamsG0, strO, pruVar, lbuVar, m1eVar, g2vVar, wdk0Var, dwuVar, ctf0Var, r9uVar, h3cVar, qv2Var, qghVar);
                    linkedHashMap2.put(strO, meiVar2);
                    meiVar = meiVar2;
                }
            }
            jf4.n(b1j.i(f3h.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (lei) meiVar.A.get();
        this.M1 = new sek();
        this.N1 = new bek();
        this.O1 = meiVar.d;
        this.P1 = meiVar.z;
        this.Q1 = meiVar.n;
        this.R1 = meiVar.f.f();
        this.S1 = ((kud) meiVar.y.f25390a).a();
    }

    public final LolScreenParams G0() {
        return (LolScreenParams) this.Z1.n(this, c2[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f46516a;
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
