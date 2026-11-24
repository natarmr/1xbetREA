package a;

import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fin0 extends w46 {
    public final i1w0 b;
    public final duj c;
    public final ntu d;
    public final ilp0 e;
    public final mne f;
    public final wgu g;
    public final n4u h;
    public final iqt i;
    public final hru j;
    public final hse0 k;
    public final p7m0 l;
    public final p7m0 m;
    public final ra10 n;
    public bby o;

    public fin0(i1w0 i1w0Var, duj dujVar, ntu ntuVar, ilp0 ilp0Var, mne mneVar, wgu wguVar, n4u n4uVar, iqt iqtVar, hru hruVar, hse0 hse0Var, sa10 sa10Var) {
        i1w0Var.getClass();
        wguVar.getClass();
        hse0Var.getClass();
        this.b = i1w0Var;
        this.c = dujVar;
        this.d = ntuVar;
        this.e = ilp0Var;
        this.f = mneVar;
        this.g = wguVar;
        this.h = n4uVar;
        this.i = iqtVar;
        this.j = hruVar;
        this.k = hse0Var;
        this.l = q7m0.a(yhn0.f42645a);
        this.m = q7m0.a(Boolean.FALSE);
        this.n = sa10.b(sa10Var, pb10.g, R.string.data_retrieval_error, 0, null, 28);
    }

    public final void w(boolean z) {
        bby bbyVar = this.o;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            x(new cin0(this, null, (byte) 3));
            this.o = sac.V(jiu0.a(this), new xhn0(this, b), null, this.f.b, new din0(z, this, (yje) null), 10);
        }
    }

    public final void x(Function1 function1) {
        sac.V(jiu0.a(this), ein0.f7868a, null, this.f.c, new a2f(function1, null, (byte) 6), 10);
    }
}
