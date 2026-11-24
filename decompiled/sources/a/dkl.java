package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dkl f6236a;
    public static final dkl b;
    public static final dkl c;
    public static final /* synthetic */ dkl[] d;

    static {
        dkl dklVar = new dkl("TITLE", 0);
        f6236a = dklVar;
        dkl dklVar2 = new dkl("SUBTITLE", 1);
        b = dklVar2;
        dkl dklVar3 = new dkl("TAG", 2);
        c = dklVar3;
        d = new dkl[]{dklVar, dklVar2, dklVar3};
    }

    public static dkl valueOf(String str) {
        return (dkl) Enum.valueOf(dkl.class, str);
    }

    public static dkl[] values() {
        return (dkl[]) d.clone();
    }
}
