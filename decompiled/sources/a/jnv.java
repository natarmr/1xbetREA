package a;

/* JADX INFO: loaded from: classes2.dex */
public enum jnv implements wlx {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16829a;

    jnv(int i2) {
        this.f16829a = i2;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f16829a;
        }
        jf4.o("Can't get the number of an unknown enum value.");
        return 0;
    }
}
