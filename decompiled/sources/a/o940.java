package a;

/* JADX INFO: loaded from: classes2.dex */
public enum o940 implements t4d0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24862a;

    /* JADX WARN: Multi-variable type inference failed */
    o940(int i) {
        this.f24862a = i;
    }

    @Override // a.t4d0
    public final int a() {
        return this.f24862a;
    }
}
