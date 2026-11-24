package a;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yfq implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yfq f42553a;
    public static final /* synthetic */ yfq[] b;

    static {
        yfq yfqVar = new yfq("INSTANCE", 0);
        f42553a = yfqVar;
        b = new yfq[]{yfqVar};
    }

    public static yfq valueOf(String str) {
        return (yfq) Enum.valueOf(yfq.class, str);
    }

    public static yfq[] values() {
        return (yfq[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
