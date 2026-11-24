package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class gck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gck f11066a;
    public static final gck b;
    public static final /* synthetic */ gck[] c;

    static {
        gck gckVar = new gck("HIDDEN", 0);
        f11066a = gckVar;
        gck gckVar2 = new gck("PINNED", 1);
        b = gckVar2;
        c = new gck[]{gckVar, gckVar2};
    }

    public static gck valueOf(String str) {
        return (gck) Enum.valueOf(gck.class, str);
    }

    public static gck[] values() {
        return (gck[]) c.clone();
    }
}
