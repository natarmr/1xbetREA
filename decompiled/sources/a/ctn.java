package a;

/* JADX INFO: loaded from: classes.dex */
public final class ctn implements btn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4946a;
    public int b = -1;
    public int c = -1;

    public ctn(int i) {
        this.f4946a = i;
    }

    @Override // a.btn
    public final boolean a(CharSequence charSequence, int i, int i2, u0t0 u0t0Var) {
        int i3 = this.f4946a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // a.btn
    public final Object b() {
        return this;
    }
}
