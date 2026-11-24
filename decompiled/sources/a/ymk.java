package a;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ymk implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ymk f42893a;
    public static final /* synthetic */ ymk[] b;

    static {
        ymk ymkVar = new ymk("INSTANCE", 0);
        f42893a = ymkVar;
        b = new ymk[]{ymkVar};
    }

    public static ymk valueOf(String str) {
        return (ymk) Enum.valueOf(ymk.class, str);
    }

    public static ymk[] values() {
        return (ymk[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
