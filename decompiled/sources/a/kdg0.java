package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kdg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18107a;
    public final /* synthetic */ p8f b;
    public final /* synthetic */ x45 c;

    public /* synthetic */ kdg0(p8f p8fVar, x45 x45Var, byte b) {
        this.f18107a = b;
        this.b = p8fVar;
        this.c = x45Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f18107a;
        x45 x45Var = this.c;
        p8f p8fVar = this.b;
        switch (b) {
            case 0:
                p8fVar.a(x45Var);
                break;
            default:
                p8fVar.a(x45Var);
                break;
        }
    }
}
