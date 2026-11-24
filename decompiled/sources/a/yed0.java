package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yed0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yed0 f42481a;
    public static final yed0 b;
    public static final yed0 c;
    public static final yed0 d;
    public static final /* synthetic */ yed0[] e;

    static {
        yed0 yed0Var = new yed0("SMS", 0);
        f42481a = yed0Var;
        yed0 yed0Var2 = new yed0("VOICE_SMS", 1);
        b = yed0Var2;
        yed0 yed0Var3 = new yed0("TELEGRAM", 2);
        c = yed0Var3;
        yed0 yed0Var4 = new yed0("FLASH_CALL", 3);
        d = yed0Var4;
        e = new yed0[]{yed0Var, yed0Var2, yed0Var3, yed0Var4};
    }

    public static yed0 valueOf(String str) {
        return (yed0) Enum.valueOf(yed0.class, str);
    }

    public static yed0[] values() {
        return (yed0[]) e.clone();
    }
}
