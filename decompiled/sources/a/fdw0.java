package a;

/* JADX INFO: loaded from: classes2.dex */
public enum fdw0 implements pew0 {
    UNKNOWN(0),
    SHARED_PREFS(1),
    CONTENT_PROVIDER(2),
    FILE(6),
    TIKTOK(4),
    DEVICE_CONFIG(5),
    PROCESS_STABLE_CONTENT_PROVIDER(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9377a;

    /* JADX WARN: Multi-variable type inference failed */
    fdw0(int i2) {
        this.f9377a = i2;
    }

    public static fdw0 a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return SHARED_PREFS;
            case 2:
                return CONTENT_PROVIDER;
            case 3:
                return PROCESS_STABLE_CONTENT_PROVIDER;
            case 4:
                return TIKTOK;
            case 5:
                return DEVICE_CONFIG;
            case 6:
                return FILE;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f9377a);
    }

    @Override // a.pew0
    public final int zza() {
        return this.f9377a;
    }
}
