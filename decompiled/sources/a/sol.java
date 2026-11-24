package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class sol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sol f32548a;
    public static final sol b;
    public static final /* synthetic */ sol[] c;

    static {
        sol solVar = new sol("HORIZONTAL", 0);
        f32548a = solVar;
        sol solVar2 = new sol("VERTICAL", 1);
        b = solVar2;
        c = new sol[]{solVar, solVar2};
    }

    public static sol valueOf(String str) {
        return (sol) Enum.valueOf(sol.class, str);
    }

    public static sol[] values() {
        return (sol[]) c.clone();
    }
}
