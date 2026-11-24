package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jcq {
    public static final icq Companion = new icq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16289a;
    public final String b;
    public final Integer c;

    public /* synthetic */ jcq(int i, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f16289a = null;
        } else {
            this.f16289a = num;
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
