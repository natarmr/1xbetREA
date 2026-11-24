package a;

/* JADX INFO: loaded from: classes2.dex */
public final class nfr extends k2 implements Runnable {
    public ig00 h;

    @Override // a.l2
    public final void e() {
        this.h = null;
    }

    @Override // a.l2
    public final String l() {
        ig00 ig00Var = this.h;
        if (ig00Var == null) {
            return null;
        }
        return "delegate=[" + ig00Var + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig00 ig00Var = this.h;
        if (ig00Var != null) {
            o(ig00Var);
        }
    }
}
