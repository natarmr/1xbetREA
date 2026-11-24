package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ckl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ckl f4512a;
    public static final ckl b;
    public static final /* synthetic */ ckl[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ckl EF0;

    static {
        ckl cklVar = new ckl("TOP_START", 0);
        ckl cklVar2 = new ckl("CENTER_START", 1);
        f4512a = cklVar2;
        ckl cklVar3 = new ckl("BOTTOM_START", 2);
        b = cklVar3;
        c = new ckl[]{cklVar, cklVar2, cklVar3};
    }

    public static ckl valueOf(String str) {
        return (ckl) Enum.valueOf(ckl.class, str);
    }

    public static ckl[] values() {
        return (ckl[]) c.clone();
    }
}
