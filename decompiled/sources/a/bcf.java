package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bcf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2355a;
    public final /* synthetic */ dcf b;
    public final /* synthetic */ e0u c;

    public /* synthetic */ bcf(dcf dcfVar, e0u e0uVar, byte b) {
        this.f2355a = b;
        this.b = dcfVar;
        this.c = e0uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f2355a;
        e0u e0uVar = this.c;
        dcf dcfVar = this.b;
        switch (b) {
            case 0:
                ((a1d) dcfVar.d()).j(e0uVar);
                break;
            case 1:
                ((a1d) dcfVar.d()).j(e0uVar);
                break;
            default:
                ((a1d) dcfVar.d()).j(e0uVar);
                break;
        }
    }
}
