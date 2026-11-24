package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class w610 extends uvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f38606a;
    public int b;

    @Override // a.uvb0
    public final Object a() {
        return Arrays.copyOf(this.f38606a, this.b);
    }

    @Override // a.uvb0
    public final void b(int i) {
        long[] jArr = this.f38606a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f38606a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // a.uvb0
    public final int d() {
        return this.b;
    }
}
