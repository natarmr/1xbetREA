package a;

/* JADX INFO: loaded from: classes6.dex */
public final class rp20 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30866a;

    public rp20(String str) {
        super(str);
        this.f30866a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f30866a;
    }
}
