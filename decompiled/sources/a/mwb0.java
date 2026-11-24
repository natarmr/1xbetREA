package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mwb0 f22496a;
    public static final mwb0 b;
    public static final mwb0 c;
    public static final /* synthetic */ mwb0[] d;

    static {
        mwb0 mwb0Var = new mwb0("DEFAULT", 0);
        f22496a = mwb0Var;
        mwb0 mwb0Var2 = new mwb0("VERY_LOW", 1);
        b = mwb0Var2;
        mwb0 mwb0Var3 = new mwb0("HIGHEST", 2);
        c = mwb0Var3;
        d = new mwb0[]{mwb0Var, mwb0Var2, mwb0Var3};
    }

    public static mwb0 valueOf(String str) {
        return (mwb0) Enum.valueOf(mwb0.class, str);
    }

    public static mwb0[] values() {
        return (mwb0[]) d.clone();
    }
}
