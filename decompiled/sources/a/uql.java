package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class uql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uql f36124a;
    public static final uql b;
    public static final /* synthetic */ uql[] c;

    static {
        uql uqlVar = new uql("STEP", 0);
        f36124a = uqlVar;
        uql uqlVar2 = new uql("COMPLETE", 1);
        b = uqlVar2;
        c = new uql[]{uqlVar, uqlVar2};
    }

    public static uql valueOf(String str) {
        return (uql) Enum.valueOf(uql.class, str);
    }

    public static uql[] values() {
        return (uql[]) c.clone();
    }
}
