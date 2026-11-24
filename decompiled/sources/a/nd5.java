package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23324a;
    public final /* synthetic */ fp b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nd5(fp fpVar, Object obj, byte b) {
        this.f23324a = b;
        this.b = fpVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f23324a;
        Object obj = this.c;
        fp fpVar = this.b;
        switch (b) {
            case 0:
                if (fpVar.b == 0) {
                    fpVar.W(obj);
                }
                break;
            default:
                int i = fpVar.b - 1;
                fpVar.b = i;
                if (i == 0) {
                    fpVar.W(obj);
                }
                break;
        }
    }
}
