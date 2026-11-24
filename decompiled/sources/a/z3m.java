package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3m f43726a;
    public static final /* synthetic */ z3m[] b;

    /* JADX INFO: Fake field, exist only in values array */
    z3m EF0;

    static {
        z3m z3mVar = new z3m("DEFAULT", 0);
        z3m z3mVar2 = new z3m("CIRCLE", 1);
        f43726a = z3mVar2;
        b = new z3m[]{z3mVar, z3mVar2};
    }

    public static z3m valueOf(String str) {
        return (z3m) Enum.valueOf(z3m.class, str);
    }

    public static z3m[] values() {
        return (z3m[]) b.clone();
    }
}
