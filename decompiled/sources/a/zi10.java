package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zi10 {
    public static final yi10 Companion = new yi10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f44419a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Double e;
    public final wh10 f;

    public /* synthetic */ zi10(int i, Integer num, Integer num2, Integer num3, String str, Double d, wh10 wh10Var) {
        if ((i & 1) == 0) {
            this.f44419a = null;
        } else {
            this.f44419a = num;
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
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = wh10Var;
        }
    }
}
