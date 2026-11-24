package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zln0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44589a;
    public final /* synthetic */ hzj b;

    public /* synthetic */ zln0(hzj hzjVar, byte b) {
        this.f44589a = b;
        this.b = hzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f44589a;
        hzj hzjVar = this.b;
        switch (b) {
            case 0:
                hzjVar.a();
                break;
            default:
                hzjVar.b();
                break;
        }
    }
}
