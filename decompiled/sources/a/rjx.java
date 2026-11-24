package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rjx extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f30619a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f30619a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        int[] iArr = this.f30619a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f30619a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
