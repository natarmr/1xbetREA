package a;

/* JADX INFO: loaded from: classes6.dex */
public final class l6v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3v0 f19527a;
    public final scu b;
    public final ntu c;
    public final pru d;

    public l6v(h3v0 h3v0Var, scu scuVar, ntu ntuVar, pru pruVar) {
        h3v0Var.getClass();
        this.f19527a = h3v0Var;
        this.b = scuVar;
        this.c = ntuVar;
        this.d = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(ql5 ql5Var, csr csrVar, boolean z, boolean z2, zje zjeVar) {
        k6v k6vVar;
        if (zjeVar instanceof k6v) {
            k6vVar = (k6v) zjeVar;
            int i = k6vVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                k6vVar.o = i - Integer.MIN_VALUE;
            } else {
                k6vVar = new k6v(this, zjeVar);
            }
        } else {
            k6vVar = new k6v(this, zjeVar);
        }
        Object objA = k6vVar.m;
        wne wneVar = wne.f39444a;
        int i2 = k6vVar.o;
        if (i2 == 0) {
            z1x.P(objA);
            long j = this.f19527a.b.f31523a;
            String strA = this.c.a();
            k6vVar.i = ql5Var;
            k6vVar.j = csrVar;
            k6vVar.k = z;
            k6vVar.l = z2;
            k6vVar.o = 1;
            objA = this.b.a(j, k6vVar, strA);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = k6vVar.l;
            z = k6vVar.k;
            csrVar = k6vVar.j;
            ql5Var = k6vVar.i;
            z1x.P(objA);
        }
        pbv pbvVar = (pbv) objA;
        boolean z3 = this.d.a().d.f27973a.g;
        if (csrVar.f4905a.f3145a.b() && !z3) {
            return w870.g;
        }
        if (z2) {
            return w870.f38709a;
        }
        txs0 txs0Var = ql5Var.i;
        if (txs0Var.f()) {
            return w870.b;
        }
        if (!pbvVar.i && txs0Var.a()) {
            return w870.c;
        }
        if (z && !csrVar.a()) {
            return w870.f;
        }
        if (csrVar.a() || !txs0Var.a()) {
            return (pbvVar.h || txs0Var.d() || csrVar.a()) ? w870.h : w870.d;
        }
        return w870.e;
    }
}
