package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kaf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17959a;
    public final /* synthetic */ oaf b;

    public /* synthetic */ kaf(oaf oafVar, byte b) {
        this.f17959a = b;
        this.b = oafVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17959a;
        yje yjeVar = null;
        oaf oafVar = this.b;
        switch (b) {
            case 0:
                nwd nwdVar = oaf.Q1;
                i1w0 i1w0Var = oafVar.H0().h;
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
            case 1:
                nwd nwdVar2 = oaf.Q1;
                lbf lbfVarH0 = oafVar.H0();
                String strValueOf = String.valueOf(oafVar.G0().f.getText());
                if (lbfVarH0.v) {
                    sac.V(jiu0.a(lbfVarH0), new qaf(lbfVarH0, (byte) 0), new jwd(lbfVarH0, (byte) 15), lbfVarH0.d.b, new xb2((Object) lbfVarH0, (Object) strValueOf, yjeVar, (byte) 11), 8);
                } else {
                    lbfVarH0.r.f(taf.f33609a);
                }
                return Unit.f46060a;
            case 2:
                nwd nwdVar3 = oaf.Q1;
                oaf oafVar2 = this.b;
                wdk0 wdk0Var = ((odi) oafVar2.M1.getValue()).n;
                rek0 rek0Var = rek0.b;
                String strH = oafVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), oafVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 3:
                nwd nwdVar4 = oaf.Q1;
                ComponentCallbacks2 application = oafVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(jaf.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof jaf)) {
                        ze3Var = null;
                    }
                    jaf jafVar = (jaf) ze3Var;
                    if (jafVar != null) {
                        i1w0 i1w0VarF = a4n0.f(oafVar);
                        paf pafVar = (paf) oafVar.P1.n(oafVar, oaf.R1[1]);
                        i1w0VarF.getClass();
                        lef0 lef0Var = jafVar.f16186a;
                        rjo rjoVar = jafVar.b;
                        jh70 jh70Var = jafVar.c;
                        mne mneVar = jafVar.d;
                        duj dujVar = jafVar.e;
                        m1e m1eVar = jafVar.i;
                        rou rouVar = jafVar.j;
                        ii iiVar = jafVar.k;
                        wdk0 wdk0Var2 = jafVar.f;
                        knf0 knf0Var = jafVar.g;
                        gii0 gii0Var = jafVar.h;
                        at4 at4Var = jafVar.l;
                        btt0 btt0Var = jafVar.m;
                        nr nrVar = jafVar.n;
                        s64 s64Var = jafVar.o;
                        mi70 mi70Var = jafVar.p;
                        qud qudVar = jafVar.q;
                        knf0Var.getClass();
                        gii0Var.getClass();
                        m1eVar.getClass();
                        iiVar.getClass();
                        wdk0Var2.getClass();
                        at4Var.getClass();
                        btt0Var.getClass();
                        return new odi(lef0Var, i1w0VarF, pafVar, rjoVar, jh70Var, mneVar, dujVar, m1eVar, rouVar, iiVar, wdk0Var2, nrVar, s64Var, mi70Var, qudVar);
                    }
                }
                jf4.n(b1j.i(jaf.class, "Cannot create dependency "));
                return null;
            default:
                nwd nwdVar5 = oaf.Q1;
                return (ndi) ((odi) oafVar.M1.getValue()).p.get();
        }
    }
}
