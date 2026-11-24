package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class it40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final it40 f15338a;
    public static final it40 b;
    public static final it40 c;
    public static final it40 d;
    public static final /* synthetic */ it40[] e;

    static {
        it40 it40Var = new it40("CONTENT", 0);
        f15338a = it40Var;
        it40 it40Var2 = new it40("TITLE", 1);
        b = it40Var2;
        it40 it40Var3 = new it40("BACKGROUND", 2);
        c = it40Var3;
        it40 it40Var4 = new it40("GRADIENT", 3);
        d = it40Var4;
        e = new it40[]{it40Var, it40Var2, it40Var3, it40Var4};
    }

    public static it40 valueOf(String str) {
        return (it40) Enum.valueOf(it40.class, str);
    }

    public static it40[] values() {
        return (it40[]) e.clone();
    }
}
