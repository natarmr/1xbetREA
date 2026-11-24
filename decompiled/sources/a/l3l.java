package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/l3l;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l3l extends yx5 implements drs, ers {
    public final e9o0 K1;
    public sfi L1;
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
    public final amw a2;
    public static final /* synthetic */ iiy[] c2 = {new j0d0(l3l.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(l3l.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;", 0)};
    public static final nek b2 = new nek();

    public l3l() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.U1 = new usd();
        this.V1 = true;
        this.W1 = true;
        this.X1 = xbc.a0(this, sre0.f32672a.b(ebl.class), null, new ucj(this, (byte) 17), 14);
        this.Y1 = ltt0.o(this, k3l.f17624a);
        this.Z1 = new khf0("params_key");
        this.a2 = new amw();
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
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1692179252, true, new i3l(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = n3l.f22856a;
        long j = G0().f46514a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        CyberGameDotaScreenParams cyberGameDotaScreenParamsG0 = G0();
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f46514a, G0().e, G0().d, G0().h, G0().j, l3l.class.getSimpleName());
        real.getClass();
        LinkedHashMap linkedHashMap2 = n3l.f22856a;
        tfi tfiVar = (tfi) linkedHashMap2.get(strO);
        if (tfiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(m3l.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                m3l m3lVar = (m3l) (ze3Var instanceof m3l ? ze3Var : null);
                if (m3lVar != null) {
                    clc clcVar = m3lVar.f21121a;
                    cad cadVar = m3lVar.b;
                    xhi xhiVarR = m3lVar.d.r(yprVar);
                    iip iipVar = m3lVar.g;
                    o2j0 o2j0Var = m3lVar.m;
                    oeg0 oeg0Var = m3lVar.h;
                    gii0 gii0Var = m3lVar.i;
                    ok50 ok50Var = m3lVar.c;
                    ivn ivnVar = m3lVar.e;
                    xri xriVar = m3lVar.f;
                    pyg pygVar = m3lVar.j;
                    pru pruVar = m3lVar.k;
                    lbu lbuVar = m3lVar.l;
                    a1d a1dVar = m3lVar.n;
                    m1e m1eVar = m3lVar.o;
                    g2v g2vVar = m3lVar.p;
                    knf0 knf0Var = m3lVar.q;
                    rmd0 rmd0Var = m3lVar.r;
                    wdk0 wdk0Var = m3lVar.s;
                    roi0 roi0Var = m3lVar.t;
                    dwu dwuVar = m3lVar.u;
                    rrc rrcVar = m3lVar.v;
                    ctf0 ctf0Var = m3lVar.w;
                    ugf0 ugf0Var = m3lVar.x;
                    poq0 poq0Var = m3lVar.y;
                    r9u r9uVar = m3lVar.z;
                    h3c h3cVar = m3lVar.A;
                    qv2 qv2Var = m3lVar.B;
                    sue sueVar = m3lVar.C;
                    ii iiVar = m3lVar.D;
                    qgh qghVar = m3lVar.E;
                    xriVar.getClass();
                    pygVar.getClass();
                    iipVar.getClass();
                    o2j0Var.getClass();
                    rmd0Var.getClass();
                    oeg0Var.getClass();
                    gii0Var.getClass();
                    m1eVar.getClass();
                    knf0Var.getClass();
                    wdk0Var.getClass();
                    ctf0Var.getClass();
                    sueVar.getClass();
                    r9uVar.getClass();
                    iiVar.getClass();
                    tfi tfiVar2 = new tfi(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, pygVar, a1dVar, iipVar, rmd0Var, roi0Var, rrcVar, ugf0Var, poq0Var, cyberGameDotaScreenParamsG0, oeg0Var, strO, pruVar, lbuVar, m1eVar, g2vVar, wdk0Var, dwuVar, ctf0Var, r9uVar, h3cVar, qv2Var, qghVar);
                    linkedHashMap2.put(strO, tfiVar2);
                    tfiVar = tfiVar2;
                }
            }
            jf4.n(b1j.i(m3l.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (sfi) tfiVar.B.get();
        this.M1 = new sek();
        this.N1 = new bek();
        this.O1 = tfiVar.d;
        this.P1 = tfiVar.A;
        this.Q1 = tfiVar.n;
        this.R1 = tfiVar.f.f();
        this.S1 = ((kud) tfiVar.z.f25390a).a();
    }

    public final CyberGameDotaScreenParams G0() {
        return (CyberGameDotaScreenParams) this.Z1.n(this, c2[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f46514a;
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
