package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class u1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1m f34906a;
    public static final u1m b;
    public static final /* synthetic */ u1m[] c;

    static {
        u1m u1mVar = new u1m("POPULAR", 0);
        f34906a = u1mVar;
        u1m u1mVar2 = new u1m("NEW", 1);
        b = u1mVar2;
        c = new u1m[]{u1mVar, u1mVar2};
    }

    public static u1m valueOf(String str) {
        return (u1m) Enum.valueOf(u1m.class, str);
    }

    public static u1m[] values() {
        return (u1m[]) c.clone();
    }
}
