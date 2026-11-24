package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r1t0 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f29699a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return new q1t0(Arrays.copyOf(this.f29699a, this.b));
    }

    @Override // a.uvb0
    public final void b(int i) {
        byte[] bArr = this.f29699a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f29699a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
