package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hck f12828a;
    public static final hck b;
    public static final /* synthetic */ hck[] c;

    static {
        hck hckVar = new hck("HIDDEN", 0);
        f12828a = hckVar;
        hck hckVar2 = new hck("PINNED", 1);
        b = hckVar2;
        c = new hck[]{hckVar, hckVar2};
    }

    public static hck valueOf(String str) {
        return (hck) Enum.valueOf(hck.class, str);
    }

    public static hck[] values() {
        return (hck[]) c.clone();
    }
}
