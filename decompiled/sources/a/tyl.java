package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tyl f34760a;
    public static final tyl b;
    public static final tyl c;
    public static final /* synthetic */ tyl[] d;

    static {
        tyl tylVar = new tyl("BUTTON", 0);
        f34760a = tylVar;
        tyl tylVar2 = new tyl("SINGLE", 1);
        b = tylVar2;
        tyl tylVar3 = new tyl("MULTI", 2);
        c = tylVar3;
        d = new tyl[]{tylVar, tylVar2, tylVar3};
    }

    public static tyl valueOf(String str) {
        return (tyl) Enum.valueOf(tyl.class, str);
    }

    public static tyl[] values() {
        return (tyl[]) d.clone();
    }
}
