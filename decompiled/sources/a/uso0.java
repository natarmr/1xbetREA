package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uso0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uso0 f36223a;
    public static final /* synthetic */ uso0[] b;

    static {
        uso0 uso0Var = new uso0("NONE", 0);
        f36223a = uso0Var;
        b = new uso0[]{uso0Var, new uso0("FIRST_OPPONENT", 1), new uso0("SECOND_OPPONENT", 2)};
    }

    public static uso0 valueOf(String str) {
        return (uso0) Enum.valueOf(uso0.class, str);
    }

    public static uso0[] values() {
        return (uso0[]) b.clone();
    }
}
