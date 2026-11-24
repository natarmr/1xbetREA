package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b4h0 {
    public static final a4h0 Companion = new a4h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1958a;
    public final Integer b;
    public final String c;

    public /* synthetic */ b4h0(int i, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f1958a = null;
        } else {
            this.f1958a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }
}
