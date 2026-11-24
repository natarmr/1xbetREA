package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r640 implements o2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3 f29918a;
    public final zdt0 b;
    public final vso c;

    public r640(zdt0 zdt0Var, vso vsoVar, x3 x3Var) {
        this.b = zdt0Var;
        vsoVar.getClass();
        this.c = vsoVar;
        this.f29918a = x3Var;
    }

    @Override // a.o2h0
    public final void a(Object obj, Object obj2) {
        w2h0.w(this.b, obj, obj2);
    }

    @Override // a.o2h0
    public final void b(Object obj) {
        this.b.getClass();
        ((jjt) obj).unknownFields.e = false;
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.o2h0
    public final boolean c(Object obj) {
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.o2h0
    public final Object d() {
        x3 x3Var = this.f29918a;
        return x3Var instanceof jjt ? ((jjt) x3Var).r() : x3Var.d().c();
    }

    @Override // a.o2h0
    public final void e(Object obj, psc pscVar) {
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.o2h0
    public final int f(jjt jjtVar) {
        this.b.getClass();
        wdt0 wdt0Var = jjtVar.unknownFields;
        int i = wdt0Var.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < wdt0Var.f38990a; i2++) {
            int i3 = wdt0Var.b[i2] >>> 3;
            iA += ryc.a(3, (og9) wdt0Var.c[i2]) + ryc.i(i3) + ryc.h(2) + (ryc.h(1) * 2);
        }
        wdt0Var.d = iA;
        return iA;
    }

    @Override // a.o2h0
    public final void g(Object obj, hu5 hu5Var, qso qsoVar) {
        this.b.getClass();
        zdt0.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.o2h0
    public final void h(Object obj, byte[] bArr, int i, int i2, vw3 vw3Var) {
        jjt jjtVar = (jjt) obj;
        if (jjtVar.unknownFields == wdt0.f) {
            jjtVar.unknownFields = wdt0.c();
        }
        throw rw2.g(obj);
    }

    @Override // a.o2h0
    public final int i(jjt jjtVar) {
        this.b.getClass();
        return jjtVar.unknownFields.hashCode();
    }

    @Override // a.o2h0
    public final boolean j(jjt jjtVar, jjt jjtVar2) {
        this.b.getClass();
        return jjtVar.unknownFields.equals(jjtVar2.unknownFields);
    }
}
