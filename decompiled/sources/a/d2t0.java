package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d2t0 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5375a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return new c2t0(Arrays.copyOf(this.f5375a, this.b));
    }

    @Override // a.uvb0
    public final void b(int i) {
        int[] iArr = this.f5375a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5375a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
