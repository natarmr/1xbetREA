package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vfw0 implements egw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jdw0 f37356a;
    public final pek0 b;

    public vfw0(pek0 pek0Var, jdw0 jdw0Var) {
        bzs0 bzs0Var = dew0.f5972a;
        this.b = pek0Var;
        this.f37356a = jdw0Var;
    }

    @Override // a.egw0
    public final int a(jdw0 jdw0Var) {
        mgw0 mgw0Var = ((mew0) jdw0Var).zzc;
        int i = mgw0Var.d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < mgw0Var.f21761a; i2++) {
            int i3 = mgw0Var.b[i2] >>> 3;
            qdw0 qdw0Var = (qdw0) mgw0Var.c[i2];
            int iA = aew0.a(8);
            int iA2 = aew0.a(i3) + aew0.a(16);
            int iA3 = aew0.a(24);
            int iE = qdw0Var.e();
            iD = hne.D(iA + iA, iA2, ohs0.b(iE, iE, iA3), iD);
        }
        mgw0Var.d = iD;
        return iD;
    }

    @Override // a.egw0
    public final void b(Object obj, byte[] bArr, int i, int i2, mdw0 mdw0Var) {
        mew0 mew0Var = (mew0) obj;
        if (mew0Var.zzc == mgw0.f) {
            mew0Var.zzc = mgw0.a();
        }
        throw rw2.g(obj);
    }

    @Override // a.egw0
    public final boolean c(mew0 mew0Var, mew0 mew0Var2) {
        return mew0Var.zzc.equals(mew0Var2.zzc);
    }

    @Override // a.egw0
    public final int d(mew0 mew0Var) {
        return mew0Var.zzc.hashCode();
    }

    @Override // a.egw0
    public final void e(Object obj, hu5 hu5Var, bew0 bew0Var) {
        this.b.getClass();
        pek0.o(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.egw0
    public final void f(Object obj, owp0 owp0Var) {
        throw rw2.g(obj);
    }

    @Override // a.egw0
    public final void g(Object obj, Object obj2) {
        fgw0.b(obj, obj2);
    }

    @Override // a.egw0
    public final void h(Object obj) {
        this.b.getClass();
        mgw0 mgw0Var = ((mew0) obj).zzc;
        if (mgw0Var.e) {
            mgw0Var.e = false;
        }
        bzs0 bzs0Var = dew0.f5972a;
        throw rw2.g(obj);
    }

    @Override // a.egw0
    public final mew0 zza() {
        jdw0 jdw0Var = this.f37356a;
        if (jdw0Var instanceof mew0) {
            return ((mew0) jdw0Var).g();
        }
        iew0 iew0Var = (iew0) ((mew0) jdw0Var).q(5);
        boolean zE = iew0Var.b.e();
        mew0 mew0Var = iew0Var.b;
        if (!zE) {
            return mew0Var;
        }
        mew0Var.getClass();
        agw0.c.a(mew0Var.getClass()).h(mew0Var);
        mew0Var.f();
        return iew0Var.b;
    }

    @Override // a.egw0
    public final boolean zzl(Object obj) {
        throw rw2.g(obj);
    }
}
