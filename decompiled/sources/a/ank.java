package a;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ank implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ank f1158a;
    public static final /* synthetic */ ank[] b;

    static {
        ank ankVar = new ank("INSTANCE", 0);
        f1158a = ankVar;
        b = new ank[]{ankVar};
    }

    public static ank valueOf(String str) {
        return (ank) Enum.valueOf(ank.class, str);
    }

    public static ank[] values() {
        return (ank[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
