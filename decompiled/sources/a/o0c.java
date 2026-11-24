package a;

import android.content.ComponentCallbacks2;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o0c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24416a;
    public final /* synthetic */ r0c b;

    public /* synthetic */ o0c(r0c r0cVar, byte b) {
        this.f24416a = b;
        this.b = r0cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24416a;
        y0c y0cVar = y0c.f41798a;
        r0c r0cVar = this.b;
        switch (b) {
            case 0:
                cl5 cl5Var = r0c.S1;
                r0cVar.I0();
                return Unit.f46060a;
            case 1:
                cl5 cl5Var2 = r0c.S1;
                s1c s1cVarH0 = r0cVar.H0();
                i1w0 i1w0Var = s1cVarH0.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenB = s1cVarH0.s.b();
                if (fragmentScreenB instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 2:
                cl5 cl5Var3 = r0c.S1;
                r0cVar.I0();
                return Unit.f46060a;
            case 3:
                cl5 cl5Var4 = r0c.S1;
                s1c s1cVarH1 = r0cVar.H0();
                if (((f1c) s1cVarH1.x.getValue()).d) {
                    s64 s64Var = s1cVarH1.e;
                    dl[] dlVarArr = dl.f6255a;
                    s64Var.getClass();
                    s64Var.f31684a.a(cui0.b(new j1p("email", (byte) 0)), 3028L);
                    s1cVarH1.B(jiu0.a(s1cVarH1), s1cVarH1.d.b, new zhb(1, s1cVarH1, s1c.class, "onCheckCodeError", "onCheckCodeError(Ljava/lang/Throwable;)V", 0, (byte) 13), new m1c(s1cVarH1, null));
                } else {
                    s1cVarH1.v.f(y0cVar);
                }
                return Unit.f46060a;
            case 4:
                cl5 cl5Var5 = r0c.S1;
                s1c s1cVarH2 = r0cVar.H0();
                if (((f1c) s1cVarH2.x.getValue()).d) {
                    ((kt2) s1cVarH2.k.b).c("reg_approve_code_sent_again");
                    s64 s64Var2 = s1cVarH2.e;
                    dl[] dlVarArr2 = dl.f6255a;
                    s64Var2.getClass();
                    s64Var2.f31684a.a(cui0.b(new j1p("email", (byte) 0)), 3029L);
                    s1cVarH2.B(jiu0.a(s1cVarH2), s1cVarH2.d.b, new zhb(1, s1cVarH2, s1c.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), new n1c(s1cVarH2, null));
                } else {
                    s1cVarH2.v.f(y0cVar);
                }
                return Unit.f46060a;
            case 5:
                cl5 cl5Var6 = r0c.S1;
                ComponentCallbacks2 application = r0cVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(n0c.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof n0c)) {
                        ze3Var = null;
                    }
                    n0c n0cVar = (n0c) ze3Var;
                    if (n0cVar != null) {
                        i1w0 i1w0VarF = a4n0.f(r0cVar);
                        CheckEmailScreenParams checkEmailScreenParams = (CheckEmailScreenParams) r0cVar.R1.n(r0cVar, r0c.U1[1]);
                        i1w0VarF.getClass();
                        mne mneVar = n0cVar.f22692a;
                        ctf0 ctf0Var = n0cVar.b;
                        s64 s64Var3 = n0cVar.c;
                        lme0 lme0Var = n0cVar.g;
                        zg zgVar = n0cVar.d;
                        uuz uuzVar = n0cVar.e;
                        ii iiVar = n0cVar.j;
                        jh70 jh70Var = n0cVar.f;
                        duj dujVar = n0cVar.h;
                        pru pruVar = n0cVar.i;
                        nr nrVar = n0cVar.k;
                        gst0 gst0Var = n0cVar.l;
                        m1e m1eVar = n0cVar.m;
                        wdk0 wdk0Var = n0cVar.n;
                        q7d0 q7d0Var = n0cVar.o;
                        vby vbyVar = n0cVar.p;
                        d190 d190Var = n0cVar.q;
                        lef0 lef0Var = n0cVar.r;
                        usd usdVar = n0cVar.s;
                        zn00 zn00Var = n0cVar.t;
                        qgd qgdVar = n0cVar.u;
                        xsu xsuVar = n0cVar.v;
                        vbyVar.getClass();
                        q7d0Var.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        gst0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        d190Var.getClass();
                        return new jci(lef0Var, xsuVar, iiVar, i1w0VarF, checkEmailScreenParams, mneVar, ctf0Var, s64Var3, lme0Var, zgVar, uuzVar, jh70Var, dujVar, pruVar, nrVar, gst0Var, m1eVar, wdk0Var, usdVar, zn00Var, qgdVar);
                    }
                }
                jf4.n(b1j.i(n0c.class, "Cannot create dependency "));
                return null;
            case 6:
                cl5 cl5Var7 = r0c.S1;
                return (ici) ((jci) r0cVar.P1.getValue()).u.get();
            case 7:
                cl5 cl5Var8 = r0c.S1;
                r0cVar.H0().w();
                return Unit.f46060a;
            case 8:
                cl5 cl5Var9 = r0c.S1;
                r0c r0cVar2 = this.b;
                wdk0 wdk0Var2 = r0cVar2.N1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = r0cVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), r0cVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            default:
                cl5 cl5Var10 = r0c.S1;
                r0cVar.H0().w();
                return Unit.f46060a;
        }
    }
}
