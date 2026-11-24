package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class mtk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mtk0 f22375a;
    public static final mtk0 b;
    public static final mtk0 c;
    public static final /* synthetic */ mtk0[] d;

    static {
        mtk0 mtk0Var = new mtk0("NO_ERROR", 0);
        f22375a = mtk0Var;
        mtk0 mtk0Var2 = new mtk0("CONTENT_ERROR", 1);
        b = mtk0Var2;
        mtk0 mtk0Var3 = new mtk0("CONTENT_EMPTY_ERROR", 2);
        c = mtk0Var3;
        d = new mtk0[]{mtk0Var, mtk0Var2, mtk0Var3};
    }

    public static mtk0 valueOf(String str) {
        return (mtk0) Enum.valueOf(mtk0.class, str);
    }

    public static mtk0[] values() {
        return (mtk0[]) d.clone();
    }
}
