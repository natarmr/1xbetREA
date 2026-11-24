package a;

/* JADX INFO: loaded from: classes2.dex */
public enum oki0 implements wrz {
    SESSION_TIME_LIMIT_1_DAY(31),
    SESSION_TIME_LIMIT_7_DAY(43),
    SESSION_TIME_LIMIT_30_DAY(36);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25407a;

    /* JADX WARN: Multi-variable type inference failed */
    oki0(int i) {
        this.f25407a = i;
    }

    @Override // a.wrz
    public final int getId() {
        return this.f25407a;
    }
}
