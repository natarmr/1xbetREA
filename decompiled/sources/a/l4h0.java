package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l4h0 {
    public static final k4h0 Companion = new k4h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19405a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ l4h0(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f19405a = null;
        } else {
            this.f19405a = str;
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
