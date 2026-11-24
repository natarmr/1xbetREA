package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ynn0 extends i3t0 {
    public final r7v o;
    public final ibu p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynn0(mne mneVar, ctf0 ctf0Var, long j, ibu ibuVar, hbu hbuVar, r7v r7vVar, ibu ibuVar2) {
        super(new pe1((Object) ibuVar, (Object) hbuVar, j, (byte) 6), cvm0.p(mneVar.f22085a, mneVar.c), new h0j0(ctf0Var, (byte) 8), (yzn0) null);
        ctf0Var.getClass();
        this.o = r7vVar;
        this.p = ibuVar2;
        if (((vnn0) D()).f37727a.f33777a == -1) {
            G(unn0.f35972a);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wdn wdnVar;
        rnn0 rnn0Var = (rnn0) obj;
        rnn0Var.getClass();
        super.x(rnn0Var);
        boolean z = rnn0Var instanceof qnn0;
        unn0 unn0Var = unn0.f35972a;
        ibu ibuVar = this.p;
        if (!z) {
            if (!rnn0Var.equals(pnn0.f27298a)) {
                t9f.b();
                return;
            } else {
                ibuVar.a(((vnn0) D()).f37727a, ((vnn0) D()).b);
                G(unn0Var);
                return;
            }
        }
        tdn tdnVar = ((vnn0) D()).f37727a;
        ibuVar.a(tdnVar, ((vnn0) D()).b);
        int iOrdinal = ((vnn0) D()).b.ordinal();
        if (iOrdinal == 0) {
            wdnVar = wdn.d;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            wdnVar = wdn.c;
        }
        this.o.h(tdnVar, wdnVar);
        G(unn0Var);
    }
}
