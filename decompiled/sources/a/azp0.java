package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class azp0 {
    public static final zyp0 Companion = new zyp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1730a;
    public final String b;
    public final qii0 c;
    public final mag0 d;

    public /* synthetic */ azp0(int i, String str, String str2, qii0 qii0Var, mag0 mag0Var) {
        if ((i & 1) == 0) {
            this.f1730a = null;
        } else {
            this.f1730a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = qii0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = mag0Var;
        }
    }
}
