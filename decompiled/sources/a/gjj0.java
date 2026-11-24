package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gjj0 {
    public static final fjj0 Companion = new fjj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11400a;
    public final String b;
    public final String c;
    public final ywp0 d;

    public /* synthetic */ gjj0(int i, String str, String str2, String str3, ywp0 ywp0Var) {
        if ((i & 1) == 0) {
            this.f11400a = null;
        } else {
            this.f11400a = str;
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
            this.d = ywp0Var;
        }
    }
}
