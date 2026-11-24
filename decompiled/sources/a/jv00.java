package a;

/* JADX INFO: loaded from: classes6.dex */
public enum jv00 implements t4d0 {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17183a;

    /* JADX WARN: Multi-variable type inference failed */
    jv00(int i2) {
        this.f17183a = i2;
    }

    @Override // a.t4d0
    public final int a() {
        return this.f17183a;
    }
}
