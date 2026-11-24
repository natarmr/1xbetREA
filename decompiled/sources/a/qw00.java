package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qw00 {
    public static final mw00 Companion = new mw00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29413a;
    public final Long b;
    public final String c;
    public final Long d;
    public final pw00 e;
    public final String f;

    public /* synthetic */ qw00(int i, String str, Long l, String str2, Long l2, pw00 pw00Var, String str3) {
        if ((i & 1) == 0) {
            this.f29413a = null;
        } else {
            this.f29413a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = pw00Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }
}
