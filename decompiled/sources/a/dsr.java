package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dsr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bek f6625a;
    public static final dsr b;
    public static final dsr c;
    public static final dsr d;
    public static final /* synthetic */ dsr[] e;

    static {
        dsr dsrVar = new dsr("NOTHING", 0);
        b = dsrVar;
        dsr dsrVar2 = new dsr("BONUS_ENABLED", 1);
        c = dsrVar2;
        dsr dsrVar3 = new dsr("BONUS_LOSE", 2);
        d = dsrVar3;
        e = new dsr[]{dsrVar, dsrVar2, dsrVar3};
        f6625a = new bek();
    }

    public static dsr valueOf(String str) {
        return (dsr) Enum.valueOf(dsr.class, str);
    }

    public static dsr[] values() {
        return (dsr[]) e.clone();
    }
}
