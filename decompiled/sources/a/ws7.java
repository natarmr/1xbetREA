package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ws7 {
    public static final ls7 Companion = new ls7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39678a;
    public final Long b;
    public final vs7 c;

    public /* synthetic */ ws7(int i, Long l, Long l2, vs7 vs7Var) {
        if ((i & 1) == 0) {
            this.f39678a = null;
        } else {
            this.f39678a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vs7Var;
        }
    }
}
