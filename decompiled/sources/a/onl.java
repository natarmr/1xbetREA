package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class onl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final onl f25551a;
    public static final onl b;
    public static final onl c;
    public static final onl d;
    public static final /* synthetic */ onl[] e;

    static {
        onl onlVar = new onl("CELL", 0);
        f25551a = onlVar;
        onl onlVar2 = new onl("BUTTON", 1);
        b = onlVar2;
        onl onlVar3 = new onl("SMALL_BANNER", 2);
        c = onlVar3;
        onl onlVar4 = new onl("LARGE_BANNER", 3);
        d = onlVar4;
        e = new onl[]{onlVar, onlVar2, onlVar3, onlVar4};
    }

    public static onl valueOf(String str) {
        return (onl) Enum.valueOf(onl.class, str);
    }

    public static onl[] values() {
        return (onl[]) e.clone();
    }
}
