package a;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k4 extends f1e0 {
    @Override // a.f1e0
    public final int a(int i) {
        return (e().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // a.f1e0
    public final int b() {
        return e().nextInt();
    }

    public abstract Random e();

    public final int f(int i) {
        return e().nextInt(i);
    }
}
