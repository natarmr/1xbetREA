package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ew70 {
    public static final cw70 Companion = new cw70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8509a;
    public final String b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Long f;
    public final Long g;

    public /* synthetic */ ew70(int i, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8509a = null;
        } else {
            this.f8509a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
        }
    }
}
