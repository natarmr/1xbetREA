package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ui10 {
    public static final ti10 Companion = new ti10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35708a;
    public final String b;
    public final Double c;
    public final wh10 d;

    public /* synthetic */ ui10(int i, Integer num, String str, Double d, wh10 wh10Var) {
        if ((i & 1) == 0) {
            this.f35708a = null;
        } else {
            this.f35708a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = wh10Var;
        }
    }
}
