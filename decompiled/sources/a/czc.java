package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class czc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final czc f5217a;
    public static final czc b;
    public static final czc c;
    public static final czc d;
    public static final /* synthetic */ czc[] e;

    static {
        czc czcVar = new czc("NONE", 0);
        f5217a = czcVar;
        czc czcVar2 = new czc("CHANGE_UP", 1);
        b = czcVar2;
        czc czcVar3 = new czc("CHANGE_DOWN", 2);
        c = czcVar3;
        czc czcVar4 = new czc("BLOCKED", 3);
        d = czcVar4;
        e = new czc[]{czcVar, czcVar2, czcVar3, czcVar4};
    }

    public static czc valueOf(String str) {
        return (czc) Enum.valueOf(czc.class, str);
    }

    public static czc[] values() {
        return (czc[]) e.clone();
    }
}
