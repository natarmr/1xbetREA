package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class re9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj5 f30324a;
    public static final re9 b;
    public static final re9 c;
    public static final /* synthetic */ re9[] d;

    static {
        re9 re9Var = new re9("Active", 0);
        b = re9Var;
        re9 re9Var2 = new re9("NotActive", 1);
        c = re9Var2;
        d = new re9[]{re9Var, re9Var2};
        f30324a = new kj5();
    }

    public static re9 valueOf(String str) {
        return (re9) Enum.valueOf(re9.class, str);
    }

    public static re9[] values() {
        return (re9[]) d.clone();
    }
}
