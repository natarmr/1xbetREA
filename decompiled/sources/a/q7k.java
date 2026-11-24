package a;

/* JADX INFO: loaded from: classes5.dex */
public enum q7k implements trz {
    DEPOSIT_LIMIT_1_DAY(20),
    DEPOSIT_LIMIT_7_DAY(21),
    DEPOSIT_LIMIT_30_DAY(22);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28253a;

    /* JADX WARN: Multi-variable type inference failed */
    q7k(int i) {
        this.f28253a = i;
    }

    @Override // a.trz
    public final int getId() {
        return this.f28253a;
    }
}
