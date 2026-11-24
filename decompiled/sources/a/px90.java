package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class px90 {
    public static final ox90 Companion = new ox90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f27743a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ px90(int i, Long l, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f27743a = null;
        } else {
            this.f27743a = l;
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
            this.d = num3;
        }
    }
}
