package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zdv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zdv0 f44226a;
    public static final zdv0 b;
    public static final /* synthetic */ zdv0[] c;

    static {
        zdv0 zdv0Var = new zdv0("MOBILE", 0);
        f44226a = zdv0Var;
        zdv0 zdv0Var2 = new zdv0("TABLET", 1);
        b = zdv0Var2;
        c = new zdv0[]{zdv0Var, zdv0Var2};
    }

    public static zdv0 valueOf(String str) {
        return (zdv0) Enum.valueOf(zdv0.class, str);
    }

    public static zdv0[] values() {
        return (zdv0[]) c.clone();
    }
}
