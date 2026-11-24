package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class es60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8315a;
    public final /* synthetic */ gs60 b;

    public /* synthetic */ es60(gs60 gs60Var, byte b) {
        this.f8315a = b;
        this.b = gs60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8315a;
        gs60 gs60Var = this.b;
        switch (b) {
            case 0:
                uuz uuzVar = gs60.R1;
                ComponentCallbacks2 application = gs60Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(i52.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof i52)) {
                        ze3Var = null;
                    }
                    i52 i52Var = (i52) ze3Var;
                    if (i52Var != null) {
                        i1w0 i1w0VarF = a4n0.f(gs60Var);
                        Bundle bundle = gs60Var.g;
                        i1w0VarF.getClass();
                        wsf0 wsf0Var = i52Var.l;
                        iw20 iw20Var = i52Var.n;
                        peg0 peg0Var = i52Var.m;
                        cad cadVar = i52Var.k;
                        gst0 gst0Var = i52Var.f14172a;
                        btt0 btt0Var = i52Var.b;
                        duj dujVar = i52Var.c;
                        m1e m1eVar = i52Var.d;
                        bw60 bw60Var = i52Var.v;
                        l570 l570Var = i52Var.I;
                        v88 v88Var = i52Var.e;
                        g2v g2vVar = i52Var.f;
                        oeg0 oeg0Var = i52Var.g;
                        ctf0 ctf0Var = i52Var.h;
                        r9u r9uVar = i52Var.s;
                        ii iiVar = i52Var.i;
                        wdk0 wdk0Var = i52Var.j;
                        j1q0 j1q0Var = i52Var.J;
                        jtj jtjVar = i52Var.o;
                        ali aliVar = i52Var.p;
                        hs60 hs60Var = i52Var.q;
                        ih5 ih5Var = i52Var.r;
                        kyg0 kyg0Var = i52Var.H;
                        hnu hnuVar = i52Var.t;
                        b8u b8uVar = i52Var.u;
                        s31 s31Var = i52Var.w;
                        lqc lqcVar = i52Var.x;
                        nr nrVar = i52Var.y;
                        yuu yuuVar = i52Var.z;
                        x4u x4uVar = i52Var.A;
                        lqc lqcVar2 = i52Var.B;
                        gw60 gw60Var = i52Var.C;
                        l7k l7kVar = i52Var.D;
                        cyu cyuVar = i52Var.E;
                        cmt cmtVar = i52Var.F;
                        foi0 foi0Var = i52Var.G;
                        ouu ouuVar = i52Var.K;
                        bw60Var.getClass();
                        j1q0Var.getClass();
                        gst0Var.getClass();
                        btt0Var.getClass();
                        m1eVar.getClass();
                        oeg0Var.getClass();
                        r9uVar.getClass();
                        ctf0Var.getClass();
                        iiVar.getClass();
                        wdk0Var.getClass();
                        return new z7i(wsf0Var, peg0Var, iw20Var, bw60Var, cadVar, bundle, i1w0VarF, gst0Var, dujVar, m1eVar, v88Var, g2vVar, oeg0Var, ctf0Var, jtjVar, aliVar, hs60Var, ih5Var, l570Var, hnuVar, b8uVar, s31Var, lqcVar, kyg0Var, nrVar, yuuVar, x4uVar, lqcVar2, gw60Var, l7kVar, cyuVar, foi0Var, ouuVar, cmtVar);
                    }
                }
                jf4.n(b1j.i(i52.class, "Cannot create dependency "));
                return null;
            case 1:
                uuz uuzVar2 = gs60.R1;
                return qxw.y(gs60Var);
            case 2:
                uuz uuzVar3 = gs60.R1;
                fiu0 fiu0Var = gs60Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                uuz uuzVar4 = gs60.R1;
                androidx.fragment.app.e eVarF = gs60Var.F();
                String strN = gs60Var.K1.n(gs60Var, gs60.S1[0]);
                strN.getClass();
                o2t.c(eVarF, GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a, strN);
                gs60Var.G0().x(ip60.f15147a);
                return Unit.f46060a;
        }
    }
}
