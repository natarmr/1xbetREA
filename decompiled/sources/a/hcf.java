package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hcf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12821a;
    public final /* synthetic */ icf b;
    public final /* synthetic */ e0u c;

    public /* synthetic */ hcf(icf icfVar, e0u e0uVar, byte b) {
        this.f12821a = b;
        this.b = icfVar;
        this.c = e0uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f12821a;
        e0u e0uVar = this.c;
        icf icfVar = this.b;
        switch (b) {
            case 0:
                ((a1d) icfVar.d()).j(e0uVar);
                break;
            case 1:
                ((a1d) icfVar.d()).j(e0uVar);
                break;
            default:
                ((a1d) icfVar.d()).j(e0uVar);
                break;
        }
    }
}
