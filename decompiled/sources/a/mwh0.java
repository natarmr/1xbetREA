package a;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uvh0 f22503a = new uvh0(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(uvh0 uvh0Var) {
        uvh0Var.getClass();
        if (uvh0Var.f != null || uvh0Var.g != null) {
            jf4.o("Failed requirement.");
            return;
        }
        if (uvh0Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        uvh0 uvh0Var2 = f22503a;
        uvh0 uvh0Var3 = (uvh0) atomicReference.getAndSet(uvh0Var2);
        if (uvh0Var3 == uvh0Var2) {
            return;
        }
        int i = uvh0Var3 != null ? uvh0Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(uvh0Var3);
            return;
        }
        uvh0Var.f = uvh0Var3;
        uvh0Var.b = 0;
        uvh0Var.c = i + 8192;
        atomicReference.set(uvh0Var);
    }

    public static final uvh0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        uvh0 uvh0Var = f22503a;
        uvh0 uvh0Var2 = (uvh0) atomicReference.getAndSet(uvh0Var);
        if (uvh0Var2 == uvh0Var) {
            return new uvh0();
        }
        if (uvh0Var2 == null) {
            atomicReference.set(null);
            return new uvh0();
        }
        atomicReference.set(uvh0Var2.f);
        uvh0Var2.f = null;
        uvh0Var2.c = 0;
        return uvh0Var2;
    }
}
