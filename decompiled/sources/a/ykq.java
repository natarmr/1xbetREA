package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ykq extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f42803a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f42803a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        float[] fArr = this.f42803a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f42803a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
