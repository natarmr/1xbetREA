package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class etw0 extends zrw0 {
    public boolean c;

    public etw0(kxw0 kxw0Var) {
        super(kxw0Var);
        ((kxw0) this.b).A++;
    }

    @Override // a.p4
    public final void f1() {
        if (this.c) {
            jf4.n("Can't initialize twice");
        } else {
            if (o1()) {
                return;
            }
            ((kxw0) this.b).Y.incrementAndGet();
            this.c = true;
        }
    }

    public final void n1() {
        if (this.c) {
            return;
        }
        jf4.n("Not initialized");
    }

    public boolean o1() {
        return true;
    }
}
