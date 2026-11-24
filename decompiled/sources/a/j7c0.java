package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class j7c0 {
    public static final i7c0 Companion = new i7c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16034a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ j7c0(int i, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        if ((i & 1) == 0) {
            this.f16034a = null;
        } else {
            this.f16034a = num;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
    }
}
