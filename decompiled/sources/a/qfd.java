package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qfd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28626a;
    public final /* synthetic */ agd b;

    public /* synthetic */ qfd(agd agdVar, byte b) {
        this.f28626a = b;
        this.b = agdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f28626a;
        agd agdVar = this.b;
        switch (b) {
            case 0:
                agd.q(agdVar);
                break;
            default:
                agdVar.invalidateOptionsMenu();
                break;
        }
    }
}
