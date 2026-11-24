package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vbq {
    public static final ubq Companion = new ubq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37151a;
    public final Double b;
    public final Double c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final Boolean g;

    public /* synthetic */ vbq(int i, String str, Double d, Double d2, Long l, Long l2, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.f37151a = null;
        } else {
            this.f37151a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
    }
}
