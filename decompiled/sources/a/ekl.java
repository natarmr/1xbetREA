package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ekl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ekl f7957a;
    public static final ekl b;
    public static final /* synthetic */ ekl[] c;

    static {
        ekl eklVar = new ekl("TEXT", 0);
        f7957a = eklVar;
        ekl eklVar2 = new ekl("MONEY", 1);
        b = eklVar2;
        c = new ekl[]{eklVar, eklVar2};
    }

    public static ekl valueOf(String str) {
        return (ekl) Enum.valueOf(ekl.class, str);
    }

    public static ekl[] values() {
        return (ekl[]) c.clone();
    }
}
