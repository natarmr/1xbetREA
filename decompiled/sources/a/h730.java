package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h730 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h730 f12558a;
    public static final h730 b;
    public static final /* synthetic */ h730[] c;

    static {
        h730 h730Var = new h730("PITCH", 0);
        f12558a = h730Var;
        h730 h730Var2 = new h730("LIST", 1);
        b = h730Var2;
        c = new h730[]{h730Var, h730Var2};
    }

    public static h730 valueOf(String str) {
        return (h730) Enum.valueOf(h730.class, str);
    }

    public static h730[] values() {
        return (h730[]) c.clone();
    }
}
