package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tw90 f34640a;
    public static final tw90 b;
    public static final /* synthetic */ tw90[] c;

    static {
        tw90 tw90Var = new tw90("ANDROID", 0);
        f34640a = tw90Var;
        tw90 tw90Var2 = new tw90("JVM", 1);
        tw90 tw90Var3 = new tw90("NATIVE", 2);
        tw90 tw90Var4 = new tw90("WEB", 3);
        b = tw90Var4;
        c = new tw90[]{tw90Var, tw90Var2, tw90Var3, tw90Var4};
    }

    public static tw90 valueOf(String str) {
        return (tw90) Enum.valueOf(tw90.class, str);
    }

    public static tw90[] values() {
        return (tw90[]) c.clone();
    }
}
