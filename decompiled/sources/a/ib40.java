package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.meta_heroes.presentation.MetaHeroesParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ib40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14470a;
    public final /* synthetic */ lb40 b;

    public /* synthetic */ ib40(lb40 lb40Var, byte b) {
        this.f14470a = b;
        this.b = lb40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14470a;
        lb40 lb40Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = lb40.P1;
                ComponentCallbacks2 application = lb40Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(mb40.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof mb40)) {
                        ze3Var = null;
                    }
                    mb40 mb40Var = (mb40) ze3Var;
                    if (mb40Var != null) {
                        i1w0 i1w0VarF = a4n0.f(lb40Var);
                        MetaHeroesParams metaHeroesParams = (MetaHeroesParams) lb40Var.O1.n(lb40Var, lb40.Q1[0]);
                        i1w0VarF.getClass();
                        cad cadVar = mb40Var.f21490a;
                        xri xriVar = mb40Var.b;
                        pyg pygVar = mb40Var.c;
                        ctf0 ctf0Var = mb40Var.d;
                        m1e m1eVar = mb40Var.e;
                        g2v g2vVar = mb40Var.f;
                        wdk0 wdk0Var = mb40Var.g;
                        rou rouVar = mb40Var.h;
                        uzc uzcVar = mb40Var.i;
                        qv2 qv2Var = mb40Var.j;
                        gii0 gii0Var = mb40Var.k;
                        knf0 knf0Var = mb40Var.l;
                        x0u x0uVar = mb40Var.m;
                        kuy kuyVar = mb40Var.n;
                        r9u r9uVar = mb40Var.o;
                        gst0 gst0Var = mb40Var.p;
                        xriVar.getClass();
                        pygVar.getClass();
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        uzcVar.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        kuyVar.getClass();
                        r9uVar.getClass();
                        gst0Var.getClass();
                        return new sli(cadVar, pygVar, ctf0Var, m1eVar, g2vVar, wdk0Var, rouVar, uzcVar, qv2Var, i1w0VarF, gii0Var, knf0Var, x0uVar, metaHeroesParams, r9uVar, gst0Var);
                    }
                }
                jf4.n(b1j.i(mb40.class, "Cannot create dependency "));
                return null;
            case 1:
                htz htzVar2 = lb40.P1;
                fiu0 fiu0Var = lb40Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                htz htzVar3 = lb40.P1;
                lb40Var.G0().x(ta40.f33597a);
                return Unit.f46060a;
            default:
                htz htzVar4 = lb40.P1;
                lb40Var.G0().x(sa40.f31875a);
                return Unit.f46060a;
        }
    }
}
