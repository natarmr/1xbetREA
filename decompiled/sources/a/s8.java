package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s8 f31777a;
    public static final /* synthetic */ s8[] b;

    static {
        s8 s8Var = new s8("Theme", 0);
        f31777a = s8Var;
        b = new s8[]{s8Var, new s8("Static", 1)};
    }

    public static s8 valueOf(String str) {
        return (s8) Enum.valueOf(s8.class, str);
    }

    public static s8[] values() {
        return (s8[]) b.clone();
    }
}
