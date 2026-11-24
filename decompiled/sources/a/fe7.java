package a;

/* JADX INFO: loaded from: classes5.dex */
public enum fe7 implements vrz {
    BET_LIMIT_1_DAY(1),
    BET_LIMIT_7_DAY(2),
    BET_LIMIT_30_DAY(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9391a;

    /* JADX WARN: Multi-variable type inference failed */
    fe7(int i) {
        this.f9391a = i;
    }

    @Override // a.vrz
    public final int getId() {
        return this.f9391a;
    }
}
