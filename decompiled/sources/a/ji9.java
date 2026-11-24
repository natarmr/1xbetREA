package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ji9 {
    public static final ii9 Companion = new ii9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16563a;
    public final String b;
    public final String c;
    public final gi9 d;

    public /* synthetic */ ji9(int i, String str, String str2, String str3, gi9 gi9Var) {
        if ((i & 1) == 0) {
            this.f16563a = null;
        } else {
            this.f16563a = str;
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
            this.d = gi9Var;
        }
    }
}
