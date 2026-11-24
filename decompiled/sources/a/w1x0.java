package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w1x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38423a;
    public final /* synthetic */ c2x0 b;

    public w1x0(c2x0 c2x0Var, byte b) {
        this.f38423a = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(c2x0Var);
                this.b = c2x0Var;
                break;
            default:
                Objects.requireNonNull(c2x0Var);
                this.b = c2x0Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f38423a;
        c2x0 c2x0Var = this.b;
        switch (b) {
            case 0:
                c2x0Var.f = c2x0Var.k;
                break;
            default:
                c2x0Var.k = null;
                break;
        }
    }
}
