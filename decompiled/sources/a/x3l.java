package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class x3l {
    public static final w3l Companion = new w3l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40225a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ x3l(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.f40225a = null;
        } else {
            this.f40225a = num;
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
