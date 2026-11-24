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
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rzd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31354a;
    public final /* synthetic */ uzd b;

    public /* synthetic */ rzd(uzd uzdVar, byte b) {
        this.f31354a = b;
        this.b = uzdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31354a;
        byte b2 = 0;
        yje yjeVar = null;
        uzd uzdVar = this.b;
        switch (b) {
            case 0:
                qud qudVar = uzd.S1;
                uzdVar.K0();
                return Unit.f46060a;
            case 1:
                qud qudVar2 = uzd.S1;
                uzdVar.K0();
                return Unit.f46060a;
            case 2:
                qud qudVar3 = uzd.S1;
                uzdVar.J0().G();
                return Unit.f46060a;
            case 3:
                qud qudVar4 = uzd.S1;
                uzdVar.K0();
                return Unit.f46060a;
            case 4:
                qud qudVar5 = uzd.S1;
                uzdVar.J0().a();
                return Unit.f46060a;
            case 5:
                qud qudVar6 = uzd.S1;
                uzdVar.J0().a();
                return Unit.f46060a;
            case 6:
                qud qudVar7 = uzd.S1;
                uzdVar.J0().G();
                return Unit.f46060a;
            case 7:
                qud qudVar8 = uzd.S1;
                g1e g1eVarJ0 = uzdVar.J0();
                bby bbyVar = g1eVarJ0.F;
                if (bbyVar == null || !bbyVar.isActive()) {
                    g1eVarJ0.F = sac.V(jiu0.a(g1eVarJ0), new enc(1, g1eVarJ0, g1e.class, "handleAuthorizationError", "handleAuthorizationError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, g1eVarJ0.f.b, new a1e(g1eVarJ0, null), 10);
                }
                return Unit.f46060a;
            case 8:
                qud qudVar9 = uzd.S1;
                g1e g1eVarJ1 = uzdVar.J0();
                ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType = g1eVarJ1.d;
                if ((confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.Authenticator ? (ConfirmationNewPlaceScreenType.Authenticator) confirmationNewPlaceScreenType : null) != null) {
                    sac.V(jiu0.a(g1eVarJ1), b1e.f1802a, null, g1eVarJ1.f.b, new c1e(g1eVarJ1, yjeVar, b2), 10);
                }
                return Unit.f46060a;
            case 9:
                qud qudVar10 = uzd.S1;
                uzdVar.J0().G();
                return Unit.f46060a;
            case 10:
                qud qudVar11 = uzd.S1;
                ComponentCallbacks2 application = uzdVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(qzd.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof qzd)) {
                        ze3Var = null;
                    }
                    qzd qzdVar = (qzd) ze3Var;
                    if (qzdVar != null) {
                        i1w0 i1w0VarF = a4n0.f(uzdVar);
                        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenTypeI0 = uzdVar.I0();
                        i1w0VarF.getClass();
                        duj dujVar = qzdVar.d;
                        mne mneVar = qzdVar.e;
                        m1e m1eVar = qzdVar.f;
                        ok50 ok50Var = qzdVar.c;
                        cyh cyhVar = qzdVar.g;
                        ii iiVar = qzdVar.i;
                        z4w0 z4w0Var = qzdVar.h;
                        ojj ojjVar = qzdVar.j;
                        wdk0 wdk0Var = qzdVar.k;
                        lef0 lef0Var = qzdVar.l;
                        yox yoxVar = qzdVar.m;
                        ctf0 ctf0Var = qzdVar.n;
                        lp4 lp4Var = qzdVar.f29573a;
                        c8c c8cVar = qzdVar.b;
                        pru pruVar = qzdVar.o;
                        usd usdVar = qzdVar.p;
                        s64 s64Var = qzdVar.q;
                        lp4Var.getClass();
                        c8cVar.getClass();
                        iiVar.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        return new bdi(lef0Var, yoxVar, lp4Var, ok50Var, usdVar, iiVar, i1w0VarF, confirmationNewPlaceScreenTypeI0, dujVar, mneVar, m1eVar, cyhVar, z4w0Var, ojjVar, wdk0Var, ctf0Var, pruVar, s64Var);
                    }
                }
                jf4.n(b1j.i(qzd.class, "Cannot create dependency "));
                return null;
            case 11:
                qud qudVar12 = uzd.S1;
                return (adi) ((bdi) uzdVar.P1.getValue()).s.get();
            case 12:
                qud qudVar13 = uzd.S1;
                g1e g1eVarJ2 = uzdVar.J0();
                i1w0 i1w0Var = g1eVarJ2.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenB = g1eVarJ2.v.b();
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
            case 13:
                qud qudVar14 = uzd.S1;
                g1e g1eVarJ3 = uzdVar.J0();
                bby bbyVar2 = g1eVarJ3.E;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(plc.b("Operation canceled by user", new art0()));
                }
                g1eVarJ3.B();
                return Unit.f46060a;
            case 14:
                qud qudVar15 = uzd.S1;
                uzd uzdVar2 = this.b;
                wdk0 wdk0Var2 = uzdVar2.N1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = uzdVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), uzdVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 15:
                qud qudVar16 = uzd.S1;
                i1w0 i1w0Var2 = uzdVar.J0().c;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 16:
                qud qudVar17 = uzd.S1;
                uzdVar.K0();
                return Unit.f46060a;
            case 17:
                qud qudVar18 = uzd.S1;
                uzdVar.K0();
                return Unit.f46060a;
            default:
                qud qudVar19 = uzd.S1;
                uzdVar.J0().G();
                return Unit.f46060a;
        }
    }
}
