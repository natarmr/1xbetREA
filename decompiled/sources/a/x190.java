package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x190 f40111a;
    public static final /* synthetic */ x190[] b;

    static {
        x190 x190Var = new x190("CounterClockwise", 0);
        f40111a = x190Var;
        b = new x190[]{x190Var, new x190("Clockwise", 1)};
    }

    public static x190 valueOf(String str) {
        return (x190) Enum.valueOf(x190.class, str);
    }

    public static x190[] values() {
        return (x190[]) b.clone();
    }
}
