package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ikm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ikm f14933a;
    public static final ikm b;
    public static final /* synthetic */ ikm[] c;
    public static final /* synthetic */ c0o d;

    static {
        ikm ikmVar = new ikm("THEME", 0);
        f14933a = ikmVar;
        ikm ikmVar2 = new ikm("STATIC_WHITE", 1);
        b = ikmVar2;
        ikm[] ikmVarArr = {ikmVar, ikmVar2};
        c = ikmVarArr;
        d = new c0o(ikmVarArr);
    }

    public static ikm valueOf(String str) {
        return (ikm) Enum.valueOf(ikm.class, str);
    }

    public static ikm[] values() {
        return (ikm[]) c.clone();
    }
}
