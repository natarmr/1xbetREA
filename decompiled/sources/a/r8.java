package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r8 f30001a;
    public static final r8 b;
    public static final /* synthetic */ r8[] c;

    static {
        r8 r8Var = new r8("Expanded", 0);
        f30001a = r8Var;
        r8 r8Var2 = new r8("Collapsed", 1);
        b = r8Var2;
        c = new r8[]{r8Var, r8Var2};
    }

    public static r8 valueOf(String str) {
        return (r8) Enum.valueOf(r8.class, str);
    }

    public static r8[] values() {
        return (r8[]) c.clone();
    }
}
