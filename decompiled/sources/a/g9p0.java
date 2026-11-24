package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g9p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10927a;
    public final /* synthetic */ h9p0 b;

    public /* synthetic */ g9p0(h9p0 h9p0Var, byte b) {
        this.f10927a = b;
        this.b = h9p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10927a;
        h9p0 h9p0Var = this.b;
        switch (b) {
            case 0:
                y2m0 y2m0Var = h9p0.V1;
                fiu0 fiu0Var = h9p0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                y2m0 y2m0Var2 = h9p0.V1;
                ComponentCallbacks2 application = h9p0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(i9p0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof i9p0)) {
                        ze3Var = null;
                    }
                    i9p0 i9p0Var = (i9p0) ze3Var;
                    if (i9p0Var != null) {
                        TeamDetailsParams teamDetailsParams = (TeamDetailsParams) h9p0Var.U1.n(h9p0Var, h9p0.W1[0]);
                        i1w0 i1w0VarF = a4n0.f(h9p0Var);
                        i1w0VarF.getClass();
                        ctf0 ctf0Var = i9p0Var.f14398a;
                        wdk0 wdk0Var = i9p0Var.b;
                        poq0 poq0Var = i9p0Var.c;
                        pru pruVar = i9p0Var.d;
                        bzt bztVar = i9p0Var.e;
                        gii0 gii0Var = i9p0Var.f;
                        knf0 knf0Var = i9p0Var.g;
                        rtu rtuVar = i9p0Var.h;
                        lbu lbuVar = i9p0Var.i;
                        g2v g2vVar = i9p0Var.j;
                        y78 y78Var = i9p0Var.k;
                        wiu wiuVar = i9p0Var.l;
                        m1e m1eVar = i9p0Var.m;
                        cad cadVar = i9p0Var.n;
                        itr itrVar = i9p0Var.o;
                        pyg pygVar = i9p0Var.p;
                        iip iipVar = i9p0Var.q;
                        xri xriVar = i9p0Var.r;
                        vqc vqcVar = i9p0Var.s;
                        ugf0 ugf0Var = i9p0Var.t;
                        lsn lsnVar = i9p0Var.u;
                        rrc rrcVar = i9p0Var.v;
                        roi0 roi0Var = i9p0Var.w;
                        clc clcVar = i9p0Var.x;
                        epi0 epi0Var = i9p0Var.y;
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        m1eVar.getClass();
                        itrVar.getClass();
                        pygVar.getClass();
                        iipVar.getClass();
                        xriVar.getClass();
                        return new kwi(cadVar, itrVar, pygVar, iipVar, xriVar, vqcVar, ugf0Var, lsnVar, rrcVar, roi0Var, clcVar, epi0Var, teamDetailsParams, i1w0VarF, ctf0Var, wdk0Var, poq0Var, pruVar, bztVar, gii0Var, knf0Var, rtuVar, lbuVar, g2vVar, y78Var, wiuVar, m1eVar);
                    }
                }
                jf4.n(b1j.i(i9p0.class, "Cannot create dependency "));
                return null;
            case 2:
                y2m0 y2m0Var3 = h9p0.V1;
                h9p0Var.G0().x(w7p0.f38686a);
                return Unit.f46060a;
            default:
                y2m0 y2m0Var4 = h9p0.V1;
                h9p0Var.G0().x(v7p0.f36940a);
                return Unit.f46060a;
        }
    }
}
