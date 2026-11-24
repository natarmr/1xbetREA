package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oqb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25680a;
    public final /* synthetic */ rqb b;

    public /* synthetic */ oqb(rqb rqbVar, byte b) {
        this.f25680a = b;
        this.b = rqbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f25680a;
        rqb rqbVar = this.b;
        switch (b) {
            case 0:
                bj5 bj5Var = rqb.U1;
                ComponentCallbacks2 application = rqbVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(nqb.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof nqb)) {
                        ze3Var = null;
                    }
                    nqb nqbVar = (nqb) ze3Var;
                    if (nqbVar != null) {
                        i1w0 i1w0VarF = a4n0.f(rqbVar);
                        uqb uqbVar = (uqb) rqbVar.S1.n(rqbVar, rqb.V1[1]);
                        i1w0VarF.getClass();
                        lef0 lef0Var = nqbVar.f23951a;
                        mne mneVar = nqbVar.b;
                        rpt rptVar = nqbVar.c;
                        rou rouVar = nqbVar.d;
                        cyh cyhVar = nqbVar.e;
                        rjo rjoVar = nqbVar.f;
                        duj dujVar = nqbVar.g;
                        ii iiVar = nqbVar.h;
                        ag3 ag3Var = nqbVar.i;
                        ik4 ik4Var = nqbVar.j;
                        z4w0 z4w0Var = nqbVar.k;
                        ntu ntuVar = nqbVar.l;
                        m1e m1eVar = nqbVar.m;
                        btt0 btt0Var = nqbVar.n;
                        gii0 gii0Var = nqbVar.o;
                        ctf0 ctf0Var = nqbVar.p;
                        nr nrVar = nqbVar.q;
                        s64 s64Var = nqbVar.r;
                        wdk0 wdk0Var = nqbVar.s;
                        sa10 sa10Var = nqbVar.t;
                        mi70 mi70Var = nqbVar.u;
                        iiVar.getClass();
                        m1eVar.getClass();
                        btt0Var.getClass();
                        gii0Var.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        return new hci(lef0Var, iiVar, mneVar, rptVar, rouVar, i1w0VarF, cyhVar, rjoVar, dujVar, uqbVar, ag3Var, ik4Var, z4w0Var, ntuVar, m1eVar, ctf0Var, nrVar, s64Var, wdk0Var, sa10Var, mi70Var);
                    }
                }
                jf4.n(b1j.i(nqb.class, "Cannot create dependency "));
                return null;
            case 1:
                bj5 bj5Var2 = rqb.U1;
                return (gci) ((hci) rqbVar.M1.getValue()).v.get();
            case 2:
                bj5 bj5Var3 = rqb.U1;
                rqb rqbVar2 = this.b;
                wdk0 wdk0Var2 = rqbVar2.P1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = rqbVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), rqbVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 3:
                bj5 bj5Var4 = rqb.U1;
                i1w0 i1w0Var = rqbVar.H0().f;
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
            default:
                bj5 bj5Var5 = rqb.U1;
                p7m0 p7m0Var = rqbVar.H0().x;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, frb.a((frb) value, null, false, false, null, null, 29)));
                return Unit.f46060a;
        }
    }
}
