package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j2t0 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15799a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return new i2t0(Arrays.copyOf(this.f15799a, this.b));
    }

    @Override // a.uvb0
    public final void b(int i) {
        long[] jArr = this.f15799a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f15799a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
