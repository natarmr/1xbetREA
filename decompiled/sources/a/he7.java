package a;

/* JADX INFO: loaded from: classes5.dex */
public enum he7 implements trz {
    BET_LIMIT_1_DAY(1),
    BET_LIMIT_7_DAY(2),
    BET_LIMIT_30_DAY(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f12907a;

    /* JADX WARN: Multi-variable type inference failed */
    he7(int i) {
        this.f12907a = i;
    }

    @Override // a.trz
    public final int getId() {
        return this.f12907a;
    }
}
