package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uxl f36445a;
    public static final uxl b;
    public static final uxl c;
    public static final uxl d;
    public static final /* synthetic */ uxl[] e;

    static {
        uxl uxlVar = new uxl("INACTIVE", 0);
        f36445a = uxlVar;
        uxl uxlVar2 = new uxl("ACTIVE", 1);
        b = uxlVar2;
        uxl uxlVar3 = new uxl("INACTIVE_DISABLED", 2);
        c = uxlVar3;
        uxl uxlVar4 = new uxl("ACTIVE_DISABLED", 3);
        d = uxlVar4;
        e = new uxl[]{uxlVar, uxlVar2, uxlVar3, uxlVar4};
    }

    public static uxl valueOf(String str) {
        return (uxl) Enum.valueOf(uxl.class, str);
    }

    public static uxl[] values() {
        return (uxl[]) e.clone();
    }
}
