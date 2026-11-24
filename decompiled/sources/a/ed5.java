package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ed5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ed5 f7601a;
    public static final ed5 b;
    public static final /* synthetic */ ed5[] c;

    static {
        ed5 ed5Var = new ed5("APP_START", 0);
        f7601a = ed5Var;
        ed5 ed5Var2 = new ed5("APP_UPDATE", 1);
        b = ed5Var2;
        c = new ed5[]{ed5Var, ed5Var2};
    }

    public static ed5 valueOf(String str) {
        return (ed5) Enum.valueOf(ed5.class, str);
    }

    public static ed5[] values() {
        return (ed5[]) c.clone();
    }
}
