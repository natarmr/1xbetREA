package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ufc.api.game.UfcGameParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/mcs;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mcs extends yx5 implements drs, ers {
    public final e9o0 K1;
    public rhi L1;
    public sek M1;
    public bek N1;
    public xhi O1;
    public wdk0 P1;
    public xi70 Q1;
    public xex R1;
    public final usd S1;
    public final boolean U1;
    public final boolean V1;
    public final a8z W1;
    public final s0r X1;
    public final khf0 Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(mcs.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(mcs.class, "screenParams", "getScreenParams()Lorg/xplatform/ufc/api/game/UfcGameParams;", 0)};
    public static final bek Z1 = new bek();

    public mcs() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.S1 = new usd();
        this.U1 = true;
        this.V1 = true;
        this.W1 = xbc.a0(this, sre0.f32672a.b(c0t.class), null, new jcs(this, (byte) 0), 14);
        this.X1 = ltt0.o(this, lcs.f19815a);
        this.Y1 = new khf0("params_key");
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getV1() {
        return this.V1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.S1.getClass();
        usd.d(this);
        wdk0 wdk0Var = this.P1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.U1);
        Object objN = this.X1.n(a2[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1451352913, true, new jar(this, (byte) 14)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = ocs.f25042a;
        long j = G0().f47170a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        UfcGameParams ufcGameParamsG0 = G0();
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f47170a, 189L, 0L, G0().e, k1g.OPEN_REGULAR, mcs.class.getSimpleName());
        LinkedHashMap linkedHashMap2 = ocs.f25042a;
        shi shiVar = (shi) linkedHashMap2.get(strO);
        if (shiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(ncs.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                ncs ncsVar = (ncs) (ze3Var instanceof ncs ? ze3Var : null);
                if (ncsVar != null) {
                    clc clcVar = ncsVar.f23308a;
                    cad cadVar = ncsVar.b;
                    ok50 ok50Var = ncsVar.c;
                    xhi xhiVarR = ncsVar.d.r(yprVar);
                    ivn ivnVar = ncsVar.e;
                    xri xriVar = ncsVar.f;
                    iip iipVar = ncsVar.g;
                    a1d a1dVar = ncsVar.h;
                    rmd0 rmd0Var = ncsVar.i;
                    sue sueVar = ncsVar.j;
                    oeg0 oeg0Var = ncsVar.k;
                    gii0 gii0Var = ncsVar.l;
                    pru pruVar = ncsVar.m;
                    lbu lbuVar = ncsVar.n;
                    m1e m1eVar = ncsVar.o;
                    g2v g2vVar = ncsVar.p;
                    knf0 knf0Var = ncsVar.q;
                    wdk0 wdk0Var = ncsVar.r;
                    ctf0 ctf0Var = ncsVar.s;
                    dwu dwuVar = ncsVar.t;
                    r9u r9uVar = ncsVar.u;
                    xriVar.getClass();
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
                    shi shiVar2 = new shi(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, iipVar, a1dVar, rmd0Var, oeg0Var, gii0Var, ufcGameParamsG0, strO, pruVar, lbuVar, m1eVar, g2vVar, knf0Var, wdk0Var, ctf0Var, dwuVar, r9uVar);
                    linkedHashMap2.put(strO, shiVar2);
                    shiVar = shiVar2;
                }
            }
            jf4.n(b1j.i(ncs.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (rhi) shiVar.x.get();
        this.M1 = new sek();
        this.N1 = new bek();
        this.O1 = shiVar.d;
        this.P1 = shiVar.u;
        this.Q1 = shiVar.h.f();
        this.R1 = ((kud) shiVar.t.f25390a).a();
    }

    public final UfcGameParams G0() {
        return (UfcGameParams) this.Y1.n(this, a2[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.W1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f47170a;
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
    public final boolean getU1() {
        return this.U1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
