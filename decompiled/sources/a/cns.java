package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.feed.notifictation.presentation.models.GameNotificationScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cns implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4671a;
    public final /* synthetic */ gns b;

    public /* synthetic */ cns(gns gnsVar, byte b) {
        this.f4671a = b;
        this.b = gnsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4671a;
        yms ymsVar = yms.f42906a;
        gns gnsVar = this.b;
        switch (b) {
            case 0:
                pek pekVar = gns.R1;
                gnsVar.G0().x(xms.f41144a);
                return Unit.f46060a;
            case 1:
                pek pekVar2 = gns.R1;
                gnsVar.G0().x(zms.f44641a);
                return Unit.f46060a;
            case 2:
                pek pekVar3 = gns.R1;
                ComponentCallbacks2 application = gnsVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(bns.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof bns)) {
                        ze3Var = null;
                    }
                    bns bnsVar = (bns) ze3Var;
                    if (bnsVar != null) {
                        i1w0 i1w0VarF = a4n0.f(gnsVar);
                        GameNotificationScreenParams gameNotificationScreenParams = (GameNotificationScreenParams) gnsVar.Q1.n(gnsVar, gns.S1[1]);
                        i1w0VarF.getClass();
                        m1e m1eVar = bnsVar.f2900a;
                        ii iiVar = bnsVar.b;
                        mne mneVar = bnsVar.c;
                        iip iipVar = bnsVar.d;
                        wdk0 wdk0Var = bnsVar.e;
                        hru hruVar = bnsVar.f;
                        rjo rjoVar = bnsVar.g;
                        wdd0 wdd0Var = bnsVar.h;
                        duj dujVar = bnsVar.i;
                        ctf0 ctf0Var = bnsVar.j;
                        gst0 gst0Var = bnsVar.k;
                        kt2 kt2Var = bnsVar.l;
                        bzt bztVar = bnsVar.m;
                        knf0 knf0Var = bnsVar.n;
                        peg0 peg0Var = bnsVar.o;
                        ix0 ix0Var = bnsVar.p;
                        sd60 sd60Var = bnsVar.q;
                        iipVar.getClass();
                        wdd0Var.getClass();
                        iiVar.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        gst0Var.getClass();
                        kt2Var.getClass();
                        knf0Var.getClass();
                        return new whi(mneVar, iipVar, wdd0Var, iiVar, i1w0VarF, gameNotificationScreenParams, m1eVar, wdk0Var, hruVar, rjoVar, dujVar, ctf0Var, gst0Var, kt2Var, bztVar, knf0Var, peg0Var, ix0Var, sd60Var);
                    }
                }
                jf4.n(b1j.i(bns.class, "Cannot create dependency "));
                return null;
            case 3:
                pek pekVar4 = gns.R1;
                return new q0h0((vhi) ((whi) gnsVar.M1.getValue()).t.get());
            case 4:
                pek pekVar5 = gns.R1;
                gnsVar.G0().x(tms.f34209a);
                return Unit.f46060a;
            case 5:
                pek pekVar6 = gns.R1;
                gnsVar.G0().x(ymsVar);
                return Unit.f46060a;
            case 6:
                pek pekVar7 = gns.R1;
                gnsVar.G0().x(wms.f39419a);
                ywq ywqVar = gnsVar.O1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 7:
                pek pekVar8 = gns.R1;
                gnsVar.G0().x(vms.f37686a);
                gnsVar.G0().x(ymsVar);
                return Unit.f46060a;
            default:
                pek pekVar9 = gns.R1;
                gnsVar.G0().x(new sms(gns.class.getSimpleName()));
                return Unit.f46060a;
        }
    }
}
