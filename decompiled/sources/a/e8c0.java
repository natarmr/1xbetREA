package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class e8c0 {
    public static final d8c0 Companion = new d8c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7366a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Integer e;

    public /* synthetic */ e8c0(int i, Integer num, Integer num2, Integer num3, String str, String str2) {
        if ((i & 1) == 0) {
            this.f7366a = null;
        } else {
            this.f7366a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
    }
}
