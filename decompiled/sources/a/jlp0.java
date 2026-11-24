package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jlp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jlp0 f16729a;
    public static final jlp0 b;
    public static final /* synthetic */ jlp0[] c;

    static {
        jlp0 jlp0Var = new jlp0("HERO_IMAGE_AND_PLAYER_HERO_INFO", 0);
        f16729a = jlp0Var;
        jlp0 jlp0Var2 = new jlp0("PLAYER_HERO_INFO_WITH_IMAGE", 1);
        b = jlp0Var2;
        c = new jlp0[]{jlp0Var, jlp0Var2};
    }

    public static jlp0 valueOf(String str) {
        return (jlp0) Enum.valueOf(jlp0.class, str);
    }

    public static jlp0[] values() {
        return (jlp0[]) c.clone();
    }
}
