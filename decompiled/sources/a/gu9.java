package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gu9 extends i3t0 {
    public static final /* synthetic */ int s = 0;
    public final ctf0 o;
    public final lef0 p;
    public final long q;
    public final mne r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu9(ctf0 ctf0Var, lef0 lef0Var, long j, mne mneVar) {
        super(null, new mn9((byte) 12), new d69((byte) 5), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = ctf0Var;
        this.p = lef0Var;
        this.q = j;
        this.r = mneVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        qt9 qt9Var = (qt9) obj;
        qt9Var.getClass();
        boolean z = qt9Var instanceof ot9;
        yje yjeVar = null;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, eu9.a((eu9) value5, ((ot9) qt9Var).f25818a, null, false, 6)));
            return;
        }
        if (qt9Var instanceof nt9) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, eu9.a((eu9) value4, 0, ((nt9) qt9Var).f24086a, false, 5)));
            return;
        }
        if (qt9Var instanceof mt9) {
            byte b = 23;
            sac.V(jiu0.a(this), new d38(this, b), null, this.r.f22085a, new qv3(this, yjeVar, b), 10);
            return;
        }
        boolean z2 = qt9Var instanceof pt9;
        cu9 cu9Var = cu9.f4976a;
        if (z2) {
            if (!((eu9) D()).c) {
                G(cu9Var);
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, eu9.a((eu9) value3, 0, null, true, 3)));
            return;
        }
        if (qt9Var instanceof lt9) {
            if (!((eu9) D()).c) {
                G(cu9Var);
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, eu9.a((eu9) value2, 0, null, true, 3)));
            return;
        }
        if (!(qt9Var instanceof jt9)) {
            if (qt9Var instanceof kt9) {
                E();
            }
        } else {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value = p7m0Var5.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value, eu9.a((eu9) value, 0, null, false, 3)));
        }
    }
}
