package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u5x0 extends k5x0 {
    public boolean d;

    public u5x0(m6x0 m6x0Var) {
        super(m6x0Var);
        this.c.r++;
    }

    public final void n1() {
        if (this.d) {
            return;
        }
        jf4.n("Not initialized");
    }

    public final void o1() {
        if (this.d) {
            jf4.n("Can't initialize twice");
            return;
        }
        p1();
        this.c.s++;
        this.d = true;
    }

    public void p1() {
    }
}
