package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i3o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14107a;
    public final /* synthetic */ k3o b;

    public /* synthetic */ i3o(k3o k3oVar, byte b) {
        this.f14107a = b;
        this.b = k3oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14107a;
        k3o k3oVar = this.b;
        switch (b) {
            case 0:
                zfi zfiVar = k3oVar.K1;
                if (zfiVar != null) {
                    return new q0h0(zfiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nek nekVar = k3o.R1;
                ComponentCallbacks2 application = k3oVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(l3o.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof l3o)) {
                        ze3Var = null;
                    }
                    l3o l3oVar = (l3o) ze3Var;
                    if (l3oVar != null) {
                        EsportsGamesScreenParams esportsGamesScreenParams = (EsportsGamesScreenParams) k3oVar.P1.n(k3oVar, k3o.S1[0]);
                        cad cadVar = l3oVar.h;
                        pyg pygVar = l3oVar.b;
                        itr itrVar = l3oVar.d;
                        lsn lsnVar = l3oVar.e;
                        vqc vqcVar = l3oVar.f;
                        ugf0 ugf0Var = l3oVar.f19367a;
                        iip iipVar = l3oVar.c;
                        epi0 epi0Var = l3oVar.g;
                        oeg0 oeg0Var = l3oVar.i;
                        s31 s31Var = l3oVar.j;
                        ctf0 ctf0Var = l3oVar.k;
                        y78 y78Var = l3oVar.l;
                        lbu lbuVar = l3oVar.m;
                        pru pruVar = l3oVar.n;
                        m1e m1eVar = l3oVar.o;
                        g2v g2vVar = l3oVar.p;
                        gii0 gii0Var = l3oVar.q;
                        knf0 knf0Var = l3oVar.r;
                        cyu cyuVar = l3oVar.s;
                        sjl0 sjl0Var = l3oVar.t;
                        btt0 btt0Var = l3oVar.u;
                        gst0 gst0Var = l3oVar.v;
                        wdk0 wdk0Var = l3oVar.x;
                        b3c0 b3c0Var = l3oVar.w;
                        rtu rtuVar = l3oVar.y;
                        vqc vqcVar2 = l3oVar.z;
                        sb6 sb6Var = l3oVar.A;
                        pygVar.getClass();
                        itrVar.getClass();
                        iipVar.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        sjl0Var.getClass();
                        btt0Var.getClass();
                        gst0Var.getClass();
                        b3c0Var.getClass();
                        wdk0Var.getClass();
                        return new agi(cadVar, ugf0Var, pygVar, itrVar, lsnVar, iipVar, vqcVar, epi0Var, esportsGamesScreenParams, s31Var, ctf0Var, y78Var, lbuVar, pruVar, m1eVar, g2vVar, cyuVar, gst0Var, wdk0Var, vqcVar2, rtuVar, sb6Var);
                    }
                }
                jf4.n(b1j.i(l3o.class, "Cannot create dependency "));
                return null;
            case 2:
                nek nekVar2 = k3o.R1;
                k3oVar.G0().x(v2o.f36695a);
                return Unit.f46060a;
            case 3:
                nek nekVar3 = k3o.R1;
                k3oVar.G0().x(q2o.f28010a);
                return Unit.f46060a;
            default:
                nek nekVar4 = k3o.R1;
                k3oVar.G0().x(p2o.f26260a);
                return Unit.f46060a;
        }
    }
}
