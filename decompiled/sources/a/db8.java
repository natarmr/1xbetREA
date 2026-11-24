package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class db8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final db8 f5790a;
    public static final db8 b;
    public static final /* synthetic */ db8[] c;

    static {
        db8 db8Var = new db8("HIGHER", 0);
        f5790a = db8Var;
        db8 db8Var2 = new db8("LOWER", 1);
        b = db8Var2;
        c = new db8[]{db8Var, db8Var2};
    }

    public static db8 valueOf(String str) {
        return (db8) Enum.valueOf(db8.class, str);
    }

    public static db8[] values() {
        return (db8[]) c.clone();
    }
}
