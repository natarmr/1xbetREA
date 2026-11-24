package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lbr {
    public static final jbr Companion = new jbr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19764a;
    public final String b;
    public final String c;
    public final cvh0 d;
    public final qt00 e;
    public final t1v0 f;

    public /* synthetic */ lbr(int i, String str, String str2, String str3, cvh0 cvh0Var, qt00 qt00Var, t1v0 t1v0Var) {
        if ((i & 1) == 0) {
            this.f19764a = null;
        } else {
            this.f19764a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cvh0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = qt00Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = t1v0Var;
        }
    }
}
