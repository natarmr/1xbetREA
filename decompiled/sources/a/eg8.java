package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class eg8 {
    public static final dg8 Companion = new dg8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7751a;
    public final String b;
    public final String c;
    public final Boolean d;

    public /* synthetic */ eg8(int i, Boolean bool, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f7751a = null;
        } else {
            this.f7751a = num;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }
}
