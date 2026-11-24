package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dxf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6844a;
    public final /* synthetic */ hxf0 b;

    public /* synthetic */ dxf0(hxf0 hxf0Var, byte b) {
        this.f6844a = b;
        this.b = hxf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6844a;
        hxf0 hxf0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = hxf0.V1;
                ComponentCallbacks2 application = hxf0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(qwf0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof qwf0)) {
                        ze3Var = null;
                    }
                    qwf0 qwf0Var = (qwf0) ze3Var;
                    if (qwf0Var != null) {
                        String strN = hxf0Var.L1.n(hxf0Var, hxf0.W1[0]);
                        i1w0 i1w0VarF = a4n0.f(hxf0Var);
                        strN.getClass();
                        i1w0VarF.getClass();
                        duj dujVar = qwf0Var.f29434a;
                        cad cadVar = qwf0Var.b;
                        lef0 lef0Var = qwf0Var.d;
                        gst0 gst0Var = qwf0Var.c;
                        rjo rjoVar = qwf0Var.e;
                        s31 s31Var = qwf0Var.f;
                        cyh cyhVar = qwf0Var.g;
                        ii iiVar = qwf0Var.l;
                        z4w0 z4w0Var = qwf0Var.h;
                        d190 d190Var = qwf0Var.i;
                        iqt iqtVar = qwf0Var.j;
                        rou rouVar = qwf0Var.k;
                        gii0 gii0Var = qwf0Var.m;
                        btt0 btt0Var = qwf0Var.n;
                        ctf0 ctf0Var = qwf0Var.o;
                        wdk0 wdk0Var = qwf0Var.q;
                        at4 at4Var = qwf0Var.r;
                        knf0 knf0Var = qwf0Var.p;
                        sek sekVar = qwf0Var.s;
                        gst0Var.getClass();
                        iiVar.getClass();
                        d190Var.getClass();
                        gii0Var.getClass();
                        btt0Var.getClass();
                        ctf0Var.getClass();
                        knf0Var.getClass();
                        wdk0Var.getClass();
                        at4Var.getClass();
                        return new bsi(cadVar, lef0Var, gst0Var, iiVar, dujVar, rjoVar, s31Var, cyhVar, z4w0Var, iqtVar, rouVar, ctf0Var, wdk0Var, sekVar, strN);
                    }
                }
                jf4.n(b1j.i(qwf0.class, "Cannot create dependency "));
                return null;
            case 1:
                asi asiVar = hxf0Var.Q1;
                if (asiVar != null) {
                    return new t0h0(asiVar, a4n0.f(hxf0Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                zie0 zie0Var2 = hxf0.V1;
                return hxf0Var.p0();
            case 3:
                zie0 zie0Var3 = hxf0.V1;
                hxf0 hxf0Var2 = this.b;
                wdk0 wdk0Var2 = hxf0Var2.O1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = hxf0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), hxf0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            default:
                zie0 zie0Var4 = hxf0.V1;
                sxf0 sxf0VarH0 = hxf0Var.H0();
                bby bbyVar = sxf0VarH0.v;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var = sxf0VarH0.s;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
        }
    }
}
