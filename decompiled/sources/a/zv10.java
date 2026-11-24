package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.messages.navigation.MessagesScreens$MessagesScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zv10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45034a;
    public final /* synthetic */ dw10 b;

    public /* synthetic */ zv10(dw10 dw10Var, byte b) {
        this.f45034a = b;
        this.b = dw10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45034a;
        byte b2 = 4;
        yje yjeVar = null;
        dw10 dw10Var = this.b;
        switch (b) {
            case 0:
                uuz uuzVar = dw10.V1;
                cx10 cx10VarI0 = dw10Var.I0();
                tzi tziVar = cx10VarI0.z;
                ((ag3) tziVar.h).f809a.c("header_menu_msg_click");
                ((je) tziVar.d).f16351a.a(xun.f41520a, 3137L);
                i1w0 i1w0Var = cx10VarI0.d;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                cx10VarI0.i.getClass();
                k0w0VarI.h(new MessagesScreens$MessagesScreen());
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 1:
                uuz uuzVar2 = dw10.V1;
                dw10Var.I0().B();
                return Unit.f46060a;
            case 2:
                uuz uuzVar3 = dw10.V1;
                y2m0 y2m0Var = jho0.R1;
                r040 r040Var = (r040) dw10Var.P1.n(dw10Var, dw10.W1[1]);
                y2m0Var.getClass();
                jho0 jho0Var = new jho0();
                jho0Var.O1.u(jho0Var, jho0.S1[1], r040Var);
                return jho0Var;
            case 3:
                uuz uuzVar4 = dw10.V1;
                s2m0 s2m0Var = ufo0.Q1;
                r040 r040Var2 = (r040) dw10Var.P1.n(dw10Var, dw10.W1[1]);
                s2m0Var.getClass();
                ufo0 ufo0Var = new ufo0();
                ufo0Var.O1.u(ufo0Var, ufo0.R1[1], r040Var2);
                return ufo0Var;
            case 4:
                uuz uuzVar5 = dw10.V1;
                ComponentCallbacks2 application = dw10Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ew10.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ew10)) {
                        ze3Var = null;
                    }
                    ew10 ew10Var = (ew10) ze3Var;
                    if (ew10Var != null) {
                        i1w0 i1w0VarF = a4n0.f(dw10Var);
                        i1w0VarF.getClass();
                        peg0 peg0Var = ew10Var.c;
                        ii iiVar = ew10Var.d;
                        mne mneVar = ew10Var.f8499a;
                        v88 v88Var = ew10Var.b;
                        m1e m1eVar = ew10Var.e;
                        gst0 gst0Var = ew10Var.f;
                        pmi0 pmi0Var = ew10Var.g;
                        pru pruVar = ew10Var.h;
                        ag3 ag3Var = ew10Var.i;
                        ytt yttVar = ew10Var.j;
                        yfu yfuVar = ew10Var.k;
                        do20 do20Var = ew10Var.m;
                        lbu lbuVar = ew10Var.n;
                        rou rouVar = ew10Var.o;
                        wsf0 wsf0Var = ew10Var.l;
                        zlt0 zlt0Var = ew10Var.p;
                        kt2 kt2Var = ew10Var.q;
                        duj dujVar = ew10Var.r;
                        ctf0 ctf0Var = ew10Var.s;
                        dmt dmtVar = ew10Var.t;
                        d1p d1pVar = ew10Var.u;
                        nr00 nr00Var = ew10Var.v;
                        onv onvVar = ew10Var.w;
                        r9u r9uVar = ew10Var.x;
                        nr00 nr00Var2 = ew10Var.y;
                        wdk0 wdk0Var = ew10Var.z;
                        lef0 lef0Var = ew10Var.A;
                        mnb mnbVar = ew10Var.B;
                        bzt bztVar = ew10Var.C;
                        qho qhoVar = ew10Var.D;
                        o470 o470Var = ew10Var.E;
                        n4u n4uVar = ew10Var.F;
                        iiVar.getClass();
                        m1eVar.getClass();
                        gst0Var.getClass();
                        kt2Var.getClass();
                        ctf0Var.getClass();
                        r9uVar.getClass();
                        wdk0Var.getClass();
                        d1pVar.getClass();
                        return new vki(d1pVar, nr00Var, wsf0Var, onvVar, peg0Var, lef0Var, nr00Var2, i1w0VarF, o470Var, iiVar, mneVar, v88Var, m1eVar, gst0Var, pmi0Var, pruVar, ag3Var, yttVar, yfuVar, do20Var, lbuVar, rouVar, zlt0Var, kt2Var, dujVar, ctf0Var, dmtVar, r9uVar, wdk0Var, mnbVar, bztVar, qhoVar, n4uVar);
                    }
                }
                jf4.n(b1j.i(ew10.class, "Cannot create dependency "));
                return null;
            case 5:
                uuz uuzVar6 = dw10.V1;
                return (uki) dw10Var.H0().G.get();
            case 6:
                uuz uuzVar7 = dw10.V1;
                dw10Var.C().t0(i120.V(new Pair("CHANGE_BALANCE_CLICK_REQUEST_KEY", Boolean.TRUE)), "CHANGE_BALANCE_CLICK_REQUEST_KEY");
                cx10 cx10VarI1 = dw10Var.I0();
                sac.V(jiu0.a(cx10VarI1), new yw10(1, cx10VarI1, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, cx10VarI1.f.b, new uw10(cx10VarI1, yjeVar, (byte) 3), 10);
                return Unit.f46060a;
            case 7:
                uuz uuzVar8 = dw10.V1;
                dw10Var.C().t0(i120.V(new Pair("PAYMENT_CLICK_REQUEST_KEY", Boolean.TRUE)), "PAYMENT_CLICK_REQUEST_KEY");
                cx10 cx10VarI2 = dw10Var.I0();
                v88.b(cx10VarI2.k, cx10VarI2.d, 0L, 4);
                return Unit.f46060a;
            case 8:
                uuz uuzVar9 = dw10.V1;
                cx10 cx10VarI3 = dw10Var.I0();
                sac.V(jiu0.a(cx10VarI3), new yw10(1, cx10VarI3, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, cx10VarI3.f.b, new xw10(cx10VarI3, yjeVar, b2), 10);
                return Unit.f46060a;
            default:
                uuz uuzVar10 = dw10.V1;
                dw10Var.I0().B();
                return Unit.f46060a;
        }
    }
}
