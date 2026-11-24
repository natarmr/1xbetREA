package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fwa f10250a;
    public static final fwa b;
    public static final /* synthetic */ fwa[] c;

    static {
        fwa fwaVar = new fwa("BASIC", 0);
        f10250a = fwaVar;
        fwa fwaVar2 = new fwa("ALTERNATIVE", 1);
        b = fwaVar2;
        c = new fwa[]{fwaVar, fwaVar2};
    }

    public static fwa valueOf(String str) {
        return (fwa) Enum.valueOf(fwa.class, str);
    }

    public static fwa[] values() {
        return (fwa[]) c.clone();
    }
}
