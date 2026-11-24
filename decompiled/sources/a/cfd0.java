package a;

import android.content.ComponentCallbacks2;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.mail.check.params.QrCheckCodeByMailParams;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cfd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4256a;
    public final /* synthetic */ gfd0 b;

    public /* synthetic */ cfd0(gfd0 gfd0Var, byte b) {
        this.f4256a = b;
        this.b = gfd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4256a;
        byte b2 = 1;
        sfd0 sfd0Var = sfd0.f32115a;
        yje yjeVar = null;
        gfd0 gfd0Var = this.b;
        switch (b) {
            case 0:
                lqi lqiVar = gfd0Var.K1;
                if (lqiVar != null) {
                    return new t0h0(lqiVar, a4n0.f(gfd0Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                mi70 mi70Var = gfd0.S1;
                gfd0Var.I0().A();
                return Unit.f46060a;
            case 2:
                mi70 mi70Var2 = gfd0.S1;
                fgd0 fgd0VarI0 = gfd0Var.I0();
                sac.V(jiu0.a(fgd0VarI0), new prc0(1, fgd0VarI0, fgd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, fgd0VarI0.k.b, new cgd0(fgd0VarI0, yjeVar, b2), 10);
                return Unit.f46060a;
            case 3:
                mi70 mi70Var3 = gfd0.S1;
                ComponentCallbacks2 application = gfd0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(hfd0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof hfd0)) {
                        ze3Var = null;
                    }
                    hfd0 hfd0Var = (hfd0) ze3Var;
                    if (hfd0Var != null) {
                        yzn0 yzn0Var = gfd0Var.Q1;
                        iiy[] iiyVarArr = gfd0.U1;
                        QrCheckCodeByMailParams qrCheckCodeByMailParams = new QrCheckCodeByMailParams((swp0) yzn0Var.n(gfd0Var, iiyVarArr[1]), gfd0Var.R1.n(gfd0Var, iiyVarArr[2]).longValue());
                        mne mneVar = hfd0Var.f12969a;
                        duj dujVar = hfd0Var.b;
                        rou rouVar = hfd0Var.c;
                        ubu ubuVar = hfd0Var.d;
                        zoi0 zoi0Var = hfd0Var.e;
                        ii iiVar = hfd0Var.f;
                        pmi0 pmi0Var = hfd0Var.g;
                        rjo rjoVar = hfd0Var.h;
                        m1e m1eVar = hfd0Var.i;
                        wdk0 wdk0Var = hfd0Var.j;
                        lef0 lef0Var = hfd0Var.k;
                        ctf0 ctf0Var = hfd0Var.l;
                        usd usdVar = hfd0Var.m;
                        pru pruVar = hfd0Var.n;
                        iiVar.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        return new mqi(lef0Var, iiVar, qrCheckCodeByMailParams, mneVar, dujVar, rouVar, ubuVar, zoi0Var, pmi0Var, rjoVar, m1eVar, wdk0Var, ctf0Var, usdVar, pruVar);
                    }
                }
                jf4.n(b1j.i(hfd0.class, "Cannot create dependency "));
                return null;
            case 4:
                mi70 mi70Var4 = gfd0.S1;
                fgd0 fgd0VarI1 = gfd0Var.I0();
                i1w0 i1w0Var = fgd0VarI1.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(pmi0.b(fgd0VarI1.l, false))), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 5:
                mi70 mi70Var5 = gfd0.S1;
                fgd0 fgd0VarI2 = gfd0Var.I0();
                i1w0 i1w0Var2 = fgd0VarI2.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(pmi0.b(fgd0VarI2.l, false))), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 6:
                mi70 mi70Var6 = gfd0.S1;
                gfd0 gfd0Var2 = this.b;
                wdk0 wdk0Var2 = gfd0Var2.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = gfd0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), gfd0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 7:
                mi70 mi70Var7 = gfd0.S1;
                fgd0 fgd0VarI3 = gfd0Var.I0();
                i1w0 i1w0Var3 = fgd0VarI3.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(pmi0.b(fgd0VarI3.l, false))), i1w0Var3, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar3.next());
                }
                break;
            case 8:
                mi70 mi70Var8 = gfd0.S1;
                fgd0 fgd0VarI4 = gfd0Var.I0();
                i1w0 i1w0Var4 = fgd0VarI4.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var4);
                FragmentScreen fragmentScreenB = fgd0VarI4.p.b();
                if (fragmentScreenB instanceof DialogScreen) {
                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                } else {
                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var4, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO;
                    if (!pawVar4.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var4.a((oe50) pawVar4.next());
                }
                break;
            case 9:
                mi70 mi70Var9 = gfd0.S1;
                gfd0Var.I0().C(sfd0Var);
                return Unit.f46060a;
            default:
                mi70 mi70Var10 = gfd0.S1;
                gfd0Var.I0().C(sfd0Var);
                return Unit.f46060a;
        }
    }
}
