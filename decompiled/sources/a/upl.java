package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class upl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bek f36071a;
    public static final upl b;
    public static final upl c;
    public static final upl d;
    public static final /* synthetic */ upl[] e;

    static {
        upl uplVar = new upl("BLUE", 0);
        b = uplVar;
        upl uplVar2 = new upl("VIOLET", 1);
        c = uplVar2;
        upl uplVar3 = new upl("RED", 2);
        d = uplVar3;
        e = new upl[]{uplVar, uplVar2, uplVar3};
        f36071a = new bek();
    }

    public static upl valueOf(String str) {
        return (upl) Enum.valueOf(upl.class, str);
    }

    public static upl[] values() {
        return (upl[]) e.clone();
    }
}
