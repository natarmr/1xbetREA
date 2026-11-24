package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.sms.send.params.QrSendConfirmationSmsParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jjd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16615a;
    public final /* synthetic */ njd0 b;

    public /* synthetic */ jjd0(njd0 njd0Var, byte b) {
        this.f16615a = b;
        this.b = njd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16615a;
        p0w0 p0w0Var = p0w0.f26173a;
        njd0 njd0Var = this.b;
        switch (b) {
            case 0:
                nh70 nh70Var = njd0.S1;
                njd0 njd0Var2 = this.b;
                wdk0 wdk0Var = njd0Var2.M1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = njd0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), njd0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 1:
                nh70 nh70Var2 = njd0.S1;
                fkd0 fkd0VarI0 = njd0Var.I0();
                sac.V(jiu0.a(fkd0VarI0), new prc0(1, fkd0VarI0, fkd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, fkd0VarI0.f.b, new zjd0(fkd0VarI0, null, (byte) 2), 10);
                return Unit.f46060a;
            case 2:
                nh70 nh70Var3 = njd0.S1;
                i1w0 i1w0Var = njd0Var.I0().b;
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
            case 3:
                nh70 nh70Var4 = njd0.S1;
                fkd0 fkd0VarI1 = njd0Var.I0();
                sac.V(jiu0.a(fkd0VarI1), new prc0(1, fkd0VarI1, fkd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, fkd0VarI1.f.b, new zjd0(fkd0VarI1, null, (byte) 0), 10);
                return Unit.f46060a;
            case 4:
                nh70 nh70Var5 = njd0.S1;
                njd0Var.I0().y(rjd0.f30587a);
                return Unit.f46060a;
            case 5:
                nh70 nh70Var6 = njd0.S1;
                i1w0 i1w0VarF = a4n0.f(njd0Var);
                sqi sqiVar = njd0Var.K1;
                if (sqiVar != null) {
                    return new ry3(i1w0VarF, sqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 6:
                nh70 nh70Var7 = njd0.S1;
                ComponentCallbacks2 application = njd0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ojd0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ojd0)) {
                        ze3Var = null;
                    }
                    ojd0 ojd0Var = (ojd0) ze3Var;
                    if (ojd0Var != null) {
                        yzn0 yzn0Var = njd0Var.Q1;
                        iiy[] iiyVarArr = njd0.U1;
                        QrSendConfirmationSmsParams qrSendConfirmationSmsParams = new QrSendConfirmationSmsParams((swp0) yzn0Var.n(njd0Var, iiyVarArr[1]), njd0Var.R1.n(njd0Var, iiyVarArr[2]));
                        mne mneVar = ojd0Var.f25353a;
                        duj dujVar = ojd0Var.b;
                        rou rouVar = ojd0Var.c;
                        ii iiVar = ojd0Var.d;
                        m1e m1eVar = ojd0Var.e;
                        wdk0 wdk0Var2 = ojd0Var.f;
                        lef0 lef0Var = ojd0Var.g;
                        s64 s64Var = ojd0Var.h;
                        iiVar.getClass();
                        m1eVar.getClass();
                        wdk0Var2.getClass();
                        return new tqi(lef0Var, iiVar, qrSendConfirmationSmsParams, mneVar, dujVar, rouVar, m1eVar, wdk0Var2, s64Var);
                    }
                }
                jf4.n(b1j.i(ojd0.class, "Cannot create dependency "));
                return null;
            case 7:
                nh70 nh70Var8 = njd0.S1;
                fkd0 fkd0VarI2 = njd0Var.I0();
                sac.V(jiu0.a(fkd0VarI2), new prc0(1, fkd0VarI2, fkd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, fkd0VarI2.f.b, new zjd0(fkd0VarI2, null, (byte) 3), 10);
                return Unit.f46060a;
            default:
                nh70 nh70Var9 = njd0.S1;
                i1w0 i1w0Var2 = njd0Var.I0().b;
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
