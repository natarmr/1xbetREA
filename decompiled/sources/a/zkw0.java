package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zkw0 implements dlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojw0 f44554a;

    public zkw0(ojw0 ojw0Var) {
        this.f44554a = ojw0Var;
    }

    @Override // a.dlw0
    public final boolean a(Object obj) {
        rw2.w(obj);
        throw null;
    }

    @Override // a.dlw0
    public final void b(Object obj) {
        klw0 klw0Var = ((jkw0) obj).zzb;
        if (klw0Var.e) {
            klw0Var.e = false;
        }
        rw2.w(obj);
        throw null;
    }

    @Override // a.dlw0
    public final void c(Object obj, zlt0 zlt0Var) {
        rw2.w(obj);
        throw null;
    }

    @Override // a.dlw0
    public final void d(Object obj, hu5 hu5Var, dkw0 dkw0Var) {
        qek0.n(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.dlw0
    public final int e(jkw0 jkw0Var) {
        return jkw0Var.zzb.hashCode();
    }

    @Override // a.dlw0
    public final int f(jkw0 jkw0Var) {
        klw0 klw0Var = jkw0Var.zzb;
        int i = klw0Var.d;
        if (i != -1) {
            return i;
        }
        int iD1 = 0;
        for (int i2 = 0; i2 < klw0Var.f18511a; i2++) {
            int i3 = klw0Var.b[i2] >>> 3;
            iD1 += p4.d1(3, (sjw0) klw0Var.c[i2]) + ohs0.C(i3, p4.i1(16), p4.i1(8) << 1);
        }
        klw0Var.d = iD1;
        return iD1;
    }

    @Override // a.dlw0
    public final boolean g(jkw0 jkw0Var, jkw0 jkw0Var2) {
        return jkw0Var.zzb.equals(jkw0Var2.zzb);
    }

    @Override // a.dlw0
    public final void h(Object obj, byte[] bArr, int i, int i2, mdw0 mdw0Var) {
        jkw0 jkw0Var = (jkw0) obj;
        if (jkw0Var.zzb == klw0.f) {
            jkw0Var.zzb = klw0.e();
        }
        throw rw2.g(obj);
    }

    @Override // a.dlw0
    public final void i(Object obj, Object obj2) {
        jiq0.C0(obj, obj2);
    }

    @Override // a.dlw0
    public final jkw0 zza() {
        ojw0 ojw0Var = this.f44554a;
        if (ojw0Var instanceof jkw0) {
            return ((jkw0) ojw0Var).p();
        }
        hkw0 hkw0Var = (hkw0) ((jkw0) ojw0Var).h(5);
        boolean zS = hkw0Var.b.s();
        jkw0 jkw0Var = hkw0Var.b;
        if (!zS) {
            return jkw0Var;
        }
        jkw0Var.q();
        return hkw0Var.b;
    }
}
