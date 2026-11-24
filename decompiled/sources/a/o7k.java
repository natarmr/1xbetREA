package a;

/* JADX INFO: loaded from: classes2.dex */
public enum o7k implements wrz {
    DEPOSIT_LIMIT_1_DAY(20),
    DEPOSIT_LIMIT_7_DAY(21),
    DEPOSIT_LIMIT_30_DAY(22);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24790a;

    /* JADX WARN: Multi-variable type inference failed */
    o7k(int i) {
        this.f24790a = i;
    }

    @Override // a.wrz
    public final int getId() {
        return this.f24790a;
    }
}
