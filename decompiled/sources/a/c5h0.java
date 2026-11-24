package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class c5h0 {
    public static final v3h0 Companion = new v3h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3772a;
    public final String b;
    public final qnq0 c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ c5h0(int i, String str, String str2, qnq0 qnq0Var, String str3, Boolean bool) {
        if ((i & 1) == 0) {
            this.f3772a = null;
        } else {
            this.f3772a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = qnq0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }
}
