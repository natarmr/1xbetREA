package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sna f32483a;
    public static final sna b;
    public static final sna c;
    public static final sna d;
    public static final /* synthetic */ sna[] e;

    static {
        sna snaVar = new sna("AutomaticSwipe", 0);
        f32483a = snaVar;
        sna snaVar2 = new sna("ManualSwipe", 1);
        b = snaVar2;
        sna snaVar3 = new sna("ManualCancel", 2);
        c = snaVar3;
        sna snaVar4 = new sna("RewoundSwipe", 3);
        d = snaVar4;
        e = new sna[]{snaVar, snaVar2, snaVar3, snaVar4};
    }

    public static sna valueOf(String str) {
        return (sna) Enum.valueOf(sna.class, str);
    }

    public static sna[] values() {
        return (sna[]) e.clone();
    }
}
