package a;

/* JADX INFO: loaded from: classes.dex */
public final class cih0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4415a;
    public final /* synthetic */ androidx.appcompat.widget.d b;

    public /* synthetic */ cih0(androidx.appcompat.widget.d dVar, byte b) {
        this.f4415a = b;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f4415a;
        androidx.appcompat.widget.d dVar = this.b;
        switch (b) {
            case 0:
                dVar.s();
                break;
            default:
                cwf cwfVar = dVar.s1;
                if (cwfVar instanceof lhn0) {
                    cwfVar.b(null);
                }
                break;
        }
    }
}
