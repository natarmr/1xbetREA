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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h5c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12472a;
    public final /* synthetic */ l5c b;

    public /* synthetic */ h5c(l5c l5cVar, byte b) {
        this.f12472a = b;
        this.b = l5cVar;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01d8  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        it2 it2Var;
        byte b = this.f12472a;
        yje yjeVar = null;
        l5c l5cVar = this.b;
        switch (b) {
            case 0:
                kl5 kl5Var = l5c.W1;
                l5cVar.I0().a();
                return Unit.f46060a;
            case 1:
                kl5 kl5Var2 = l5c.W1;
                l5c l5cVar2 = this.b;
                wdk0 wdk0Var = l5cVar2.O1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = l5cVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), l5cVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 2:
                ywq ywqVar = l5cVar.S1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 3:
                kl5 kl5Var3 = l5c.W1;
                l5cVar.I0().x();
                return Unit.f46060a;
            case 4:
                kl5 kl5Var4 = l5c.W1;
                ComponentCallbacks2 application = l5cVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(m5c.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof m5c)) {
                        ze3Var = null;
                    }
                    m5c m5cVar = (m5c) ze3Var;
                    if (m5cVar != null) {
                        i1w0 i1w0VarF = a4n0.f(l5cVar);
                        d6c d6cVar = (d6c) l5cVar.V1.n(l5cVar, l5c.X1[1]);
                        i1w0VarF.getClass();
                        pv00 pv00Var = m5cVar.G;
                        gst0 gst0Var = m5cVar.u;
                        ctf0 ctf0Var = m5cVar.f21213a;
                        pmi0 pmi0Var = m5cVar.c;
                        duj dujVar = m5cVar.b;
                        mne mneVar = m5cVar.d;
                        cyh cyhVar = m5cVar.e;
                        nr nrVar = m5cVar.f;
                        s64 s64Var = m5cVar.g;
                        yo4 yo4Var = m5cVar.h;
                        uuz uuzVar = m5cVar.j;
                        qgd qgdVar = m5cVar.i;
                        jh70 jh70Var = m5cVar.k;
                        eru eruVar = m5cVar.l;
                        ii iiVar = m5cVar.q;
                        rjo rjoVar = m5cVar.m;
                        fsd fsdVar = m5cVar.n;
                        lef0 lef0Var = m5cVar.o;
                        usd usdVar = m5cVar.p;
                        nvu nvuVar = m5cVar.r;
                        pru pruVar = m5cVar.s;
                        m1e m1eVar = m5cVar.t;
                        wdk0 wdk0Var2 = m5cVar.v;
                        vby vbyVar = m5cVar.x;
                        q7d0 q7d0Var = m5cVar.w;
                        yox yoxVar = m5cVar.y;
                        ouu ouuVar = m5cVar.z;
                        rou rouVar = m5cVar.A;
                        z4w0 z4w0Var = m5cVar.B;
                        nr00 nr00Var = m5cVar.C;
                        dmt dmtVar = m5cVar.D;
                        lme0 lme0Var = m5cVar.E;
                        lp4 lp4Var = m5cVar.F;
                        d190 d190Var = m5cVar.H;
                        mi70 mi70Var = m5cVar.I;
                        zn00 zn00Var = m5cVar.J;
                        qud qudVar = m5cVar.K;
                        e41 e41Var = m5cVar.L;
                        s31 s31Var = m5cVar.M;
                        lp4Var.getClass();
                        vbyVar.getClass();
                        q7d0Var.getClass();
                        iiVar.getClass();
                        gst0Var.getClass();
                        ctf0Var.getClass();
                        fsdVar.getClass();
                        m1eVar.getClass();
                        wdk0Var2.getClass();
                        d190Var.getClass();
                        return new lci(lef0Var, yoxVar, nr00Var, lp4Var, pv00Var, dmtVar, lme0Var, pmi0Var, iiVar, gst0Var, i1w0VarF, d6cVar, ctf0Var, dujVar, mneVar, cyhVar, nrVar, s64Var, yo4Var, qgdVar, uuzVar, jh70Var, eruVar, rjoVar, usdVar, nvuVar, pruVar, m1eVar, wdk0Var2, ouuVar, rouVar, z4w0Var, mi70Var, zn00Var, qudVar, e41Var, s31Var);
                    }
                }
                jf4.n(b1j.i(m5c.class, "Cannot create dependency "));
                return null;
            case 5:
                kl5 kl5Var5 = l5c.W1;
                return (kci) ((lci) l5cVar.R1.getValue()).K.get();
            case 6:
                kl5 kl5Var6 = l5c.W1;
                l5cVar.I0().a();
                return Unit.f46060a;
            case 7:
                kl5 kl5Var7 = l5c.W1;
                v7c v7cVarI0 = l5cVar.I0();
                String strValueOf = String.valueOf(l5cVar.H0().f.getText());
                v7cVarI0.H(vm4.ACTIVATE, q64.ACTIVATE);
                if (((i7c) v7cVarI0.Q.getValue()).m) {
                    ((kt2) v7cVarI0.h.b).c("reg_approve_code_done");
                    v7cVarI0.F(jiu0.a(v7cVarI0), v7cVarI0.g.b, new zhb(1, v7cVarI0, v7c.class, "onValidationFailed", "onValidationFailed(Ljava/lang/Throwable;)V", 0, (byte) 15), new fr9(v7cVarI0, strValueOf, yjeVar, (byte) 6));
                } else {
                    v7cVarI0.P.f(v6c.f36870a);
                }
                return Unit.f46060a;
            case 8:
                kl5 kl5Var8 = l5c.W1;
                l5cVar.I0().w();
                return Unit.f46060a;
            case 9:
                kl5 kl5Var9 = l5c.W1;
                l5cVar.I0().G(wm4.CANCEL, o64.CANCEL);
                return Unit.f46060a;
            case 10:
                kl5 kl5Var10 = l5c.W1;
                v7c v7cVarI1 = l5cVar.I0();
                i1w0 i1w0Var = v7cVarI1.c;
                d6c d6cVar2 = v7cVarI1.d;
                if (d6cVar2 == null) {
                    v7cVarI1.w();
                } else if (d6cVar2 instanceof v5c) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(((v5c) d6cVar2).i0())), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (d6cVar2 instanceof z5c) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new d1w0(((z5c) d6cVar2).i)), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                } else if (d6cVar2 instanceof c6c) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                    ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(((c6c) d6cVar2).i)), i1w0Var, copyOnWriteArrayListQ3, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorP3;
                        if (pawVar3.hasNext()) {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else if (d6cVar2 instanceof x5c) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                    ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, new q0w0(((x5c) d6cVar2).g)), i1w0Var, copyOnWriteArrayListQ4, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorP4;
                        if (pawVar4.hasNext()) {
                            i1w0Var.a((oe50) pawVar4.next());
                        }
                    }
                } else if (d6cVar2 instanceof w5c) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                    ListIterator listIteratorP5 = b1j.p(copyOnWriteArrayListQ5, new c8d(y7d.f42146a, new d1w0(((w5c) d6cVar2).g)), i1w0Var, copyOnWriteArrayListQ5, 0);
                    while (true) {
                        paw pawVar5 = (paw) listIteratorP5;
                        if (pawVar5.hasNext()) {
                            i1w0Var.a((oe50) pawVar5.next());
                        }
                    }
                } else {
                    v7cVarI1.w();
                }
                return Unit.f46060a;
            default:
                kl5 kl5Var11 = l5c.W1;
                v7c v7cVarI2 = l5cVar.I0();
                d6c d6cVar3 = v7cVarI2.d;
                if (d6cVar3 != null) {
                    if ((d6cVar3 instanceof o5c) || (d6cVar3 instanceof p5c) || (d6cVar3 instanceof q5c)) {
                        it2Var = it2.LINKING_AUTHENTICATOR;
                    } else if (d6cVar3 instanceof s5c) {
                        it2Var = it2.PASS_RECOVERY;
                    } else if (d6cVar3 instanceof t5c) {
                        it2Var = it2.CHANGE;
                    } else if ((d6cVar3 instanceof u5c) || (d6cVar3 instanceof w5c)) {
                        it2Var = it2.PHONE_ACTIVATE;
                    } else if (d6cVar3 instanceof x5c) {
                        it2Var = it2.LINKING_PHONE;
                    } else if (d6cVar3 instanceof z5c) {
                        it2Var = it2.PHONE_ACTIVATE;
                    } else if (d6cVar3 instanceof a6c) {
                        it2Var = it2.REGISTRATION_BY_PHONE;
                    } else if (d6cVar3 instanceof b6c) {
                        it2Var = it2.PASS_RECOVERY;
                    } else if (d6cVar3 instanceof c6c) {
                        int i = ((c6c) d6cVar3).c;
                        if (12 > i || i >= 17) {
                            it2Var = i == 11 ? it2.CHANGE : it2.LINKING_PHONE;
                        } else {
                            it2Var = it2.LINKING_AUTHENTICATOR;
                        }
                    }
                    v7cVarI2.M.b(it2Var);
                    v7cVarI2.N.b("сhat", it2Var.f15333a);
                    i1w0 i1w0Var2 = v7cVarI2.c;
                    CopyOnWriteArrayList copyOnWriteArrayListQ6 = b1j.q(i1w0Var2);
                    FragmentScreen fragmentScreenB = v7cVarI2.p.b();
                    if (fragmentScreenB instanceof DialogScreen) {
                        copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                    } else {
                        copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var2, copyOnWriteArrayListQ6, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO;
                        if (!pawVar6.hasNext()) {
                            return Unit.f46060a;
                        }
                        i1w0Var2.a((oe50) pawVar6.next());
                    }
                }
                t9f.b();
                return null;
        }
    }
}
