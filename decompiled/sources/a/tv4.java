package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tv4 {
    public static final rv4 Companion = new rv4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34581a;
    public final Long b;
    public final yv4 c;
    public final Integer d;

    public /* synthetic */ tv4(int i, String str, Long l, yv4 yv4Var, Integer num) {
        if ((i & 1) == 0) {
            this.f34581a = null;
        } else {
            this.f34581a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = yv4Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }
}
