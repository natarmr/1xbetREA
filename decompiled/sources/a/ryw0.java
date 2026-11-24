package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ryw0 extends p4 {
    public boolean c;

    public ryw0(kxw0 kxw0Var) {
        super(kxw0Var);
        ((kxw0) this.b).A++;
    }

    public boolean n1() {
        return false;
    }

    public final void o1() {
        if (this.c) {
            return;
        }
        jf4.n("Not initialized");
    }

    public final void p1() {
        if (this.c) {
            jf4.n("Can't initialize twice");
        } else {
            if (n1()) {
                return;
            }
            ((kxw0) this.b).Y.incrementAndGet();
            this.c = true;
        }
    }
}
