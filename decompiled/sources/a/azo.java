package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final azo f1727a;
    public static final azo b;
    public static final azo c;
    public static final /* synthetic */ azo[] d;

    static {
        azo azoVar = new azo("CHECKED_SUCCESSFUL", 0);
        f1727a = azoVar;
        azo azoVar2 = new azo("CHECKED_WRONG", 1);
        b = azoVar2;
        azo azoVar3 = new azo("UNCHECKED", 2);
        c = azoVar3;
        d = new azo[]{azoVar, azoVar2, azoVar3};
    }

    public static azo valueOf(String str) {
        return (azo) Enum.valueOf(azo.class, str);
    }

    public static azo[] values() {
        return (azo[]) d.clone();
    }
}
