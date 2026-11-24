package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kf30 {
    public static final jf30 Companion = new jf30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18180a;
    public final String b;
    public final String c;

    public /* synthetic */ kf30(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f18180a = null;
        } else {
            this.f18180a = num;
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
