package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ly1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ly1 f20843a;
    public static final ly1 b;
    public static final ly1 c;
    public static final /* synthetic */ ly1[] d;

    static {
        ly1 ly1Var = new ly1("PREPARE", 0);
        f20843a = ly1Var;
        ly1 ly1Var2 = new ly1("ACTIVE", 1);
        b = ly1Var2;
        ly1 ly1Var3 = new ly1("ENDED", 2);
        c = ly1Var3;
        d = new ly1[]{ly1Var, ly1Var2, ly1Var3};
    }

    public static ly1 valueOf(String str) {
        return (ly1) Enum.valueOf(ly1.class, str);
    }

    public static ly1[] values() {
        return (ly1[]) d.clone();
    }
}
