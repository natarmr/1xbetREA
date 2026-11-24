package a;

import android.content.ComponentCallbacks2;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.sms.check.params.QrCheckCodeBySmsParams;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ggd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11248a;
    public final /* synthetic */ jgd0 b;

    public /* synthetic */ ggd0(jgd0 jgd0Var, byte b) {
        this.f11248a = b;
        this.b = jgd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11248a;
        fhd0 fhd0Var = fhd0.f9536a;
        jgd0 jgd0Var = this.b;
        switch (b) {
            case 0:
                xi70 xi70Var = jgd0.V1;
                jgd0Var.I0().A();
                return Unit.f46060a;
            case 1:
                nqi nqiVar = jgd0Var.K1;
                if (nqiVar != null) {
                    return new t0h0(nqiVar, a4n0.f(jgd0Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                xi70 xi70Var2 = jgd0.V1;
                ComponentCallbacks2 application = jgd0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(kgd0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof kgd0)) {
                        ze3Var = null;
                    }
                    kgd0 kgd0Var = (kgd0) ze3Var;
                    if (kgd0Var != null) {
                        yzn0 yzn0Var = jgd0Var.Q1;
                        iiy[] iiyVarArr = jgd0.W1;
                        QrCheckCodeBySmsParams qrCheckCodeBySmsParams = new QrCheckCodeBySmsParams((swp0) yzn0Var.n(jgd0Var, iiyVarArr[1]), jgd0Var.R1.n(jgd0Var, iiyVarArr[2]).longValue(), (yed0) jgd0Var.S1.n(jgd0Var, iiyVarArr[3]), jgd0Var.U1.n(jgd0Var, iiyVarArr[4]));
                        zx10 zx10Var = kgd0Var.f18233a;
                        mne mneVar = kgd0Var.b;
                        duj dujVar = kgd0Var.c;
                        rou rouVar = kgd0Var.d;
                        ubu ubuVar = kgd0Var.e;
                        iw20 iw20Var = kgd0Var.g;
                        zoi0 zoi0Var = kgd0Var.f;
                        ii iiVar = kgd0Var.h;
                        pmi0 pmi0Var = kgd0Var.i;
                        rjo rjoVar = kgd0Var.j;
                        m1e m1eVar = kgd0Var.k;
                        wdk0 wdk0Var = kgd0Var.l;
                        lef0 lef0Var = kgd0Var.m;
                        yuu yuuVar = kgd0Var.n;
                        usd usdVar = kgd0Var.o;
                        ctf0 ctf0Var = kgd0Var.p;
                        iiVar.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        return new oqi(zx10Var, iw20Var, lef0Var, iiVar, qrCheckCodeBySmsParams, mneVar, dujVar, rouVar, ubuVar, zoi0Var, pmi0Var, rjoVar, m1eVar, wdk0Var, yuuVar, usdVar, ctf0Var);
                    }
                }
                jf4.n(b1j.i(kgd0.class, "Cannot create dependency "));
                return null;
            case 3:
                xi70 xi70Var3 = jgd0.V1;
                shd0 shd0VarI0 = jgd0Var.I0();
                i1w0 i1w0Var = shd0VarI0.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(pmi0.b(shd0VarI0.k, false))), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 4:
                xi70 xi70Var4 = jgd0.V1;
                shd0 shd0VarI1 = jgd0Var.I0();
                i1w0 i1w0Var2 = shd0VarI1.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(pmi0.b(shd0VarI1.k, false))), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 5:
                xi70 xi70Var5 = jgd0.V1;
                shd0 shd0VarI2 = jgd0Var.I0();
                i1w0 i1w0Var3 = shd0VarI2.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(pmi0.b(shd0VarI2.k, false))), i1w0Var3, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar3.next());
                }
                break;
            case 6:
                xi70 xi70Var6 = jgd0.V1;
                shd0 shd0VarI3 = jgd0Var.I0();
                i1w0 i1w0Var4 = shd0VarI3.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var4);
                FragmentScreen fragmentScreenB = shd0VarI3.o.b();
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
            case 7:
                xi70 xi70Var7 = jgd0.V1;
                jgd0Var.I0().B(fhd0Var);
                return Unit.f46060a;
            case 8:
                xi70 xi70Var8 = jgd0.V1;
                jgd0Var.I0().B(fhd0Var);
                return Unit.f46060a;
            default:
                xi70 xi70Var9 = jgd0.V1;
                jgd0 jgd0Var2 = this.b;
                wdk0 wdk0Var2 = jgd0Var2.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = jgd0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), jgd0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
        }
    }
}
