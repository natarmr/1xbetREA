package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h7t {
    public static final g7t Companion = new g7t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12591a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final Double e;
    public final Double f;

    public /* synthetic */ h7t(int i, Integer num, Long l, Integer num2, Integer num3, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.f12591a = null;
        } else {
            this.f12591a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d2;
        }
    }
}
