package a;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zmk implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zmk f44629a;
    public static final /* synthetic */ zmk[] b;

    static {
        zmk zmkVar = new zmk("INSTANCE", 0);
        f44629a = zmkVar;
        b = new zmk[]{zmkVar};
    }

    public static zmk valueOf(String str) {
        return (zmk) Enum.valueOf(zmk.class, str);
    }

    public static zmk[] values() {
        return (zmk[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
