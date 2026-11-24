package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kkx extends bkx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18462a;
    public final int b;
    public boolean c;
    public int d;

    public kkx(int i, int i2, int i3) {
        this.f18462a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // a.bkx
    public final int nextInt() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.f18462a + i;
            return i;
        }
        if (this.c) {
            this.c = false;
            return i;
        }
        itt0.a();
        return 0;
    }
}
