package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s640 implements p2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3 f31685a;
    public final aet0 b;
    public final wso c;

    public s640(aet0 aet0Var, wso wsoVar, y3 y3Var) {
        this.b = aet0Var;
        wsoVar.getClass();
        this.c = wsoVar;
        this.f31685a = y3Var;
    }

    @Override // a.p2h0
    public final void a(Object obj, Object obj2) {
        x2h0.j(this.b, obj, obj2);
    }

    @Override // a.p2h0
    public final void b(Object obj) {
        this.b.getClass();
        xdt0 xdt0Var = ((kjt) obj).unknownFields;
        if (xdt0Var.e) {
            xdt0Var.e = false;
        }
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.p2h0
    public final boolean c(Object obj) {
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.p2h0
    public final kjt d() {
        y3 y3Var = this.f31685a;
        if (y3Var instanceof kjt) {
            return (kjt) ((kjt) y3Var).j(4);
        }
        zit zitVar = (zit) ((kjt) y3Var).j(5);
        boolean zM = zitVar.b.m();
        kjt kjtVar = zitVar.b;
        if (!zM) {
            return kjtVar;
        }
        kjtVar.getClass();
        b5d0 b5d0Var = b5d0.c;
        b5d0Var.getClass();
        b5d0Var.a(kjtVar.getClass()).b(kjtVar);
        kjtVar.n();
        return zitVar.b;
    }

    @Override // a.p2h0
    public final int e(kjt kjtVar) {
        this.b.getClass();
        xdt0 xdt0Var = kjtVar.unknownFields;
        int i = xdt0Var.d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < xdt0Var.f40713a; i2++) {
            int i3 = xdt0Var.b[i2] >>> 3;
            lg9 lg9Var = (lg9) xdt0Var.c[i2];
            int iD2 = qyc.d(i3) + qyc.c(2) + (qyc.c(1) * 2);
            int iC = qyc.c(3);
            int size = lg9Var.size();
            iD += qyc.d(size) + size + iC + iD2;
        }
        xdt0Var.d = iD;
        return iD;
    }

    @Override // a.p2h0
    public final boolean f(kjt kjtVar, kjt kjtVar2) {
        this.b.getClass();
        return kjtVar.unknownFields.equals(kjtVar2.unknownFields);
    }

    @Override // a.p2h0
    public final void g(Object obj, prc prcVar) {
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.p2h0
    public final int h(kjt kjtVar) {
        this.b.getClass();
        return kjtVar.unknownFields.hashCode();
    }
}
