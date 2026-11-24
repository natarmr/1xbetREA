package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ijl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ijl f14880a;
    public static final ijl b;
    public static final ijl c;
    public static final ijl d;
    public static final ijl e;
    public static final /* synthetic */ ijl[] f;

    static {
        ijl ijlVar = new ijl("PRIMARY", 0);
        f14880a = ijlVar;
        ijl ijlVar2 = new ijl("SECONDARY", 1);
        b = ijlVar2;
        ijl ijlVar3 = new ijl("TERTIARY", 2);
        c = ijlVar3;
        ijl ijlVar4 = new ijl("QUATERNARY", 3);
        d = ijlVar4;
        ijl ijlVar5 = new ijl("FIVEFOLD", 4);
        e = ijlVar5;
        f = new ijl[]{ijlVar, ijlVar2, ijlVar3, ijlVar4, ijlVar5};
    }

    public static ijl valueOf(String str) {
        return (ijl) Enum.valueOf(ijl.class, str);
    }

    public static ijl[] values() {
        return (ijl[]) f.clone();
    }
}
