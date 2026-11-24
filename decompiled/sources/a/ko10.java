package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ko10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ko10 f18608a;
    public static final ko10 b;
    public static final ko10 c;
    public static final /* synthetic */ ko10[] d;

    static {
        ko10 ko10Var = new ko10("SINGLE", 0);
        f18608a = ko10Var;
        ko10 ko10Var2 = new ko10("MULTI", 1);
        b = ko10Var2;
        ko10 ko10Var3 = new ko10("NONE", 2);
        c = ko10Var3;
        d = new ko10[]{ko10Var, ko10Var2, ko10Var3};
    }

    public static ko10 valueOf(String str) {
        return (ko10) Enum.valueOf(ko10.class, str);
    }

    public static ko10[] values() {
        return (ko10[]) d.clone();
    }
}
