package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mp4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22160a;
    public final /* synthetic */ qp4 b;

    public /* synthetic */ mp4(qp4 qp4Var, byte b) {
        this.f22160a = b;
        this.b = qp4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22160a;
        qp4 qp4Var = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = qp4.R1;
                ComponentCallbacks2 application = qp4Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(dq4.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof dq4)) {
                        ze3Var = null;
                    }
                    dq4 dq4Var = (dq4) ze3Var;
                    if (dq4Var != null) {
                        yzn0 yzn0Var = qp4Var.P1;
                        iiy[] iiyVarArr = qp4.S1;
                        mq4 mq4Var = (mq4) yzn0Var.n(qp4Var, iiyVarArr[3]);
                        String strN = qp4Var.N1.n(qp4Var, iiyVarArr[1]);
                        r080 r080Var = (r080) qp4Var.O1.n(qp4Var, iiyVarArr[2]);
                        i1w0 i1w0VarF = a4n0.f(qp4Var);
                        strN.getClass();
                        i1w0VarF.getClass();
                        d1p d1pVar = dq4Var.f6495a;
                        duj dujVar = dq4Var.c;
                        cs00 cs00Var = dq4Var.g;
                        m1e m1eVar = dq4Var.f;
                        mne mneVar = dq4Var.h;
                        g2v g2vVar = dq4Var.e;
                        sp4 sp4Var = dq4Var.j;
                        kt2 kt2Var = dq4Var.d;
                        gst0 gst0Var = dq4Var.b;
                        rou rouVar = dq4Var.i;
                        ii iiVar = dq4Var.k;
                        wdk0 wdk0Var = dq4Var.l;
                        ouu ouuVar = dq4Var.m;
                        d1pVar.getClass();
                        cs00Var.getClass();
                        m1eVar.getClass();
                        gst0Var.getClass();
                        kt2Var.getClass();
                        iiVar.getClass();
                        wdk0Var.getClass();
                        return new f9i(d1pVar, cs00Var, m1eVar, mneVar, sp4Var, gst0Var, dujVar, kt2Var, g2vVar, iiVar, rouVar, wdk0Var, mq4Var, strN, r080Var, i1w0VarF, ouuVar);
                    }
                }
                jf4.n(b1j.i(dq4.class, "Cannot create dependency "));
                return null;
            case 1:
                hfk0 hfk0Var2 = qp4.R1;
                return (e9i) qp4Var.G0().r.get();
            case 2:
                hfk0 hfk0Var3 = qp4.R1;
                ku4 ku4VarH0 = qp4Var.H0();
                ku4VarH0.p.h();
                ku4VarH0.u.f44833a.a(tx3.l0(new k1p[]{new j1p("settings", (byte) 0), new j1p("authenticator", (byte) 1)}), 3344L);
                ywq ywqVar = qp4Var.Q1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            default:
                hfk0 hfk0Var4 = qp4.R1;
                ku4 ku4VarH1 = qp4Var.H0();
                ku4VarH1.p.i();
                ku4VarH1.u.f44833a.a(tx3.l0(new k1p[]{new j1p("cancel", (byte) 0), new j1p("authenticator", (byte) 1)}), 3344L);
                return Unit.f46060a;
        }
    }
}
