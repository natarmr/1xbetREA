package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ivf0 {
    public static final hvf0 Companion = new hvf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fvf0 f15444a;
    public final String b;
    public final String c;

    public /* synthetic */ ivf0(int i, fvf0 fvf0Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.f15444a = null;
        } else {
            this.f15444a = fvf0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
