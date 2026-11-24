package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class wc9 extends kl5 {
    @Override // a.kl5
    public final List b(Executor executor) {
        return Arrays.asList(new qdd(), new ltj(executor));
    }

    @Override // a.kl5
    public final List c() {
        return Collections.singletonList(new vc9((byte) 1));
    }
}
