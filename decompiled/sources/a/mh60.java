package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mh60 extends lm40 implements xj30 {
    public Function1 o;
    public long p;

    @Override // a.lm40
    public final boolean O0() {
        return true;
    }

    @Override // a.xj30
    public final void a(long j) {
        if (qkx.a(this.p, j)) {
            return;
        }
        this.o.invoke(new qkx(j));
        this.p = j;
    }
}
