package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.mail.send.params.QrSendConfirmationMailParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tid0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34003a;
    public final /* synthetic */ wid0 b;

    public /* synthetic */ tid0(wid0 wid0Var, byte b) {
        this.f34003a = b;
        this.b = wid0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34003a;
        p0w0 p0w0Var = p0w0.f26173a;
        wid0 wid0Var = this.b;
        switch (b) {
            case 0:
                jh70 jh70Var = wid0.R1;
                i1w0 i1w0VarF = a4n0.f(wid0Var);
                qqi qqiVar = wid0Var.K1;
                if (qqiVar != null) {
                    return new ry3(i1w0VarF, qqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                jh70 jh70Var2 = wid0.R1;
                ComponentCallbacks2 application = wid0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(xid0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof xid0)) {
                        ze3Var = null;
                    }
                    xid0 xid0Var = (xid0) ze3Var;
                    if (xid0Var != null) {
                        QrSendConfirmationMailParams qrSendConfirmationMailParams = new QrSendConfirmationMailParams((swp0) wid0Var.Q1.n(wid0Var, wid0.S1[1]));
                        mne mneVar = xid0Var.f40939a;
                        duj dujVar = xid0Var.b;
                        rou rouVar = xid0Var.c;
                        ii iiVar = xid0Var.d;
                        m1e m1eVar = xid0Var.e;
                        wdk0 wdk0Var = xid0Var.f;
                        lef0 lef0Var = xid0Var.g;
                        iiVar.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        return new rqi(lef0Var, iiVar, qrSendConfirmationMailParams, mneVar, dujVar, rouVar, m1eVar, wdk0Var);
                    }
                }
                jf4.n(b1j.i(xid0.class, "Cannot create dependency "));
                return null;
            case 2:
                jh70 jh70Var3 = wid0.R1;
                wid0Var.H0().x(bjd0.f2701a);
                return Unit.f46060a;
            case 3:
                jh70 jh70Var4 = wid0.R1;
                ijd0 ijd0VarH0 = wid0Var.H0();
                sac.V(jiu0.a(ijd0VarH0), new prc0(1, ijd0VarH0, ijd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, ijd0VarH0.f.b, new coc0(ijd0VarH0, null, (byte) 5), 10);
                return Unit.f46060a;
            case 4:
                jh70 jh70Var5 = wid0.R1;
                wid0 wid0Var2 = this.b;
                wdk0 wdk0Var2 = wid0Var2.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = wid0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), wid0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 5:
                jh70 jh70Var6 = wid0.R1;
                i1w0 i1w0Var = wid0Var.H0().b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            default:
                jh70 jh70Var7 = wid0.R1;
                i1w0 i1w0Var2 = wid0Var.H0().b;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
        }
    }
}
