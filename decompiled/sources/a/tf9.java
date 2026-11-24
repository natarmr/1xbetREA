package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tf9 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f33856a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f33856a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        byte[] bArr = this.f33856a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f33856a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
