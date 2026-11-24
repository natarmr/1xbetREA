package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class y40 {
    public static final x40 Companion = new x40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41977a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ y40(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        if ((i & 1) == 0) {
            this.f41977a = null;
        } else {
            this.f41977a = num;
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
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num6;
        }
    }
}
