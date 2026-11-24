package a;

/* JADX INFO: loaded from: classes2.dex */
public final class u3x extends r3x {
    public final void f(Object... objArr) {
        int length = objArr.length;
        h8x.w(length, objArr);
        d(length);
        System.arraycopy(objArr, 0, this.f29807a, this.b, length);
        this.b += length;
    }

    public final rcf0 g() {
        this.c = true;
        return b4x.k(this.b, this.f29807a);
    }
}
