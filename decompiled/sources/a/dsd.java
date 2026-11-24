package a;

/* JADX INFO: loaded from: classes.dex */
public final class dsd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ esd f6607a;

    public dsd(esd esdVar) {
        this.f6607a = esdVar;
    }

    public final void a() {
        esd esdVar = this.f6607a;
        synchronized (esdVar) {
            esdVar.d = true;
        }
        this.f6607a.g();
    }
}
