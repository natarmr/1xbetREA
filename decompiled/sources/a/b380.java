package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b380 {
    public static final a380 Companion = new a380();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f1891a;
    public final String b;
    public final String c;

    public /* synthetic */ b380(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f1891a = null;
        } else {
            this.f1891a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
