package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ms20 {
    public static final ls20 Companion = new ls20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22299a;
    public final String b;

    public /* synthetic */ ms20(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f22299a = null;
        } else {
            this.f22299a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }
}
