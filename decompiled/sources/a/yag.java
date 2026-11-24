package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class yag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yag f42295a;
    public static final yag b;
    public static final yag c;
    public static final yag d;
    public static final /* synthetic */ yag[] e;

    static {
        yag yagVar = new yag("DAY", 0);
        f42295a = yagVar;
        yag yagVar2 = new yag("THREE_DAY", 1);
        b = yagVar2;
        yag yagVar3 = new yag("WEEK", 2);
        c = yagVar3;
        yag yagVar4 = new yag("MONTH", 3);
        d = yagVar4;
        e = new yag[]{yagVar, yagVar2, yagVar3, yagVar4};
    }

    public static yag valueOf(String str) {
        return (yag) Enum.valueOf(yag.class, str);
    }

    public static yag[] values() {
        return (yag[]) e.clone();
    }
}
