package a;

/* JADX INFO: loaded from: classes6.dex */
public final class dmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6324a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public dmk(boolean z, int i, int i2, int i3, int i4) {
        this.f6324a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public int a() {
        return Math.min(this.c - this.f6324a, this.d - this.b);
    }

    public boolean b(int i) {
        if (i == 1) {
            if (this.f6324a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
