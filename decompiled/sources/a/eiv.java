package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class eiv extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final mne o;
    public final uvu p;
    public c4m0 q;

    public eiv(vzg0 vzg0Var, whv whvVar, mne mneVar, uvu uvuVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        bdv bdvVar = new bdv(whvVar, (byte) 3);
        bcn bcnVar = new bcn(ctf0Var, (byte) 20);
        vs10 vs10Var = mneVar.c;
        super(null, bdvVar, bcnVar, cvm0.p(vs10Var, vs10Var), null);
        this.o = mneVar;
        this.p = uvuVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        List list;
        uhv uhvVar = (uhv) obj;
        uhvVar.getClass();
        super.x(uhvVar);
        if (uhvVar.equals(rhv.f30507a)) {
            v3c.N(this.q);
            return;
        }
        if (uhvVar.equals(shv.f32233a)) {
            this.q = i3t0.L(this, new fnq(i120.W(new div(this.p.f36366a.c.f21068a.z(), (byte) 0)), new j0s(this, null, (byte) 22), (byte) 4), this.o.f22085a, null, 2);
        } else {
            if (!(uhvVar instanceof thv)) {
                t9f.b();
                return;
            }
            long j = ((thv) uhvVar).f33978a;
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                list = ((zhv) value).b;
            } while (!p7m0Var.m(value, new zhv((String) list.get((int) j), list)));
        }
    }
}
