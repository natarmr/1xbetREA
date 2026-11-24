package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class k010 {
    public static final j010 Companion = new j010();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f17442a;
    public final Integer b;
    public final Double c;

    public /* synthetic */ k010(int i, Double d, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f17442a = null;
        } else {
            this.f17442a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
    }
}
