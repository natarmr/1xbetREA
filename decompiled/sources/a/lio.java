package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lio {
    public static final kio Companion = new kio();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20116a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Boolean e;

    public /* synthetic */ lio(int i, Boolean bool, Long l, Long l2, Long l3, String str) {
        if ((i & 1) == 0) {
            this.f20116a = null;
        } else {
            this.f20116a = l;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }
}
