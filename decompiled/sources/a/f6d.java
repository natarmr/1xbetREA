package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class f6d {
    public static final d6d Companion = new d6d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9003a;
    public final String b;

    public /* synthetic */ f6d(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f9003a = null;
        } else {
            this.f9003a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}
