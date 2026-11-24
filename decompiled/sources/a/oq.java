package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class oq {
    public static final nq Companion = new nq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25664a;
    public final String b;
    public final Long c;

    public /* synthetic */ oq(int i, Long l, Long l2, String str) {
        if ((i & 1) == 0) {
            this.f25664a = null;
        } else {
            this.f25664a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
    }
}
