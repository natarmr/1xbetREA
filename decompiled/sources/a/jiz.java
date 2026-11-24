package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jiz {
    public static final iiz Companion = new iiz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16597a;
    public final String b;
    public final String c;

    public /* synthetic */ jiz(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f16597a = null;
        } else {
            this.f16597a = num;
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
