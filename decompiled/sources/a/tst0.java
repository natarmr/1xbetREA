package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tst0 {
    public static final sst0 Companion = new sst0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f34478a;
    public final Boolean b;

    public /* synthetic */ tst0(int i, Boolean bool, Long l) {
        if ((i & 1) == 0) {
            this.f34478a = null;
        } else {
            this.f34478a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }
}
