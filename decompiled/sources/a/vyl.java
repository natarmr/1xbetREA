package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vyl f38253a;
    public static final vyl b;
    public static final /* synthetic */ vyl[] c;

    static {
        vyl vylVar = new vyl("THEME", 0);
        f38253a = vylVar;
        vyl vylVar2 = new vyl("OVERLAY", 1);
        b = vylVar2;
        c = new vyl[]{vylVar, vylVar2};
    }

    public static vyl valueOf(String str) {
        return (vyl) Enum.valueOf(vyl.class, str);
    }

    public static vyl[] values() {
        return (vyl[]) c.clone();
    }
}
