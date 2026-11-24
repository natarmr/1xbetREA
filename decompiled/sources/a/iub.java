package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class iub extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f15388a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f15388a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        char[] cArr = this.f15388a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f15388a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
