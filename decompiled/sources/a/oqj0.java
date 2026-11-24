package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class oqj0 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f25691a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f25691a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        short[] sArr = this.f25691a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f25691a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
