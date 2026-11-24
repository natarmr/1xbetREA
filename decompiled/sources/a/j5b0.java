package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class j5b0 extends w3k {
    public final i1w0 c;
    public final rkt0 d;
    public final g2v e;
    public final ctf0 f;
    public final pwi g;
    public final iij h;
    public final std i;
    public final m1e j;
    public final mne k;
    public final pru l;
    public final p7m0 m;
    public bby n;
    public bby o;
    public bby p;
    public boolean q;
    public final n0o0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5b0(vzg0 vzg0Var, i1w0 i1w0Var, rkt0 rkt0Var, g2v g2vVar, ctf0 ctf0Var, pwi pwiVar, iij iijVar, std stdVar, m1e m1eVar, mne mneVar, pru pruVar) {
        super(vzg0Var, kotlin.collections.a.c(iijVar));
        ctf0Var.getClass();
        m1eVar.getClass();
        this.c = i1w0Var;
        this.d = rkt0Var;
        this.e = g2vVar;
        this.f = ctf0Var;
        this.g = pwiVar;
        this.h = iijVar;
        this.i = stdVar;
        this.j = m1eVar;
        this.k = mneVar;
        this.l = pruVar;
        this.m = q7m0.a(w(true));
        this.q = true;
        this.r = maz.b(new ehj(this, (byte) 3));
    }

    public static vro w(boolean z) {
        return new vro(new rro(z), new rro(z));
    }

    public final void x(y4b0 y4b0Var) {
        p7m0 p7m0Var = this.m;
        d5b0 d5b0VarZ = z((vro) p7m0Var.getValue());
        y4b0 y4b0Var2 = y4b0.b;
        if (y4b0Var == y4b0Var2) {
            bby bbyVar = this.n;
            if (bbyVar != null && bbyVar.isActive()) {
                return;
            }
            if (d5b0VarZ instanceof a5b0) {
                Throwable th = ((a5b0) d5b0VarZ).f264a;
                if (!hic.C(th) && !(th instanceof hr30)) {
                    return;
                }
            }
        }
        v3c.N(this.n);
        mne mneVar = this.k;
        byte b = 0;
        yje yjeVar = null;
        if (y4b0Var == y4b0Var2 && ((d5b0VarZ instanceof a5b0) || (d5b0VarZ instanceof c5b0))) {
            vro vroVarW = w(false);
            p7m0Var.getClass();
            p7m0Var.o(null, vroVarW);
            bby bbyVar2 = this.p;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.p = sac.V(jiu0.a(this), new kma0((byte) 17), null, mneVar.b, new i5b0(this, yjeVar, b), 10);
        } else if (!(d5b0VarZ instanceof z4b0)) {
            vro vroVarW2 = w(true);
            p7m0Var.getClass();
            p7m0Var.o(null, vroVarW2);
        }
        this.n = sac.V(jiu0.a(this), new kma0((byte) 15), null, mneVar.b, new o690(this, y4b0Var == y4b0.f41994a, (yje) null), 10);
    }

    public final void y() {
        ((p7m0) this.h.g).o(null, r9o.f30093a);
    }

    public final d5b0 z(vro vroVar) {
        tro troVar = vroVar.f37909a;
        tro troVar2 = vroVar.b;
        boolean z = troVar instanceof rro;
        boolean z2 = true;
        if (z || (troVar2 instanceof rro)) {
            if ((!z || !((rro) troVar).f30994a) && (!(troVar2 instanceof rro) || !((rro) troVar2).f30994a)) {
                z2 = false;
            }
            return new b5b0(z2);
        }
        Throwable th = null;
        qro qroVar = troVar instanceof qro ? (qro) troVar : null;
        if (!((qroVar != null ? qroVar.f29219a : null) instanceof hr30)) {
            boolean z3 = troVar2 instanceof qro;
            qro qroVar2 = z3 ? (qro) troVar2 : null;
            if (!((qroVar2 != null ? qroVar2.f29219a : null) instanceof hr30) && (!(troVar instanceof qro) || !z3)) {
                ArrayList arrayListQ0 = CollectionsKt.q0(troVar instanceof sro ? ((sro) troVar).b : iun.f15405a, troVar2 instanceof sro ? ((sro) troVar2).b : iun.f15405a);
                return arrayListQ0.isEmpty() ? new c5b0(g2v.d(this.e, pb10.g, null, null, R.string.currently_no_events, R.string.refresh_data, new ehj(this, (byte) 5), 94)) : new z4b0(arrayListQ0);
            }
        }
        List listJ = q3d.j(troVar, troVar2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (obj instanceof qro) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = ((qro) it.next()).f29219a;
            if (!hic.C(th2)) {
                th2 = null;
            }
            if (th2 != null) {
                th = th2;
                break;
            }
        }
        if (th == null) {
            th = ((qro) CollectionsKt.U(arrayList)).f29219a;
        }
        return new a5b0(th, g2v.d(this.e, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new ehj(this, (byte) 4), 94));
    }
}
