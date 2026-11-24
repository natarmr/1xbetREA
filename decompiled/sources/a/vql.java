package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vql f37860a;
    public static final vql b;
    public static final vql c;
    public static final vql d;
    public static final /* synthetic */ vql[] e;

    static {
        vql vqlVar = new vql("CHEVRON", 0);
        f37860a = vqlVar;
        vql vqlVar2 = new vql("CUP", 1);
        b = vqlVar2;
        vql vqlVar3 = new vql("ICON", 2);
        c = vqlVar3;
        vql vqlVar4 = new vql("COLOR", 3);
        d = vqlVar4;
        e = new vql[]{vqlVar, vqlVar2, vqlVar3, vqlVar4};
    }

    public static vql valueOf(String str) {
        return (vql) Enum.valueOf(vql.class, str);
    }

    public static vql[] values() {
        return (vql[]) e.clone();
    }
}
