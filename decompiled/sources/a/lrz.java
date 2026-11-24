package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rqt f20553a;
    public static final lrz b;
    public static final lrz c;
    public static final lrz d;
    public static final /* synthetic */ lrz[] e;

    static {
        lrz lrzVar = new lrz("ACTIVE", 0);
        b = lrzVar;
        lrz lrzVar2 = new lrz("PENDING", 1);
        c = lrzVar2;
        lrz lrzVar3 = new lrz("INACTIVE", 2);
        d = lrzVar3;
        e = new lrz[]{lrzVar, lrzVar2, lrzVar3};
        f20553a = new rqt();
    }

    public static lrz valueOf(String str) {
        return (lrz) Enum.valueOf(lrz.class, str);
    }

    public static lrz[] values() {
        return (lrz[]) e.clone();
    }
}
