package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ux50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ux50 f36425a;
    public static final ux50 b;
    public static final ux50 c;
    public static final ux50 d;
    public static final ux50 e;
    public static final ux50 f;
    public static final ux50 g;
    public static final ux50 h;
    public static final /* synthetic */ ux50[] i;

    /* JADX INFO: Fake field, exist only in values array */
    ux50 EF1;

    static {
        ux50 ux50Var = new ux50("FROM_IDE", 0);
        ux50 ux50Var2 = new ux50("FROM_BACKEND", 1);
        ux50 ux50Var3 = new ux50("FROM_TEST", 2);
        ux50 ux50Var4 = new ux50("FROM_BUILTINS", 3);
        f36425a = ux50Var4;
        ux50 ux50Var5 = new ux50("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        ux50 ux50Var6 = new ux50("WHEN_CHECK_OVERRIDES", 5);
        ux50 ux50Var7 = new ux50("FOR_SCRIPT", 6);
        ux50 ux50Var8 = new ux50("FROM_REFLECTION", 7);
        b = ux50Var8;
        ux50 ux50Var9 = new ux50("WHEN_RESOLVE_DECLARATION", 8);
        ux50 ux50Var10 = new ux50("WHEN_GET_DECLARATION_SCOPE", 9);
        ux50 ux50Var11 = new ux50("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        ux50 ux50Var12 = new ux50("FOR_ALREADY_TRACKED", 11);
        c = ux50Var12;
        ux50 ux50Var13 = new ux50("WHEN_GET_ALL_DESCRIPTORS", 12);
        d = ux50Var13;
        ux50 ux50Var14 = new ux50("WHEN_TYPING", 13);
        ux50 ux50Var15 = new ux50("WHEN_GET_SUPER_MEMBERS", 14);
        e = ux50Var15;
        ux50 ux50Var16 = new ux50("FOR_NON_TRACKED_SCOPE", 15);
        f = ux50Var16;
        ux50 ux50Var17 = new ux50("FROM_SYNTHETIC_SCOPE", 16);
        ux50 ux50Var18 = new ux50("FROM_DESERIALIZATION", 17);
        g = ux50Var18;
        ux50 ux50Var19 = new ux50("FROM_JAVA_LOADER", 18);
        h = ux50Var19;
        i = new ux50[]{ux50Var, ux50Var2, ux50Var3, ux50Var4, ux50Var5, ux50Var6, ux50Var7, ux50Var8, ux50Var9, ux50Var10, ux50Var11, ux50Var12, ux50Var13, ux50Var14, ux50Var15, ux50Var16, ux50Var17, ux50Var18, ux50Var19, new ux50("WHEN_GET_LOCAL_VARIABLE", 19), new ux50("WHEN_FIND_BY_FQNAME", 20), new ux50("WHEN_GET_COMPANION_OBJECT", 21), new ux50("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static ux50 valueOf(String str) {
        return (ux50) Enum.valueOf(ux50.class, str);
    }

    public static ux50[] values() {
        return (ux50[]) i.clone();
    }
}
