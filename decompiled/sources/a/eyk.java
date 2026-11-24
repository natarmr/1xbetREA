package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class eyk {
    public static final dyk Companion = new dyk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8632a;
    public final String b;
    public final Integer c;

    public /* synthetic */ eyk(int i, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f8632a = null;
        } else {
            this.f8632a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }
}
