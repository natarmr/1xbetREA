package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class rnw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30808a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ zrw0 c;

    public rnw0(dqw0 dqw0Var, long j) {
        this.b = j;
        Objects.requireNonNull(dqw0Var);
        this.c = dqw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f30808a;
        long j = this.b;
        zrw0 zrw0Var = this.c;
        switch (b) {
            case 0:
                ((dqw0) zrw0Var).s1(j);
                break;
            default:
                c2x0 c2x0Var = (c2x0) zrw0Var;
                dqw0 dqw0Var = ((kxw0) c2x0Var.b).n;
                kxw0.d(dqw0Var);
                dqw0Var.p1(j);
                c2x0Var.f = null;
                break;
        }
    }

    public rnw0(c2x0 c2x0Var, long j) {
        this.b = j;
        Objects.requireNonNull(c2x0Var);
        this.c = c2x0Var;
    }
}
