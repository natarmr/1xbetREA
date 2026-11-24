package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class grr0 {
    public static final frr0 Companion = new frr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11796a;
    public final Double b;
    public final Integer c;

    public /* synthetic */ grr0(int i, Double d, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f11796a = null;
        } else {
            this.f11796a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }
}
