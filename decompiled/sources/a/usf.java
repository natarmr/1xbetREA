package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class usf {
    public static final tsf Companion = new tsf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36207a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ usf(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.f36207a = null;
        } else {
            this.f36207a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
    }
}
