package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bag0 extends p4 {
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public bag0(vkr0 vkr0Var, int i) {
        super(vkr0Var, (byte) 3);
        this.c = i;
        if (i >= 0) {
            return;
        }
        jf4.o("retryLimit must be >= 0");
        throw null;
    }
}
