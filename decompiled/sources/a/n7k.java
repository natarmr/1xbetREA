package a;

/* JADX INFO: loaded from: classes5.dex */
public enum n7k implements vrz {
    DEPOSIT_LIMIT_1_DAY(20),
    DEPOSIT_LIMIT_7_DAY(21),
    DEPOSIT_LIMIT_30_DAY(22);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f23045a;

    /* JADX WARN: Multi-variable type inference failed */
    n7k(int i) {
        this.f23045a = i;
    }

    @Override // a.vrz
    public final int getId() {
        return this.f23045a;
    }
}
