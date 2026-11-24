package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hwe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hwe f13766a;
    public static final hwe b;
    public static final /* synthetic */ hwe[] c;

    static {
        hwe hweVar = new hwe("REPLACE", 0);
        f13766a = hweVar;
        hwe hweVar2 = new hwe("ADD", 1);
        b = hweVar2;
        c = new hwe[]{hweVar, hweVar2};
    }

    public static hwe valueOf(String str) {
        return (hwe) Enum.valueOf(hwe.class, str);
    }

    public static hwe[] values() {
        return (hwe[]) c.clone();
    }
}
