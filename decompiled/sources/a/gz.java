package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12155a;
    public final /* synthetic */ mz b;

    public /* synthetic */ gz(mz mzVar, byte b) {
        this.f12155a = b;
        this.b = mzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12155a;
        qz qzVar = qz.f29557a;
        byte b2 = 2;
        yje yjeVar = null;
        mz mzVar = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = mz.V1;
                ComponentCallbacks2 application = mzVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(fz.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof fz)) {
                        ze3Var = null;
                    }
                    fz fzVar = (fz) ze3Var;
                    if (fzVar != null) {
                        i1w0 i1w0VarF = a4n0.f(mzVar);
                        khf0 khf0Var = mzVar.S1;
                        iiy[] iiyVarArr = mz.W1;
                        chf0 chf0Var = new chf0(khf0Var.n(mzVar, iiyVarArr[1]), mzVar.U1.n(mzVar, iiyVarArr[2]), (byte) 4);
                        i1w0VarF.getClass();
                        pp90 pp90Var = fzVar.b;
                        qgd qgdVar = fzVar.f10383a;
                        jh70 jh70Var = fzVar.c;
                        rjo rjoVar = fzVar.d;
                        pru pruVar = fzVar.e;
                        duj dujVar = fzVar.f;
                        cad cadVar = fzVar.g;
                        d190 d190Var = fzVar.h;
                        ii iiVar = fzVar.j;
                        ntu ntuVar = fzVar.i;
                        fsd fsdVar = fzVar.k;
                        lef0 lef0Var = fzVar.l;
                        ctf0 ctf0Var = fzVar.m;
                        gii0 gii0Var = fzVar.n;
                        m1e m1eVar = fzVar.o;
                        wdk0 wdk0Var = fzVar.p;
                        rl70 rl70Var = fzVar.q;
                        rpt rptVar = fzVar.r;
                        zn00 zn00Var = fzVar.s;
                        pp90Var.getClass();
                        iiVar.getClass();
                        d190Var.getClass();
                        fsdVar.getClass();
                        ctf0Var.getClass();
                        gii0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        return new d6i(cadVar, lef0Var, pp90Var, iiVar, i1w0VarF, qgdVar, jh70Var, rjoVar, pruVar, chf0Var, dujVar, ntuVar, ctf0Var, m1eVar, wdk0Var, rl70Var, rptVar, zn00Var);
                    }
                }
                jf4.n(b1j.i(fz.class, "Cannot create dependency "));
                return null;
            case 1:
                jdk0 jdk0Var2 = mz.V1;
                mz mzVar2 = this.b;
                wdk0 wdk0Var2 = mzVar2.N1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = mzVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), mzVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 2:
                jdk0 jdk0Var3 = mz.V1;
                g00 g00VarH0 = mzVar.H0();
                i1w0 i1w0Var = g00VarH0.m;
                int iOrdinal = ((we50) g00VarH0.c.c).ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, r0w0.f29649a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    } else {
                        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                        ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(iw20.f(g00VarH0.l, nqh0.f23960a))), i1w0Var, copyOnWriteArrayListQ2, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorP2;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    }
                } else if (((d190) g00VarH0.e.f16851a.f10448a).e == pwf0.c) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                    ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(jh70.j(g00VarH0.j, false))), i1w0Var, copyOnWriteArrayListQ3, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorP3;
                        if (pawVar3.hasNext()) {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                    ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, new d1w0(g00VarH0.h.f0())), i1w0Var, copyOnWriteArrayListQ4, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorP4;
                        if (pawVar4.hasNext()) {
                            i1w0Var.a((oe50) pawVar4.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                jdk0 jdk0Var4 = mz.V1;
                g00 g00VarH1 = mzVar.H0();
                i1w0 i1w0Var2 = g00VarH1.m;
                k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                k0w0VarI.c(g00VarH1.i.G0((we50) g00VarH1.c.c));
                ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorO;
                    if (!pawVar5.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar5.next());
                }
                break;
            case 4:
                jdk0 jdk0Var5 = mz.V1;
                return (c6i) ((d6i) mzVar.O1.getValue()).s.get();
            case 5:
                jdk0 jdk0Var6 = mz.V1;
                g00 g00VarH2 = mzVar.H0();
                sac.R(jiu0.a(g00VarH2), new zz(1, g00VarH2, g00.class, "handleError", "handleError(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V", 0, (byte) 0), null, g00VarH2.p.b, new kz(g00VarH2, null));
                return Unit.f46060a;
            case 6:
                jdk0 jdk0Var7 = mz.V1;
                Context contextO0 = mzVar.o0();
                View currentFocus = mzVar.n0().getCurrentFocus();
                t32 t32Var = new t32((byte) 28);
                if (currentFocus != null) {
                    new Handler(Looper.getMainLooper()).postDelayed(new b1(contextO0, currentFocus.getWindowToken(), t32Var, b2), 0L);
                }
                g00 g00VarH3 = mzVar.H0();
                if (g00VarH3.D) {
                    sac.V(jiu0.a(g00VarH3), new nz(g00VarH3, (byte) 0), null, g00VarH3.p.f22085a, new oa(g00VarH3, yjeVar, b2), 10);
                }
                return Unit.f46060a;
            case 7:
                jdk0 jdk0Var8 = mz.V1;
                mzVar.H0().z.f(qzVar);
                return Unit.f46060a;
            default:
                jdk0 jdk0Var9 = mz.V1;
                mzVar.H0().z.f(qzVar);
                return Unit.f46060a;
        }
    }
}
