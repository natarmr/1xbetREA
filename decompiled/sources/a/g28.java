package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g28 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10550a;
    public final /* synthetic */ j28 b;

    public /* synthetic */ g28(j28 j28Var, byte b) {
        this.f10550a = b;
        this.b = j28Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10550a;
        j28 j28Var = this.b;
        switch (b) {
            case 0:
                kj5 kj5Var = j28.R1;
                ComponentCallbacks2 application = j28Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(f28.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof f28)) {
                        ze3Var = null;
                    }
                    f28 f28Var = (f28) ze3Var;
                    if (f28Var != null) {
                        i1w0 i1w0VarF = a4n0.f(j28Var);
                        BindEmailScreenParams bindEmailScreenParams = (BindEmailScreenParams) j28Var.N1.n(j28Var, j28.S1[0]);
                        i1w0VarF.getClass();
                        zg zgVar = f28Var.f8800a;
                        m1e m1eVar = f28Var.b;
                        ii iiVar = f28Var.c;
                        mne mneVar = f28Var.d;
                        wdk0 wdk0Var = f28Var.e;
                        iiVar.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        return new gai(iiVar, i1w0VarF, bindEmailScreenParams, zgVar, m1eVar, mneVar, wdk0Var);
                    }
                }
                jf4.n(b1j.i(f28.class, "Cannot create dependency "));
                return null;
            case 1:
                kj5 kj5Var2 = j28.R1;
                return (fai) ((gai) j28Var.P1.getValue()).g.get();
            case 2:
                kj5 kj5Var3 = j28.R1;
                i1w0 i1w0Var = ((z28) j28Var.Q1.getValue()).c;
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
            case 3:
                kj5 kj5Var4 = j28.R1;
                z28 z28Var = (z28) j28Var.Q1.getValue();
                zg zgVar2 = z28Var.e;
                ol60 ol60Var = z28Var.h;
                p7m0 p7m0Var = z28Var.i;
                if (((v28) p7m0Var.getValue()).d) {
                    String str = ((v28) p7m0Var.getValue()).b;
                    if (str.length() <= 0 || !d390.f5393a.matcher(StringsKt.u0(str).toString()).matches()) {
                        ol60Var.f(t28.f33204a);
                        i8i.D("send_code", "error", zgVar2.f44322a, "acc_add_email_input");
                    } else {
                        i8i.D("send_code", "done", zgVar2.f44322a, "acc_add_email_input");
                        z28Var.c.d(new os5(z28Var, (byte) 29));
                    }
                } else {
                    ol60Var.f(r28.f29719a);
                }
                return Unit.f46060a;
            default:
                j28 j28Var2 = this.b;
                wdk0 wdk0Var2 = j28Var2.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = j28Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), j28Var2, null, null, false, null, 1020);
                return Unit.f46060a;
        }
    }
}
