package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10861a;
    public final /* synthetic */ j8f b;
    public final /* synthetic */ sd60 c;

    public /* synthetic */ g8f(j8f j8fVar, sd60 sd60Var, byte b) {
        this.f10861a = b;
        this.b = j8fVar;
        this.c = sd60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f10861a;
        sd60 sd60Var = this.c;
        j8f j8fVar = this.b;
        switch (b) {
            case 0:
                j8fVar.a(sd60Var);
                break;
            default:
                j8fVar.a(sd60Var);
                break;
        }
    }
}
