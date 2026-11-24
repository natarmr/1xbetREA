package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vkq f37586a;
    public static final vkq b;
    public static final /* synthetic */ vkq[] c;

    static {
        vkq vkqVar = new vkq("TOP", 0);
        f37586a = vkqVar;
        vkq vkqVar2 = new vkq("BOTTOM", 1);
        b = vkqVar2;
        c = new vkq[]{vkqVar, vkqVar2};
    }

    public static vkq valueOf(String str) {
        return (vkq) Enum.valueOf(vkq.class, str);
    }

    public static vkq[] values() {
        return (vkq[]) c.clone();
    }
}
