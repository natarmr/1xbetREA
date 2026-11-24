package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/alf;", "La/yx5;", "La/drs;", "", "La/ers;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class alf extends yx5 implements drs, ers {
    public final e9o0 K1;
    public rdi L1;
    public wdk0 M1;
    public sek N1;
    public bek O1;
    public xhi P1;
    public xi70 Q1;
    public poq0 R1;
    public xex S1;
    public final khf0 U1;
    public final usd V1;
    public final s0r W1;
    public final a8z X1;
    public final boolean Y1;
    public final boolean Z1;
    public static final /* synthetic */ iiy[] b2 = {new ez40(alf.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;", 0), new j0d0(alf.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kud a2 = new kud();

    public alf() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.U1 = new khf0("params_key");
        this.V1 = new usd();
        this.W1 = ltt0.o(this, zkf.f44528a);
        this.X1 = xbc.a0(this, sre0.f32672a.b(rnf.class), null, new jwd(this, (byte) 19), 14);
        this.Y1 = true;
        this.Z1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getZ1() {
        return this.Z1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.V1.getClass();
        usd.d(this);
        wdk0 wdk0Var = this.M1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.Y1);
        Object objN = this.W1.n(b2[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(549347002, true, new cnc(this, (byte) 23)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = clf.f4555a;
        long j = G0().f46511a;
        cb50 cb50VarV = efx.v(this);
        cb50VarV.getClass();
        String strO = dw9.o(j, cb50VarV.f4046a);
        Cs2GameScreenParams cs2GameScreenParamsG0 = G0();
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        ypr yprVar = new ypr(G0().f46511a, G0().e, G0().d, G0().h, G0().j, alf.class.getSimpleName());
        real.getClass();
        LinkedHashMap linkedHashMap2 = clf.f4555a;
        sdi sdiVar = (sdi) linkedHashMap2.get(strO);
        if (sdiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(blf.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                blf blfVar = (blf) (ze3Var instanceof blf ? ze3Var : null);
                if (blfVar != null) {
                    clc clcVar = blfVar.f2792a;
                    cad cadVar = blfVar.b;
                    ok50 ok50Var = blfVar.c;
                    xhi xhiVarR = blfVar.d.r(yprVar);
                    iip iipVar = blfVar.g;
                    oeg0 oeg0Var = blfVar.h;
                    gii0 gii0Var = blfVar.i;
                    xri xriVar = blfVar.f;
                    ivn ivnVar = blfVar.e;
                    pyg pygVar = blfVar.j;
                    pru pruVar = blfVar.k;
                    lbu lbuVar = blfVar.l;
                    a1d a1dVar = blfVar.m;
                    m1e m1eVar = blfVar.n;
                    g2v g2vVar = blfVar.o;
                    knf0 knf0Var = blfVar.p;
                    rmd0 rmd0Var = blfVar.q;
                    wdk0 wdk0Var = blfVar.r;
                    j1q0 j1q0Var = blfVar.s;
                    ctf0 ctf0Var = blfVar.t;
                    dwu dwuVar = blfVar.u;
                    ugf0 ugf0Var = blfVar.v;
                    roi0 roi0Var = blfVar.w;
                    poq0 poq0Var = blfVar.x;
                    r9u r9uVar = blfVar.y;
                    h3c h3cVar = blfVar.z;
                    qv2 qv2Var = blfVar.A;
                    sue sueVar = blfVar.B;
                    ii iiVar = blfVar.C;
                    qgh qghVar = blfVar.D;
                    xriVar.getClass();
                    pygVar.getClass();
                    iipVar.getClass();
                    rmd0Var.getClass();
                    sueVar.getClass();
                    iiVar.getClass();
                    oeg0Var.getClass();
                    gii0Var.getClass();
                    m1eVar.getClass();
                    knf0Var.getClass();
                    j1q0Var.getClass();
                    wdk0Var.getClass();
                    ctf0Var.getClass();
                    r9uVar.getClass();
                    sdi sdiVar2 = new sdi(clcVar, cadVar, ok50Var, xhiVarR, ivnVar, pygVar, a1dVar, iipVar, rmd0Var, ugf0Var, roi0Var, poq0Var, oeg0Var, cs2GameScreenParamsG0, gii0Var, strO, pruVar, lbuVar, m1eVar, g2vVar, knf0Var, wdk0Var, ctf0Var, dwuVar, r9uVar, h3cVar, qv2Var, qghVar);
                    linkedHashMap2.put(strO, sdiVar2);
                    sdiVar = sdiVar2;
                }
            }
            jf4.n(b1j.i(blf.class, "Cannot create dependency "));
            return;
        }
        this.L1 = (rdi) sdiVar.D.get();
        this.M1 = sdiVar.B;
        this.N1 = new sek();
        this.O1 = new bek();
        this.P1 = sdiVar.j;
        this.Q1 = sdiVar.k.f();
        this.R1 = sdiVar.p;
        this.S1 = ((kud) sdiVar.A.f25390a).a();
    }

    public final Cs2GameScreenParams G0() {
        return (Cs2GameScreenParams) this.U1.n(this, b2[0]);
    }

    public final k3t0 H0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // a.ers
    public final long a() {
        return G0().f46511a;
    }

    @Override // a.drs
    public final xhi q() {
        xhi xhiVar = this.P1;
        if (xhiVar != null) {
            return xhiVar;
        }
        Intrinsics.h("gameScreenFeature");
        throw null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getY1() {
        return this.Y1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
