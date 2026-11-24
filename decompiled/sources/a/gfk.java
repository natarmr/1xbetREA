package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gfk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gfk f11210a;
    public static final gfk b;
    public static final /* synthetic */ gfk[] c;

    static {
        gfk gfkVar = new gfk("STABLE", 0);
        f11210a = gfkVar;
        gfk gfkVar2 = new gfk("UNSTABLE", 1);
        b = gfkVar2;
        c = new gfk[]{gfkVar, gfkVar2};
    }

    public static gfk valueOf(String str) {
        return (gfk) Enum.valueOf(gfk.class, str);
    }

    public static gfk[] values() {
        return (gfk[]) c.clone();
    }
}
