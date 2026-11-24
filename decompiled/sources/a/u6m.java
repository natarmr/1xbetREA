package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class u6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u6m f35142a;
    public static final /* synthetic */ u6m[] b;

    /* JADX INFO: Fake field, exist only in values array */
    u6m EF0;

    static {
        u6m u6mVar = new u6m("UNIVERSAL", 0);
        u6m u6mVar2 = new u6m("DOTA2", 1);
        u6m u6mVar3 = new u6m("CS2", 2);
        u6m u6mVar4 = new u6m("LOL", 3);
        u6m u6mVar5 = new u6m("VALORANT", 4);
        u6m u6mVar6 = new u6m("MLBB", 5);
        f35142a = u6mVar6;
        b = new u6m[]{u6mVar, u6mVar2, u6mVar3, u6mVar4, u6mVar5, u6mVar6, new u6m("RAINBOW6", 6)};
    }

    public static u6m valueOf(String str) {
        return (u6m) Enum.valueOf(u6m.class, str);
    }

    public static u6m[] values() {
        return (u6m[]) b.clone();
    }
}
