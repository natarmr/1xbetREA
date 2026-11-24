package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class y3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3m f41958a;
    public static final y3m b;
    public static final y3m c;
    public static final /* synthetic */ y3m[] d;

    static {
        y3m y3mVar = new y3m("Collapsed", 0);
        f41958a = y3mVar;
        y3m y3mVar2 = new y3m("HalfExpanded", 1);
        b = y3mVar2;
        y3m y3mVar3 = new y3m("Expanded", 2);
        c = y3mVar3;
        d = new y3m[]{y3mVar, y3mVar2, y3mVar3};
    }

    public static y3m valueOf(String str) {
        return (y3m) Enum.valueOf(y3m.class, str);
    }

    public static y3m[] values() {
        return (y3m[]) d.clone();
    }
}
