package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class uc1 {
    public static final tc1 Companion = new tc1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc1 f35408a;
    public final int b;
    public final String c;

    public /* synthetic */ uc1(int i, sc1 sc1Var, int i2, String str) {
        if ((i & 1) == 0) {
            this.f35408a = null;
        } else {
            this.f35408a = sc1Var;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }
}
