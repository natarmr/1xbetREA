package a;

/* JADX INFO: loaded from: classes2.dex */
public enum hv00 implements a960 {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f13705a;

    /* JADX WARN: Multi-variable type inference failed */
    hv00(int i) {
        this.f13705a = i;
    }

    @Override // a.a960
    public final int a() {
        return this.f13705a;
    }
}
