package a;

/* JADX INFO: loaded from: classes2.dex */
public enum q940 implements t4d0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28330a;

    /* JADX WARN: Multi-variable type inference failed */
    q940(int i) {
        this.f28330a = i;
    }

    @Override // a.t4d0
    public final int a() {
        return this.f28330a;
    }
}
