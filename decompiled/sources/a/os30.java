package a;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class os30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25766a;
    public final /* synthetic */ ps30 b;
    public final /* synthetic */ Timer c;

    public /* synthetic */ os30(ps30 ps30Var, Timer timer, byte b) {
        this.f25766a = b;
        this.b = ps30Var;
        this.c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f25766a;
        Timer timer = this.c;
        ps30 ps30Var = this.b;
        switch (b) {
            case 0:
                m03 m03VarB = ps30Var.b(timer);
                if (m03VarB != null) {
                    ps30Var.b.add(m03VarB);
                }
                break;
            default:
                m03 m03VarB2 = ps30Var.b(timer);
                if (m03VarB2 != null) {
                    ps30Var.b.add(m03VarB2);
                }
                break;
        }
    }
}
