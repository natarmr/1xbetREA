package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lkz f20223a;
    public static final lkz b;
    public static final lkz c;
    public static final lkz d;
    public static final lkz e;
    public static final /* synthetic */ lkz[] f;

    static {
        lkz lkzVar = new lkz("DESTROYED", 0);
        f20223a = lkzVar;
        lkz lkzVar2 = new lkz("INITIALIZED", 1);
        b = lkzVar2;
        lkz lkzVar3 = new lkz("CREATED", 2);
        c = lkzVar3;
        lkz lkzVar4 = new lkz("STARTED", 3);
        d = lkzVar4;
        lkz lkzVar5 = new lkz("RESUMED", 4);
        e = lkzVar5;
        f = new lkz[]{lkzVar, lkzVar2, lkzVar3, lkzVar4, lkzVar5};
    }

    public static lkz valueOf(String str) {
        return (lkz) Enum.valueOf(lkz.class, str);
    }

    public static lkz[] values() {
        return (lkz[]) f.clone();
    }

    public final boolean a(lkz lkzVar) {
        return compareTo(lkzVar) >= 0;
    }
}
