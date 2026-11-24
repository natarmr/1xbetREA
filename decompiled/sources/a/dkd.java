package a;

/* JADX INFO: loaded from: classes.dex */
public final class dkd extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6225a;

    public dkd(String str) {
        this.f6225a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6225a;
    }
}
