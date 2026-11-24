package a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final do20 f36655a;

    static {
        Object gcw0Var;
        ((wbw0) rbw0.f30210a).getClass();
        AtomicReference atomicReference = bcw0.f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            dcw0 dcw0Var = (dcw0) atomicReference.get();
            gcw0Var = new gcw0(strReplace, dcw0Var.f5866a, dcw0Var.b, dcw0Var.c);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            bcw0 bcw0Var = new bcw0(strReplace);
            if (bcw0.c || bcw0.d) {
                bcw0Var.b = new ecw0(strReplace);
            } else if (bcw0.e) {
                dcw0 dcw0Var2 = gcw0.h;
                bcw0Var.b = new gcw0(strReplace, Level.OFF, dcw0Var2.b, dcw0Var2.c);
            } else {
                bcw0Var.b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = ybw0.f42360a;
            concurrentLinkedQueue.offer(bcw0Var);
            gcw0Var = bcw0Var;
            if (atomicReference.get() != null) {
                while (true) {
                    bcw0 bcw0Var2 = (bcw0) concurrentLinkedQueue.poll();
                    if (bcw0Var2 == null) {
                        break;
                    }
                    dcw0 dcw0Var3 = (dcw0) atomicReference.get();
                    bcw0Var2.b = new gcw0(bcw0Var2.f6789a, dcw0Var3.f5866a, dcw0Var3.b, dcw0Var3.c);
                }
                bcw0.d();
                gcw0Var = bcw0Var;
            }
        }
        f36655a = new do20(gcw0Var);
    }
}
