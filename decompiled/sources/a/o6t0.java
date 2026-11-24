package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class o6t0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o6t0 f24755a;
    public static final Handler b;
    public static final /* synthetic */ o6t0[] c;

    static {
        o6t0 o6t0Var = new o6t0("INSTANCE", 0);
        f24755a = o6t0Var;
        c = new o6t0[]{o6t0Var};
        b = new Handler(Looper.getMainLooper());
    }

    public static o6t0 valueOf(String str) {
        return (o6t0) Enum.valueOf(o6t0.class, str);
    }

    public static o6t0[] values() {
        return (o6t0[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
