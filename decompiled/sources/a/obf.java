package a;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class obf {
    public static final nbf Companion = new nbf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24975a;
    public final String b;

    public /* synthetic */ obf(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, mbf.f21504a.getDescriptor());
            throw null;
        }
        this.f24975a = j;
        this.b = str;
    }

    public obf(long j, String str) {
        str.getClass();
        this.f24975a = j;
        this.b = str;
    }
}
