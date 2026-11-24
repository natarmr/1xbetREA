package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uyd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36483a;
    public final /* synthetic */ xyd b;

    public /* synthetic */ uyd(xyd xydVar, byte b) {
        this.f36483a = b;
        this.b = xydVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36483a;
        xyd xydVar = this.b;
        switch (b) {
            case 0:
                kud kudVar = xyd.U1;
                xyd xydVar2 = this.b;
                wdk0 wdk0Var = xydVar2.O1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = xydVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), xydVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 1:
                kud kudVar2 = xyd.U1;
                xydVar.H0().w();
                return Unit.f46060a;
            case 2:
                kud kudVar3 = xyd.U1;
                xydVar.H0().w();
                return Unit.f46060a;
            case 3:
                kud kudVar4 = xyd.U1;
                ComponentCallbacks2 application = xydVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(tyd.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof tyd)) {
                        ze3Var = null;
                    }
                    tyd tydVar = (tyd) ze3Var;
                    if (tydVar != null) {
                        i1w0 i1w0VarF = a4n0.f(xydVar);
                        ConfirmSendEmailScreenParams confirmSendEmailScreenParams = (ConfirmSendEmailScreenParams) xydVar.S1.n(xydVar, xyd.V1[1]);
                        i1w0VarF.getClass();
                        mne mneVar = tydVar.f34748a;
                        nr nrVar = tydVar.b;
                        s64 s64Var = tydVar.c;
                        zg zgVar = tydVar.e;
                        cyh cyhVar = tydVar.f;
                        ort ortVar = tydVar.g;
                        ii iiVar = tydVar.j;
                        zg zgVar2 = tydVar.h;
                        z4w0 z4w0Var = tydVar.i;
                        duj dujVar = tydVar.k;
                        gst0 gst0Var = tydVar.l;
                        m1e m1eVar = tydVar.m;
                        wdk0 wdk0Var2 = tydVar.n;
                        ctf0 ctf0Var = tydVar.o;
                        lef0 lef0Var = tydVar.p;
                        au0 au0Var = tydVar.d;
                        iiVar.getClass();
                        gst0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var2.getClass();
                        ctf0Var.getClass();
                        return new zci(lef0Var, i1w0VarF, confirmSendEmailScreenParams, mneVar, nrVar, s64Var, zgVar, cyhVar, iiVar, ortVar, zgVar2, z4w0Var, dujVar, gst0Var, m1eVar, wdk0Var2, ctf0Var, au0Var);
                    }
                }
                jf4.n(b1j.i(tyd.class, "Cannot create dependency "));
                return null;
            case 4:
                kud kudVar5 = xyd.U1;
                return (yci) ((zci) xydVar.Q1.getValue()).s.get();
            case 5:
                kud kudVar6 = xyd.U1;
                kzd kzdVarH0 = xydVar.H0();
                if (kzdVarH0.c.w() instanceof SendEmailIntention.RestorePassword) {
                    kzdVarH0.r.f(azd.f1711a);
                } else {
                    kzdVarH0.w();
                }
                return Unit.f46060a;
            case 6:
                kud kudVar7 = xyd.U1;
                kzd kzdVarH1 = xydVar.H0();
                if (((ezd) kzdVarH1.s.getValue()).b) {
                    ((kt2) kzdVarH1.e.b).c("reg_approve_code_sent");
                    s64 s64Var2 = kzdVarH1.f;
                    dl[] dlVarArr = dl.f6255a;
                    b1j.v("email", s64Var2.f31684a, 3027L);
                    bby bbyVar = kzdVarH1.t;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    kzdVarH1.t = sac.V(jiu0.a(kzdVarH1), new enc(1, kzdVarH1, kzd.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, kzdVarH1.d.b, new gzd(kzdVarH1, null), 10);
                }
                return Unit.f46060a;
            default:
                kud kudVar8 = xyd.U1;
                bby bbyVar2 = xydVar.H0().t;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                return Unit.f46060a;
        }
    }
}
