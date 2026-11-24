package a;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class kfr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18209a;
    public final /* synthetic */ ig00 b;

    public /* synthetic */ kfr(ig00 ig00Var, byte b) {
        this.f18209a = b;
        this.b = ig00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18209a) {
            case 0:
                this.b.cancel(true);
                break;
            default:
                try {
                    hkb.E(this.b);
                } catch (ExecutionException e) {
                    m0x0.V().post(new fju0((Object) e, (byte) 13));
                }
                break;
        }
    }
}
