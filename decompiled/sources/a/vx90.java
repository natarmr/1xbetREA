package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vx90 {
    public static final ux90 Companion = new ux90();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new wm90(9)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f38190a;
    public final Integer b;
    public final String[] c;
    public final Integer d;

    public /* synthetic */ vx90(int i, Integer num, Integer num2, String[] strArr, Integer num3) {
        if ((i & 1) == 0) {
            this.f38190a = null;
        } else {
            this.f38190a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = strArr;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
    }
}
