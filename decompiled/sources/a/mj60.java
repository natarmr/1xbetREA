package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mj60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21881a;
    public final /* synthetic */ oj60 b;

    public /* synthetic */ mj60(oj60 oj60Var, byte b) {
        this.f21881a = b;
        this.b = oj60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21881a;
        oj60 oj60Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = oj60.P1;
                ComponentCallbacks2 application = oj60Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(pj60.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof pj60)) {
                        ze3Var = null;
                    }
                    pj60 pj60Var = (pj60) ze3Var;
                    if (pj60Var != null) {
                        Boolean boolN = oj60Var.O1.n(oj60Var, oj60.P1[1]);
                        i1w0 i1w0VarF = a4n0.f(oj60Var);
                        i1w0VarF.getClass();
                        d1p d1pVar = pj60Var.f27072a;
                        duj dujVar = pj60Var.d;
                        ctf0 ctf0Var = pj60Var.b;
                        uyu uyuVar = pj60Var.h;
                        z4w0 z4w0Var = pj60Var.i;
                        m1e m1eVar = pj60Var.f;
                        mne mneVar = pj60Var.j;
                        sp4 sp4Var = pj60Var.k;
                        rou rouVar = pj60Var.g;
                        kt2 kt2Var = pj60Var.e;
                        gst0 gst0Var = pj60Var.c;
                        ii iiVar = pj60Var.l;
                        wdk0 wdk0Var = pj60Var.m;
                        zn00 zn00Var = pj60Var.n;
                        mi70 mi70Var = pj60Var.o;
                        d1pVar.getClass();
                        ctf0Var.getClass();
                        gst0Var.getClass();
                        kt2Var.getClass();
                        iiVar.getClass();
                        wdk0Var.getClass();
                        m1eVar.getClass();
                        return new imi(d1pVar, mneVar, sp4Var, rouVar, ctf0Var, uyuVar, z4w0Var, gst0Var, dujVar, kt2Var, iiVar, boolN, i1w0VarF, zn00Var, mi70Var);
                    }
                }
                jf4.n(b1j.i(pj60.class, "Cannot create dependency "));
                return null;
            case 1:
                iiy[] iiyVarArr2 = oj60.P1;
                return (hmi) ((imi) oj60Var.M1.getValue()).p.get();
            case 2:
                iiy[] iiyVarArr3 = oj60.P1;
                oj60Var.G0().y(true);
                return Unit.f46060a;
            case 3:
                iiy[] iiyVarArr4 = oj60.P1;
                hl60 hl60VarG0 = oj60Var.G0();
                hl60VarG0.r.f14907a.a(tx3.l0(new k1p[]{new j1p("authenticator", (byte) 0), new j1p("authenticator_allert", (byte) 1)}), 3231L);
                hl60VarG0.s.f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "authenticator"), new Pair("element", "authenticator_allert")));
                hl60VarG0.n.d(new yk60(hl60VarG0, (byte) 2));
                return Unit.f46060a;
            case 4:
                iiy[] iiyVarArr5 = oj60.P1;
                hl60 hl60VarG1 = oj60Var.G0();
                hl60VarG1.d.f42966a.c("authenticator_phone_alert_click");
                hl60VarG1.e.f31684a.a(xun.f41520a, 3340L);
                i1w0 i1w0Var = hl60VarG1.n;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            default:
                iiy[] iiyVarArr6 = oj60.P1;
                oj60Var.G0().z(true);
                return Unit.f46060a;
        }
    }
}
