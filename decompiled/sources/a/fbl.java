package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fbl extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f9264a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f9264a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        double[] dArr = this.f9264a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f9264a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
