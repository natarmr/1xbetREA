package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class upb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final upb0 f36057a;
    public static final upb0 b;
    public static final upb0 c;
    public static final /* synthetic */ upb0[] d;

    static {
        upb0 upb0Var = new upb0("BASKETBOMB", 0);
        f36057a = upb0Var;
        upb0 upb0Var2 = new upb0("DOOMSDAY", 1);
        b = upb0Var2;
        upb0 upb0Var3 = new upb0("DEFAULT", 2);
        c = upb0Var3;
        d = new upb0[]{upb0Var, upb0Var2, upb0Var3};
    }

    public static upb0 valueOf(String str) {
        return (upb0) Enum.valueOf(upb0.class, str);
    }

    public static upb0[] values() {
        return (upb0[]) d.clone();
    }
}
