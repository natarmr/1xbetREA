package a;

import com.google.firebase.perf.session.gauges.GaugeManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class net implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23403a;
    public final /* synthetic */ GaugeManager b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ts3 d;

    public /* synthetic */ net(GaugeManager gaugeManager, String str, ts3 ts3Var, byte b) {
        this.f23403a = b;
        this.b = gaugeManager;
        this.c = str;
        this.d = ts3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f23403a;
        ts3 ts3Var = this.d;
        String str = this.c;
        GaugeManager gaugeManager = this.b;
        switch (b) {
            case 0:
                gaugeManager.lambda$stopCollectingGauges$3(str, ts3Var);
                break;
            default:
                gaugeManager.lambda$startCollectingGauges$2(str, ts3Var);
                break;
        }
    }
}
