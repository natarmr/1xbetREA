package a;

/* JADX INFO: loaded from: classes2.dex */
public enum ge7 implements wrz {
    BET_LIMIT_1_DAY(1),
    BET_LIMIT_7_DAY(2),
    BET_LIMIT_30_DAY(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11139a;

    /* JADX WARN: Multi-variable type inference failed */
    ge7(int i) {
        this.f11139a = i;
    }

    @Override // a.wrz
    public final int getId() {
        return this.f11139a;
    }
}
