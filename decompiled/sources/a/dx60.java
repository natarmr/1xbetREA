package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dx60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6833a;
    public final /* synthetic */ gx60 b;

    public /* synthetic */ dx60(gx60 gx60Var, byte b) {
        this.f6833a = b;
        this.b = gx60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6833a;
        gx60 gx60Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = gx60.R1;
                androidx.fragment.app.e eVarF = gx60Var.F();
                String strN = gx60Var.K1.n(gx60Var, gx60.S1[0]);
                strN.getClass();
                o2t.c(eVarF, GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a, strN);
                gx60Var.G0().x(nw60.f24220a);
                return Unit.f46060a;
            case 1:
                atz atzVar2 = gx60.R1;
                ComponentCallbacks2 application = gx60Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(o5t.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof o5t)) {
                        ze3Var = null;
                    }
                    o5t o5tVar = (o5t) ze3Var;
                    if (o5tVar != null) {
                        i1w0 i1w0VarF = a4n0.f(gx60Var);
                        i1w0VarF.getClass();
                        wsf0 wsf0Var = o5tVar.l;
                        iw20 iw20Var = o5tVar.n;
                        peg0 peg0Var = o5tVar.m;
                        cad cadVar = o5tVar.k;
                        gst0 gst0Var = o5tVar.f24705a;
                        ih5 ih5Var = o5tVar.x;
                        bn6 bn6Var = o5tVar.y;
                        s64 s64Var = o5tVar.z;
                        cmt cmtVar = o5tVar.A;
                        gg5 gg5Var = o5tVar.B;
                        btt0 btt0Var = o5tVar.b;
                        duj dujVar = o5tVar.c;
                        m1e m1eVar = o5tVar.d;
                        bw60 bw60Var = o5tVar.r;
                        v88 v88Var = o5tVar.e;
                        g2v g2vVar = o5tVar.f;
                        oeg0 oeg0Var = o5tVar.g;
                        ctf0 ctf0Var = o5tVar.h;
                        r9u r9uVar = o5tVar.q;
                        ii iiVar = o5tVar.i;
                        wdk0 wdk0Var = o5tVar.j;
                        j1q0 j1q0Var = o5tVar.C;
                        jqt jqtVar = o5tVar.t;
                        ali aliVar = o5tVar.o;
                        ih5 ih5Var2 = o5tVar.p;
                        yoc yocVar = o5tVar.u;
                        yoc yocVar2 = o5tVar.v;
                        l7k l7kVar = o5tVar.s;
                        foi0 foi0Var = o5tVar.w;
                        ouu ouuVar = o5tVar.D;
                        bzt bztVar = o5tVar.E;
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
                        return new bii(wsf0Var, peg0Var, iw20Var, bw60Var, cadVar, i1w0VarF, dujVar, m1eVar, ih5Var, bn6Var, s64Var, cmtVar, gg5Var, v88Var, g2vVar, oeg0Var, ctf0Var, aliVar, jqtVar, ih5Var2, yocVar, yocVar2, l7kVar, foi0Var, ouuVar, bztVar);
                    }
                }
                jf4.n(b1j.i(o5t.class, "Cannot create dependency "));
                return null;
            case 2:
                atz atzVar3 = gx60.R1;
                return qxw.y(gx60Var);
            case 3:
                atz atzVar4 = gx60.R1;
                fiu0 fiu0Var = gx60Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                atz atzVar5 = gx60.R1;
                gx60Var.G0().x(ww60.f39873a);
                return Unit.f46060a;
            default:
                atz atzVar6 = gx60.R1;
                gx60Var.G0().x(vw60.f38134a);
                return Unit.f46060a;
        }
    }
}
