package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class b75 {
    public static final a75 Companion = new a75();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2086a;
    public final String b;

    public /* synthetic */ b75(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f2086a = null;
        } else {
            this.f2086a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }
}
