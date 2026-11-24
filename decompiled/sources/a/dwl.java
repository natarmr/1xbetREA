package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dwl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dwl f6805a;
    public static final dwl b;
    public static final /* synthetic */ dwl[] c;

    static {
        dwl dwlVar = new dwl("THEME", 0);
        f6805a = dwlVar;
        dwl dwlVar2 = new dwl("OVERLAY", 1);
        b = dwlVar2;
        c = new dwl[]{dwlVar, dwlVar2};
    }

    public static dwl valueOf(String str) {
        return (dwl) Enum.valueOf(dwl.class, str);
    }

    public static dwl[] values() {
        return (dwl[]) c.clone();
    }
}
