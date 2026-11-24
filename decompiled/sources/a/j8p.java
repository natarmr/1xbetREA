package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j8p f16096a;
    public static final j8p b;
    public static final j8p c;
    public static final j8p d;
    public static final /* synthetic */ j8p[] e;
    public static final /* synthetic */ c0o f;

    static {
        j8p j8pVar = new j8p("LINE", 0);
        f16096a = j8pVar;
        j8p j8pVar2 = new j8p("LIVE", 1);
        b = j8pVar2;
        j8p j8pVar3 = new j8p("VIEWED_LINE", 2);
        c = j8pVar3;
        j8p j8pVar4 = new j8p("VIEWED_LIVE", 3);
        d = j8pVar4;
        j8p[] j8pVarArr = {j8pVar, j8pVar2, j8pVar3, j8pVar4};
        e = j8pVarArr;
        f = new c0o(j8pVarArr);
    }

    public static j8p valueOf(String str) {
        return (j8p) Enum.valueOf(j8p.class, str);
    }

    public static j8p[] values() {
        return (j8p[]) e.clone();
    }
}
