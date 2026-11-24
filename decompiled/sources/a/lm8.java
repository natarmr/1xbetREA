package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lm8 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f20285a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f20285a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        boolean[] zArr = this.f20285a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f20285a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
