package a;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class sw90 extends k4 {
    @Override // a.f1e0
    public final int d(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // a.k4
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
