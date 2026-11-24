package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eeo extends lne {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public xw3 e;

    public final void F(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long H();

    public final boolean I() {
        xw3 xw3Var = this.e;
        if (xw3Var == null) {
            return false;
        }
        qvk qvkVar = (qvk) (xw3Var.isEmpty() ? null : xw3Var.removeFirst());
        if (qvkVar == null) {
            return false;
        }
        qvkVar.run();
        return true;
    }

    public abstract void shutdown();

    @Override // a.lne
    public final lne w(int i) {
        g7x.x(i);
        return this;
    }

    public final void x(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void y(qvk qvkVar) {
        xw3 xw3Var = this.e;
        if (xw3Var == null) {
            xw3Var = new xw3();
            this.e = xw3Var;
        }
        xw3Var.addLast(qvkVar);
    }
}
