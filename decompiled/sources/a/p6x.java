package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p6x f26478a;
    public static final p6x b;
    public static final p6x c;
    public static final /* synthetic */ p6x[] d;

    static {
        p6x p6xVar = new p6x("FIRST_TEAM", 0);
        f26478a = p6xVar;
        p6x p6xVar2 = new p6x("SECOND_TEAM", 1);
        b = p6xVar2;
        p6x p6xVar3 = new p6x("NONE", 2);
        c = p6xVar3;
        d = new p6x[]{p6xVar, p6xVar2, p6xVar3};
    }

    public static p6x valueOf(String str) {
        return (p6x) Enum.valueOf(p6x.class, str);
    }

    public static p6x[] values() {
        return (p6x[]) d.clone();
    }
}
