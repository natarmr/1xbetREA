package a;

/* JADX INFO: loaded from: classes2.dex */
public enum vv00 {
    VERBOSE(4),
    DEBUG(3),
    WARNING(2),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(1),
    NONE(0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f38075a;

    /* JADX WARN: Multi-variable type inference failed */
    vv00(int i) {
        this.f38075a = i;
    }
}
