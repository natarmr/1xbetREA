package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class s2t0 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f31520a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return new r2t0(Arrays.copyOf(this.f31520a, this.b));
    }

    @Override // a.uvb0
    public final void b(int i) {
        short[] sArr = this.f31520a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f31520a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
