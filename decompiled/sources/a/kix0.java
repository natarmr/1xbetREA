package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kix0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vgx0 f18359a;
    public int b;
    public int c;
    public final /* synthetic */ mix0 d;

    public /* synthetic */ kix0(mix0 mix0Var, vgx0 vgx0Var, int i) {
        this.d = mix0Var;
        this.f18359a = vgx0Var;
        int i2 = i & 31;
        this.b = i2;
        this.c = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        mix0 mix0Var = this.d;
        wgm0 wgm0Var = mix0Var.b;
        int iY = wgm0Var.y();
        Object objCast = this.f18359a.b.cast(i >= iY ? mix0Var.c.B(i - iY) : wgm0Var.B(i));
        int i2 = this.c;
        if (i2 == 0) {
            this.b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.c >>>= iNumberOfTrailingZeros;
        this.b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
