package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ssv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ssv0 f32746a;
    public static final ssv0 b;
    public static final /* synthetic */ ssv0[] c;

    static {
        ssv0 ssv0Var = new ssv0("Lift", 0);
        f32746a = ssv0Var;
        ssv0 ssv0Var2 = new ssv0("StayUnderKeyboard", 1);
        b = ssv0Var2;
        c = new ssv0[]{ssv0Var, ssv0Var2};
    }

    public static ssv0 valueOf(String str) {
        return (ssv0) Enum.valueOf(ssv0.class, str);
    }

    public static ssv0[] values() {
        return (ssv0[]) c.clone();
    }
}
